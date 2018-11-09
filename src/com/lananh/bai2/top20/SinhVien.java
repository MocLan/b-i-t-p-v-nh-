package com.lananh.bai2.top20;

public class SinhVien {
    private int maSinhVien;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;

    }
    public  SinhVien(){
        this.maSinhVien = 611208;
        this.hoTen = "MocLan";
        this.diemLT = 8.8f;
        this.diemTH = 9.0f;
    }


    public SinhVien(int maSinhVien, String hoTen, float diemLT, float diemTH) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }
    public float diemTB(){
        return (diemLT + diemTH)/2;
    }

    @Override
    public String toString() {
       return String.format("%-20d%-20s%-20f%-20f%-20f",
               maSinhVien,hoTen,diemLT,diemTH,diemTB());
    }
}

