package com.chuaBtDaHinh.bai1;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends Xe {
    private int soTuyen;
    private int sokmDiDuoc;

    public ChuyenXeNoiThanh(String maSoChuyen, String soXe, String hoTenTaiXe, long doanhThu, int soTuyen, int sokmDiDuoc) {
        super(maSoChuyen, soXe, hoTenTaiXe, doanhThu);
        this.soTuyen = soTuyen;
        this.sokmDiDuoc = sokmDiDuoc;
    }

    public ChuyenXeNoiThanh(int soTuyen, int sokmDiDuoc) {
        this.soTuyen = soTuyen;
        this.sokmDiDuoc = sokmDiDuoc;
    }

    public ChuyenXeNoiThanh() {
        super();
        this.sokmDiDuoc = 50;
        this.soTuyen = 11;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSokmDiDuoc() {
        return sokmDiDuoc;
    }

    public void setSokmDiDuoc(int sokmDiDuoc) {
        this.sokmDiDuoc = sokmDiDuoc;
    }

    public void nhap() {
        super.nhap();
        System.out.println("nhập vào số tuyến: ");
        this.soTuyen = new Scanner(System.in).nextInt();
        System.out.println("nhập vào số km đi được: ");
        this.sokmDiDuoc = new Scanner(System.in).nextInt();
    }

    @Override
    public double doanhThu() {
        return getDoanhThu()*sokmDiDuoc;
    }

    @Override
    public String toString() {
        return "XeNoiThanh{" + super.toString() +
                ",soTuyen=" + soTuyen +
                ", sokmDiDuoc=" + sokmDiDuoc +
                '}';
    }
}
