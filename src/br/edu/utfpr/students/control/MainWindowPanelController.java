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
	// alterar se n for necessario
	@SuppressWarnings("unused")
	private MainControl mainControl;

	public MainWindowPanelController(MainControl mainControl) {
		this.mainControl = mainControl;
		setUpView();

	}

	public void setUpView() {
		view = MainControl.getMainWindowView();
		// modelo view.getBtnOk().addActionListener(this);
		// view.getBtnOk().setActionCommand("Message");// MESSAGE TO BE PASS
		// TROUGHT THE ACTIONEVENT
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
		// exemplo
		// if("Ok".equals(e.getActionCommand())){
		// System.out.println(e.getActionCommand());
		// }

		switch (e.getActionCommand()) {
		case "cadastrar":
			System.out.println("CADASTRAREMOS"); // excluir da versao final
													// (somente para debug)
			// TODO chamar metodo que lida com cadastro
			break;
		case "alterar":
			System.out.println("ALTERAREMOS"); // excluir da versao final
												// (somente para debug)
			// TODO chamar metodo que lida com o alterar (view com as opcoes de
			// alteracao)
			break;
		case "excluir":
			System.out.println("EXCLUIREMOS"); // excluir da versao final
												// (somente para debug)
			// TODO chamar metodo que lida com excluir
			break;
		case "vender":
			System.out.println("VENDEREMOS"); // excluir da versao final
												// (somente para debug)
			// TODO chamar metodo que lida com venda (view/controller)
			break;
		case "comprar":
			System.out.println("COMPRAREMOS"); // excluir da versao final
												// (somente para debug)
			// TODO chamar metodo que lida com compra (view/controller) pela
			// classe maincontrol
		}

	}

}
