package com.lananh1.bai1.toptailieu;

import java.util.Scanner;

public class Xe {
    private String maSoChuyen;
    private String soXe;
    private String hoTenTaiXe;
    private long doanhThu;

    public Xe(String maSoChuyen, String soXe, String hoTenTaiXe, long doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.soXe = soXe;
        this.hoTenTaiXe = hoTenTaiXe;
        this.doanhThu = doanhThu;
    }

    public Xe() {
        this.maSoChuyen = "1a3";
        this.soXe = "123";
        this.hoTenTaiXe = "Nguyen Thi Lan Anh";
        this.doanhThu = 12;

    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public long getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(long doanhThu) {
        this.doanhThu = doanhThu;
    }

    public void nhap() {
        System.out.println("nhập vào mã số chuyến xe: ");
        this.maSoChuyen = new Scanner(System.in).nextLine();
        System.out.println("nhập vào số xe: ");
        this.soXe = new Scanner(System.in).nextLine();
        System.out.println("nhập vào họ tên tài xế: ");
        this.hoTenTaiXe = new Scanner(System.in).nextLine();
        System.out.println("nhập vào doanh thu: ");
        this.doanhThu = new Scanner(System.in).nextLong();
    }

    @Override
    public String toString() {
        return "Xe{" +
                "maSoChuyen='" + maSoChuyen + '\'' +
                ", soXe='" + soXe + '\'' +
                ", hoTenTaiXe='" + hoTenTaiXe + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }
}
