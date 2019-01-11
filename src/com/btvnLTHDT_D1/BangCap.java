package com.btvnLTHDT_D1;

import java.util.Scanner;

public class BangCap {
    private String tenTruongCap;
    private int namCap;
    private int hocVi;

    public int getHocVi() {
        return hocVi;
    }

    public void setHocVi(int hocVi) {
        this.hocVi = hocVi;
    }

    public String getTenTruongCap() {
        return tenTruongCap;
    }

    public void setTenTruongCap(String tenTruongCap) {
        this.tenTruongCap = tenTruongCap;
    }

    public int getNamCap() {
        return namCap;
    }

    public void setNamCap(int namCap) {
        this.namCap = namCap;
    }

    public BangCap(String tenTruongCap, int namCap, int hocVi) {
        this.tenTruongCap = tenTruongCap;
        this.namCap = namCap;
        this.hocVi = hocVi;
    }
    public BangCap(){

    }
    public void nhapBangCap(){
        System.out.println("nhập vào tên trường cấp: ");
        this.tenTruongCap = new Scanner(System.in).nextLine();
        System.out.println("nhập vào năm cấp: ");
        this.namCap =  new Scanner(System.in).nextInt();
        System.out.println("nhập vào học vị: ");
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
        return "BangCap{" +
                "tenTruongCap='" + tenTruongCap + '\'' +
                ", namCap=" + namCap +
                '}';
    }
}
