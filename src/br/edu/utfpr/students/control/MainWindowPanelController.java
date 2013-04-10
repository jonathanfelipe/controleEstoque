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

	public MainWindowPanelController(MainControl mainControl) {
		setUpView();
	}

	public void setUpView() {
		view = MainControl.getMainWindowView();
		view.getBtnOk().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// if("Ok".equals(e.getActionCommand())){
		System.out.println(e.getActionCommand());
		// }

	}

}
