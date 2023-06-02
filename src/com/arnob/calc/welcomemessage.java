package com.arnob.calc;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class welcomemessage {

	JFrame frame;
	private JPanel panel, panel_1, panel_2;
	private JLabel label;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblHopeYouLike;
	private JPanel panel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomemessage window = new welcomemessage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public welcomemessage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 474);
		frame = new JFrame();
		frame.setTitle("Simple Calculator");
		frame.getContentPane().setBackground(new Color(219, 112, 147));
		frame.setBounds(350, 350, 550, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBackground(new Color(255, 192, 203));
		panel.setBorder(new LineBorder(new Color(216, 191, 216), 2, true));
		panel.setBounds(10, 10, 514, 341);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 218, 185));
		panel_1.setBorder(new LineBorder(new Color(240, 128, 128), 2, true));
		panel_1.setBounds(20, 11, 473, 54);
		panel.add(panel_1);
		panel_1.setLayout(null);

		label = new JLabel("Welcome Screen");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(199, 21, 133));
		label.setFont(new Font("Tahoma", Font.BOLD, 26));
		label.setBounds(121, 11, 238, 29);
		panel_1.add(label);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 240, 245));
		panel_2.setBorder(new LineBorder(new Color(216, 191, 216), 3, true));
		panel_2.setBounds(20, 76, 473, 241);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		btnNewButton = new JButton("Go Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				try {
					welcome window = new welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				  
			}
		});
		btnNewButton.setBackground(new Color(240, 128, 128));
		btnNewButton.setBounds(374, 207, 89, 23);
		panel_2.add(btnNewButton);
		
		lblNewLabel = new JLabel("Welcome to Tesseract's Calculator (Anime adoption).");
		lblNewLabel.setForeground(new Color(112, 128, 144));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(43, 77, 395, 38);
		panel_2.add(lblNewLabel);
		
		lblHopeYouLike = new JLabel("Hope you like it!");
		lblHopeYouLike.setForeground(new Color(112, 128, 144));
		lblHopeYouLike.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHopeYouLike.setBounds(176, 102, 127, 38);
		panel_2.add(lblHopeYouLike);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(211, 211, 211));
		panel_3.setBounds(10, 11, 453, 191);
		panel_2.add(panel_3);
	}

	private void setBounds(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
