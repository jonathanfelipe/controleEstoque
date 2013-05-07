package br.edu.utfpr.students.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;


public class RegisterProductPane extends JPanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 790;
	private static final int HEIGHT = 620;
	private JTextField textFieldProductName;
	private JTextField textFieldProductPrice;
	private JTextField textFieldProductQuantity;
	private JTextArea textAreaProductDescription;
	/**
	 * Create the panel.
	 */
	public RegisterProductPane() {
		
		setSize(WIDTH, HEIGHT);
		setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(28, 40, 56, 16);
		add(lblName);
		
		textFieldProductName = new JTextField();
		textFieldProductName.setBounds(112, 37, 212, 22);
		add(textFieldProductName);
		textFieldProductName.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(28, 109, 56, 16);
		add(lblPrice);
		
		textFieldProductPrice = new JTextField();
		textFieldProductPrice.setBounds(112, 106, 212, 22);
		add(textFieldProductPrice);
		textFieldProductPrice.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Quantity");
		lblNewLabel.setBounds(28, 183, 56, 16);
		add(lblNewLabel);
		
		textFieldProductQuantity = new JTextField();
		textFieldProductQuantity.setBounds(112, 180, 212, 22);
		add(textFieldProductQuantity);
		textFieldProductQuantity.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Description");
		lblNewLabel_1.setBounds(28, 261, 69, 16);
		add(lblNewLabel_1);
		
		textAreaProductDescription = new JTextArea();
		textAreaProductDescription.setBounds(112, 258, 212, 79);
		add(textAreaProductDescription);

	}

	public JTextField getTextFieldProductName() {
		return textFieldProductName;
	}

	public JTextField getTextFieldProductPrice() {
		return textFieldProductPrice;
	}

	public JTextField getTextFieldProductQuantity() {
		return textFieldProductQuantity;
	}

	public JTextArea getTextAreaProductDescription() {
		return textAreaProductDescription;
	}

}
