package com.lananh.bai6.top20;


public class HangThucPham {
    private String maHang;
    private String tenHang;
    private double donGia;
    private  Ngay ngaySanSuat;
    private  Ngay ngayHetHan;

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Ngay getNgaySanSuat() {
        return ngaySanSuat;
    }

    public void setNgaySanSuat(Ngay ngaySanSuat) {
        this.ngaySanSuat = ngaySanSuat;
    }

    public Ngay getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Ngay ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

   public HangThucPham(){
        this.ngaySanSuat = new Ngay(1,1,2018);
        this.ngaySanSuat = new Ngay(1,2,2018);
        this.tenHang = "1";
        this.maHang = "";
        this.donGia = 12;

    }

    public HangThucPham(String maHang, String tenHang, double donGia, Ngay ngaySanSuat, Ngay ngayHetHan) {
        if ("".equals(maHang)){
            this.maHang = "mac dinh";
        }
        this.tenHang = "asd";
        if ("".equals(tenHang)){
        }
        if (donGia < 0){
            this.donGia = 10;
        }
        if (ngayHetHan == null){
            this.ngayHetHan =new Ngay(1,3,2015);
        }
        if (ngaySanSuat == null){
            this.ngaySanSuat = new Ngay(2,4,2016);
        }
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanSuat = ngaySanSuat;
        this.ngayHetHan = ngayHetHan;
    }
   // public boolean soSanh()

    @Override
    public String toString() {
        return "HangThucPham{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", donGia=" + donGia +
                ", ngayHetHan=" + ngayHetHan +
                ", ngaySanSuat=" + ngaySanSuat +
                '}';
    }
}
