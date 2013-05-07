/**
 * 
 */
package br.edu.utfpr.students.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import br.edu.utfpr.students.model.Address;
import br.edu.utfpr.students.model.Client;
import br.edu.utfpr.students.model.Contact;
import br.edu.utfpr.students.persistence.DAOFactory;
import br.edu.utfpr.students.persistence.interfaces.ClientDAO;
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
		
		MainControl.getRcp().getBtnOk().addActionListener(this);
		MainControl.getRcp().getBtnOk().setActionCommand("createClient");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "cancel":
				mainControl.getMwpc();
				break;
			case "createClient":
				boolean result = registerClient();
				if(result){
					JOptionPane.showMessageDialog(null, "Client registered");
					cleanClientView();
				}else{
					JOptionPane.showMessageDialog(null, "Client couldn't be registered");
				}
				//exibir msg se foi bem sucedida
				break;
				default:
				break;
		}

	}
	
	public void cleanClientView(){
		MainControl.getRcp().getTextFieldBirthdate().setText("");
		MainControl.getRcp().getTextFieldCellPhone().setText("");
		MainControl.getRcp().getTextFieldCity().setText("");
		MainControl.getRcp().getTextFieldContact().setText("");
		MainControl.getRcp().getTextFieldCountry().setText("");
		MainControl.getRcp().getTextFieldDistrict().setText("");
		MainControl.getRcp().getTextFieldEmail().setText("");
		MainControl.getRcp().getTextFieldName().setText("");
		MainControl.getRcp().getTextFieldNumber().setText("");
		MainControl.getRcp().getTextFieldSSN().setText("");
		MainControl.getRcp().getTextFieldState().setText("");
		MainControl.getRcp().getTextFieldStreet().setText("");
		MainControl.getRcp().getTextFieldTelephone().setText("");
		MainControl.getRcp().getTextFieldZipcode().setText("");
		
	}
	
	public boolean registerClient(){
		boolean sucess = true;
		//ALTERAR PARA QUANDO FOR FILTRAR NO MODEL
		Client client = new Client();
		client.setName(MainControl.getRcp().getTextFieldName().getText());
		client.setSsn(MainControl.getRcp().getTextFieldSSN().getText());
		
		Address end = new Address();
		end.setZipCode(MainControl.getRcp().getTextFieldZipcode().getText());
		end.setStreet(MainControl.getRcp().getTextFieldStreet().getText());
		end.setDistrict(MainControl.getRcp().getTextFieldDistrict().getText());
		end.setCity(MainControl.getRcp().getTextFieldCity().getText());
		end.setState(MainControl.getRcp().getTextFieldState().getText());
		end.setCountry(MainControl.getRcp().getTextFieldCountry().getText());
		end.setNumber(Integer.parseInt(MainControl.getRcp().getTextFieldNumber().getText()));
		client.setAddr(end);
		
		Contact contact = new Contact();
		contact.setEmail(MainControl.getRcp().getTextFieldEmail().getText());
		contact.setCellphone(MainControl.getRcp().getTextFieldCellPhone().getText());
		contact.setTelephone(MainControl.getRcp().getTextFieldTelephone().getText());
		client.setCont(contact);
		Date date = null;
		try {
			date  = new SimpleDateFormat("dd/MM/yyyy").parse(MainControl.getRcp().getTextFieldBirthdate().getText());
		} catch (ParseException e) {
			sucess = false;
			e.printStackTrace();
		}
		
		client.setBirthdate(Calendar.getInstance());
		client.getBirthdate().setTime(date);
		
		DAOFactory post = DAOFactory.getDAOFactory(DAOFactory.POSTGRES);
		ClientDAO cdao = post.getClientDAO();
		
		try {
			cdao.insertClient(client);
		} catch (ClassNotFoundException | SQLException e) {
			sucess = false;
			e.printStackTrace();
		}
		return sucess;
		
	}
	

	public RegisterPanel getView() {
		return view;
	}
}
