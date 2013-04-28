package br.edu.utfpr.students.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MainWindowPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 880;
	private static final int HEIGHT = 640;

	// botoes
	private JButton btnCadastrar;
	private JButton btnAlterar;
	private JButton btnExcluir;
	private JButton btnVender;
	private JButton btnComprar;

	/**
	 * Create the panel.
	 */
	public MainWindowPanel() {
		setSize(WIDTH, HEIGHT);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		btnCadastrar = new JButton("Cadastrar");
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCadastrar.insets = new Insets(0, 0, 5, 0);
		gbc_btnCadastrar.gridx = 1;
		gbc_btnCadastrar.gridy = 3;
		add(btnCadastrar, gbc_btnCadastrar);

		btnAlterar = new JButton("Alterar");
		GridBagConstraints gbc_btnAlterar = new GridBagConstraints();
		gbc_btnAlterar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAlterar.insets = new Insets(0, 0, 5, 0);
		gbc_btnAlterar.gridx = 1;
		gbc_btnAlterar.gridy = 6;
		add(btnAlterar, gbc_btnAlterar);

		btnExcluir = new JButton("Excluir");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnExcluir.insets = new Insets(0, 0, 5, 0);
		gbc_btnExcluir.gridx = 1;
		gbc_btnExcluir.gridy = 9;
		add(btnExcluir, gbc_btnExcluir);

		btnVender = new JButton("Vender");
		GridBagConstraints gbc_btnVender = new GridBagConstraints();
		gbc_btnVender.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVender.insets = new Insets(0, 0, 5, 0);
		gbc_btnVender.gridx = 1;
		gbc_btnVender.gridy = 12;
		add(btnVender, gbc_btnVender);

		btnComprar = new JButton("Comprar");
		GridBagConstraints gbc_btnComprar = new GridBagConstraints();
		gbc_btnComprar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnComprar.gridx = 1;
		gbc_btnComprar.gridy = 15;
		add(btnComprar, gbc_btnComprar);
	}

	/**
	 * @return the btnCadastrar
	 */
	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	/**
	 * @return the btnAlterar
	 */
	public JButton getBtnAlterar() {
		return btnAlterar;
	}

	/**
	 * @return the btnExcluir
	 */
	public JButton getBtnExcluir() {
		return btnExcluir;
	}

	/**
	 * @return the btnVender
	 */
	public JButton getBtnVender() {
		return btnVender;
	}

	/**
	 * @return the btnComprar
	 */
	public JButton getBtnComprar() {
		return btnComprar;
	}
}
