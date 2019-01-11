package com.lananh1.bai1.toptailieu;

import java.util.Scanner;

public class QLXe {
    private Xe[] danhSachXe;
    private int n;
    private long tong1 = 0;
    private long tong2 = 0;


    public QLXe() {
        this.danhSachXe = new Xe[n];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void ThemXe() {
        int k;
        System.out.println("nhập vào số xe cần nhập: ");
        this.n = new Scanner(System.in).nextInt();
        danhSachXe = new Xe[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập thông tin xe thứ " + (i + 1));
            do {
                System.out.println("nhập vào 1 nếu thêm xe ngoại thành, nhập 2 nếu thêm xe nội thành " +
                        ", nếu sai nhập lại !");
                k = new Scanner(System.in).nextInt();
                if (k != 1 && k != 2) {
                    System.out.println("nhập sai yêu cầu nhập lại");
                }
            } while (k != 1 && k != 2);
            if (k == 1) {
                danhSachXe[i] = new XengoaiThanh();
                danhSachXe[i].nhap();
                tong1 += danhSachXe[i].getDoanhThu();
            } else if (k == 2) {
                danhSachXe[i] = new XeNoiThanh();
                danhSachXe[i].nhap();
                tong2 += danhSachXe[i].getDoanhThu();
            }
        }

    }

    public void Xuat() {
        for (int i = 0; i < n; i++) {
            System.out.println(danhSachXe[i].toString());
        }
        System.out.println("tổng doanh thu chuyến xe nội thành là: " + tong2);
        System.out.println("tổng doanh thu xe ngoại thành là: " + tong1);
    }
}
