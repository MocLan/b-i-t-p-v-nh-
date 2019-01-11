package com.lananh1.bai4.toptailieu;

import java.util.Calendar;
import java.util.Scanner;

public class QLGiaoDich {
    private GiaoDich[] danhSachGiaoDich;
    private int n;
    private int tong = 0;
    private int dem = 0;

    public QLGiaoDich() {
        this.danhSachGiaoDich = new GiaoDich[n];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void ThemNhaDat() {
        int k;
        System.out.println("nhập vào số xe cần nhập: ");
        this.n = new Scanner(System.in).nextInt();
        danhSachGiaoDich = new GiaoDich[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhập thông nhà đất thứ " + (i + 1));
            do {
                System.out.println("nhập vào 1 nếu thêm đất, nhập 2 nếu thêm nhà " +
                        ", nếu sai nhập lại !");
                k = new Scanner(System.in).nextInt();
                if (k != 1 && k != 2) {
                    System.out.println("nhập sai yêu cầu nhập lại");
                }
            } while (k != 1 && k != 2);
            if (k == 1) {
                danhSachGiaoDich[i] = new GiaoDichDat();
                danhSachGiaoDich[i].nhap();

            } else if (k == 2) {
                danhSachGiaoDich[i] = new GiaoDichNha();
                danhSachGiaoDich[i].nhap();

            }
        }

    }

    public long tongThanhTienTrungBinhDat() {

        for (GiaoDich giaoDichNhaDat : danhSachGiaoDich) {
            if (giaoDichNhaDat instanceof GiaoDichDat) {
                tong += giaoDichNhaDat.thanhTien();
                dem++;
            }
        }
        if (dem == 0) {
            return tong;
        }
        return 0;
    }

    public void xuatGiaoDichCanTim() {
        for (int i = 0; i < danhSachGiaoDich.length; i++) {
            Calendar c = Calendar.getInstance();
            c.setTime(danhSachGiaoDich[n].getNgayGiaoDich());
            int thang = c.get(Calendar.MONTH) + 1;
            int nam = c.get(Calendar.YEAR);
            if (thang == 9 && nam == 2013) {
                danhSachGiaoDich[n].toString();
            }
        }
    }

}
