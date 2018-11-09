package com.lananh1.bai5.toptailieu;

import java.util.Scanner;

public class QLKH {
    private KhachHang[] danhSachKhachHang;
    private int n;
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public QLKH() {
        this.danhSachKhachHang = new KhachHang[n];
    }

    public void Them() {
        int k;
        System.out.println("nhập vào số khách hàng cần nhập: ");
        this.n = new Scanner(System.in).nextInt();
        danhSachKhachHang = new KhachHang[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập thông tin khách hàng thứ "+(i+1));
            do {
                System.out.println("nhập vào 1 nếu thêm khách nước ngoài , nhập 2 nếu thêm khách việt" +
                        ", nếu sai nhập lại !");
                k = new Scanner(System.in).nextInt();
                if (k != 1 && k != 2) {
                    System.out.println("nhập sai yêu cầu nhập lại");
                }
            } while (k != 1 && k != 2);
            if (k == 1) {
                danhSachKhachHang[i] = new KhachHangNuocNgoai();
                danhSachKhachHang[i].nhap();
            } else if (k == 2) {
                danhSachKhachHang[i] = new KhachHangVietNam();
                danhSachKhachHang[i].nhap();
            }
        }
    }
    public long tinhTrungBinhHoaDonNguoiViet(){
        int tong =0;
        int dem =0;
        for (KhachHang khachHang : danhSachKhachHang) {
            if (khachHang instanceof KhachHangVietNam) {
                tong += khachHang.thanhTien();
                dem ++;
            }
        }
        if (dem == 0) {
            return tong/dem;
        }
        return 0;
    }
    public void Xuat() {
        for (int i = 0; i < n; i++) {
            System.out.println(danhSachKhachHang[i].toString());
        }
    }
}
