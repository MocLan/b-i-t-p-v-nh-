package com.lananh.bai1.top20;

import java.util.Scanner;

public class HinhChuNhat {
    private float chieuDai;
    private float chieuRong;

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
//    public HinhChuNhat(){
//        this.chieuDai = getChieuDai();
//        this.chieuRong = getChieuRong();
//    }
    public void nhapHinhChuNhat(){
        System.out.println("nhập vào chiều dài: ");
        chieuDai = new Scanner(System.in).nextFloat();
        System.out.println("nhập vào chiều rộng: ");
        chieuRong = new Scanner(System.in).nextFloat();

    }
    public float tinhDienTich(){
        return chieuDai* chieuRong;
    }
    public  float tinhChuVi(){
        return (chieuDai+chieuRong)*2;
    }


    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ",dientich=" + tinhDienTich()+
                ",chuvi="+tinhChuVi()+
                '}';
    }
}
