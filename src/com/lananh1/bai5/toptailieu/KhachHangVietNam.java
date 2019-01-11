package com.lananh1.bai5.toptailieu;

import java.util.Date;
import java.util.Scanner;

public class KhachHangVietNam extends KhachHang {
    private long donGia;
    private long dinhMuc;

    public KhachHangVietNam(int maKhachHang, String hoVaTen, Date ngayRaHoaDon, long soDienTieuThu, long donGia, long dinhMuc) {
        super(maKhachHang, hoVaTen, ngayRaHoaDon, soDienTieuThu);
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    public KhachHangVietNam() {
        super();
    }

    public KhachHangVietNam(long donGia, long dinhMuc) {
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public long getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(long dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhap vao don gia: ");
        this.donGia = new Scanner(System.in).nextLong();
        System.out.println("nhap vao dinh muc: ");
        this.dinhMuc = new Scanner(System.in).nextLong();
    }

    @Override
    public long thanhTien() {
        if (getSoDienTieuThu() >= dinhMuc) {
            return getSoDienTieuThu() * donGia;
        } else {
            return (long) (getSoDienTieuThu() * donGia * (dinhMuc + (getSoDienTieuThu() - dinhMuc)) * donGia * 2.5);
        }
    }

    @Override
    public String toString() {
        return "KhachHangVietNam{" + super.toString() +
                "donGia=" + donGia +
                ", dinhMuc=" + dinhMuc +
                '}';
    }
}
