package com.chuaBtDaHinh.bai1;

import java.util.Scanner;

public class QLCX {
    private Xe[] danhSachXe;
    private int n;
    private int tongDoanhThuNgoaiThanh;
    private int tongDoanhThuNoiThanh;

    public QLCX() {
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
                danhSachXe[i] = new ChuyenXeNgoaiThanh();
                danhSachXe[i].nhap();


            } else {
                danhSachXe[i] = new ChuyenXeNoiThanh();
                danhSachXe[i].nhap();

            }
        }

    }
    public double doanhThu(){
        long tong = 0;
        for (int i = 0; i <n ; i++) {
           tong  += danhSachXe[i].doanhThu();
           if (danhSachXe[i] instanceof ChuyenXeNoiThanh)
               tongDoanhThuNoiThanh += danhSachXe[i].doanhThu();
           if (danhSachXe[i] instanceof ChuyenXeNgoaiThanh)
               tongDoanhThuNgoaiThanh += danhSachXe[i].doanhThu();
        }
        return tong;
    }

    public void Xuat() {
        for (int i = 0; i < n; i++) {
            System.out.println(danhSachXe[i].toString());
        }
        System.out.println("tổng danh thu xe nội thành: " + tongDoanhThuNoiThanh);
        System.out.println("tổng doanh thu xe ngoại thành: " +tongDoanhThuNgoaiThanh);
    }
}

