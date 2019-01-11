package com.lananh1.bai3.toptailieu;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich {
    private float tiGia;
    private int x;

    public GiaoDichTienTe() {
        super();
        this.tiGia = 2;

    }

    public GiaoDichTienTe(String maGiaoDich, Date ngayGiaoDich, long donGia, long soLuong) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    @Override
    public void nhapGiaoDich() {
        super.nhapGiaoDich();
        System.out.println("nhập tỉ Giá: ");
        this.tiGia = new Scanner(System.in).nextFloat();
    }

    @Override
    public double thanhTien() {
        double thanhTien;
        System.out.println("nhập 1 là USD hoac Euro");
        System.out.println("nhập 2 là VND");
        System.out.println("nhap vao loai tien: ");
        this.x = new Scanner(System.in).nextInt();
        if (x == 1) {
            thanhTien = this.getSoLuong() * this.getDonGia() * this.tiGia;
            return thanhTien;
        }
        if (x == 2) {
            thanhTien = this.getSoLuong() * getDonGia();
            return thanhTien;
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "GiaoDichTienTe{" + super.toString() +
                "tiGia=" + tiGia +
                '}';
    }
}
