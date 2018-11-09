package com.lananh1.bai6.toptailieu;


import java.util.Scanner;

public class QLHĐ {
    private HoaDon[] danhSachHoaDon;
    private int n;
    private double tong1 =0;
    private double tong2=0;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void Them() {
        int k;
        System.out.println("nhập vào loại hóa đơn cần nhập: ");
        this.n = new Scanner(System.in).nextInt();
        danhSachHoaDon = new HoaDon[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập thông tin hóa đơn thứ "+(i+1));
            do {
                System.out.println("nhập vào 1 nếu thêm hóa đơn ngày, nhập 2 nếu thêm hóa đơn giờ " +
                        ", nếu sai nhập lại !");
                k = new Scanner(System.in).nextInt();
                if (k != 1 && k != 2) {
                    System.out.println("nhập sai yêu cầu nhập lại");
                }
            } while (k != 1 && k != 2);
            if (k == 1) {
                danhSachHoaDon[i] = new HoaDonTheoGio();
                danhSachHoaDon[i].nhap();
                tong1  += danhSachHoaDon[i].tinhTien();

            } else if (k == 2) {
                danhSachHoaDon[i] = new HoaDonTheoNgay();
                danhSachHoaDon[i].nhap();
                tong2 +=danhSachHoaDon[i].tinhTien();

            }

        }

    }
    public  void tongThanhTien(){
        System.out.println("tổng tiền hóa đơn ngày là: " + tong2);
        System.out.println("tổng tiền hóa đơn giờ là: " + tong1);
    }
     public void xuatDanhSach(){
        for (int i = 0; i < n; i++) {
            danhSachHoaDon[i].toString();
        }
    }


}
