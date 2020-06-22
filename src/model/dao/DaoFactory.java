package model.dao;

public class DaoFactory {

	
	public static SellerDao creatSellerDao() {
		return new SellerDaoJdbc();
	}
}
