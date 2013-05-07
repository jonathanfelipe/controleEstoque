package br.edu.utfpr.students.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class BuyPane extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 790;
	private static final int HEIGHT = 620;
	private JTextField textFieldInsertBuy;
	private JTable tableBuy;
	private JButton btnConfirmBuySupplier;
	private JButton btnProceedBuy;
	private JButton btnCancelBuy;
	private JLabel lblInsertProduct;
	private JTextField textField;
	private JButton btnConfirmBuyProduct;

	/**
	 * Create the panel.
	 */
	public BuyPane() {
		
		setSize(WIDTH, HEIGHT);
		setLayout(null);
		
		JLabel lblChoseProduct = new JLabel("Insert Supplier");
		lblChoseProduct.setBounds(27, 38, 88, 16);
		add(lblChoseProduct);
		
		textFieldInsertBuy = new JTextField();
		textFieldInsertBuy.setBounds(141, 35, 146, 22);
		add(textFieldInsertBuy);
		textFieldInsertBuy.setColumns(10);
		
		btnConfirmBuySupplier = new JButton("Confirm");
		btnConfirmBuySupplier.setBounds(329, 34, 97, 25);
		add(btnConfirmBuySupplier);
		
		tableBuy = new JTable();
		tableBuy.setBounds(27, 386, 399, -209);
		add(tableBuy);
		
		btnProceedBuy = new JButton("Proceed");
		btnProceedBuy.setBounds(27, 421, 125, 25);
		add(btnProceedBuy);
		
		btnCancelBuy = new JButton("Cancel");
		btnCancelBuy.setBounds(301, 421, 125, 25);
		add(btnCancelBuy);
		
		lblInsertProduct = new JLabel("Insert Product");
		lblInsertProduct.setBounds(27, 107, 88, 16);
		add(lblInsertProduct);
		
		textField = new JTextField();
		textField.setBounds(141, 104, 146, 22);
		add(textField);
		textField.setColumns(10);
		
		btnConfirmBuyProduct = new JButton("Confirm");
		btnConfirmBuyProduct.setBounds(329, 103, 97, 25);
		add(btnConfirmBuyProduct);

	}

	public JTextField getTextFieldInsertBuy() {
		return textFieldInsertBuy;
	}

	public JTable getTableBuy() {
		return tableBuy;
	}

	public JButton getBtnConfirmBuy() {
		return btnConfirmBuySupplier;
	}

	public JButton getBtnProceedBuy() {
		return btnProceedBuy;
	}

	public JButton getBtnCancelBuy() {
		return btnCancelBuy;
	}
}
