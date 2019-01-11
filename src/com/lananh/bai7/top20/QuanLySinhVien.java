package com.lananh.bai7.top20;

import java.util.Scanner;

public class QuanLySinhVien {
    private SinhVien[] danhSachsv;
    private int n;

    public QuanLySinhVien() {
        danhSachsv = new SinhVien[100];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void themSinhVien() {
        System.out.println("nhập vào số sinh viên cần thêm: ");
        n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhập thông tin sinh viên thứ " + (i + 1));
            danhSachsv[i] = new SinhVien();
            danhSachsv[i].nhap();
        }
    }

    public void xuatDanhSachsv() {
        for (int i = 0; i < n; i++) {
            System.out.println(danhSachsv[i].toString());
        }
    }
}
