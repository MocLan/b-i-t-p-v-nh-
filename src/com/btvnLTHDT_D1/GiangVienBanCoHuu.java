package com.btvnLTHDT_D1;

import java.util.Scanner;

public class GiangVienBanCoHuu extends GiangVien {
    private double luongCoBan;

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public GiangVienBanCoHuu(){

    }
    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhập lương cơ bản: ");
        this.luongCoBan = new Scanner(System.in).nextDouble();
    }

    @Override
    public double tinhLuong() {
        double hso;
        if(getHocVi() ==1)
            hso = 0.15;
        else if (getHocVi() == 2)
            hso= 0.3;
        else if (getHocVi() == 3)
            hso = 0.5;
        else
            hso = 0.7;
        return getLuongCoBan() + getLuongCoBan()*hso;

    }

}
