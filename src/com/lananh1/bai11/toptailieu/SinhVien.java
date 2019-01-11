package com.lananh1.bai11.toptailieu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SinhVien {
    public static final int TRUNG_CAP = 1;
    public static final int CAO_DANG = 2;
    public static final int DAI_HOC = 3;
    private String ten;
    private String maSinhVien;
    private Date ngayNhapHoc;
    private int heDaiHoc;

    public SinhVien() {
        this.ten = "";
        this.maSinhVien = "";
        this.heDaiHoc = 0;
    }

    public SinhVien(String ten, String maSV, int heDH) {
        this.ten = ten;
        this.maSinhVien = maSV;
        this.heDaiHoc = heDH;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public Date getNgayNhapHoc() {
        return ngayNhapHoc;
    }

    public void setNgayNhapHoc(Date ngayNhapHoc) {
        this.ngayNhapHoc = ngayNhapHoc;
    }

    public int getHeDaiHoc() {
        return heDaiHoc;
    }

    public void setHeDaiHoc(int heDaiHoc) {
        this.heDaiHoc = heDaiHoc;
    }

    public void chonHeDaiHoc() {
        switch (heDaiHoc) {
            case TRUNG_CAP:
                System.out.println("he Trung cap co 2 nam");
                break;
            case CAO_DANG:
                System.out.println("he cao dang co 3 nam");
                break;
            case DAI_HOC:
                System.out.println("he dai hoc co 4 nam");
            default:
                break;
        }
    }

    public void nhap() {
        System.out.println("nhap vao ten sinh vien: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.println("nhap vao ma sinh vien: ");
        this.maSinhVien = new Scanner(System.in).nextLine();
        System.out.println("ngay nhap hoc: ");
        String ngay = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngayNhapHoc = df.parse(ngay);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("chon he theo hoc: ");
        System.out.println("1.trung cap");
        System.out.println("2.cao dang");
        System.out.println("3.dai hoc");
        this.heDaiHoc = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", maSinhVien='" + maSinhVien + '\'' +
                ", ngayNhapHoc=" + ngayNhapHoc +
                ", heDaiHoc=" + heDaiHoc +
                '}';
    }
}
