package br.edu.utfpr.students.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegisterSupplierPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 790;
	private static final int HEIGHT = 620;
	private JTextField textFieldSuplierName;
	private JTextField textFieldSupplierLPN;
	private JTextField textFieldSupplierContact;
	private JTextField textFieldSupplierState;
	private JTextField textFieldSupplierCity;
	private JTextField textFieldSupplierStreet;
	private JTextField textFieldSupplierNumber;
	/**
	 * Create the panel.
	 */
	
	
	public RegisterSupplierPanel() {

		setSize(WIDTH, HEIGHT);
		setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(33, 43, 56, 16);
		add(lblName);
		
		textFieldSuplierName = new JTextField();
		textFieldSuplierName.setBounds(188, 40, 116, 22);
		add(textFieldSuplierName);
		textFieldSuplierName.setColumns(10);
		
		JLabel lblLegalPearsonNumber = new JLabel("Legal Pearson Number");
		lblLegalPearsonNumber.setBounds(33, 96, 136, 16);
		add(lblLegalPearsonNumber);
		
		textFieldSupplierLPN = new JTextField();
		textFieldSupplierLPN.setBounds(188, 93, 116, 22);
		add(textFieldSupplierLPN);
		textFieldSupplierLPN.setColumns(10);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setBounds(33, 153, 56, 16);
		add(lblContact);
		
		textFieldSupplierContact = new JTextField();
		textFieldSupplierContact.setBounds(188, 150, 116, 22);
		add(textFieldSupplierContact);
		textFieldSupplierContact.setColumns(10);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(33, 208, 56, 16);
		add(lblAdress);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(33, 257, 56, 16);
		add(lblState);
		
		textFieldSupplierState = new JTextField();
		textFieldSupplierState.setBounds(188, 254, 116, 22);
		add(textFieldSupplierState);
		textFieldSupplierState.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("City");
		lblNewLabel.setBounds(33, 309, 56, 16);
		add(lblNewLabel);
		
		textFieldSupplierCity = new JTextField();
		textFieldSupplierCity.setBounds(188, 306, 116, 22);
		add(textFieldSupplierCity);
		textFieldSupplierCity.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Street");
		lblNewLabel_1.setBounds(33, 363, 56, 16);
		add(lblNewLabel_1);
		
		textFieldSupplierStreet = new JTextField();
		textFieldSupplierStreet.setBounds(188, 360, 116, 22);
		add(textFieldSupplierStreet);
		textFieldSupplierStreet.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(33, 420, 56, 16);
		add(lblNumber);
		
		textFieldSupplierNumber = new JTextField();
		textFieldSupplierNumber.setBounds(188, 417, 116, 22);
		add(textFieldSupplierNumber);
		textFieldSupplierNumber.setColumns(10);
		
		
	}
	public JTextField getTextFieldSuplierName() {
		return textFieldSuplierName;
	}
	public JTextField getTextFieldSupplierLPN() {
		return textFieldSupplierLPN;
	}
	public JTextField getTextFieldSupplierContact() {
		return textFieldSupplierContact;
	}
	public JTextField getTextFieldSupplierState() {
		return textFieldSupplierState;
	}
	public JTextField getTextFieldSupplierCity() {
		return textFieldSupplierCity;
	}
	public JTextField getTextFieldSupplierStreet() {
		return textFieldSupplierStreet;
	}
	public JTextField getTextFieldSupplierNumber() {
		return textFieldSupplierNumber;
	}

}
