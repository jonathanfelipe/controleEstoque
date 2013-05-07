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
	private JTextField textFieldTelephone;
	private JLabel lblCountry;
	private JTextField textFieldCountry;
	private JLabel lblCellphone;
	private JTextField textFieldCellPhone;
	private JLabel lblEmail;
	private JTextField textFieldEmail;
	private JTextField textFieldDistrict;
	private JLabel lblZipCode;
	private JTextField textFieldZipcode;

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
		lblName.setBounds(36, 27, 56, 16);
		add(lblName);

		textFieldName = new JTextField();
		textFieldName.setBounds(127, 24, 175, 22);
		add(textFieldName);
		textFieldName.setColumns(10);

		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(36, 239, 56, 16);
		add(lblAdress);

		JLabel lblStreet = new JLabel("Street");
		lblStreet.setBounds(36, 451, 56, 16);
		add(lblStreet);

		textFieldStreet = new JTextField();
		textFieldStreet.setBounds(127, 448, 175, 22);
		add(textFieldStreet);
		textFieldStreet.setColumns(10);

		JLabel lblSsn = new JLabel("SSN");
		lblSsn.setBounds(36, 81, 56, 16);
		add(lblSsn);

		textFieldSSN = new JTextField();
		textFieldSSN.setBounds(127, 78, 175, 22);
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
		lblBirthdate.setBounds(36, 138, 56, 16);
		add(lblBirthdate);

		textFieldBirthdate = new JTextField();
		textFieldBirthdate.setBounds(127, 135, 175, 22);
		add(textFieldBirthdate);
		textFieldBirthdate.setColumns(10);

		JLabel lblContact = new JLabel("Phone");
		lblContact.setBounds(36, 190, 56, 16);
		add(lblContact);

		textFieldTelephone = new JTextField();
		textFieldTelephone.setBounds(127, 187, 169, 22);
		add(textFieldTelephone);
		textFieldTelephone.setColumns(10);

		lblCountry = new JLabel("Country");
		lblCountry.setBounds(36, 290, 56, 16);
		add(lblCountry);

		textFieldCountry = new JTextField();
		textFieldCountry.setBounds(127, 287, 175, 22);
		add(textFieldCountry);
		textFieldCountry.setColumns(10);

		lblCellphone = new JLabel("CellPhone");
		lblCellphone.setBounds(308, 190, 56, 16);
		add(lblCellphone);

		textFieldCellPhone = new JTextField();
		textFieldCellPhone.setBounds(376, 187, 145, 22);
		add(textFieldCellPhone);
		textFieldCellPhone.setColumns(10);

		lblEmail = new JLabel("Email");
		lblEmail.setBounds(547, 190, 56, 16);
		add(lblEmail);

		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(615, 187, 145, 22);
		add(textFieldEmail);
		textFieldEmail.setColumns(10);

		JLabel lblDistrict = new JLabel("District");
		lblDistrict.setBounds(314, 399, 61, 16);
		add(lblDistrict);

		textFieldDistrict = new JTextField();
		textFieldDistrict.setBounds(376, 393, 134, 28);
		add(textFieldDistrict);
		textFieldDistrict.setColumns(10);

		lblZipCode = new JLabel("Zip code");
		lblZipCode.setBounds(303, 507, 61, 16);
		add(lblZipCode);

		textFieldZipcode = new JTextField();
		textFieldZipcode.setBounds(376, 498, 134, 28);
		add(textFieldZipcode);
		textFieldZipcode.setColumns(10);

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
		return textFieldTelephone;
	}

	public JTextField getTextFieldTelephone() {
		return textFieldTelephone;
	}

	public JTextField getTextFieldCountry() {
		return textFieldCountry;
	}

	public JTextField getTextFieldCellPhone() {
		return textFieldCellPhone;
	}

	public JTextField getTextFieldEmail() {
		return textFieldEmail;
	}

	public JButton getBtnClientCancel() {
		return btnClientCancel;
	}

	/**
	 * @return the btnClientSubmit
	 */
	public JButton getBtnClientSubmit() {
		return btnClientSubmit;
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
}
