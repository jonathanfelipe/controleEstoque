package br.edu.utfpr.students.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class SellPane extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 790;
	private static final int HEIGHT = 620;
	private JTextField textField;
	private JTable tableSell;
	private JButton btnConfirmSellProduct;
	private JButton btnProceedSell;
	private JButton btnCancelSell;
	
	/**
	 * Create the panel.
	 */
	public SellPane() {
		
		setSize(WIDTH, HEIGHT);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Insert Product");
		lblNewLabel.setBounds(34, 35, 90, 16);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(146, 32, 116, 22);
		add(textField);
		textField.setColumns(10);
		
		btnConfirmSellProduct = new JButton("Confirm");
		btnConfirmSellProduct.setBounds(300, 31, 97, 25);
		add(btnConfirmSellProduct);
		
		tableSell = new JTable();
		tableSell.setBounds(34, 311, 363, -203);
		add(tableSell);
		
		btnProceedSell = new JButton("Proceed");
		btnProceedSell.setBounds(27, 384, 123, 25);
		add(btnProceedSell);
		
		btnCancelSell = new JButton("Cancel");
		btnCancelSell.setBounds(281, 384, 116, 25);
		add(btnCancelSell);

	}

	public JTextField getTextField() {
		return textField;
	}

	public JTable getTableSell() {
		return tableSell;
	}

	public JButton getBtnConfirmSellProduct() {
		return btnConfirmSellProduct;
	}

	public JButton getBtnProceedSell() {
		return btnProceedSell;
	}

	public JButton getBtnCancelSell() {
		return btnCancelSell;
	}

}
