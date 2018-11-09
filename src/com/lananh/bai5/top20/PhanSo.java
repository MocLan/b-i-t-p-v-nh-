package com.lananh.bai5.top20;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public  PhanSo(){
    this.mauSo = 1;
    this.tuSo = 1;
    }
    private int timUocChungLonNhat(int x, int y) {
        int a;
        while (y != 0) {
            a = x % y;
            x = y;
            y = a;
        }
        return x;
    }
    public PhanSo timPhanSoToiGian(){
        int uocChungLonNhat = timUocChungLonNhat(this.tuSo, this.mauSo);
        this.tuSo /= uocChungLonNhat;
        this.mauSo /= uocChungLonNhat;
        return this;
    }
//    public PhanSo timPhanSoNghichDao(){
//        PhanSo phanSo = new PhanSo();
//
//    }

    @Override
    public String toString() {
        return "PhanSo{" +
                "tuSo=" + tuSo +
                ", mauSo=" + mauSo +
                '}';
    }
}
