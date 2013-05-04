/**
 * 
 */
package br.edu.utfpr.students.control;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.edu.utfpr.students.view.MainWindowPanel;
import br.edu.utfpr.students.view.RegisterClientPanel;
import br.edu.utfpr.students.view.RegisterPanel;
import br.edu.utfpr.students.view.RegisterProductPanel;
import br.edu.utfpr.students.view.RegisterSupplierPanel;

/**
 * @author raphael
 * 
 */
public class MainControl {

	private JFrame frame;
	private static MainWindowPanel mainWindowView;
	private static RegisterClientPanel rcp;
	private static RegisterPanel rp;
	private static RegisterProductPanel rpp;
	private static RegisterSupplierPanel rsp;
	
	private RegisterPanelController rpc;

	

	public MainControl() {
		setUpFrame();
		MainControl.mainWindowView = getMainWindowView();
		frame.setContentPane(MainControl.mainWindowView);
		new MainWindowPanelController(this);

	}

	public void setUpFrame() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(880, 640));
		frame.setVisible(true);
	}

	public void pack() {
		frame.pack();
	}
	public void setContentPane(JPanel panel) {
		frame.setContentPane(panel);
	}


	public void changeToWindow(String actionCommand) {
		switch (actionCommand) {
			case "cadastrar":
				getRpc();
				break;
				

		}
		pack();
	}

	public static MainWindowPanel getMainWindowView() {
		if(mainWindowView == null){
			mainWindowView = new MainWindowPanel();
		}
		return mainWindowView;
	}
	

	/**
	 * @return the rcp
	 */
	public static RegisterClientPanel getRcp() {
		if (rcp == null){
			rcp = new RegisterClientPanel();
		}
		return rcp;
	}

	/**
	 * @return the rp
	 */
	public static RegisterPanel getRp() {
		if(rp == null){
			rp = new RegisterPanel();
		}
		return rp;
	}

	/**
	 * @return the rpp
	 */
	public static RegisterProductPanel getRpp() {
		if(rpp == null){
			rpp = new RegisterProductPanel();
		}
		return rpp;
	}

	/**
	 * @return the rsp
	 */
	public static RegisterSupplierPanel getRsp() {
		if(rsp == null){
			rsp = new RegisterSupplierPanel();
		}
			
		return rsp;
	}


	/**
	 * @param mainControl 
	 * @return the rpc
	 */
	public RegisterPanelController getRpc() {
		if(rpc == null){
			rpc = new RegisterPanelController(this);
		}
		return rpc;
	}

}
