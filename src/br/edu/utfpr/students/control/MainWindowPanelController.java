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
	MainControl mainControl;

	// alterar se n for necessario

	public MainWindowPanelController(MainControl mainControl) {
		this.mainControl = mainControl;
		setUpView();

	}

	public void setUpView() {
		view = MainControl.getMainWindowView();
		mainControl.setContentPane(view);
		view.getBtnCadastrar().addActionListener(this);
		view.getBtnCadastrar().setActionCommand("cadastrar");
		view.getBtnAlterar().addActionListener(this);
		view.getBtnAlterar().setActionCommand("alterar");
		view.getBtnExcluir().addActionListener(this);
		view.getBtnExcluir().setActionCommand("excluir");
		view.getBtnVender().addActionListener(this);
		view.getBtnVender().setActionCommand("vender");
		view.getBtnComprar().addActionListener(this);
		view.getBtnComprar().setActionCommand("comprar");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		mainControl.changeToWindow(e.getActionCommand());
		// exemplo
		// if("Ok".equals(e.getActionCommand())){
		// System.out.println(e.getActionCommand());
		// }
		/*
		 * switch (e.getActionCommand()) { case "cadastrar":
		 * 
		 * 
		 * // TODO chamar metodo que lida com cadastro break; case "alterar":
		 * System.out.println("ALTERAREMOS"); // excluir da versao final //
		 * (somente para debug) // TODO chamar metodo que lida com o alterar
		 * (view com as opcoes de // alteracao) break; case "excluir":
		 * System.out.println("EXCLUIREMOS"); // excluir da versao final //
		 * (somente para debug) // TODO chamar metodo que lida com excluir
		 * break; case "vender": System.out.println("VENDEREMOS"); // excluir da
		 * versao final // (somente para debug) // TODO chamar metodo que lida
		 * com venda (view/controller) break; case "comprar":
		 * System.out.println("COMPRAREMOS"); // excluir da versao final //
		 * (somente para debug) // TODO chamar metodo que lida com compra
		 * (view/controller) pela // classe maincontrol }
		 */
	}

	/**
	 * @return the view
	 */
	public MainWindowPanel getView() {
		return view;
	}

}
