package br.edu.utfpr.students.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegisterProductPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5513476060708592397L;

	private static final int WIDTH = 790;
	private static final int HEIGHT = 620;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public RegisterProductPanel() {
		setSize(WIDTH, HEIGHT);
		setLayout(null);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(159, 184, 40, 16);
		add(lblName);

		textField = new JTextField();
		textField.setBounds(214, 178, 152, 28);
		add(textField);
		textField.setColumns(10);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(214, 550, 75, 29);
		add(btnCancel);

		JButton btnOk = new JButton("OK");
		btnOk.setBounds(370, 550, 75, 29);
		add(btnOk);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(214, 228, 152, 37);
		add(textArea);

		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(113, 242, 86, 16);
		add(lblDescription);

	}
}
