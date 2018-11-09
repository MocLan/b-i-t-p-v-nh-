package com.lananh.bai7.top20;

import java.util.Scanner;

public class SinhVien {
    private long maSinhVien;
    private String hoTen;
    private String diaChi;
    private long soDienThoai;

    public long getMaSinhVien() {
        return maSinhVien;
    }


    public void setMaSinhVien(long maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public long getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(long soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public SinhVien(){

    }

    public SinhVien(long maSinhVien, String hoTen, String diaChi, long soDienThoai) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }
    public void nhap(){
        System.out.println("nhập vào mã sinh viên: ");
        this.maSinhVien = new Scanner(System.in).nextLong();
        System.out.println("nhập vào họ tên: ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("nhập vào địa chỉ: ");
        this.diaChi = new Scanner(System.in).nextLine();
        do {
            System.out.println("nhập vào số điện thoại: ");
            this.soDienThoai = new Scanner(System.in).nextLong();
            if (soDienThoai < 1000000 || soDienThoai > 9999999 ){
                System.out.println("nhập sai yêu cầu nhập lại");
            }
        }while (soDienThoai < 1000000 || soDienThoai > 9999999);
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien=" + maSinhVien +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai=" + soDienThoai +
                '}';
    }
}
