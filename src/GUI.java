import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	private JFrame frmDdDice;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JRadioButton radioButton;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton_2;
	private JRadioButton radioButton_3;
	private JRadioButton radioButton_4;
	private JRadioButton radioButton_5;
	private JRadioButton radioButton_6;
	private JRadioButton radioButton_7;
	private JRadioButton radioButton_8;
	private JRadioButton radioButton_9;
	private JRadioButton radioButton_10;
	private JRadioButton radioButton_11;
	private JRadioButton radioButton_12;
	private JRadioButton radioButton_13;
	private JRadioButton radioButton_14;
	private JRadioButton radioButton_15;
	private JRadioButton radioButton_16;
	private JRadioButton radioButton_17;
	private JRadioButton radioButton_18;
	private JRadioButton radioButton_19;
	private JRadioButton radioButton_20;
	private JRadioButton radioButton_21;
	private JRadioButton radioButton_22;
	private JRadioButton radioButton_23;
	private JRadioButton radioButton_24;
	private JRadioButton radioButton_25;
	private JRadioButton radioButton_26;
	private JRadioButton radioButton_27;
	private JRadioButton radioButton_28;
	private JRadioButton radioButton_29;
	private JRadioButton radioButton_30;
	private JRadioButton radioButton_31;
	private JRadioButton radioButton_32;
	private JRadioButton radioButton_33;
	private JRadioButton radioButton_34;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmDdDice.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmDdDice = new JFrame();
		frmDdDice.getContentPane().setBackground(new Color(51, 0, 0));
		frmDdDice.setBackground(new Color(255, 255, 255));
		frmDdDice.setResizable(false);
		frmDdDice.setTitle("D&D Dice");
		ImageIcon icon = new ImageIcon("resourse/icon.jpg");
		frmDdDice.setIconImage(icon.getImage());
		frmDdDice.setBounds(100, 100, 347, 404);
		frmDdDice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setForeground(new Color(51, 0, 0));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(10, 11, 37, 40);
		textField.setEditable(false);
		textField.setFont(new Font("Arial", Font.BOLD, 28));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(51, 0, 0));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(65, 11, 37, 40);
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Arial", Font.BOLD, 28));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(51, 0, 0));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(120, 11, 37, 40);
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Arial", Font.BOLD, 28));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(51, 0, 0));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setBounds(175, 11, 38, 40);
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Arial", Font.BOLD, 28));
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(51, 0, 0));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setBounds(231, 11, 37, 40);
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Arial", Font.BOLD, 28));
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setForeground(new Color(51, 0, 0));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setBounds(286, 11, 35, 40);
		textField_5.setEditable(false);
		textField_5.setFont(new Font("Arial", Font.BOLD, 28));
		textField_5.setColumns(10);
		frmDdDice.getContentPane().setLayout(null);
		frmDdDice.getContentPane().add(textField);
		frmDdDice.getContentPane().add(textField_1);
		frmDdDice.getContentPane().add(textField_2);
		frmDdDice.getContentPane().add(textField_3);
		frmDdDice.getContentPane().add(textField_4);
		frmDdDice.getContentPane().add(textField_5);
		
		ButtonGroup tf1 = new ButtonGroup();
		ButtonGroup tf2 = new ButtonGroup();
		ButtonGroup tf3 = new ButtonGroup();
		ButtonGroup tf4 = new ButtonGroup();
		ButtonGroup tf5 = new ButtonGroup();
		ButtonGroup tf6 = new ButtonGroup();
		
		
		JRadioButton rdbtnNone = new JRadioButton("off");
		rdbtnNone.setForeground(new Color(255, 255, 255));
		rdbtnNone.setBackground(new Color(51, 0, 0));
		rdbtnNone.setBounds(10, 58, 47, 30);
		rdbtnNone.setSelected(true);
		rdbtnNone.setFont(new Font("Arial", Font.BOLD, 10));
		frmDdDice.getContentPane().add(rdbtnNone);
		tf1.add(rdbtnNone);
		JRadioButton rdbtnD_4 = new JRadioButton("D4");
		rdbtnD_4.setForeground(new Color(255, 255, 255));
		rdbtnD_4.setBackground(new Color(51, 0, 0));
		rdbtnD_4.setBounds(10, 91, 47, 30);
		rdbtnD_4.setFont(new Font("Arial", Font.BOLD, 10));
		frmDdDice.getContentPane().add(rdbtnD_4);
		tf1.add(rdbtnD_4);
		JRadioButton rdbtnD_6 = new JRadioButton("D6");
		rdbtnD_6.setForeground(new Color(255, 255, 255));
		rdbtnD_6.setBackground(new Color(51, 0, 0));
		rdbtnD_6.setBounds(10, 124, 47, 30);
		rdbtnD_6.setFont(new Font("Arial", Font.BOLD, 10));
		frmDdDice.getContentPane().add(rdbtnD_6);
		tf1.add(rdbtnD_6);
		JRadioButton rdbtnD_8 = new JRadioButton("D8");
		rdbtnD_8.setForeground(new Color(255, 255, 255));
		rdbtnD_8.setBackground(new Color(51, 0, 0));
		rdbtnD_8.setBounds(10, 157, 47, 30);
		rdbtnD_8.setFont(new Font("Arial", Font.BOLD, 10));
		frmDdDice.getContentPane().add(rdbtnD_8);
		tf1.add(rdbtnD_8);
		JRadioButton rdbtnD_10 = new JRadioButton("D10");
		rdbtnD_10.setForeground(new Color(255, 255, 255));
		rdbtnD_10.setBackground(new Color(51, 0, 0));
		rdbtnD_10.setBounds(10, 190, 47, 30);
		rdbtnD_10.setFont(new Font("Arial", Font.BOLD, 10));
		frmDdDice.getContentPane().add(rdbtnD_10);
		tf1.add(rdbtnD_10);
		JRadioButton rdbtnD_12 = new JRadioButton("D12");
		rdbtnD_12.setForeground(new Color(255, 255, 255));
		rdbtnD_12.setBackground(new Color(51, 0, 0));
		rdbtnD_12.setBounds(10, 223, 47, 30);
		rdbtnD_12.setFont(new Font("Arial", Font.BOLD, 10));
		frmDdDice.getContentPane().add(rdbtnD_12);
		tf1.add(rdbtnD_12);
		JRadioButton rdbtnD_20 = new JRadioButton("D20");
		rdbtnD_20.setForeground(new Color(255, 255, 255));
		rdbtnD_20.setBackground(new Color(51, 0, 0));
		rdbtnD_20.setBounds(10, 256, 47, 30);
		rdbtnD_20.setFont(new Font("Arial", Font.BOLD, 10));
		frmDdDice.getContentPane().add(rdbtnD_20);
		tf1.add(rdbtnD_20);
		
		radioButton = new JRadioButton("off");
		radioButton.setForeground(new Color(255, 255, 255));
		radioButton.setBackground(new Color(51, 0, 0));
		radioButton.setSelected(true);
		radioButton.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton.setBounds(65, 58, 47, 30);
		frmDdDice.getContentPane().add(radioButton);
		tf2.add(radioButton);
		radioButton_1 = new JRadioButton("D4");
		radioButton_1.setForeground(new Color(255, 255, 255));
		radioButton_1.setBackground(new Color(51, 0, 0));
		radioButton_1.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_1.setBounds(65, 91, 47, 30);
		frmDdDice.getContentPane().add(radioButton_1);
		tf2.add(radioButton_1);
		radioButton_2 = new JRadioButton("D6");
		radioButton_2.setForeground(new Color(255, 255, 255));
		radioButton_2.setBackground(new Color(51, 0, 0));
		radioButton_2.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_2.setBounds(65, 124, 47, 30);
		frmDdDice.getContentPane().add(radioButton_2);
		tf2.add(radioButton_2);
		radioButton_3 = new JRadioButton("D8");
		radioButton_3.setForeground(new Color(255, 255, 255));
		radioButton_3.setBackground(new Color(51, 0, 0));
		radioButton_3.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_3.setBounds(65, 157, 47, 30);
		frmDdDice.getContentPane().add(radioButton_3);
		tf2.add(radioButton_3);
		radioButton_4 = new JRadioButton("D10");
		radioButton_4.setForeground(new Color(255, 255, 255));
		radioButton_4.setBackground(new Color(51, 0, 0));
		radioButton_4.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_4.setBounds(65, 190, 47, 30);
		frmDdDice.getContentPane().add(radioButton_4);
		tf2.add(radioButton_4);
		radioButton_5 = new JRadioButton("D12");
		radioButton_5.setForeground(new Color(255, 255, 255));
		radioButton_5.setBackground(new Color(51, 0, 0));
		radioButton_5.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_5.setBounds(65, 223, 47, 30);
		frmDdDice.getContentPane().add(radioButton_5);
		tf2.add(radioButton_5);
		radioButton_6 = new JRadioButton("D20");
		radioButton_6.setForeground(new Color(255, 255, 255));
		radioButton_6.setBackground(new Color(51, 0, 0));
		radioButton_6.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_6.setBounds(65, 256, 47, 30);
		frmDdDice.getContentPane().add(radioButton_6);
		tf2.add(radioButton_6);
		radioButton_7 = new JRadioButton("off");
		radioButton_7.setForeground(new Color(255, 255, 255));
		radioButton_7.setBackground(new Color(51, 0, 0));
		radioButton_7.setSelected(true);
		radioButton_7.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_7.setBounds(120, 58, 47, 30);
		frmDdDice.getContentPane().add(radioButton_7);
		tf3.add(radioButton_7);
		radioButton_8 = new JRadioButton("D4");
		radioButton_8.setForeground(new Color(255, 255, 255));
		radioButton_8.setBackground(new Color(51, 0, 0));
		radioButton_8.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_8.setBounds(120, 91, 47, 30);
		frmDdDice.getContentPane().add(radioButton_8);
		tf3.add(radioButton_8);
		radioButton_9 = new JRadioButton("D6");
		radioButton_9.setForeground(new Color(255, 255, 255));
		radioButton_9.setBackground(new Color(51, 0, 0));
		radioButton_9.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_9.setBounds(120, 124, 47, 30);
		frmDdDice.getContentPane().add(radioButton_9);
		tf3.add(radioButton_9);
		radioButton_10 = new JRadioButton("D8");
		radioButton_10.setForeground(new Color(255, 255, 255));
		radioButton_10.setBackground(new Color(51, 0, 0));
		radioButton_10.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_10.setBounds(120, 157, 47, 30);
		frmDdDice.getContentPane().add(radioButton_10);
		tf3.add(radioButton_10);
		radioButton_11 = new JRadioButton("D10");
		radioButton_11.setForeground(new Color(255, 255, 255));
		radioButton_11.setBackground(new Color(51, 0, 0));
		radioButton_11.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_11.setBounds(120, 190, 47, 30);
		frmDdDice.getContentPane().add(radioButton_11);
		tf3.add(radioButton_11);
		radioButton_12 = new JRadioButton("D12");
		radioButton_12.setForeground(new Color(255, 255, 255));
		radioButton_12.setBackground(new Color(51, 0, 0));
		radioButton_12.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_12.setBounds(120, 223, 47, 30);
		frmDdDice.getContentPane().add(radioButton_12);
		tf3.add(radioButton_12);
		radioButton_13 = new JRadioButton("D20");
		radioButton_13.setForeground(new Color(255, 255, 255));
		radioButton_13.setBackground(new Color(51, 0, 0));
		radioButton_13.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_13.setBounds(120, 256, 47, 30);
		frmDdDice.getContentPane().add(radioButton_13);
		tf3.add(radioButton_13);
		radioButton_14 = new JRadioButton("off");
		radioButton_14.setForeground(new Color(255, 255, 255));
		radioButton_14.setBackground(new Color(51, 0, 0));
		radioButton_14.setSelected(true);
		radioButton_14.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_14.setBounds(175, 58, 47, 30);
		frmDdDice.getContentPane().add(radioButton_14);
		tf4.add(radioButton_14);
		radioButton_15 = new JRadioButton("D4");
		radioButton_15.setForeground(new Color(255, 255, 255));
		radioButton_15.setBackground(new Color(51, 0, 0));
		radioButton_15.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_15.setBounds(175, 91, 47, 30);
		frmDdDice.getContentPane().add(radioButton_15);
		tf4.add(radioButton_15);
		radioButton_16 = new JRadioButton("D6");
		radioButton_16.setForeground(new Color(255, 255, 255));
		radioButton_16.setBackground(new Color(51, 0, 0));
		radioButton_16.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_16.setBounds(175, 124, 47, 30);
		frmDdDice.getContentPane().add(radioButton_16);
		tf4.add(radioButton_16);
		radioButton_17 = new JRadioButton("D8");
		radioButton_17.setForeground(new Color(255, 255, 255));
		radioButton_17.setBackground(new Color(51, 0, 0));
		radioButton_17.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_17.setBounds(175, 157, 47, 30);
		frmDdDice.getContentPane().add(radioButton_17);
		tf4.add(radioButton_17);
		radioButton_18 = new JRadioButton("D10");
		radioButton_18.setForeground(new Color(255, 255, 255));
		radioButton_18.setBackground(new Color(51, 0, 0));
		radioButton_18.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_18.setBounds(175, 190, 47, 30);
		frmDdDice.getContentPane().add(radioButton_18);
		tf4.add(radioButton_18);
		radioButton_19 = new JRadioButton("D12");
		radioButton_19.setForeground(new Color(255, 255, 255));
		radioButton_19.setBackground(new Color(51, 0, 0));
		radioButton_19.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_19.setBounds(175, 223, 47, 30);
		frmDdDice.getContentPane().add(radioButton_19);
		tf4.add(radioButton_19);
		radioButton_20 = new JRadioButton("D20");
		radioButton_20.setForeground(new Color(255, 255, 255));
		radioButton_20.setBackground(new Color(51, 0, 0));
		radioButton_20.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_20.setBounds(175, 256, 47, 30);
		frmDdDice.getContentPane().add(radioButton_20);
		tf4.add(radioButton_20);
		radioButton_21 = new JRadioButton("off");
		radioButton_21.setForeground(new Color(255, 255, 255));
		radioButton_21.setBackground(new Color(51, 0, 0));
		radioButton_21.setSelected(true);
		radioButton_21.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_21.setBounds(231, 58, 47, 30);
		frmDdDice.getContentPane().add(radioButton_21);
		tf5.add(radioButton_21);
		radioButton_22 = new JRadioButton("D4");
		radioButton_22.setForeground(new Color(255, 255, 255));
		radioButton_22.setBackground(new Color(51, 0, 0));
		radioButton_22.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_22.setBounds(231, 91, 47, 30);
		frmDdDice.getContentPane().add(radioButton_22);
		tf5.add(radioButton_22);
		radioButton_23 = new JRadioButton("D6");
		radioButton_23.setForeground(new Color(255, 255, 255));
		radioButton_23.setBackground(new Color(51, 0, 0));
		radioButton_23.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_23.setBounds(231, 124, 47, 30);
		frmDdDice.getContentPane().add(radioButton_23);
		tf5.add(radioButton_23);
		radioButton_24 = new JRadioButton("D8");
		radioButton_24.setForeground(new Color(255, 255, 255));
		radioButton_24.setBackground(new Color(51, 0, 0));
		radioButton_24.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_24.setBounds(231, 157, 47, 30);
		frmDdDice.getContentPane().add(radioButton_24);
		tf5.add(radioButton_24);
		radioButton_25 = new JRadioButton("D10");
		radioButton_25.setForeground(new Color(255, 255, 255));
		radioButton_25.setBackground(new Color(51, 0, 0));
		radioButton_25.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_25.setBounds(231, 190, 47, 30);
		frmDdDice.getContentPane().add(radioButton_25);
		tf5.add(radioButton_25);
		radioButton_26 = new JRadioButton("D12");
		radioButton_26.setForeground(new Color(255, 255, 255));
		radioButton_26.setBackground(new Color(51, 0, 0));
		radioButton_26.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_26.setBounds(231, 223, 47, 30);
		frmDdDice.getContentPane().add(radioButton_26);
		tf5.add(radioButton_26);
		radioButton_27 = new JRadioButton("D20");
		radioButton_27.setForeground(new Color(255, 255, 255));
		radioButton_27.setBackground(new Color(51, 0, 0));
		radioButton_27.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_27.setBounds(231, 256, 47, 30);
		frmDdDice.getContentPane().add(radioButton_27);
		tf5.add(radioButton_27);
		radioButton_28 = new JRadioButton("off");
		radioButton_28.setForeground(new Color(255, 255, 255));
		radioButton_28.setBackground(new Color(51, 0, 0));
		radioButton_28.setSelected(true);
		radioButton_28.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_28.setBounds(286, 58, 47, 30);
		frmDdDice.getContentPane().add(radioButton_28);
		tf6.add(radioButton_28);
		radioButton_29 = new JRadioButton("D4");
		radioButton_29.setForeground(new Color(255, 255, 255));
		radioButton_29.setBackground(new Color(51, 0, 0));
		radioButton_29.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_29.setBounds(286, 91, 47, 30);
		frmDdDice.getContentPane().add(radioButton_29);
		tf6.add(radioButton_29);
		radioButton_30 = new JRadioButton("D6");
		radioButton_30.setForeground(new Color(255, 255, 255));
		radioButton_30.setBackground(new Color(51, 0, 0));
		radioButton_30.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_30.setBounds(286, 124, 47, 30);
		frmDdDice.getContentPane().add(radioButton_30);	
		radioButton_31 = new JRadioButton("D8");
		radioButton_31.setForeground(new Color(255, 255, 255));
		radioButton_31.setBackground(new Color(51, 0, 0));
		radioButton_31.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_31.setBounds(286, 157, 47, 30);
		frmDdDice.getContentPane().add(radioButton_31);
		tf6.add(radioButton_31);
		radioButton_32 = new JRadioButton("D10");
		radioButton_32.setForeground(new Color(255, 255, 255));
		radioButton_32.setBackground(new Color(51, 0, 0));
		radioButton_32.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_32.setBounds(286, 190, 47, 30);
		frmDdDice.getContentPane().add(radioButton_32);
		tf6.add(radioButton_32);
		radioButton_33 = new JRadioButton("D12");
		radioButton_33.setForeground(new Color(255, 255, 255));
		radioButton_33.setBackground(new Color(51, 0, 0));
		radioButton_33.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_33.setBounds(286, 223, 47, 30);
		frmDdDice.getContentPane().add(radioButton_33);
		tf6.add(radioButton_33);
		radioButton_34 = new JRadioButton("D20");
		radioButton_34.setForeground(new Color(255, 255, 255));
		radioButton_34.setBackground(new Color(51, 0, 0));
		radioButton_34.setFont(new Font("Arial", Font.BOLD, 10));
		radioButton_34.setBounds(286, 256, 47, 30);
		frmDdDice.getContentPane().add(radioButton_34);
		tf6.add(radioButton_34);
		
		
		JButton btnNewButton = new JButton("ROLL THE DICE");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(10, 293, 320, 30);
		frmDdDice.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				if (rdbtnNone.isSelected()) {
					textField.setText(null);
				}
				
				if (rdbtnD_4.isSelected()) {
					textField.setText(String.valueOf(1+((int)(Math.random()*4))));
				}
				
				if (rdbtnD_6.isSelected()) {
					textField.setText(String.valueOf(1+((int)(Math.random()*6))));
				}
				
				if (rdbtnD_8.isSelected()) {
					textField.setText(String.valueOf(1+((int)(Math.random()*8))));
				}
				
				if (rdbtnD_10.isSelected()) {
					textField.setText(String.valueOf(1+((int)(Math.random()*10))));
				}
				
				if (rdbtnD_12.isSelected()) {
					textField.setText(String.valueOf(1+((int)(Math.random()*12))));
				}
				
				if (rdbtnD_20.isSelected()) {
					textField.setText(String.valueOf(1+((int)(Math.random()*20))));
				}
				
				if (radioButton.isSelected()) {
					textField_1.setText(null);
				}
				
				if (radioButton_1.isSelected()) {
					textField_1.setText(String.valueOf(1+((int)(Math.random()*4))));
				}
				
				if (radioButton_2.isSelected()) {
					textField_1.setText(String.valueOf(1+((int)(Math.random()*6))));
				}
				
				if (radioButton_3.isSelected()) {
					textField_1.setText(String.valueOf(1+((int)(Math.random()*8))));
				}
				
				if (radioButton_4.isSelected()) {
					textField_1.setText(String.valueOf(1+((int)(Math.random()*10))));
				}
				
				if (radioButton_5.isSelected()) {
					textField_1.setText(String.valueOf(1+((int)(Math.random()*12))));
				}
				
				if (radioButton_6.isSelected()) {
					textField_1.setText(String.valueOf(1+((int)(Math.random()*20))));
				}
				
				if (radioButton_7.isSelected()) {
					textField_2.setText(null);
				}
				
				if (radioButton_8.isSelected()) {
					textField_2.setText(String.valueOf(1+((int)(Math.random()*4))));
				}
				
				if (radioButton_9.isSelected()) {
					textField_2.setText(String.valueOf(1+((int)(Math.random()*6))));
				}
				
				if (radioButton_10.isSelected()) {
					textField_2.setText(String.valueOf(1+((int)(Math.random()*8))));
				}
				
				if (radioButton_11.isSelected()) {
					textField_2.setText(String.valueOf(1+((int)(Math.random()*10))));
				}
				
				if (radioButton_12.isSelected()) {
					textField_2.setText(String.valueOf(1+((int)(Math.random()*12))));
				}
				
				if (radioButton_13.isSelected()) {
					textField_2.setText(String.valueOf(1+((int)(Math.random()*20))));
				}
				
				if (radioButton_14.isSelected()) {
					textField_3.setText(null);
				}
				
				if (radioButton_15.isSelected()) {
					textField_3.setText(String.valueOf(1+((int)(Math.random()*4))));
				}
				
				if (radioButton_16.isSelected()) {
					textField_3.setText(String.valueOf(1+((int)(Math.random()*6))));
				}
				
				if (radioButton_17.isSelected()) {
					textField_3.setText(String.valueOf(1+((int)(Math.random()*8))));
				}
				
				if (radioButton_18.isSelected()) {
					textField_3.setText(String.valueOf(1+((int)(Math.random()*10))));
				}
				
				if (radioButton_19.isSelected()) {
					textField_3.setText(String.valueOf(1+((int)(Math.random()*12))));
				}
				
				if (radioButton_20.isSelected()) {
					textField_3.setText(String.valueOf(1+((int)(Math.random()*20))));
				}
				
				if (radioButton_21.isSelected()) {
					textField_4.setText(null);
				}
				
				if (radioButton_22.isSelected()) {
					textField_4.setText(String.valueOf(1+((int)(Math.random()*4))));
				}
				
				if (radioButton_23.isSelected()) {
					textField_4.setText(String.valueOf(1+((int)(Math.random()*6))));
				}
				
				if (radioButton_24.isSelected()) {
					textField_4.setText(String.valueOf(1+((int)(Math.random()*8))));
				}
				
				if (radioButton_25.isSelected()) {
					textField_4.setText(String.valueOf(1+((int)(Math.random()*10))));
				}
				
				if (radioButton_26.isSelected()) {
					textField_4.setText(String.valueOf(1+((int)(Math.random()*12))));
				}
				
				if (radioButton_27.isSelected()) {
					textField_4.setText(String.valueOf(1+((int)(Math.random()*20))));
				}
				
				if (radioButton_28.isSelected()) {
					textField_5.setText(null);
				}
				
				if (radioButton_29.isSelected()) {
					textField_5.setText(String.valueOf(1+((int)(Math.random()*4))));
				}
				
				if (radioButton_30.isSelected()) {
					textField_5.setText(String.valueOf(1+((int)(Math.random()*6))));
				}
				
				if (radioButton_31.isSelected()) {
					textField_5.setText(String.valueOf(1+((int)(Math.random()*8))));
				}
				
				if (radioButton_32.isSelected()) {
					textField_5.setText(String.valueOf(1+((int)(Math.random()*10))));
				}
				
				if (radioButton_33.isSelected()) {
					textField_5.setText(String.valueOf(1+((int)(Math.random()*12))));
				}
				
				if (radioButton_34.isSelected()) {
					textField_5.setText(String.valueOf(1+((int)(Math.random()*20))));
				}
				
				
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.setBounds(10, 327, 320, 32);
		frmDdDice.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			textField.setText("");
			textField_1.setText("");
			textField_2.setText("");
			textField_3.setText("");
			textField_4.setText("");
			textField_5.setText("");
			rdbtnNone.setSelected(true);
			radioButton.setSelected(true);
			radioButton_7.setSelected(true);
			radioButton_14.setSelected(true);
			radioButton_21.setSelected(true);
			radioButton_28.setSelected(true);
			}
		});
		
	
	}
	}
	
