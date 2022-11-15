package com.example.bai_ktck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Sign_In extends AppCompatActivity {
    EditText edt_email,edt_pass ;
    Button btn_signin;
    CheckBox checkbox;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        edt_email = findViewById(R.id.edt_email);
        edt_pass = findViewById(R.id.edt_pass);
        btn_signin = findViewById(R.id.btn_signin);
        checkbox = findViewById(R.id.checkbox);

        sharedPreferences = getSharedPreferences("SignIn",MODE_PRIVATE);
        edt_email.setText(sharedPreferences.getString("taikhoan",""));
        edt_pass.setText(sharedPreferences.getString("matkhau",""));
        checkbox.setChecked(sharedPreferences.getBoolean("checked",false));

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edt_email.getText().toString();
                String pass = edt_pass.getText().toString();
                if(email.equals("khoa") && pass.equals("123")){
                    Toast.makeText(Sign_In.this,"Đăng nhập thành công!",Toast.LENGTH_SHORT).show();
                    if(checkbox.isChecked()){
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("taikhoan",email);
                        editor.putString("matkhau",pass);
                        editor.putBoolean("checked",true);
                        editor.commit();
                    }else{
                        SharedPreferences.Editor  editor = sharedPreferences.edit();
                        editor.remove("taikhoan");
                        editor.remove("matkhau");
                        editor.remove("checked");
                        editor.commit();
                    }
                    Intent intent = new Intent(Sign_In.this,List.class);
                    startActivity(intent);;

                }else{
                    Toast.makeText(Sign_In.this,"Đăng nhập không thành công!",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}