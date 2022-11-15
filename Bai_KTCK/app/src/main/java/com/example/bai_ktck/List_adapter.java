package com.example.bai_ktck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class List_adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<List_model> arraylist;

    public List_adapter(Context context, int layout, List<List_model> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
           List_model list_model = arraylist.get(position);
           //anhxa
        ImageView img_item = view.findViewById(R.id.img_item);
        TextView ten_item = view.findViewById(R.id.ten_item);
        TextView nghedanh_item = view.findViewById(R.id.nghedanh_item);
        TextView quocgia_item = view.findViewById(R.id.quocgia_item);
        TextView sosao_item = view.findViewById(R.id.sosao_item);

        img_item.setImageResource(list_model.getImg_item());
        ten_item.setText(list_model.getTen_item());
        nghedanh_item.setText(list_model.getNghedanh_item());
        quocgia_item.setText(list_model.getQuocgia_item());
        sosao_item.setText(list_model.getSosao_item());

        return view;
    }
}
