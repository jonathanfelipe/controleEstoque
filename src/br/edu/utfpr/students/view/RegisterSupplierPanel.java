package br.edu.utfpr.students.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

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
	private JTextField textFieldCountrySupplier;
	private JTextField textFieldCellPhone;
	private JTextField textFieldEmail;
	private JButton btnCancelSupplier;
	private JButton btnSubmitSupplier;
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
		
		JLabel lblContact = new JLabel("Phone");
		lblContact.setBounds(33, 153, 56, 16);
		add(lblContact);
		
		textFieldSupplierContact = new JTextField();
		textFieldSupplierContact.setBounds(188, 150, 116, 22);
		add(textFieldSupplierContact);
		textFieldSupplierContact.setColumns(10);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(33, 224, 56, 16);
		add(lblAdress);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(33, 339, 56, 16);
		add(lblState);
		
		textFieldSupplierState = new JTextField();
		textFieldSupplierState.setBounds(188, 336, 116, 22);
		add(textFieldSupplierState);
		textFieldSupplierState.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("City");
		lblNewLabel.setBounds(33, 396, 56, 16);
		add(lblNewLabel);
		
		textFieldSupplierCity = new JTextField();
		textFieldSupplierCity.setBounds(188, 393, 116, 22);
		add(textFieldSupplierCity);
		textFieldSupplierCity.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Street");
		lblNewLabel_1.setBounds(33, 450, 56, 16);
		add(lblNewLabel_1);
		
		textFieldSupplierStreet = new JTextField();
		textFieldSupplierStreet.setBounds(188, 447, 116, 22);
		add(textFieldSupplierStreet);
		textFieldSupplierStreet.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(33, 500, 56, 16);
		add(lblNumber);
		
		textFieldSupplierNumber = new JTextField();
		textFieldSupplierNumber.setBounds(188, 497, 116, 22);
		add(textFieldSupplierNumber);
		textFieldSupplierNumber.setColumns(10);
		
		btnSubmitSupplier = new JButton("Submit");
		btnSubmitSupplier.setBounds(33, 555, 97, 25);
		add(btnSubmitSupplier);
		
		btnCancelSupplier = new JButton("Cancel");
		btnCancelSupplier.setBounds(207, 555, 97, 25);
		add(btnCancelSupplier);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(33, 285, 56, 16);
		add(lblCountry);
		
		textFieldCountrySupplier = new JTextField();
		textFieldCountrySupplier.setBounds(188, 282, 116, 22);
		add(textFieldCountrySupplier);
		textFieldCountrySupplier.setColumns(10);
		
		JLabel lblCellphone = new JLabel("Cellphone");
		lblCellphone.setBounds(316, 153, 56, 16);
		add(lblCellphone);
		
		textFieldCellPhone = new JTextField();
		textFieldCellPhone.setBounds(394, 150, 147, 22);
		add(textFieldCellPhone);
		textFieldCellPhone.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(563, 153, 56, 16);
		add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(631, 150, 147, 22);
		add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		
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
	public JTextField getTextFieldCountrySupplier() {
		return textFieldCountrySupplier;
	}
	public JTextField getTextFieldCellPhone() {
		return textFieldCellPhone;
	}
	public JTextField getTextFieldEmail() {
		return textFieldEmail;
	}
	public JButton getBtnCancelSupplier() {
		return btnCancelSupplier;
	}
	public JButton getBtnSubmitSupplier() {
		return btnSubmitSupplier;
	}

}
