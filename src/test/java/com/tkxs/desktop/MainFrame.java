/**
 * @author Mai Thành Duy An
 *
 */
package com.tkxs.desktop;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 3545611209165377795L;
	private JPanel contentPane;
	private static final int screen_width = 600;
	private static final int screen_height = 400;
	private static String appName = "Thong Ke KQXS";

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, screen_width, screen_height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked.");
			}
		});
		btnNewButton.setBounds(32, 22, 85, 21);
		contentPane.add(btnNewButton);
		
		this.setTitle(appName);
	}

}
