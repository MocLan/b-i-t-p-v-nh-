package com.lananh.bai3.top20;

public class main {
    public static void main(String[] args) {
        Xe xe1 = new Xe();
        xe1.nhapThongTin();
        xe1.tinhThue();
        Xe xe2 = new Xe();
        xe2.nhapThongTin();
        xe2.tinhThue();
        Xe xe3 = new Xe();
        xe3.nhapThongTin();
        xe3.tinhThue();
        System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Tên chủ xe",
                "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
        System.out.println(xe1.toString());
        System.out.println(xe2.toString());
        System.out.println(xe3.toString());
    }
}
