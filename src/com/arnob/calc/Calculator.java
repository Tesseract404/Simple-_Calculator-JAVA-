package com.arnob.calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {
	JFrame frame;
	private JPanel contentPane;
	private JTextField textField;

	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 474);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 51, 204), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(new LineBorder(Color.BLACK, 1, true));
		panel.setBounds(10, 11, 625, 413);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(188, 143, 143), 4, true));
		panel_1.setBackground(new Color(255, 228, 196));
		panel_1.setBounds(20, 11, 588, 63);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblSimpleCalculator = new JLabel("Simple Calculator");
		lblSimpleCalculator.setBackground(new Color(224, 255, 255));
		lblSimpleCalculator.setForeground(new Color(255, 20, 147));
		lblSimpleCalculator.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 26));
		lblSimpleCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimpleCalculator.setBounds(136, 11, 320, 41);
		panel_1.add(lblSimpleCalculator);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 51), 2, true));
		panel_2.setBackground(new Color(255, 182, 193));
		panel_2.setBounds(20, 74, 588, 328);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblEnterNumber1 = new JLabel("Enter Number 1:");
		lblEnterNumber1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterNumber1.setForeground(new Color(0, 0, 0));
		lblEnterNumber1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterNumber1.setBounds(10, 22, 148, 20);
		panel_2.add(lblEnterNumber1);

		JLabel lblEnterNumber2 = new JLabel("Enter Number 2:");
		lblEnterNumber2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterNumber2.setForeground(Color.BLACK);
		lblEnterNumber2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterNumber2.setBounds(290, 22, 162, 20);
		panel_2.add(lblEnterNumber2);

		JTextField textFieldNumber1 = new JTextField();
		textFieldNumber1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textFieldNumber1.setBounds(168, 22, 102, 20);
		panel_2.add(textFieldNumber1);
		textFieldNumber1.setColumns(10);

		JTextField textFieldNumber2 = new JTextField();
		textFieldNumber2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textFieldNumber2.setColumns(10);
		textFieldNumber2.setBounds(455, 22, 121, 20);
		panel_2.add(textFieldNumber2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 128, 128));
		panel_3.setBorder(new LineBorder(new Color(153, 51, 51), 2, true));
		panel_3.setBounds(35, 75, 209, 210);
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblChooseOperation = new JLabel("Choose Operation");
		lblChooseOperation.setForeground(new Color(75, 0, 130));
		lblChooseOperation.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseOperation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChooseOperation.setBounds(0, 11, 207, 27);
		panel_3.add(lblChooseOperation);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 0, 51));
		separator.setBounds(0, 38, 207, 8);
		panel_3.add(separator);

		JTextField results = new JTextField();
		results.setBackground(new Color(255, 240, 245));
		results.setForeground(new Color(0, 0, 0));
		results.setBounds(427, 94, 121, 35);
		panel_2.add(results);
		results.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1;
				double num2;
				double result;

				try {
					num1 = Double.parseDouble(textFieldNumber1.getText());
					num2 = Double.parseDouble(textFieldNumber2.getText());
					result = num1 + num2;
					results.setText(Double.toString(result));
					 
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}

			}

		});
		
		btnAdd.setForeground(new Color(153, 0, 51));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdd.setBackground(new Color(255, 182, 193));
		btnAdd.setBounds(37, 49, 138, 23);
		panel_3.add(btnAdd);
		
		JButton btnSubtract = new JButton("SUBTRACT");
		btnSubtract.setBackground(new Color(255, 182, 193));
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1;
				double num2;
				double result;

				try {
					num1 = Double.parseDouble(textFieldNumber1.getText());
					num2 = Double.parseDouble(textFieldNumber2.getText());
					result = num1 - num2;
					results .setText(Double.toString(result));
					 
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}

			}

		});
		btnSubtract.setForeground(new Color(153, 2, 41));
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSubtract.setBounds(37, 83, 138, 27);
		panel_3.add(btnSubtract);
		
		JButton btnMulti = new JButton("MULTIPLY");
		btnMulti.setBackground(new Color(255, 182, 193));
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1;
				double num2;
				double result;

				try {
					num1 = Double.parseDouble(textFieldNumber1.getText());
					num2 = Double.parseDouble(textFieldNumber2.getText());
					result = num1 * num2;
					results .setText(Double.toString(result));
				 
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}

			}

		});
		btnMulti.setForeground(new Color(153, 12, 41));
		btnMulti.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMulti.setBounds(37, 121, 138, 27);
		panel_3.add(btnMulti);
		
		JButton btnDiv = new JButton("DIVISION");
		btnDiv.setBackground(new Color(255, 182, 193));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num1;
				double num2;
				double result;

				try {
					num1 = Double.parseDouble(textFieldNumber1.getText());
					num2 = Double.parseDouble(textFieldNumber2.getText());
					result = num1 / num2;
					results.setText(Double.toString(result));
 				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");
				}

			}

		});
		btnDiv.setForeground(new Color(153, 12, 41));
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDiv.setBounds(37, 159, 138, 27);
		panel_3.add(btnDiv);
		
		
		
		JLabel ansewer = new JLabel("  ANSWER :");
		 
		ansewer.setFont(new Font("Tahoma", Font.BOLD, 16));
		ansewer.setBounds(330, 94, 111, 35);
		panel_2.add(ansewer);
		
		JButton AC = new JButton("AC");
		AC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					textFieldNumber1.setText("");
					textFieldNumber2.setText("");
					results.setText("");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please, enter a valid number");

 				}

			}

		});
			
		

		AC.setBackground(new Color(0, 0, 0));
		AC.setForeground(new Color(255, 0, 0));
		AC.setFont(new Font("Tahoma", Font.BOLD, 16));
		AC.setBounds(373, 208, 139, 27);
		panel_2.add(AC);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(303, 73, 275, 179);
		panel_2.add(panel_4);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(153, 12, 41));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBackground(new Color(255, 182, 193));
		btnExit.setBounds(513, 263, 63, 27);
		panel_2.add(btnExit);

	}
}

