package com.lananh1.bai2.toptailieu;

import java.util.Date;
import java.util.Scanner;

public class SachGiaoKhoa extends Sach {
    final int moi = 1;
    final int cu = 2;
    private int tinhTrang;

    public SachGiaoKhoa() {
        super();
    }

    public SachGiaoKhoa(String maSach, Date ngayNhap, long donGia, int soLuong, String nhaXuatBan) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
    }

    @Override
    public double thanhTien() {
        if (moi == tinhTrang) {
            return getSoLuong() * getDonGia();
        }
        return (double) (getDonGia() * getSoLuong() * 0.5);
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhập vào tính trạng");
        this.tinhTrang = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "SachGiaoKhoa{" +
                "tinhTrang=" + tinhTrang +
                '}';
    }
}
