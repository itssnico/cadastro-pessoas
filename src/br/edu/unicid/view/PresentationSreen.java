package br.edu.unicid.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class PresentationSreen extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAdress;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PresentationSreen frame = new PresentationSreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PresentationSreen() {
		setForeground(new Color(51, 204, 102));
		setTitle("Cadastro de Pessoas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 343);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(new Color(102, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 24, 53, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Adress:");
		lblNewLabel_1.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 47, 60, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender:");
		lblNewLabel_2.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 70, 66, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Civil Status:");
		lblNewLabel_3.setFont(new Font("Source Sans Pro Black", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 93, 100, 23);
		contentPane.add(lblNewLabel_3);
		
		txtName = new JTextField();
		txtName.setBounds(277, 25, 250, 16);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setColumns(10);
		txtAdress.setBounds(277, 48, 250, 16);
		contentPane.add(txtAdress);
		
		JComboBox cmbGender = new JComboBox();
		cmbGender.setFont(new Font("Tahoma", Font.BOLD, 10));
		cmbGender.setModel(new DefaultComboBoxModel(new String[] {"Select:", "male", "female"}));
		cmbGender.setBounds(277, 73, 250, 17);
		contentPane.add(cmbGender);
		
		JComboBox cmbCivilStatus = new JComboBox();
		cmbCivilStatus.setFont(new Font("Tahoma", Font.BOLD, 10));
		cmbCivilStatus.setModel(new DefaultComboBoxModel(new String[] {"Select:", "married", "single"}));
		cmbCivilStatus.setBounds(277, 94, 250, 17);
		contentPane.add(cmbCivilStatus);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mostrar = txtName.getText() + " lives in "+ txtAdress.getText() + 
				" identify as " + cmbGender.getSelectedItem().toString() + " and it's " + 
				cmbCivilStatus.getSelectedItem().toString();
				
				textField.setText(mostrar);
				
			}
		});
		btnShow.setBackground(UIManager.getColor("Button.light"));
		btnShow.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnShow.setBounds(10, 131, 244, 51);
		contentPane.add(btnShow);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText(null);
				txtAdress.setText(null);
				cmbGender.setSelectedIndex(0);
				cmbCivilStatus.setSelectedIndex(0);		
				textField.setText(null);
			}
		});
		btnClear.setBackground(UIManager.getColor("Button.light"));
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setBounds(264, 131, 263, 51);
		contentPane.add(btnClear);
		
		textField = new JTextField();
		textField.setBounds(10, 200, 518, 95);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
