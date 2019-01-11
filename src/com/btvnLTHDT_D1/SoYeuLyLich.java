package com.btvnLTHDT_D1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoYeuLyLich  {
    private String hoTen;
    private int gioiTinh;
    private String email;
    private String soDienThoai;
    private List<BangCap> danhsachBang = new ArrayList<>();

    public List<BangCap> getDanhsachBang() {
        return danhsachBang;
    }

    public void setDanhsachBang(List<BangCap> danhsachBang) {
        this.danhsachBang = danhsachBang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public SoYeuLyLich(){


    }
    public SoYeuLyLich(String hoTen, int gioiTinh, String email, String soDienThoai, List<BangCap> danhsachBang) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.danhsachBang = danhsachBang;
    }

    public void nhap() {
        System.out.println("nhập vào họ tên giảng viên");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("nhập vào giới tính");
        do {
            System.out.println("nhập vào 1 nếu là nữ, 2 nếu là nam, 3 nếu là giới tính khác," +
                    "sai nhập lại !");
            this.gioiTinh = new Scanner(System.in).nextInt();
            if (gioiTinh == 1)
                System.out.println("nữ");
            if (gioiTinh==2)
                System.out.println("nam");
            if (gioiTinh == 3)
                System.out.println("giới tính khác");
        }while (gioiTinh!=1 && gioiTinh!=2 && gioiTinh!=3);
        System.out.println("nhập vào email: ");
        this.email = new Scanner(System.in).nextLine();
        System.out.println("nhập vào số điện thoại: ");
        this.soDienThoai = new Scanner(System.in).nextLine();
        int soBang;
        System.out.println("nhập vào số bằng cấp:");
        soBang = new Scanner(System.in).nextInt();
        for (int i = 0; i <soBang ; i++) {
            BangCap bangCap = new BangCap();
            bangCap.nhapBangCap();
            danhsachBang.add(bangCap);
        }
    }

    @Override
    public String toString() {
        String gt;
        switch (gioiTinh){
            case 1:
                gt = "nữ";
                break;
            case 2:
                gt = "nam";
                break;
            default:
                gt = "giới tính khác";
                break;
        }
        return "SoYeuLyLich{" +
                "hoTen='" + hoTen + '\'' +
                ", email='" + email + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", danhsachBang=" + danhsachBang +
                '}';
    }
}
