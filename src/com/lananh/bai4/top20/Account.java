package com.lananh.bai4.top20;

import java.util.Scanner;

public class Account {
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTienTrongTaiKhoan;
    final double laiSuat = 0.035;

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }


    public Account(long soTaiKhoan, String tenTaiKhoan, double soTienTrongTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;

    }

    public Account(){
        this.soTaiKhoan = 123456789;
        this.tenTaiKhoan = "moclan";
        this.soTienTrongTaiKhoan = 50;
    }
    public double napTien(){
        double soTienNap;
        do
        {
            System.out.println("nhập vào số tiền nạp: ");
            soTienNap = new Scanner(System.in).nextDouble();
            if (soTienNap < 0){
                System.out.println("nhập sai yêu cầu nhập lại! ");
            }

        }while (soTienNap < 0);
       return soTienTrongTaiKhoan += soTienNap;
    }

    public double rutTien(){
        double soTienRut;
        float phiRutTien;
        System.out.println("nhập phí rút tiền: ");
        phiRutTien = new Scanner(System.in).nextFloat();
        do
        {
            System.out.println("nhập vào số tiền rút: ");
            soTienRut = new Scanner(System.in).nextDouble();
            if (soTienRut > soTienTrongTaiKhoan){
                System.out.println("không hợp lệ yêu cầu nhập lại! ");
            }

        }while (soTienRut > soTienTrongTaiKhoan);
        return soTienTrongTaiKhoan -= (soTienRut + phiRutTien);
    }

    public  double daoHan(){
        return soTienTrongTaiKhoan += soTienTrongTaiKhoan * laiSuat;
    }

    @Override
    public String toString() {
        return "Account{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", soTienTrongTaiKhoan=" + soTienTrongTaiKhoan +
                ", laiSuat=" + laiSuat +
                ", naptien=" + napTien() +
                ", ruttien=" + rutTien() +
                ", daohan=" + daoHan() +
                '}';
    }
}
