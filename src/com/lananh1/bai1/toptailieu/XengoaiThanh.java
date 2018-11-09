package com.lananh1.bai1.toptailieu;

import com.lananh1.bai1.toptailieu.Xe;

import java.util.Scanner;

public class XengoaiThanh extends Xe {
    private String noiDen;
    private float soNgayDiDuoc;

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public float getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(float soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public XengoaiThanh(String maSoChuyen, String soXe, String hoTenTaiXe, long doanhThu, String noiDen, float soNgayDiDuoc) {
        super(maSoChuyen, soXe, hoTenTaiXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public XengoaiThanh(String noiDen, float soNgayDiDuoc) {
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public XengoaiThanh() {
        super();
        this.soNgayDiDuoc = 26;
        this.noiDen = "Hà Nội";
    }

    public void nhap() {
        super.nhap();
        System.out.println("nhập vào nơi đến: ");
        this.noiDen = new Scanner(System.in).nextLine();
        System.out.println("nhập vào số km đi được ");
        this.soNgayDiDuoc = new Scanner(System.in).nextFloat();
    }

    @Override
    public String toString() {
        return "XengoaiThanh{" + super.toString() +
                "noiDen='" + noiDen + '\'' +
                ", soNgayDiDuoc=" + soNgayDiDuoc +
                '}';
    }
}
