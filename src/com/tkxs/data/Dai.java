package com.tkxs.data;

/**
 * @author Mai Thành Duy An
 */

import java.util.Date;

public class Dai {

    String ten;
    Date ngay;
    String giaiDacBiet;
    String giaiNhat;
    String giaiNhi;
    String giaiBa1;
    String giaiBa2;
    String giaiTu1;
    String giaiTu2;
    String giaiTu3;
    String giaiTu4;
    String giaiTu5;
    String giaiTu6;
    String giaiTu7;
    String giaiNam;
    String giaiSau1;
    String giaiSau2;
    String giaiSau3;
    String giaiBay;
    String giaiTam;

    public Dai(String ten, Date ngay, String giaiDacBiet, String giaiNhat, String giaiNhi, String giaiBa1, String giaiBa2, String giaiTu1, String giaiTu2, String giaiTu3, String giaiTu4, String giaiTu5, String giaiTu6, String giaiTu7, String giaiNam, String giaiSau1, String giaiSau2, String giaiSau3, String giaiBay, String giaiTam) {
        this.ten = ten;
        this.ngay = ngay;
        this.giaiDacBiet = giaiDacBiet;
        this.giaiNhat = giaiNhat;
        this.giaiNhi = giaiNhi;
        this.giaiBa1 = giaiBa1;
        this.giaiBa2 = giaiBa2;
        this.giaiTu1 = giaiTu1;
        this.giaiTu2 = giaiTu2;
        this.giaiTu3 = giaiTu3;
        this.giaiTu4 = giaiTu4;
        this.giaiTu5 = giaiTu5;
        this.giaiTu6 = giaiTu6;
        this.giaiTu7 = giaiTu7;
        this.giaiNam = giaiNam;
        this.giaiSau1 = giaiSau1;
        this.giaiSau2 = giaiSau2;
        this.giaiSau3 = giaiSau3;
        this.giaiBay = giaiBay;
        this.giaiTam = giaiTam;
    }
    public Dai() {
    }

    @Override
    public String toString() {
        return "Dai{" + "ten=" + ten + ", ngay=" + ngay + ", giaiDacBiet=" + giaiDacBiet + ", giaiNhat=" + giaiNhat + ", giaiNhi=" + giaiNhi + ", giaiBa1=" + giaiBa1 + ", giaiBa2=" + giaiBa2 + ", giaiTu1=" + giaiTu1 + ", giaiTu2=" + giaiTu2 + ", giaiTu3=" + giaiTu3 + ", giaiTu4=" + giaiTu4 + ", giaiTu5=" + giaiTu5 + ", giaiTu6=" + giaiTu6 + ", giaiTu7=" + giaiTu7 + ", giaiNam=" + giaiNam + ", giaiSau1=" + giaiSau1 + ", giaiSau2=" + giaiSau2 + ", giaiSau3=" + giaiSau3 + ", giaiBay=" + giaiBay + ", giaiTam=" + giaiTam + '}';
    }

}
