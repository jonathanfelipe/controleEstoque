package br.edu.utfpr.students.view;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class RegisterPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 800;
	private static final int HEIGHT = 640;
	// isto e temporario, mover para o MainControl
	private RegisterClientPanel rcp;
	private RegisterProductPanel rpp;
	private RegisterSupplierPanel rsp;

	public RegisterPanel() {
		setSize(WIDTH, HEIGHT);
		setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.TOP);
		tabbedPane.setBounds(0, 0, 800, 634);
		add(tabbedPane);
		rcp = new RegisterClientPanel();
		rpp = new RegisterProductPanel();
		rsp = new RegisterSupplierPanel();
		tabbedPane.addTab("Register Client", rcp);
		tabbedPane.addTab("Register Product", rpp);
		tabbedPane.addTab("Register Supplier", rsp);

	}

}
