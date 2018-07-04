package com.tkxs.gui;

import javax.swing.JFrame;

/**
 * @author Mai Thành Duy An
 */
@SuppressWarnings("serial")
public class ThongKeXoSoFrame extends JFrame {

	public ThongKeXoSoFrame() {
		initComponents();
	}

	void initComponents() {
		this.setVisible(true);
		this.setTitle("Thống Kê");
		this.setSize(500, 300);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	}

}
