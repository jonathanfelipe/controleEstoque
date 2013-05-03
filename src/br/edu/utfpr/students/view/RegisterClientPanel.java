package br.edu.utfpr.students.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.JTextArea;

@SuppressWarnings("unused")
public class RegisterClientPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 790;
	private static final int HEIGHT = 620;
	private JButton btnClientSubmit;
	private JButton btnClientCancel;
	private JTextField textFieldName;
	private JTextField textFieldStreet;
	private JTextField textFieldSSN;
	private JTextField textFieldState;
	private JTextField textFieldCity;
	private JTextField textFieldNumber;
	private JTextField textFieldBirthdate;
	private JTextField textFieldContact;
	
	/**
	 * Create the panel.
	 */
	
	public RegisterClientPanel() {
		
		setSize(WIDTH, HEIGHT);
		setLayout(null);
		
		btnClientSubmit = new JButton("Submit");
		btnClientSubmit.setBounds(36, 555, 131, 25);
		add(btnClientSubmit);
		
		btnClientCancel = new JButton("Cancel");
		btnClientCancel.setBounds(200, 555, 131, 25);
		add(btnClientCancel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(36, 60, 56, 16);
		add(lblName);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(127, 57, 175, 22);
		add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(36, 293, 56, 16);
		add(lblAdress);
		
		JLabel lblStreet = new JLabel("Street");
		lblStreet.setBounds(36, 451, 56, 16);
		add(lblStreet);
		
		textFieldStreet = new JTextField();
		textFieldStreet.setBounds(127, 448, 175, 22);
		add(textFieldStreet);
		textFieldStreet.setColumns(10);
		
		JLabel lblSsn = new JLabel("SSN");
		lblSsn.setBounds(36, 116, 56, 16);
		add(lblSsn);
		
		textFieldSSN = new JTextField();
		textFieldSSN.setBounds(127, 113, 175, 22);
		add(textFieldSSN);
		textFieldSSN.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(36, 347, 56, 16);
		add(lblState);
		
		textFieldState = new JTextField();
		textFieldState.setBounds(127, 344, 175, 22);
		add(textFieldState);
		textFieldState.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("City");
		lblNewLabel.setBounds(36, 399, 56, 16);
		add(lblNewLabel);
		
		textFieldCity = new JTextField();
		textFieldCity.setBounds(127, 396, 175, 22);
		add(textFieldCity);
		textFieldCity.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(36, 504, 56, 16);
		add(lblNumber);
		
		textFieldNumber = new JTextField();
		textFieldNumber.setBounds(127, 501, 175, 22);
		add(textFieldNumber);
		textFieldNumber.setColumns(10);
		
		JLabel lblBirthdate = new JLabel("Birthdate");
		lblBirthdate.setBounds(36, 174, 56, 16);
		add(lblBirthdate);
		
		textFieldBirthdate = new JTextField();
		textFieldBirthdate.setBounds(127, 171, 175, 22);
		add(textFieldBirthdate);
		textFieldBirthdate.setColumns(10);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(36, 231, 56, 16);
		add(lblContact);
		
		textFieldContact = new JTextField();
		textFieldContact.setBounds(127, 228, 175, 22);
		add(textFieldContact);
		textFieldContact.setColumns(10);
		
		
		
		
	}
	public JTextField getTextFieldSSN() {
		return textFieldSSN;
	}
	public JTextField getTextFieldName() {
		return textFieldName;
	}
	public JTextField getTextFieldStreet() {
		return textFieldStreet;
	}
	public JButton getBtnOk() {
		return btnClientSubmit;
	}
	public JTextField getTextFieldState() {
		return textFieldState;
	}
	public JTextField getTextFieldCity() {
		return textFieldCity;
	}
	public JTextField getTextFieldNumber() {
		return textFieldNumber;
	}
	public JTextField getTextFieldBirthdate() {
		return textFieldBirthdate;
	}
	public JTextField getTextFieldContact() {
		return textFieldContact;
	}
}
