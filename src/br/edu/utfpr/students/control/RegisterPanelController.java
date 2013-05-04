/**
 * 
 */
package br.edu.utfpr.students.control;

import br.edu.utfpr.students.view.RegisterPanel;

/**
 * @author raphael
 *
 */
public class RegisterPanelController {
	private RegisterPanel view;
	MainControl mainControl;

	
	public RegisterPanelController(MainControl mainControl){
		this.mainControl= mainControl;
		setUpView();
	}


	private void setUpView() {
		view = MainControl.getRp();
		view.getTabbedPane().addTab("Register Product", MainControl.getRpp());
		view.getTabbedPane().addTab("Register Client", MainControl.getRcp());
		view.getTabbedPane().addTab("Register Supplier", MainControl.getRsp());
	}
}
