package com.lananh1.bai4.toptailieu;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichDat extends  GiaoDich{
    private int loaiDat;
    private double tinhTien;

    public int getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }

    public double getTinhTien() {
        return tinhTien;
    }

    public void setTinhTien(double tinhTien) {
        this.tinhTien = tinhTien;
    }

    public GiaoDichDat(int loaiDat, double tinhTien) {
        this.loaiDat = loaiDat;
        this.tinhTien = tinhTien;
    }

    public GiaoDichDat(int maGiaoDich, Date ngayGiaoDich, long donGia, double dienTich, int loaiDat, double tinhTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
        this.tinhTien = tinhTien;
    }
    public GiaoDichDat() {
        super();
        this.loaiDat = 0;
    }

    @Override
    public void nhap() {
        super.nhap();
    }

    @Override
    public double thanhTien() {
        do {
            System.out.println("nhập vào loại đất 1 là loại A, 2 là loại B, 3 là loại C, nếu sai nhập lại!");
            this.loaiDat = new Scanner(System.in).nextInt();
            if(loaiDat == 1){
                return  tinhTien = getDienTich() * getDonGia() * 1.5;
            }
            else if (loaiDat == 2){
                return  tinhTien = getDienTich() * getDonGia();
            }
            else
                return tinhTien= getDienTich() * getDonGia();

        }while(loaiDat != 1 && loaiDat != 2 && loaiDat != 3);

    }

    @Override
    public String toString() {
        return "GiaoDichDat{" +super.toString()+
                "loaiDat=" + loaiDat +
                ", tinhTien=" + tinhTien +
                '}';
    }
}
