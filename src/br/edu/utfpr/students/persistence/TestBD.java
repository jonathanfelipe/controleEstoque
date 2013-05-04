/**
 * 
 */
/*package br.edu.utfpr.students.persistence;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


import br.edu.utfpr.students.model.Address;
import br.edu.utfpr.students.model.Client;
import br.edu.utfpr.students.model.Contact;
import br.edu.utfpr.students.model.Product;
import br.edu.utfpr.students.model.Sell;
import br.edu.utfpr.students.persistence.interfaces.ClientDAO;
import br.edu.utfpr.students.persistence.interfaces.ProductDAO;
import br.edu.utfpr.students.persistence.interfaces.SellDAO;

/**
 * @author raphael
 * 
 */
//public class TestBD {
	/*
	public static void main(String args[]){
		DAOFactory post = DAOFactory.getDAOFactory(DAOFactory.POSTGRES);
		ProductDAO pdao = post.getProductDAO(); 
		SellDAO sdao = post.getSellDAO();
		Product prod = new Product();
		Sell sell = new Sell();
		Product sub = new Product();
		ClientDAO cdao = post.getClientDAO();
		Client client = new Client();
	
		client.setAddr(new Address("1382388","k1s23treet","maria","london","longon","england",566));
		client.setCont(new Contact("52344","439944","raphaeljh@am.com"));
		client.setName("Rd132d3");
		client.setSsn("19233a4599");
		String datad = "21/11/1989";
		Date date = null;
		try {
			date  = new SimpleDateFormat("dd/MM/yyyy").parse(datad);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		client.setBirthdate(Calendar.getInstance());
		client.getBirthdate().setTime(date);
		try {
			client.setClient_id(cdao.insertClient(client));
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		sub.setName("S2dp33211");
		sub.setDescription("s69a332dddsue");
		sub.setQuantity(50);
		sub.setNeedSubcomponents(false);
		sub.setCost(5.6);
		sub.setPrice(10);
		
		try {
			sub.setProduct_id(pdao.insertProduct(sub));
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		//inserir primeiro os subcomponents
		
		
		prod.setCost(200);
		prod.setName("s8312d999");
		prod.setDescription("f39dd9");
		
		prod.setNeedSubcomponents(true);
		prod.addSubcomponent(sub);
		prod.setQuantity(200);
		prod.setPrice(500);
		try {
			prod.setProduct_id(pdao.insertProduct(prod));
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//selecionar produto entao remover
		prod.setQuantity(50);
		sub.setQuantity(10);
		System.out.println(prod.getQuantity());
		sell.setClient_id(client.getClient_id());
		sell.setDate(Calendar.getInstance());
		datad = "28/04/2013";
		try {
			date  = new SimpleDateFormat("dd/MM/yyyy").parse(datad);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sell.getDate().setTime(date);
		sell.addProductToList(prod);
		sell.addProductToList(prod.getSubcomponents());
		sell.setTotal(prod.getPrice()*prod.getQuantity());
		sell.setTotalCost(prod.getCost()*prod.getQuantity());
		sell.setTotalEarn(sell.getTotal()-sell.getTotalCost());		
		try {
			sdao.insertSell(sell);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

	/*
	 * public static void main(String args[]){ DAOFactory post =
	 * DAOFactory.getDAOFactory(DAOFactory.POSTGRES); SupplierDAO sup =
	 * post.getSupplierDAO(); ProductDAO prod = post.getProductDAO();
	 * 
	 * Product p = new Product(); p.setCost(3.0); p.setName("cafe2352");
	 * p.setDescription("the best coffee in the world"); p.setPrice(8.0);
	 * p.setNeedSubcomponents(true); int idp=0; Product ps = new Product();
	 * ps.setProduct_id(1); p.addSubcomponent(ps); p.addQuantity(22); try { idp
	 * = prod.insertProduct(p); } catch (ClassNotFoundException | SQLException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * try { sup.insertRelationSupplierProduct(2, idp); } catch
	 * (ClassNotFoundException | SQLException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } }
	 * 
	 * 
	 * /* public static void main(String args[]){ DAOFactory postgres =
	 * DAOFactory.getDAOFactory(DAOFactory.POSTGRES); ClientDAO cdao =
	 * postgres.getClientDAO(); Address a = new Address(); Contact c = new
	 * Contact(); a.setCity("Hometown"); a.setCountry("Br");
	 * a.setDistrict("zip"); a.setState("Geo"); a.setStreet(" aaa  aaa");
	 * a.setZipCode("83331111"); a.setNumber(123); c.setCellphone("99388");
	 * c.setEmail("aa@aa.com"); c.setTelephone("233222"); Client cl = new
	 * Client(); cl.setName("Raphael"); cl.setAddr(a); cl.setCont(c);
	 * 
	 * Date date = null; try { date = new
	 * SimpleDateFormat("dd/MM/yyyy").parse("21/11/1989");
	 * cl.setBirthdate(Calendar.getInstance()); cl.getBirthdate().setTime(date);
	 * 
	 * } catch (ParseException e1) { // TODO Auto-generated catch block
	 * e1.printStackTrace(); }
	 * 
	 * int id = 0; try { id = cdao.insertClient(cl); } catch
	 * (ClassNotFoundException | SQLException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } System.out.println(id); }
	 * 
	 * 
	 * /**
	 * 
	 * @param args
	 */
	/*
	 * public static void main(String args[]){ DAOFactory postDaoFactory =
	 * DAOFactory.getDAOFactory(DAOFactory.POSTGRES); ContactDAO conDao =
	 * postDaoFactory.getContactDAO(); Contact con = new Contact();
	 * con.setCellphone("9999999"); con.setEmail("raphael@gmail.com");
	 * con.setTelephone("98993222");
	 * 
	 * int id = 0; try { id = conDao.insertContact(con); } catch
	 * (ClassNotFoundException | SQLException e) {
	 * System.out.println("Deu merda"); e.printStackTrace(); }
	 * 
	 * System.out.println(id); }
	 */

	/*
	 * public static void main(String[] args) { //EXEMPLO DE MANIPULACAO DO
	 * BANCO DAOFactory postDaoFactory =
	 * DAOFactory.getDAOFactory(DAOFactory.POSTGRES); AddressDAO addDao =
	 * postDaoFactory.getAddressDAO(); Address address = new Address();
	 * address.setCity("Porto Velho"); address.setCountry("Brasil");
	 * address.setState("Rondonia");
	 * address.setStreet("Victor Ferreira Manahiba");
	 * address.setDistrict("Agenor de Carvalho"); address.setNumber(12345);
	 * address.setZipCode("99883772"); int newAddrID = 0; try { newAddrID =
	 * addDao.insertAddress(address); } catch (ClassNotFoundException |
	 * SQLException e) { System.out.println("Shit sometimes happens");
	 * e.printStackTrace(); return; } System.out.println(newAddrID);
	 * 
	 * }
	 */
//}
