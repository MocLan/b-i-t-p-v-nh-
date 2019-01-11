package com.btvnLTHDT_D1;

import java.util.*;
public class QLGiangVien {
    List<GiangVien> danhSachGiangVien = new ArrayList<>();

    public boolean themGiangVien(){
        int k;
        GiangVien giangVien;
        System.out.println("nhập vào 1 thêm giảng viên cơ hữu, 2 thêm giảng viên bán cơ hữu, số còn lại thêm giảng viên thỉnh giảng: ");
        k = new Scanner(System.in).nextInt();
        if (k==1){
            giangVien = new GiangVienCoHuu();
            giangVien.nhap();
        }
        else if (k==2){
            giangVien = new GiangVienBanCoHuu();
            giangVien.nhap();
        }
        else {
            giangVien= new GiangVienThinhGiang();
            giangVien.nhap();
        }
        for (GiangVien gv: danhSachGiangVien) {
            if (gv.getMaSo() == giangVien.getMaSo()){
                System.out.println("giảng viên đã tồn tại trong danh sách !");
                return false;
            }
        }
        danhSachGiangVien.add(giangVien);
        System.out.println("thêm giảng viên thành công");
        return true;

    }

    public void giangVienDaNghiViec(){
        
    }

    public void tienLuong(){
        for (GiangVien gv :danhSachGiangVien) {
            if(gv instanceof GiangVienCoHuu){
                gv.tinhLuong();
            }
            else  if (gv instanceof  GiangVienBanCoHuu)
                gv.tinhLuong();
            else
                gv.tinhLuong();
        }
    }

    public List<GiangVienThinhGiang> congtachon1nam(){
        List<GiangVienThinhGiang> giangVienThinhGiangs = new ArrayList<>();
       // int year = Calendar.getInstance().get(Calendar.YEAR);
        Date date = new Date();
        Calendar namhientai = Calendar.getInstance();
        namhientai.setTime(date);
        namhientai.get(Calendar.YEAR);
        Calendar namvaotrg = Calendar.getInstance();
        for (GiangVien x : danhSachGiangVien) {
            if (x instanceof GiangVienThinhGiang)
                namvaotrg.setTime(x.getNgayDuocNhanVaoTruong());
            namvaotrg.add(Calendar.YEAR,1);
            if (namvaotrg.before(namhientai) && (x.getHocVi() == 3 ||
                    x.getHocVi() == 4 || x.getHocVi() == 5)) {
                giangVienThinhGiangs.add((GiangVienThinhGiang) x);
            }
        }
        return giangVienThinhGiangs;
    }

    public List<GiangVienBanCoHuu> congTacHon3Nam(){
        List<GiangVienBanCoHuu> giangVienBanCoHuus= new ArrayList<>();
        // int year = Calendar.getInstance().get(Calendar.YEAR);
        Date date = new Date();
        Calendar namhientai = Calendar.getInstance();
        namhientai.setTime(date);
        namhientai.get(Calendar.YEAR);
        Calendar namvaotrg = Calendar.getInstance();
        for (GiangVien x : danhSachGiangVien) {
            if (x instanceof GiangVienBanCoHuu)
                namvaotrg.setTime(x.getNgayDuocNhanVaoTruong());
            namvaotrg.add(Calendar.YEAR,3);
            if (namvaotrg.before(namhientai) && ( x.getHocVi() == 2||x.getHocVi() == 3 ||
                    x.getHocVi() == 4 || x.getHocVi() == 5)) {
                giangVienBanCoHuus.add((GiangVienBanCoHuu) x);
            }
        }
        return giangVienBanCoHuus;
    }

    public List<GiangVienCoHuu> DanhSachGiangVienCoHuuChuaCoBangThacSi() {
        List<GiangVienCoHuu> giangVienCoHuus = new ArrayList<>();
        for (GiangVien gv : danhSachGiangVien) {
            if (gv instanceof GiangVienCoHuu) {
                int k = 0;
                for (BangCap y : gv.getSoYeuLyLich().getDanhsachBang()) {
                    if (y.getHocVi() == 2)
                        k = 1;
                }
                if (k == 0)
                    giangVienCoHuus.add((GiangVienCoHuu) gv);
            }
        }
        return giangVienCoHuus;
    }

    public List<GiangVien> DanhSachGiangVienCoHocViThacSiTroLen() {
        List<GiangVien> giangViens = new ArrayList<>();
        for (GiangVien gv : danhSachGiangVien) {
            int k = 0;
            for (BangCap bangCap : gv.getSoYeuLyLich().getDanhsachBang()) {
                if (bangCap.getHocVi() == 2 )
                    giangViens.add(gv);
            }
        }
        return giangViens;
    }

    public List<GiangVienCoHuu> DanhSachGiangVienCoHuuThacSiVaTenBatDauChuN() {
        List<GiangVienCoHuu> giangVienCoHuus = new ArrayList<>();
        for (GiangVien gv : danhSachGiangVien) {
            if (gv instanceof GiangVienCoHuu) {
                if ((gv.getHocVi() == 2) && (gv.getTen().matches("^N.*"))) {
                    giangVienCoHuus.add((GiangVienCoHuu) gv);
                }
            }
        }
        return giangVienCoHuus;
    }

    public List<GiangVienCoHuu> GiangVienCoHuuTangDanTheoMucLuongThang() {
        List<GiangVienCoHuu> gv = new ArrayList<>();
        for (GiangVien x : danhSachGiangVien) {
            if (x instanceof GiangVienCoHuu) gv.add((GiangVienCoHuu) x);
        }
        Collections.sort(gv, (o1, o2) -> (int) (o1.tinhLuong() - o2.tinhLuong()));
        return gv;
    }

    public List<GiangVien> GiangVienTangTheoHocVi() {
        List<GiangVien> gv = new ArrayList<>();
        gv.addAll(danhSachGiangVien);
        Collections.sort(gv, (o1, o2) -> o1.getHocVi() - o2.getHocVi());
        return gv;
    }

    public List<GiangVienBanCoHuu> congTacHon10Nam() {
        List<GiangVienBanCoHuu> giangVienBanCoHuus = new ArrayList<>();
        // int year = Calendar.getInstance().get(Calendar.YEAR);
        Date date = new Date();
        Calendar namhientai = Calendar.getInstance();
        namhientai.setTime(date);
        namhientai.get(Calendar.YEAR);
        Calendar nam10 = Calendar.getInstance();
        for (GiangVien x : danhSachGiangVien) {
            if (x instanceof GiangVienBanCoHuu)
                nam10.setTime(x.getNgayDuocNhanVaoTruong());
            nam10.add(Calendar.YEAR, 10);
            if (nam10.before(namhientai)) {
                giangVienBanCoHuus.add((GiangVienBanCoHuu) x);
            }
        }
        return giangVienBanCoHuus;
    }
}
