package com.chuaBtDaHinh.bai2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Sach {
    private String maSach;
    private Date ngayNhap;
    private long donGia;
    private int soLuong;
    private String nhaXuatBan;

    public Sach(String maSach, Date ngayNhap, long donGia, int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public Sach() {

    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void nhap() {
        System.out.println("nhập vào mã sách: ");
        this.maSach = new Scanner(System.in).nextLine();
        System.out.println("nhập vào đơn giá: ");
        this.donGia = new Scanner(System.in).nextLong();
        System.out.println("nhập vào số lượng sách: ");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.println("nhập vào tên nhà xuất bản: ");
        this.nhaXuatBan = new Scanner(System.in).nextLine();
        System.out.println("nhập vào ngày nhập sách: ");
        String ngay = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/mm/yy");
        try {
            this.ngayNhap = df.parse(ngay);
        } catch (Exception e) {

        }
    }

    public abstract double thanhTien();

    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", ngayNhap=" + ngayNhap +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                '}';
    }
}
