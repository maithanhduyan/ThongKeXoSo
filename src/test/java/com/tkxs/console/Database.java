package com.tkxs.console;
/**
 * @author Mai Thành Duy An
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Database {
	 private File databaseFolderName;
		private Dai dai;
	    private ArrayList<String> listDai;

	    public Database() {
	        this.databaseFolderName = new File("database");
	        if (!this.databaseFolderName.exists()) {
	            try {
	                this.databaseFolderName.mkdir();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        File listDaiFileName = new File(databaseFolderName + "/Dai.list");
	        //create new one
	        createDaiList(listDaiFileName);
	        this.listDai = new ArrayList<String>();
	        try {
	            Scanner scan = new Scanner(listDaiFileName);
	            while (scan.hasNextLine()) {
	                String dai = scan.nextLine();
	                listDai.add(dai);
	                //System.out.println(dai);
	                createDaiFile(dai);
	            }
	            scan.close();
	            //Thread.sleep(2000);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }

	    public List<String> getDai(String fileName) {
	        List<String> list = new ArrayList<>();
	        File file = new File(databaseFolderName + "/" + fileName + ".data");
	        if (file.exists()) {
	            try {
	                Scanner scan = new Scanner(file);
	                while (scan.hasNextLine()) {
	                    String line = scan.nextLine();
	                    list.add(line);
	                    //System.out.println(scan.nextLine());
	                }
	                scan.close();
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	        return list;
	    }

	    private void createDaiList(File file) {
	        if (!file.exists()) {
	            try {
	                PrintWriter out = new PrintWriter(file);
	                out.println("AnGiang");
	                out.println("BinhThuan");
	                out.println("BinhDuong");
	                out.println("BinhPhuoc");
	                out.println("BenTre");
	                out.println("BacLieu");
	                out.println("CanTho");
	                out.println("CaMau");
	                out.println("DongNai");
	                out.println("DongThap");
	                out.println("HauGiang");
	                out.println("HoChiMinh");
	                out.println("KienGiang");
	                out.println("LamDong");
	                out.println("LongAn");
	                out.println("SocTrang");
	                out.println("TienGiang");
	                out.println("TraVinh");
	                out.println("TayNinh");
	                out.println("VinhLong");
	                out.println("VungTau");
	                out.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    private void createDaiFile(String fileName) {
	        File dai = new File(databaseFolderName + "/" + fileName + ".data");
	        if (!dai.exists()) {
	            try {
	                PrintWriter out = new PrintWriter(dai);
	                out.print("");
	                out.close();
	            } catch (Exception ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	    public List<String> showKQ(int page, String url) {
	        Document doc = null;
	        try {
	            doc = Jsoup.connect(url + page).get();
	        } catch (IOException ex) {
	            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        Element content = doc.getElementById("content");
	        Elements tables = content.getElementsByTag("table").prev();
	        List<String> dais = new ArrayList<>();
	        for (Element t : tables) {
	            if (t.hasText()) {
	                String s = t.getElementsByClass("tcat_box_main_yellow").text() + t.getElementsByClass("number_kq").text();
	                if (!s.isEmpty() && s.length() > 140) {
	                    s = s.replaceAll("-", " ");
	                    s = s.replaceAll("KẾT QUẢ XỔ SỐ ", "");
	                    s = s.replaceAll("(Thứ Hai)", "");
	                    s = s.replaceAll("(Thứ Ba)", "");
	                    s = s.replaceAll("(Thứ Tư)", "");
	                    s = s.replaceAll("(Thứ Năm)", "");
	                    s = s.replaceAll("(Thứ Sáu)", "");
	                    s = s.replaceAll("(Thứ Bảy)", "");
	                    s = s.replaceAll("(Chủ Nhật)", "");
	                    s = s.replaceAll("[()]", "");
	                    s = s.replaceAll("ngày", "");
	                    s = s.replaceAll("Tp. Hồ Chí Minh ", "TP.HCM");
	                    s = s.replaceAll("Bình Dương ", "BinhDuong");
	                    s = s.replaceAll("Bình Thuận ", "BinhThuan");
	                    s = s.replaceAll("An Giang ", "AnGiang");
	                    s = s.replaceAll("Cà Mau ", "CaMau");
	                    s = s.replaceAll("Đồng Tháp ", "DongThap");
	                    s = s.replaceAll("Bạc Liêu ", "BacLieu");
	                    s = s.replaceAll("Bến Tre ", "BenTre");
	                    s = s.replaceAll("Đồng Nai ", "DongNai");
	                    s = s.replaceAll("Sóc Trăng ", "SocTrang");
	                    s = s.replaceAll("Cần Thơ ", "CanTho");
	                    s = s.replaceAll("Vũng Tàu ", "VungTau");
	                    s = s.replaceAll("Bình Phước ", "BinhPhuoc");
	                    s = s.replaceAll("Hậu Giang ", "HauGiang");
	                    s = s.replaceAll("Kiên Giang ", "KienGiang");
	                    s = s.replaceAll("Lâm Đồng ", "LamDong");
	                    s = s.replaceAll("Tây Ninh ", "TayNinh");
	                    s = s.replaceAll("Trà Vinh ", "TraVinh");
	                    s = s.replaceAll("Vĩnh Long ", "VinhLong");
	                    s = s.replaceAll("Tiền Giang ", "TienGiang");
	                    s = s.replaceAll("Long An ", "LongAn");
	                    s = s.replaceAll("Ninh Thuận ", "NinhThuan");
	                    s = s.replaceAll("Bình Định ", "BinhDinh");
	                    s = s.replaceAll("Đà Nẵng ", "DaNang");
	                    s = s.replaceAll("Đắc Lắc ", "DacLac");
	                    s = s.replaceAll("Đắc Nông ", "DacNong");
	                    s = s.replaceAll("Gia Lai ", "GiaLai");
	                    s = s.replaceAll("Khánh Hòa ", "KhanhHoa");
	                    s = s.replaceAll("Kon Tum ", "KonTum");
	                    s = s.replaceAll("Phú Yên ", "PhuYen");
	                    s = s.replaceAll("Quảng Bình ", "QuangBinh");
	                    s = s.replaceAll("Quảng Nam ", "QuangNam");
	                    s = s.replaceAll("Quảng Ngãi ", "QuangNgai");
	                    s = s.replaceAll("Quảng Trị ", "QuangTri");
	                    s = s.replaceAll("Thừa Thiên Huế ", "ThuaThienHue");
	                    s = s.replaceAll("Miền Bắc ", "MienBac");

	                    //
	                    s = s.replaceAll(" ", "-");
	                    s = s.replaceAll("--", "");
	                    s = s.replaceAll("-", ",");
	                    s = s.replaceAll("/", "-");
	                    String[] d = null;
	                    if (s.length() < 113) {
	                        s += ",00";
	                        d = s.split(",");
	                    } else {
	                        d = s.split(",");
	                    }
	                    System.out.println(s);
	                    dais.add(s);
	                }
	            }
	        }
	        return dais;
	    }

	    public List<String> showKQMienBac(int page, String url) {
	        Document doc = null;
	        try {
	            doc = Jsoup.connect(url + page).get();
	        } catch (IOException ex) {
	            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        Element content = doc.getElementById("content");
	        Elements tables = content.getElementsByTag("table").prev();
	        List<String> dais = new ArrayList<>();
	        for (Element t : tables) {
	            if (t.hasText()) {
	                String s = t.getElementsByClass("tcat_box_main_yellow").text() + t.getElementsByClass("number_kq").text();
	                //System.out.println(s);
	                if (!s.isEmpty() && s.length() > 140) {
	                    s = s.replaceAll("-", " ");
	                    s = s.replaceAll("KẾT QUẢ XỔ SỐ ", "");
	                    s = s.replaceAll("(Thứ Hai)", "");
	                    s = s.replaceAll("(Thứ Ba)", "");
	                    s = s.replaceAll("(Thứ Tư)", "");
	                    s = s.replaceAll("(Thứ Năm)", "");
	                    s = s.replaceAll("(Thứ Sáu)", "");
	                    s = s.replaceAll("(Thứ Bảy)", "");
	                    s = s.replaceAll("(Chủ Nhật)", "");
	                    s = s.replaceAll("[()]", "");
	                    s = s.replaceAll("ngày", "");
	                    s = s.replaceAll("Miền Bắc ", "MienBac");
	                    s = s.replaceAll(" ", "-");
	                    s = s.replaceAll("--", "");
	                    s = s.replaceAll("-", ",");
	                    s = s.replaceAll("/", "-");
	                    String[] d = null;
	                    if (s.length() < 113) {
	                        s += ",00";
	                        d = s.split(",");
	                    } else {
	                        d = s.split(",");
	                    }
	                    System.out.println(s);
	                    dais.add(s);
	                }
	            }
	        }
	        return dais;
	    }

	    public void displayDai(String urlDai, int deep) {
	        for (int i = 1; i < deep; i++) {
	            showKQ(i, urlDai);
	        }
	    }

	    public void displayDaiMienBac(int deep) {
	        for (int i = 1; i < deep; i++) {
	            showKQMienBac(i, URL_MienBac);
	        }
	    }

	    public ArrayList<String> getListDai() {
	        return listDai;
	    }
	    public static final String URL_MienBac = "http://ketquaxoso.24h.com.vn/xo-so-mien-bac/page";
	    public static final String URL_AnGiang = "http://ketquaxoso.24h.com.vn/xo-so-an-giang/page";
	    public static final String URL_BacLieu = "http://ketquaxoso.24h.com.vn/xo-so-bac-lieu/page";
	    public static final String URL_BenTre = "http://ketquaxoso.24h.com.vn/xo-so-ben-tre/page";
	    public static final String URL_BinhDinh = "http://ketquaxoso.24h.com.vn/xo-so-binh-dinh/page";
	    public static final String URL_BinhDuong = "http://ketquaxoso.24h.com.vn/xo-so-binh-duong/page";
	    public static final String URL_BinhPhuoc = "http://ketquaxoso.24h.com.vn/xo-so-binh-phuoc/page";
	    public static final String URL_BinhThuan = "http://ketquaxoso.24h.com.vn/xo-so-binh-thuan/page";
	    public static final String URL_CaMau = "http://ketquaxoso.24h.com.vn/xo-so-ca-mau/page";
	    public static final String URL_CanTho = "http://ketquaxoso.24h.com.vn/xo-so-can-tho/page";
	    public static final String URL_DacLac = "http://ketquaxoso.24h.com.vn/xo-so-dac-lac/page";
	    public static final String URL_DacNong = "http://ketquaxoso.24h.com.vn/xo-so-dac-nong/page";
	    public static final String URL_DaNang = "http://ketquaxoso.24h.com.vn/xo-so-da-nang/page";
	    public static final String URL_DongNai = "http://ketquaxoso.24h.com.vn/xo-so-dong-nai/page";
	    public static final String URL_DongThap = "http://ketquaxoso.24h.com.vn/xo-so-dong-thap/page";
	    public static final String URL_GiaLai = "http://ketquaxoso.24h.com.vn/xo-so-gia-lai/page";
	    public static final String URL_HauGiang = "http://ketquaxoso.24h.com.vn/xo-so-hau-giang/page";
	    public static final String URL_TPHCM = "http://ketquaxoso.24h.com.vn/xo-so-tp-ho-chi-minh/page";
	    public static final String URL_KhanhHoa = "http://ketquaxoso.24h.com.vn/xo-so-khanh-hoa/page";
	    public static final String URL_KienGiang = "http://ketquaxoso.24h.com.vn/xo-so-kien-giang/page";
	    public static final String URL_KonTum = "http://ketquaxoso.24h.com.vn/xo-so-kon-tum/page";
	    public static final String URL_LamDong = "http://ketquaxoso.24h.com.vn/xo-so-lam-dong/page";
	    public static final String URL_LongAn = "http://ketquaxoso.24h.com.vn/xo-so-long-an/page";
	    public static final String URL_NinhThuan = "http://ketquaxoso.24h.com.vn/xo-so-ninh-thuan/page";
	    public static final String URL_PhuYen = "http://ketquaxoso.24h.com.vn/xo-so-phu-yen/page";
	    public static final String URL_QuangBinh = "http://ketquaxoso.24h.com.vn/xo-so-quang-binh/page";
	    public static final String URL_QuangNam = "http://ketquaxoso.24h.com.vn/xo-so-quang-nam/page";
	    public static final String URL_QuangNgai = "http://ketquaxoso.24h.com.vn/xo-so-quang-ngai/page";
	    public static final String URL_QuangTri = "http://ketquaxoso.24h.com.vn/xo-so-quang-tri/page";
	    public static final String URL_SocTrang = "http://ketquaxoso.24h.com.vn/xo-so-soc-trang/page";
	    public static final String URL_TayNinh = "http://ketquaxoso.24h.com.vn/xo-so-tay-ninh/page";
	    public static final String URL_ThuaThienHue = "http://ketquaxoso.24h.com.vn/xo-so-thua-thien-hue/page";
	    public static final String URL_TienGiang = "http://ketquaxoso.24h.com.vn/xo-so-tien-giang/page";
	    public static final String URL_TraVinh = "http://ketquaxoso.24h.com.vn/xo-so-tra-vinh/page";
	    public static final String URL_VinhLong = "http://ketquaxoso.24h.com.vn/xo-so-vinh-long/page";
	    public static final String URL_VungTau = "http://ketquaxoso.24h.com.vn/xo-so-vung-tau/page";
}
