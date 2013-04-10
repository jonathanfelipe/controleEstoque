/**
 * 
 */
package br.edu.utfpr.students.control;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.edu.utfpr.students.view.MainWindowPanel;

/**
 * @author raphael
 * 
 */
public class MainControl {

	private JFrame frame;
	private static MainWindowPanel mainWindowView;

	public MainControl() {
		setUpFrame();
		MainControl.mainWindowView = getMainWindowView();
		this.frame.setContentPane(MainControl.mainWindowView);
		new MainWindowPanelController(this);

	}

	public void setUpFrame() {
		this.frame = new JFrame();
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setSize(new Dimension(880, 640));
		this.frame.setVisible(true);
	}

	public void pack() {
		this.frame.pack();
	}

	public void setContentPane(JPanel panel) {
		this.frame.setContentPane(panel);
	}

	public void changeToWindow(String actionCommand) {
		switch (actionCommand) {
		// TODO switch between the jpanels, here we will create the controler
		// and call getSomethingView to set the View to its controller

		}
		pack();
	}

	public static MainWindowPanel getMainWindowView() {
		if (mainWindowView != null) {
			return mainWindowView;
		} else {
			mainWindowView = new MainWindowPanel();
			return mainWindowView;
		}

	}

}
