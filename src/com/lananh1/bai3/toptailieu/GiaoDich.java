package com.lananh1.bai3.toptailieu;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GiaoDich {
    private String maGiaoDich;
    private Date ngayGiaoDich;
    private long donGia;
    private long soLuong;

    public GiaoDich(String maGiaoDich, Date ngayGiaoDich, long donGia, long soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public GiaoDich() {
        this.maGiaoDich = "";
        //this.ngayGiaoDich = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayGiaoDich = df.parse("2/9/2018");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.soLuong = 12;
        this.donGia = 10;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(long soLuong) {
        this.soLuong = soLuong;
    }

    public void nhapGiaoDich() {
        System.out.println("nhập vào mã giao dịch: ");
        this.maGiaoDich = new Scanner(System.in).nextLine();
        System.out.println("nhập vào ngày giao dịch: ");
        String ngay = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/mm/yy");
        try {
            this.ngayGiaoDich = df.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("nhập vào số lượng: ");
        this.soLuong = new Scanner(System.in).nextLong();
        System.out.println("nhập vào đơn giá: ");
        this.donGia = new Scanner(System.in).nextLong();
    }

    public double thanhTien() {
        return 0;
    }

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", ngayGiaoDich=" + ngayGiaoDich +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                '}';
    }
}
