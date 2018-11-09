package com.lananh1.bai5.toptailieu;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhachHang {
    private int maKhachHang;
    private String hoVaTen;
    private Date ngayRaHoaDon;
    private long soDienTieuThu;

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(Date ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public long getSoDienTieuThu() {
        return soDienTieuThu;
    }

    public void setSoDienTieuThu(long soDienTieuThu) {
        this.soDienTieuThu = soDienTieuThu;
    }

    public KhachHang(int maKhachHang, String hoVaTen, Date ngayRaHoaDon, long soDienTieuThu) {
        this.maKhachHang = maKhachHang;
        this.hoVaTen = hoVaTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soDienTieuThu = soDienTieuThu;
    }
    public KhachHang() {
    }
    public void nhap() {
        System.out.println("nhập vào mã khách hàng: ");
        this.maKhachHang = new Scanner(System.in).nextInt();
        System.out.println("nhập vào hộc tên khách hàng: ");
        this.hoVaTen = new Scanner(System.in).nextLine();
        System.out.println("nhập vào số điện tiêu thụ: ");
        this.soDienTieuThu = new Scanner(System.in).nextLong();
        System.out.println("Nhập vào ngày nhập: ");
        try {
            String ngay = new Scanner(System.in).nextLine();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            this.ngayRaHoaDon = df.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public long thanhTien() {
        return 0;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKhachHang=" + maKhachHang +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngayRaHoaDon=" + ngayRaHoaDon +
                ", soDienTieuThu=" + soDienTieuThu +
                '}';
    }
}
