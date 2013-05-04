/**
 * 
 */
package br.edu.utfpr.students.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.edu.utfpr.students.view.RegisterPanel;

/**
 * @author raphael
 * 
 */
public class RegisterPanelController implements ActionListener {
	private RegisterPanel view;
	/**
	 * @return the view
	 */

	MainControl mainControl;

	public RegisterPanelController(MainControl mainControl) {
		this.mainControl = mainControl;
		setUpView();
	}

	private void setUpView() {
		view = MainControl.getRp();
		mainControl.setContentPane(view);
		view.getTabbedPane().addTab("Register Product", MainControl.getRpp());
		view.getTabbedPane().addTab("Register Client", MainControl.getRcp());
		view.getTabbedPane().addTab("Register Supplier", MainControl.getRsp());

		MainControl.getRcp().getBtnClientCancel().addActionListener(this);
		MainControl.getRcp().getBtnClientCancel().setActionCommand("cancel");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "cancel":
			mainControl.getMwpc();
			break;
		}

	}

	public RegisterPanel getView() {
		return view;
	}
}
