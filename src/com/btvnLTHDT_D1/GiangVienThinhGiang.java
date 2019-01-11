package com.btvnLTHDT_D1;

import java.util.*;

public class GiangVienThinhGiang extends GiangVien {
    private int kyHocGiangDay;
    private int soTietThucGiang;

    public int getKiHocGiangDay() {
        return kyHocGiangDay;
    }

    public void setKiHocGiangDay(int kiHocGiangDay) {
        this.kyHocGiangDay = kiHocGiangDay;
    }

    public int getSoTietThucGiang() {
        return soTietThucGiang;
    }

    public void setSoTietThucGiang(int soTietThucGiang) {
        this.soTietThucGiang = soTietThucGiang;
    }
    public GiangVienThinhGiang(){

    }

    public GiangVienThinhGiang(String maSo, String ten, Date ngayThangNamSinh, int hocVi, Date ngayDuocNhanVaoTruong, int kyHocGiangDay, int soTietThucGiang) {
        super(maSo, ten, ngayThangNamSinh, hocVi, ngayDuocNhanVaoTruong);
        this.kyHocGiangDay = kyHocGiangDay;
        this.soTietThucGiang = soTietThucGiang;
    }

    public GiangVienThinhGiang(int kyHocGiangDay, int soTietThucGiang) {
        this.kyHocGiangDay = kyHocGiangDay;
        this.soTietThucGiang = soTietThucGiang;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhập vào kỳ học giảng dạy: ");
        this.kyHocGiangDay = new Scanner(System.in).nextInt();
        System.out.println("nhập vào số tiết thực giảng: ");
        this.soTietThucGiang = new Scanner(System.in).nextInt();
    }

    @Override
    public String toString() {
        return "GiangVienThinhGiang{" + super.toString() +
                "kyHocGiangDay=" + kyHocGiangDay +
                ", soTietThucGiang=" + soTietThucGiang +
                '}';
    }

    @Override
    public double tinhLuong() {
        return 6 *(getSoTietThucGiang() * 100000);
    }


}
