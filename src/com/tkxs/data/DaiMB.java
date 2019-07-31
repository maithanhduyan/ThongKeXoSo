package com.tkxs.data;

import java.util.Date;

/**
 * @author Mai Thành Duy An
 */

public class DaiMB {

	String ten;

	Date ngay;

	String giaiDacBiet;

	String giaiNhat;

	String giaiNhi1;
	String giaiNhi2;

	String giaiBa1;
	String giaiBa2;
	String giaiBa3;
	String giaiBa4;
	String giaiBa5;
	String giaiBa6;

	String giaiTu1;
	String giaiTu2;
	String giaiTu3;
	String giaiTu4;

	String giaiNam1;
	String giaiNam2;
	String giaiNam3;
	String giaiNam4;
	String giaiNam5;
	String giaiNam6;

	String giaiSau1;
	String giaiSau2;
	String giaiSau3;

	String giaiBay1;
	String giaiBay2;
	String giaiBay3;

	public DaiMB() {
		super();
	}

	public DaiMB(String ten, Date ngay, String giaiDacBiet, String giaiNhat, String giaiNhi1, String giaiNhi2,
			String giaiBa1, String giaiBa2, String giaiBa3, String giaiBa4, String giaiBa5, String giaiBa6,
			String giaiTu1, String giaiTu2, String giaiTu3, String giaiTu4, String giaiNam1, String giaiNam2,
			String giaiNam3, String giaiNam4, String giaiNam5, String giaiNam6, String giaiSau1, String giaiSau2,
			String giaiSau3, String giaiBay1, String giaiBay2, String giaiBay3) {
		super();
		this.ten = ten;
		this.ngay = ngay;
		this.giaiDacBiet = giaiDacBiet;
		this.giaiNhat = giaiNhat;
		this.giaiNhi1 = giaiNhi1;
		this.giaiNhi2 = giaiNhi2;
		this.giaiBa1 = giaiBa1;
		this.giaiBa2 = giaiBa2;
		this.giaiBa3 = giaiBa3;
		this.giaiBa4 = giaiBa4;
		this.giaiBa5 = giaiBa5;
		this.giaiBa6 = giaiBa6;
		this.giaiTu1 = giaiTu1;
		this.giaiTu2 = giaiTu2;
		this.giaiTu3 = giaiTu3;
		this.giaiTu4 = giaiTu4;
		this.giaiNam1 = giaiNam1;
		this.giaiNam2 = giaiNam2;
		this.giaiNam3 = giaiNam3;
		this.giaiNam4 = giaiNam4;
		this.giaiNam5 = giaiNam5;
		this.giaiNam6 = giaiNam6;
		this.giaiSau1 = giaiSau1;
		this.giaiSau2 = giaiSau2;
		this.giaiSau3 = giaiSau3;
		this.giaiBay1 = giaiBay1;
		this.giaiBay2 = giaiBay2;
		this.giaiBay3 = giaiBay3;
	}

	@Override
	public String toString() {
		return "DaiMB [ten=" + ten + ", ngay=" + ngay + ", giaiDacBiet=" + giaiDacBiet + ", giaiNhat=" + giaiNhat
				+ ", giaiNhi1=" + giaiNhi1 + ", giaiNhi2=" + giaiNhi2 + ", giaiBa1=" + giaiBa1 + ", giaiBa2=" + giaiBa2
				+ ", giaiBa3=" + giaiBa3 + ", giaiBa4=" + giaiBa4 + ", giaiBa5=" + giaiBa5 + ", giaiBa6=" + giaiBa6
				+ ", giaiTu1=" + giaiTu1 + ", giaiTu2=" + giaiTu2 + ", giaiTu3=" + giaiTu3 + ", giaiTu4=" + giaiTu4
				+ ", giaiNam1=" + giaiNam1 + ", giaiNam2=" + giaiNam2 + ", giaiNam3=" + giaiNam3 + ", giaiNam4="
				+ giaiNam4 + ", giaiNam5=" + giaiNam5 + ", giaiNam6=" + giaiNam6 + ", giaiSau1=" + giaiSau1
				+ ", giaiSau2=" + giaiSau2 + ", giaiSau3=" + giaiSau3 + ", giaiBay1=" + giaiBay1 + ", giaiBay2="
				+ giaiBay2 + ", giaiBay3=" + giaiBay3 + "]";
	}

	
}
