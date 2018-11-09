package com.lananh1.bai3.toptailieu;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichVang extends GiaoDich{
    private String loaiVang;

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public GiaoDichVang(String maGiaoDich, Date ngayGiaoDich, long donGia, long soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public GiaoDichVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }

    public GiaoDichVang(){
        super();
        this.loaiVang = "9999";
    }

    @Override
    public void nhapGiaoDich() {
        super.nhapGiaoDich();
        System.out.println("nhập vào loại vàng: ");
        this.loaiVang = new Scanner(System.in).nextLine();
    }

    @Override
    public double thanhTien() {
        double thanhTien;
        return thanhTien = getSoLuong() * getDonGia();
    }

    @Override
    public String toString() {
        return "GiaoDichVang{" + super.toString() +
                "loaiVang='" + loaiVang + '\'' +
                '}';
    }
}
