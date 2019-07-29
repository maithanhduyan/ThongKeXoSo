package com.tkxs.app;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;

import com.tkxs.data.DaiManagerUtil;
import com.tkxs.data.Database;

public class TK {

	private JFrame frame;

	Database database;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TK window = new TK();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TK() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				System.out.println("Opened.");
			}
		});
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 374, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				clearScreen();
				database = new Database();
				System.out.println(comboBox.getSelectedItem().toString());
				DaiManagerUtil.statistic(database.getDai(comboBox.getSelectedItem().toString()), 60);
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "AnGiang", "BacLieu", "BenTre", "BinhDinh",
				"BinhDuong", "BinhPhuoc", "BinhThuan", "CaMau", "CanTho", "DacLac", "DacNong", "DaNang", "DongNai",
				"DongThap", "GiaLai", "HauGiang", "TPHoChiMinh", "KhanhHoa", "KienGiang", "KonTum", "LamDong", "LongAn",
				"NinhThuan", "PhuYen", "QuangBinh", "QuangNam", "QuangNgai", "QuangTri", "SocTrang", "TayNinh",
				"ThuaThienHue", "TienGiang", "TraVinh", "VinhLong", "VungTau" }));

		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(100, 13, 117, 22);
		frame.getContentPane().add(comboBox);

		JLabel lbli = new JLabel("Đài:");
		lbli.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbli.setBounds(25, 16, 40, 16);
		frame.getContentPane().add(lbli);

		JLabel lblSTun = new JLabel("Số tuần");
		lblSTun.setBounds(25, 58, 56, 16);
		frame.getContentPane().add(lblSTun);

		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner.setBounds(100, 55, 50, 22);

		frame.getContentPane().add(spinner);
	}

	//
	void initComboBox() {

	}

	public static void clearScreen() {
		try {
			final String os = System.getProperty("os.name");

			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {
			// Handle any exceptions.
		}
	}
}
