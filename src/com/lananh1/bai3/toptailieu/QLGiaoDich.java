package com.lananh1.bai3.toptailieu;

import java.util.Scanner;

public class QLGiaoDich {
    private GiaoDich[] danhsachGD;
    private int n;
    private double tong1 = 0;
    private double tong2 = 0;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void themGiaoDich() {
        int k;
        System.out.println("số giao dịch cần nhập là: ");
        this.n = new Scanner(System.in).nextInt();
        danhsachGD = new GiaoDich[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("nhập vào 1 nếu là giao dịch vàng, nhập vào 2 nếu giao dịch tiền tệ, nếu sai nhập lại!");
                k = new Scanner(System.in).nextInt();
                if (k != 1 && k != 2) {
                    System.out.println("nhập sai yêu cầu nhập lại !");
                }
            } while (k != 1 && k != 2);
            if (k == 1) {
                danhsachGD[i] = new GiaoDichVang();
                danhsachGD[i].nhapGiaoDich();
                tong1 += danhsachGD[i].thanhTien();

            } else if (k == 2) {
                danhsachGD[i] = new GiaoDichTienTe();
                danhsachGD[i].nhapGiaoDich();
                tong2 += danhsachGD[i].thanhTien();
            }
        }
    }

    public void tongThanhTien() {
        System.out.println("tổng thành tiền giao dịch tiền tệ là: " + tong2);
        System.out.println("tổng thành tiền giao dịch vàng là : " + tong1);
    }

    public void Xuat() {
        for (int i = 0; i < n; i++) {
            System.out.println(danhsachGD[i].toString());
        }
    }
}
