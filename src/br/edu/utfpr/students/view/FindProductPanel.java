package br.edu.utfpr.students.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;



public class FindProductPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 790;
	private static final int HEIGHT = 620;
	private JTextField textFieldSearchProduct;
	private JButton btnSearchProduct;
	private JButton btnSubmitSearchProduct;
	private JButton btnCancelSearchProduct;
	private JButton btnDeleteSearchProduct;
	private JTable tableSearchProduct;
	
	/**
	 * Create the panel.
	 */

	public FindProductPanel() {
		setSize(WIDTH, HEIGHT);
		setLayout(null);
		
		JLabel lblSearch = new JLabel("Value");
		lblSearch.setBounds(49, 38, 56, 16);
		add(lblSearch);
		
		textFieldSearchProduct = new JTextField();
		textFieldSearchProduct.setBounds(127, 35, 197, 22);
		add(textFieldSearchProduct);
		textFieldSearchProduct.setColumns(10);
		
		btnSearchProduct = new JButton("Search");
		btnSearchProduct.setBounds(356, 34, 97, 25);
		add(btnSearchProduct);
		
		tableSearchProduct = new JTable();
		tableSearchProduct.setBounds(49, 346, 404, -225);
		add(tableSearchProduct);
		
		btnSubmitSearchProduct = new JButton("Submit");
		btnSubmitSearchProduct.setBounds(49, 445, 97, 25);
		add(btnSubmitSearchProduct);
		
		btnCancelSearchProduct = new JButton("Cancel");
		btnCancelSearchProduct.setBounds(227, 445, 97, 25);
		add(btnCancelSearchProduct);
		
		btnDeleteSearchProduct = new JButton("Delete");
		btnDeleteSearchProduct.setBounds(49, 515, 97, 25);
		add(btnDeleteSearchProduct);
		
		
		
	}

	public JButton getBtnDeleteSearchProduct() {
		return btnDeleteSearchProduct;
	}

	public JTextField getTextFieldSearchProduct() {
		return textFieldSearchProduct;
	}

	public JButton getBtnSearchProduct() {
		return btnSearchProduct;
	}

	public JButton getBtnSubmitSearchProduct() {
		return btnSubmitSearchProduct;
	}

	public JButton getBtnCancelSearchProduct() {
		return btnCancelSearchProduct;
	}

	public JTable getTableSearchProduct() {
		return tableSearchProduct;
	}
}
