package com.lananh1.bai11.toptailieu;

import java.util.Scanner;

public class SinhVienCaoDang extends SinhVien{
    private String chuyenNganh;
    private int soTinChi;
    private int thoiGianHoc;

    public static final int TRONG_GIO_HANH_CHINH = 1;
    public static final int NGOAI_GIO_HANH_CHINH = 2;

    public String getChuyenNganh() {
        return chuyenNganh;
    }
    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    public int getSoTinChi() {
        return soTinChi;
    }
    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public long hocPhi() {
        switch (thoiGianHoc) {
            case TRONG_GIO_HANH_CHINH:
                System.out.println("hoc phi trong gio hanh chinh:");
                return soTinChi * 350;
            case NGOAI_GIO_HANH_CHINH:
                System.out.println("hoc phi ngoai gio hanh chinh:");
                return soTinChi * 500;
            default:
                return 0;
        }
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhap vao so tin chi dang ki: ");
        this.soTinChi = new Scanner(System.in).nextInt();
        System.out.println("chon thoi gian hoc: ");
        System.out.println("1.trong gio hanh chinh");
        System.out.println("2.ngoai gio hanh chinh");
        this.thoiGianHoc = new Scanner(System.in).nextInt();
    }
}
