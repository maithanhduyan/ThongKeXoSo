package com.tkxs.domain.mn.entity;

/**
 * @author Mai Thành Duy An
 *
 */
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "DAIMN")
public class DaiMN implements Serializable {

	private static final long serialVersionUID = 3595960661978647881L;
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	private String id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "GIAI_DAC_BIET")
	private String giaiDacBiet;

	@Column(name = "GIAI_NHAT")
	private String giaiNhat;

	@Column(name = "GIAI_NHI")
	private String giaiNhi;

	@Column(name = "GIAI_BA_1")
	private String giaiBa1;

	@Column(name = "GIAI_BA_2")
	private String giaiBa2;

	@Column(name = "GIAI_TU_1")
	private String giaiTu1;

	@Column(name = "GIAI_TU_2")
	private String giaiTu2;

	@Column(name = "GIAI_TU_3")
	private String giaiTu3;

	@Column(name = "GIAI_TU_4")
	private String giaiTu4;

	@Column(name = "GIAI_TU_5")
	private String giaiTu5;

	@Column(name = "GIAI_TU_6")
	private String giaiTu6;

	@Column(name = "GIAI_TU_7")
	private String giaiTu7;

	@Column(name = "GIAI_NAM")
	private String giaiNam;

	@Column(name = "GIAI_SAU_1")
	private String giaiSau1;

	@Column(name = "GIAI_SAU_2")
	private String giaiSau2;

	@Column(name = "GIAI_SAU_3")
	private String giaiSau3;

	@Column(name = "GIAI_BAY")
	private String giaiBay;

	@Column(name = "GIAI_TAM")
	private String giaiTam;

	@Column(name = "CREATED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;

	@Column(name = "UPDATED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedDate;

	public DaiMN() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGiaiDacBiet() {
		return giaiDacBiet;
	}

	public void setGiaiDacBiet(String giaiDacBiet) {
		this.giaiDacBiet = giaiDacBiet;
	}

	public String getGiaiNhat() {
		return giaiNhat;
	}

	public void setGiaiNhat(String giaiNhat) {
		this.giaiNhat = giaiNhat;
	}

	public String getGiaiNhi() {
		return giaiNhi;
	}

	public void setGiaiNhi(String giaiNhi) {
		this.giaiNhi = giaiNhi;
	}

	public String getGiaiBa1() {
		return giaiBa1;
	}

	public void setGiaiBa1(String giaiBa1) {
		this.giaiBa1 = giaiBa1;
	}

	public String getGiaiBa2() {
		return giaiBa2;
	}

	public void setGiaiBa2(String giaiBa2) {
		this.giaiBa2 = giaiBa2;
	}

	public String getGiaiTu1() {
		return giaiTu1;
	}

	public void setGiaiTu1(String giaiTu1) {
		this.giaiTu1 = giaiTu1;
	}

	public String getGiaiTu2() {
		return giaiTu2;
	}

	public void setGiaiTu2(String giaiTu2) {
		this.giaiTu2 = giaiTu2;
	}

	public String getGiaiTu3() {
		return giaiTu3;
	}

	public void setGiaiTu3(String giaiTu3) {
		this.giaiTu3 = giaiTu3;
	}

	public String getGiaiTu4() {
		return giaiTu4;
	}

	public void setGiaiTu4(String giaiTu4) {
		this.giaiTu4 = giaiTu4;
	}

	public String getGiaiTu5() {
		return giaiTu5;
	}

	public void setGiaiTu5(String giaiTu5) {
		this.giaiTu5 = giaiTu5;
	}

	public String getGiaiTu6() {
		return giaiTu6;
	}

	public void setGiaiTu6(String giaiTu6) {
		this.giaiTu6 = giaiTu6;
	}

	public String getGiaiTu7() {
		return giaiTu7;
	}

	public void setGiaiTu7(String giaiTu7) {
		this.giaiTu7 = giaiTu7;
	}

	public String getGiaiNam() {
		return giaiNam;
	}

	public void setGiaiNam(String giaiNam) {
		this.giaiNam = giaiNam;
	}

	public String getGiaiSau1() {
		return giaiSau1;
	}

	public void setGiaiSau1(String giaiSau1) {
		this.giaiSau1 = giaiSau1;
	}

	public String getGiaiSau2() {
		return giaiSau2;
	}

	public void setGiaiSau2(String giaiSau2) {
		this.giaiSau2 = giaiSau2;
	}

	public String getGiaiSau3() {
		return giaiSau3;
	}

	public void setGiaiSau3(String giaiSau3) {
		this.giaiSau3 = giaiSau3;
	}

	public String getGiaiBay() {
		return giaiBay;
	}

	public void setGiaiBay(String giaiBay) {
		this.giaiBay = giaiBay;
	}

	public String getGiaiTam() {
		return giaiTam;
	}

	public void setGiaiTam(String giaiTam) {
		this.giaiTam = giaiTam;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "DaiMN [id=" + id + ", name=" + name + ", giaiDacBiet=" + giaiDacBiet + ", giaiNhat=" + giaiNhat
				+ ", giaiNhi=" + giaiNhi + ", giaiBa1=" + giaiBa1 + ", giaiBa2=" + giaiBa2 + ", giaiTu1=" + giaiTu1
				+ ", giaiTu2=" + giaiTu2 + ", giaiTu3=" + giaiTu3 + ", giaiTu4=" + giaiTu4 + ", giaiTu5=" + giaiTu5
				+ ", giaiTu6=" + giaiTu6 + ", giaiTu7=" + giaiTu7 + ", giaiNam=" + giaiNam + ", giaiSau1=" + giaiSau1
				+ ", giaiSau2=" + giaiSau2 + ", giaiSau3=" + giaiSau3 + ", giaiBay=" + giaiBay + ", giaiTam=" + giaiTam
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

}
