package com.lananh1.bai4.toptailieu;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichNha extends GiaoDich {
    private int loaiNha;
    private String diaChi;

    public int getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(int loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public GiaoDichNha() {
        super();
        this.loaiNha = 0;
        this.diaChi = "";
    }

    public GiaoDichNha(int loaiNha, String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha(int maGiaoDich, Date ngayGiaoDich, long donGia, double dienTich, int loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhap vao loai nha can thanh toan");
        System.out.println("nhập vào 1 là nhà cao cấp  hoặc 2 là nhà thường)");
        this.loaiNha = new Scanner(System.in).nextInt();
        System.out.println("nhap dia chi");
        this.diaChi = new Scanner(System.in).nextLine();
    }

    @Override
    public double thanhTien() {
        if (loaiNha == 1) {
            return (long) (getDienTich() * getDonGia());
        }
        if (loaiNha == 2) {
            return (long) (getDienTich() * getDonGia() * 0.9);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" + super.toString() +
                "loaiNha=" + loaiNha +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
