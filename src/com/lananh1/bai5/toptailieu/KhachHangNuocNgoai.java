package com.lananh1.bai5.toptailieu;

import java.util.Date;
import java.util.Scanner;

public class KhachHangNuocNgoai extends  KhachHang {
    private String quocTich;
    private long donGia;

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public KhachHangNuocNgoai(int maKhachHang, String hoVaTen, Date ngayRaHoaDon, long soDienTieuThu, String quocTich, long donGia) {
        super(maKhachHang, hoVaTen, ngayRaHoaDon, soDienTieuThu);
        this.quocTich = quocTich;
        this.donGia = donGia;
    }
    public KhachHangNuocNgoai(){
        super();
    }

    public KhachHangNuocNgoai(String quocTich, long donGia) {
        this.quocTich = quocTich;
        this.donGia = donGia;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhap vao don gia: ");
        this.donGia = new Scanner(System.in).nextLong();
        System.out.println("nhap vao quoc tich: ");
        this.quocTich = new Scanner(System.in).nextLine();
    }

    @Override
    public long thanhTien() {
        return getSoDienTieuThu() * donGia;
    }

    @Override
    public String toString() {
        return "KhachHangNuocNgoai{" +super.toString() +
                "quocTich='" + quocTich + '\'' +
                ", donGia=" + donGia +
                '}';
    }
}
