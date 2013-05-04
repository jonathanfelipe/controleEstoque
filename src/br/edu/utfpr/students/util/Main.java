/**
 * 
 */
package br.edu.utfpr.students.util;

/**
 * @author raphael
 *
 */
public class Main {
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
