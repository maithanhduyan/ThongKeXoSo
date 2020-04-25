package com.anmtd.dai.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the daimn database table.
 * 
 */
@Entity
@NamedQuery(name = "Daimn.findAll", query = "SELECT d FROM Daimn d")
@Table(name = "daimn")
public class Daimn implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Column(name = "dai")
    private String dai;

    @Column(name = "giai_1")
    private String giai1;

    @Column(name = "giai_2")
    private String giai2;

    @Column(name = "giai_31")
    private String giai31;

    @Column(name = "giai_32")
    private String giai32;

    @Column(name = "giai_41")
    private String giai41;

    @Column(name = "giai_42")
    private String giai42;

    @Column(name = "giai_43")
    private String giai43;

    @Column(name = "giai_44")
    private String giai44;

    @Column(name = "giai_45")
    private String giai45;

    @Column(name = "giai_46")
    private String giai46;

    @Column(name = "giai_47")
    private String giai47;

    @Column(name = "giai_5")
    private String giai5;

    @Column(name = "giai_61")
    private String giai61;

    @Column(name = "giai_62")
    private String giai62;

    @Column(name = "giai_63")
    private String giai63;

    @Column(name = "giai_7")
    private String giai7;

    @Column(name = "giai_8")
    private String giai8;

    @Column(name = "giai_db")
    private String giaiDb;

    @Column(name = "ngay")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngay;

    public Daimn() {
    }

    /**
     * @return the id
     */
    public String getId() {
	return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
	this.id = id;
    }

    /**
     * @return the dai
     */
    public String getDai() {
	return dai;
    }

    /**
     * @param dai the dai to set
     */
    public void setDai(String dai) {
	this.dai = dai;
    }

    /**
     * @return the giai1
     */
    public String getGiai1() {
	return giai1;
    }

    /**
     * @param giai1 the giai1 to set
     */
    public void setGiai1(String giai1) {
	this.giai1 = giai1;
    }

    /**
     * @return the giai2
     */
    public String getGiai2() {
	return giai2;
    }

    /**
     * @param giai2 the giai2 to set
     */
    public void setGiai2(String giai2) {
	this.giai2 = giai2;
    }

    /**
     * @return the giai31
     */
    public String getGiai31() {
	return giai31;
    }

    /**
     * @param giai31 the giai31 to set
     */
    public void setGiai31(String giai31) {
	this.giai31 = giai31;
    }

    /**
     * @return the giai32
     */
    public String getGiai32() {
	return giai32;
    }

    /**
     * @param giai32 the giai32 to set
     */
    public void setGiai32(String giai32) {
	this.giai32 = giai32;
    }

    /**
     * @return the giai41
     */
    public String getGiai41() {
	return giai41;
    }

    /**
     * @param giai41 the giai41 to set
     */
    public void setGiai41(String giai41) {
	this.giai41 = giai41;
    }

    /**
     * @return the giai42
     */
    public String getGiai42() {
	return giai42;
    }

    /**
     * @param giai42 the giai42 to set
     */
    public void setGiai42(String giai42) {
	this.giai42 = giai42;
    }

    /**
     * @return the giai43
     */
    public String getGiai43() {
	return giai43;
    }

    /**
     * @param giai43 the giai43 to set
     */
    public void setGiai43(String giai43) {
	this.giai43 = giai43;
    }

    /**
     * @return the giai44
     */
    public String getGiai44() {
	return giai44;
    }

    /**
     * @param giai44 the giai44 to set
     */
    public void setGiai44(String giai44) {
	this.giai44 = giai44;
    }

    /**
     * @return the giai45
     */
    public String getGiai45() {
	return giai45;
    }

    /**
     * @param giai45 the giai45 to set
     */
    public void setGiai45(String giai45) {
	this.giai45 = giai45;
    }

    /**
     * @return the giai46
     */
    public String getGiai46() {
	return giai46;
    }

    /**
     * @param giai46 the giai46 to set
     */
    public void setGiai46(String giai46) {
	this.giai46 = giai46;
    }

    /**
     * @return the giai47
     */
    public String getGiai47() {
	return giai47;
    }

    /**
     * @param giai47 the giai47 to set
     */
    public void setGiai47(String giai47) {
	this.giai47 = giai47;
    }

    /**
     * @return the giai5
     */
    public String getGiai5() {
	return giai5;
    }

    /**
     * @param giai5 the giai5 to set
     */
    public void setGiai5(String giai5) {
	this.giai5 = giai5;
    }

    /**
     * @return the giai61
     */
    public String getGiai61() {
	return giai61;
    }

    /**
     * @param giai61 the giai61 to set
     */
    public void setGiai61(String giai61) {
	this.giai61 = giai61;
    }

    /**
     * @return the giai62
     */
    public String getGiai62() {
	return giai62;
    }

    /**
     * @param giai62 the giai62 to set
     */
    public void setGiai62(String giai62) {
	this.giai62 = giai62;
    }

    /**
     * @return the giai63
     */
    public String getGiai63() {
	return giai63;
    }

    /**
     * @param giai63 the giai63 to set
     */
    public void setGiai63(String giai63) {
	this.giai63 = giai63;
    }

    /**
     * @return the giai7
     */
    public String getGiai7() {
	return giai7;
    }

    /**
     * @param giai7 the giai7 to set
     */
    public void setGiai7(String giai7) {
	this.giai7 = giai7;
    }

    /**
     * @return the giai8
     */
    public String getGiai8() {
	return giai8;
    }

    /**
     * @param giai8 the giai8 to set
     */
    public void setGiai8(String giai8) {
	this.giai8 = giai8;
    }

    /**
     * @return the giaiDb
     */
    public String getGiaiDb() {
	return giaiDb;
    }

    /**
     * @param giaiDb the giaiDb to set
     */
    public void setGiaiDb(String giaiDb) {
	this.giaiDb = giaiDb;
    }

    /**
     * @return the ngay
     */
    public Date getNgay() {
	return ngay;
    }

    /**
     * @param ngay the ngay to set
     */
    public void setNgay(Date ngay) {
	this.ngay = ngay;
    }

    @Override
    public String toString() {
	return "Daimn [id=" + id + ", dai=" + dai + ", giai1=" + giai1 + ", giai2=" + giai2 + ", giai31=" + giai31
		+ ", giai32=" + giai32 + ", giai41=" + giai41 + ", giai42=" + giai42 + ", giai43=" + giai43
		+ ", giai44=" + giai44 + ", giai45=" + giai45 + ", giai46=" + giai46 + ", giai47=" + giai47 + ", giai5="
		+ giai5 + ", giai61=" + giai61 + ", giai62=" + giai62 + ", giai63=" + giai63 + ", giai7=" + giai7
		+ ", giai8=" + giai8 + ", giaiDb=" + giaiDb + ", ngay=" + ngay + "]";
    }

}