package com.lananh.bai5.top20;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

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

    public int uocChungLonNhat(int x, int y) {
        int a;
        while (y != 0) {
            a = x % y;
            x = y;
            y = a;
        }
        return x;
    }

    public PhanSo rutGonPhanSo() {
        int uocChung = uocChungLonNhat(this.tuSo, this.mauSo);
        this.tuSo /= uocChung;
        this.mauSo /= uocChung;
        return this;
    }

    public PhanSo phanSoNghichDao() {
        int a = this.tuSo;
        this.tuSo = this.mauSo;
        this.mauSo = a;
        return this;
    }

    public PhanSo congHaiPhanSo(PhanSo phanSo1) {
        PhanSo phanSo = new PhanSo();
        phanSo.tuSo = this.tuSo * phanSo1.mauSo + this.mauSo * phanSo1.tuSo;
        phanSo.mauSo = this.mauSo * phanSo1.mauSo;
        return phanSo;
    }

    public PhanSo chiaHaiPhanSo(PhanSo phanSo1) {
        PhanSo phanSo = new PhanSo();
        phanSo1.phanSoNghichDao();
        phanSo.tuSo = this.tuSo * phanSo1.tuSo;
        phanSo.mauSo = this.mauSo * phanSo1.mauSo;
        return phanSo;
    }

    public PhanSo truHaiPhanSo(PhanSo phanSo1) {
        PhanSo phanSo = new PhanSo();
        phanSo.tuSo = this.tuSo * phanSo1.mauSo - this.mauSo * phanSo1.tuSo;
        phanSo.mauSo = this.mauSo * phanSo1.mauSo;
        return phanSo;
    }

    @Override
    public String toString() {
        return "PhanSo{" +
                "tuSo=" + tuSo +
                ", mauSo=" + mauSo +
                '}';
    }
}
