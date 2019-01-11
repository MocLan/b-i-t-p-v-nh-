package com.lananh1.bai2.toptailieu;

import java.util.Date;
import java.util.Scanner;

public class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao(String maSach, Date ngayNhap, long donGia, int soLuong, String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.thue = thue;
    }

    public SachThamKhao(double thue) {
        this.thue = thue;
    }

    public SachThamKhao() {
        super();
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhập vào số thuế: ");
        this.thue = new Scanner(System.in).nextDouble();

    }

    @Override
    public double thanhTien() {
        return (double) (getSoLuong() * getDonGia() + thue);
    }

    @Override
    public String toString() {
        return "SachThamKhao{" + super.toString() +
                "thue=" + thue +
                '}';
    }
}
