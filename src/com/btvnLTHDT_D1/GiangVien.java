package com.btvnLTHDT_D1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public  abstract class GiangVien implements ITinhLuong{
    private String maSo;
    private String ten;
    private Date ngayThangNamSinh;
    private int hocVi;
    private Date ngayDuocNhanVaoTruong;
    private SoYeuLyLich soYeuLyLich;

    public SoYeuLyLich getSoYeuLyLich() {
        return soYeuLyLich;
    }

    public void setSoYeuLyLich(SoYeuLyLich soYeuLyLich) {
        this.soYeuLyLich = soYeuLyLich;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }

    public void setNgayThangNamSinh(Date ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public int getHocVi() {
        return hocVi;
    }

    public void setHocVi(int hocVi) {
        this.hocVi = hocVi;
    }

    public Date getNgayDuocNhanVaoTruong() {
        return ngayDuocNhanVaoTruong;
    }

    public void setNgayDuocNhanVaoTruong(Date ngayDuocNhanVaoTruong) {
        this.ngayDuocNhanVaoTruong = ngayDuocNhanVaoTruong;
    }

    public GiangVien(String maSo, String ten, Date ngayThangNamSinh, int hocVi, Date ngayDuocNhanVaoTruong) {
        this.maSo = maSo;
        this.ten = ten;
        this.ngayThangNamSinh = ngayThangNamSinh;
        this.hocVi = hocVi;
        this.ngayDuocNhanVaoTruong = ngayDuocNhanVaoTruong;
    }

    public GiangVien() {

    }

    public void nhap() {
        System.out.println("nhập vào mã số giảng viên: ");
        this.maSo = new Scanner(System.in).nextLine();
        System.out.println("nhập vào tên giảng viên: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.println("nhập vào ngày tháng năm sinh của giảng viên: ");
        String ngay = new Scanner(System.in).nextLine();
        System.out.println("nhập vào ngày được nhận vào trường: ");
        String ngayVaoTruong = new Scanner(System.in).nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            ngayThangNamSinh = df.parse(ngay);
            ngayDuocNhanVaoTruong = df.parse(ngayVaoTruong);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("nhập vào học vị");
        do {
            System.out.println("nhập vào 1 nếu là Cử nhân, 2 là Thạc sĩ," +
                    " 3 là Tiến sĩ, 4 là Phó giáo sư, 5 Giáo sư, sai nhập lại !");
            this.hocVi = new Scanner(System.in).nextInt();
            if (hocVi==1)
                System.out.println("Học vị Cử nhân");
            if (hocVi == 2)
                System.out.println("Học vị Thạc sĩ");
            if (hocVi == 3)
                System.out.println("Học vị là Tiến sĩ");
            if (hocVi == 4)
                System.out.println("Học vị là Phó giáo sư");
            if (hocVi == 5)
                System.out.println("Học vị là Giáo sư");
        }while (hocVi != 1 && hocVi != 2 && hocVi != 3 && hocVi != 4 && hocVi != 5);
        System.out.println("nhập vào sơ yếu lý lịch: ");
        SoYeuLyLich soYeuLyLich = new SoYeuLyLich();
        soYeuLyLich.nhap();
    }


    @Override
    public String toString() {
        String hv;
        switch (hocVi){
            case 1:
                hv = "Cử nhân";
                break;
            case 2:
                hv = "Thạc sĩ";
                break;
            case 3:
                hv = "Tiến sĩ";
                break;
            case 4:
                hv = "Phó Giáo Sư";
                break;
            default:
                hv = "Giáo sư";
                break;
        }
        return "GiangVien{" +
                "maSo='" + maSo + '\'' +
                ", ten='" + ten + '\'' +
                ", ngayThangNamSinh=" + ngayThangNamSinh +
                ", ngayDuocNhanVaoTruong=" + ngayDuocNhanVaoTruong +
                ", soYeuLyLich=" + soYeuLyLich +
                '}';
    }
}
