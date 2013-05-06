package br.edu.utfpr.students.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
	private JTextField textFieldEmail;
	private JTextField textFieldTelephone;
	private JTextField textFieldCellphone;
	private JLabel lblCellphone;
	private JTextField textFieldZipcode;
	private JLabel lblZipCode;
	private JTextField textFieldDistrict;
	private JLabel lblDistrict;
	private JLabel lblCountry;
	private JTextField textFieldCountry;

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
		lblName.setBounds(47, 60, 56, 16);
		add(lblName);

		textFieldName = new JTextField();
		textFieldName.setBounds(127, 57, 175, 22);
		add(textFieldName);
		textFieldName.setColumns(10);

		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(47, 329, 56, 16);
		add(lblAdress);

		JLabel lblStreet = new JLabel("Street");
		lblStreet.setBounds(47, 461, 56, 16);
		add(lblStreet);

		textFieldStreet = new JTextField();
		textFieldStreet.setBounds(127, 455, 168, 22);
		add(textFieldStreet);
		textFieldStreet.setColumns(10);

		JLabel lblSsn = new JLabel("SSN");
		lblSsn.setBounds(47, 116, 56, 16);
		add(lblSsn);

		textFieldSSN = new JTextField();
		textFieldSSN.setBounds(127, 113, 175, 22);
		add(textFieldSSN);
		textFieldSSN.setColumns(10);

		JLabel lblState = new JLabel("State");
		lblState.setBounds(352, 415, 56, 16);
		add(lblState);

		textFieldState = new JTextField();
		textFieldState.setBounds(432, 409, 175, 22);
		add(textFieldState);
		textFieldState.setColumns(10);

		JLabel lblNewLabel = new JLabel("City");
		lblNewLabel.setBounds(47, 409, 56, 16);
		add(lblNewLabel);

		textFieldCity = new JTextField();
		textFieldCity.setBounds(127, 403, 168, 22);
		add(textFieldCity);
		textFieldCity.setColumns(10);

		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(47, 514, 56, 16);
		add(lblNumber);

		textFieldNumber = new JTextField();
		textFieldNumber.setBounds(127, 511, 168, 22);
		add(textFieldNumber);
		textFieldNumber.setColumns(10);

		JLabel lblBirthdate = new JLabel("Birthdate");
		lblBirthdate.setBounds(47, 174, 56, 16);
		add(lblBirthdate);

		textFieldBirthdate = new JTextField();
		textFieldBirthdate.setBounds(127, 171, 175, 22);
		add(textFieldBirthdate);
		textFieldBirthdate.setColumns(10);

		JLabel lblContact = new JLabel("Contact:");
		lblContact.setBounds(47, 202, 56, 16);
		add(lblContact);

		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(127, 228, 175, 22);
		add(textFieldEmail);
		textFieldEmail.setColumns(10);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(47, 230, 61, 16);
		add(lblEmail);

		textFieldTelephone = new JTextField();
		textFieldTelephone.setBounds(127, 269, 175, 28);
		add(textFieldTelephone);
		textFieldTelephone.setColumns(10);

		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setBounds(47, 281, 66, 16);
		add(lblTelephone);

		textFieldCellphone = new JTextField();
		textFieldCellphone.setBounds(432, 269, 175, 28);
		add(textFieldCellphone);
		textFieldCellphone.setColumns(10);

		lblCellphone = new JLabel("Cellphone");
		lblCellphone.setBounds(352, 281, 79, 16);
		add(lblCellphone);

		textFieldZipcode = new JTextField();
		textFieldZipcode.setBounds(435, 508, 168, 28);
		add(textFieldZipcode);
		textFieldZipcode.setColumns(10);

		lblZipCode = new JLabel("Zip code");
		lblZipCode.setBounds(350, 514, 61, 16);
		add(lblZipCode);

		textFieldDistrict = new JTextField();
		textFieldDistrict.setBounds(435, 452, 168, 28);
		add(textFieldDistrict);
		textFieldDistrict.setColumns(10);

		lblDistrict = new JLabel("District");
		lblDistrict.setBounds(350, 461, 61, 16);
		add(lblDistrict);

		lblCountry = new JLabel("Country");
		lblCountry.setBounds(36, 357, 61, 16);
		add(lblCountry);

		textFieldCountry = new JTextField();
		textFieldCountry.setBounds(127, 351, 168, 28);
		add(textFieldCountry);
		textFieldCountry.setColumns(10);

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

	/**
	 * @return the btnClientCancel
	 */
	public JButton getBtnClientCancel() {
		return btnClientCancel;
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
		return textFieldEmail;
	}

	/**
	 * @return the textFieldEmail
	 */
	public JTextField getTextFieldEmail() {
		return textFieldEmail;
	}

	/**
	 * @return the textFieldTelephone
	 */
	public JTextField getTextFieldTelephone() {
		return textFieldTelephone;
	}

	/**
	 * @return the textFieldCellphone
	 */
	public JTextField getTextFieldCellphone() {
		return textFieldCellphone;
	}

	/**
	 * @return the textFieldDistrict
	 */
	public JTextField getTextFieldDistrict() {
		return textFieldDistrict;
	}

	/**
	 * @return the textFieldZipcode
	 */
	public JTextField getTextFieldZipcode() {
		return textFieldZipcode;
	}

	/**
	 * @return the textFieldCountry
	 */
	public JTextField getTextFieldCountry() {
		return textFieldCountry;
	}
}
