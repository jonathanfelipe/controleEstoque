/**
 * 
 */
package br.edu.utfpr.students.persistence;

/**
 * @author raphael
 * 
 */
public class TestBD {

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
}
