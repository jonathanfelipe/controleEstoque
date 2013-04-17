package br.edu.utfpr.students.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.utfpr.students.view.MainWindowPanel;

/**
 * 
 * @author Raphael Jardim Lopes <raphaeljlps@gmail.com>
 */
public class MainWindowPanelController implements ActionListener {
	private MainWindowPanel view;
	private MainControl mainControl;

	public MainWindowPanelController(MainControl mainControl) {
		this.mainControl = mainControl;
		setUpView();

	}

	public void setUpView() {
		view = MainControl.getMainWindowView();
		view.getBtnOk().addActionListener(this);
		view.getBtnOk().setActionCommand("Message");// MESSAGE TO BE PASS
													// TROUGHT THE ACTIONEVENT

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// if("Ok".equals(e.getActionCommand())){
		System.out.println(e.getActionCommand());
		// }

	}

}
