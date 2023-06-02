package com.arnob.calc;

import java.awt.*;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
 
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class welcome {

	JFrame frame;
	private JPanel panel, panel_1, panel_2;
	private JLabel label;
	private JButton btnWelcomeMessage;
 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome window = new welcome();
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
	public welcome() {

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

		JButton btnGoToSimple = new JButton("Calculator");
		btnGoToSimple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Calculator c = new Calculator();
				c.setVisible(true);
			}
		});

		btnGoToSimple.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGoToSimple.setBackground(new Color(199, 21, 133));
		btnGoToSimple.setForeground(new Color(255, 255, 255));
		btnGoToSimple.setBounds(123, 126, 245, 31);
		panel_2.add(btnGoToSimple);
		
		 
		JButton  btnWelcomeMessage = new JButton("Welcome Message");
		btnWelcomeMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					frame.dispose();
					welcomemessage window1 = new welcomemessage();
					window1.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		btnWelcomeMessage.setForeground(new Color(255, 255, 255));
		btnWelcomeMessage.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnWelcomeMessage.setBackground(new Color(123, 104, 238));
		btnWelcomeMessage.setBounds(123, 70, 245, 31);
		panel_2.add(btnWelcomeMessage);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
