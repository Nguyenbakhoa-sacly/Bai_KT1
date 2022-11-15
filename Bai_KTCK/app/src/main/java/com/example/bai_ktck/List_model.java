package com.example.bai_ktck;

public class List_model {
    private int img_item;
    private String sosao_item,quocgia_item,nghedanh_item,ten_item;

    public List_model(int img_item,String ten_item, String nghedanh_item,  String quocgia_item,String sosao_item) {
        this.img_item = img_item;
        this.ten_item = ten_item;
        this.nghedanh_item = nghedanh_item;
        this.quocgia_item = quocgia_item;
        this.sosao_item = sosao_item;



    }

    public int getImg_item() {
        return img_item;
    }

    public void setImg_item(int img_item) {
        this.img_item = img_item;
    }
    public String getTen_item() {
        return ten_item;
    }

    public void setTen_item(String ten_item) {
        this.ten_item = ten_item;
    }


    public String getNghedanh_item() {
        return nghedanh_item;
    }

    public void setNghedanh_item(String nghedanh_item) {
        this.nghedanh_item = nghedanh_item;
    }
    public String getQuocgia_item() {
        return quocgia_item;
    }

    public void setQuocgia_item(String quocgia_item) {
        this.quocgia_item = quocgia_item;
    }

    public String getSosao_item() {
        return sosao_item;
    }

    public void setSosao_item(String sosao_item) {
        this.sosao_item = sosao_item;
    }




}
