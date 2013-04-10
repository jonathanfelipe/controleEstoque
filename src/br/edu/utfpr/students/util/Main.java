/**
 * 
 */
package br.edu.utfpr.students.util;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import br.edu.utfpr.students.control.MainControl;

/**
 * @author raphael
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		new MainControl();

	}

}
