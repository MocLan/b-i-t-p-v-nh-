package com.lananh1.bai6.toptailieu;

import java.util.Scanner;

public class HoaDonTheoGio extends  HoaDon{
    private double soGioThue;
    private double thanhTien;

    public double getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(double soGioThue) {
        this.soGioThue = soGioThue;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public HoaDonTheoGio(int maHoaDon, String tenKhachHang, int maPhong, double donGia, double soGioThue, double thanhTien) {
        super(maHoaDon, tenKhachHang, maPhong, donGia);
        this.soGioThue = soGioThue;
        this.thanhTien = thanhTien;
    }

    public HoaDonTheoGio(double soGioThue, double thanhTien) {
        this.soGioThue = soGioThue;
        this.thanhTien = thanhTien;
    }
    public HoaDonTheoGio(){
        super();
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập vào số giờ thuê: ");
        this.soGioThue=new Scanner(System.in).nextDouble();
    }

    @Override
    public double tinhTien() {
        return thanhTien=getSoGioThue()*getDonGia();

    }

    @Override
    public String toString() {
        return "HoaDonTheoGio{" +super.toString()+
                "soGioThue=" + soGioThue +
                ", thanhTien=" + thanhTien +
                '}';
    }
}
