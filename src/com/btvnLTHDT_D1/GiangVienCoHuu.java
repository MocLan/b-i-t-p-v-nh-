package com.btvnLTHDT_D1;

import java.util.Date;
import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien {
    private int soGioNghienCuuKhoaHoc;
    private double luongCoBan;
    private int soGioNghiaVu;


    public int getSoGioNghienCuuKhoaHoc() {
        return soGioNghienCuuKhoaHoc;
    }

    public void setSoGioNghienCuuKhoaHoc(int soGioNghienCuuKhoaHoc) {
        this.soGioNghienCuuKhoaHoc = soGioNghienCuuKhoaHoc;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public GiangVienCoHuu(String maSo, String ten, Date ngayThangNamSinh, int hocVi, Date ngayDuocNhanVaoTruong, int soGioNghienCuuKhoaHoc, double luongCoBan, int soGioNghiaVu) {
        super(maSo, ten, ngayThangNamSinh, hocVi, ngayDuocNhanVaoTruong);
        this.soGioNghienCuuKhoaHoc = soGioNghienCuuKhoaHoc;
        this.luongCoBan = luongCoBan;
        this.soGioNghiaVu = soGioNghiaVu;
    }

    public GiangVienCoHuu(){

    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhập vào số giờ nghiên cứu khoa học: ");
        this.soGioNghienCuuKhoaHoc = new Scanner(System.in).nextInt();
        System.out.println("nhập vào lương cơ bản");
        this.luongCoBan = new Scanner(System.in).nextDouble();
        if (getHocVi()==1 || getHocVi() ==2){
            this.soGioNghiaVu = Constant.Kysu_va_Thacsi_gio_nghia_vu;
        }
        else
            this.soGioNghiaVu = Constant.Tiensi_Phogiaosu_Giaosu_gio_nghia_vu;
    }

    @Override
    public String toString() {
        return "GiangVienCoHuu{" + super.toString() +
                "soGioNghienCuuKhoaHoc=" + soGioNghienCuuKhoaHoc +
                ", luongCoBan=" + luongCoBan +
                '}';
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

    public double thuLaoVuotChuan(int soGioGiangThucTe){

        if (soGioGiangThucTe <= this.soGioNghiaVu)
            return 0;
        else if (soGioGiangThucTe < this.soGioNghienCuuKhoaHoc)
            return 0;
        else if (soGioGiangThucTe > this.soGioNghiaVu){
            int gioVuotChuan;
            double tienVuotChuan;
            gioVuotChuan = soGioGiangThucTe - getSoGioNghienCuuKhoaHoc();
            tienVuotChuan = gioVuotChuan * 80000 * 0.1*tinhLuong();
            return tienVuotChuan;
        }
        return 0;
    }



}
