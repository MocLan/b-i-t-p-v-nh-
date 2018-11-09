package com.lananh1.bai2.toptailieu;

import java.util.Scanner;

public class QLSach {
    private Sach[] danhSachSach;
    private int n;
    private double tong1=0;
    private double tong2=0;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void them() {
        int k;
        System.out.println("nhập vào số sách cần nhập: ");
        this.n = new Scanner(System.in).nextInt();
        danhSachSach = new Sach[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("nhập vào 1 nếu là sách giáo khoa, 2 nếu là sách tham khảo, nếu sai nhập lại !");
                k = new Scanner(System.in).nextInt();
                if (k != 1 && k != 2) {
                    System.out.println("nhập sai yêu vầu nhập lại !");
                }
            } while (k != 1 && k != 2);
            if (k == 1) {
                danhSachSach[i] = new SachGiaoKhoa();
                danhSachSach[i].nhap();
                tong1 += danhSachSach[i].thanhTien();

            }
            if (k == 2) {
                danhSachSach[i] = new SachThamKhao();
                danhSachSach[i].nhap();
                tong2 += danhSachSach[i].thanhTien();
            }
        }

    }
    public  void tongThanhTien(){
        System.out.println("tổng tiền sách tham khảo là: " + tong2);
        System.out.println("tổng tiền sách giáo khoa là: " + tong1);
    }
    public void xuatDanhSach(){
        for (int i = 0; i < n; i++) {
            danhSachSach[i].toString();
        }
    }

    public boolean sachCanTim(){
        for (int i = 0; i < n; i++) {
            if (danhSachSach[i].getNhaXuatBan().equals("x")) {
                danhSachSach[i].toString();
            }
        }return false;
    }



}
