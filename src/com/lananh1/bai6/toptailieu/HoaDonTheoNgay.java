package com.lananh1.bai6.toptailieu;

import java.util.Scanner;

public class HoaDonTheoNgay extends HoaDon {
    private int soNgayThue;
    private double thanhTien;

    public HoaDonTheoNgay(int maHoaDon, String tenKhachHang, int maPhong, double donGia, int soNgayThue, double thanhTien) {
        super(maHoaDon, tenKhachHang, maPhong, donGia);
        this.soNgayThue = soNgayThue;
        this.thanhTien = thanhTien;
    }

    public HoaDonTheoNgay() {
        super();
    }

    public HoaDonTheoNgay(int soNgayThue, double thanhTien) {
        this.soNgayThue = soNgayThue;
        this.thanhTien = thanhTien;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập vào số ngày thuê: ");
        this.soNgayThue = new Scanner(System.in).nextInt();
    }

    @Override
    public double tinhTien() {
        if (soNgayThue > 7) {
            return thanhTien = getSoNgayThue() * getDonGia() * 0.2;
        } else {
            return thanhTien = getSoNgayThue() * getDonGia();
        }
    }

    @Override
    public String toString() {
        return "HoaDonTheoNgay{" + super.toString() +
                "soNgayThue=" + soNgayThue +
                ", thanhTien=" + thanhTien +
                '}';
    }
}
