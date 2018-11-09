package com.lananh.bai8.top20;

public class ListCD {
    private CD[] listCD;
    private int n;
    public ListCD(int n){
        this.n = n;
        this.listCD = new CD[n] ;
    }
    public boolean them(CD cd){
        if(listCD[this.n-1] != null){
            return false;
        }
        for (int i = 0; i < listCD.length; i++) {
            if (listCD[i].getMaCD()==cd.getMaCD()){
                return false;
            }
        }
        for (int i = 0; i <listCD.length ; i++) {
            if (listCD[i] == null){
                listCD[i] = cd;
                break;
            }
        }
        return true;
    }
    public int count(){
        int dem =0;
        for (int i = 0; i <listCD.length ; i++) {
            if (listCD[i] != null){
                dem ++;
            }
        }
        return dem;
    }
    public double tongGiaCD(){
        double tong = 0;
        for (int i = 0; i <listCD.length ; i++) {
           tong += listCD[i].getGiaThanh();
        }
        return tong;
    }
    public void sapXepGiamDan(){
        for (int i = 0; i < listCD.length; i++) {


        }
    }
}


