package com.example.onthi4;

public class Product {
    private String name;
    private String mota;
    private int soLuong;
    private int img;

    public Product(String name, String mota, int soLuong, int img) {
        this.name = name;
        this.mota = mota;
        this.soLuong = soLuong;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
