package br.edu.utfpr.students.view;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainWindowPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 880;
	private static final int HEIGHT = 640;
	private JButton btnOk;

	public JButton getBtnOk() {
		return btnOk;
	}

	public void setBtnOk(JButton btnOk) {
		this.btnOk = btnOk;
	}

	/**
	 * Create the panel.
	 */
	public MainWindowPanel() {
		setSize(WIDTH, HEIGHT);
		setLayout(null);
		btnOk = new JButton("Ok");
		btnOk.setBounds(402, 5, 75, 29);
		add(btnOk);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(360, 329, 117, 29);
		add(btnConfirm);
	}

}
