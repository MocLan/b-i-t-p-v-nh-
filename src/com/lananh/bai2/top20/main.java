package com.lananh.bai2.top20;

public class main {
    public static void main(String[] args) {
        SinhVien sinhVien1 = new SinhVien(611208 ,"LanAnh",8.9f,9.9f);
        sinhVien1.diemTB();
        SinhVien sinhVien2 = new SinhVien(611280,"Hoa",4.5f,6.7f);
        sinhVien2.diemTB();
        SinhVien sinhVien3 = new SinhVien();
        sinhVien3.diemTB();
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n",
                "mã sinh viên","họ tên","điểm LT","điểm TH","điểm tb");
        System.out.printf("========================================================================================\n");
        System.out.println(sinhVien1.toString());
        System.out.println(sinhVien2.toString());
        System.out.println(sinhVien3.toString());


    }
}
