package com.lananh.bai3.top20;

import java.util.Scanner;

public class Xe {
    private int dungTich;
    private String tenChuXe;
    private String loaiXe;
    private long giaXe;

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public long getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(long giaXe) {
        this.giaXe = giaXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public Xe(int dungTich, String tenChuXe, String loaiXe, long giaXe) {
        this.dungTich = dungTich;
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.giaXe = giaXe;
    }
    public Xe(){

    }

    public void nhapThongTin(){
        System.out.println("nhập vào tên chủ xe: ");
        this.tenChuXe = new Scanner(System.in).nextLine();
        System.out.println("nhập vào loại xe: ");
        this.loaiXe = new Scanner(System.in).nextLine();
        System.out.println("nhập vào giá xe: ");
        this.giaXe = new Scanner(System.in).nextLong();
        System.out.println("nhập vào dung tích xe: ");
        this.dungTich = new Scanner(System.in).nextInt();

    }
    public double tinhThue(){
        if(dungTich < 100){
            return  dungTich * 0.1f * giaXe;
        }
        if(dungTich >= 100 && dungTich <= 200){
            return dungTich * 0.3f * giaXe;
        }
        if(dungTich > 200){
            return dungTich * 0.5f * giaXe;
        }
        else
            return 0;
    }
    @Override
    public String toString() {
        return
                String.format("%-20s%-20s%-20d%-20d%-20.2f",
                tenChuXe,loaiXe,giaXe,dungTich,tinhThue());
    }

}
