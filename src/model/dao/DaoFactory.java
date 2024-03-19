package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	public static SellerDaoJDBC createSellerDao() {
		//return new SellerDaoJDBC();
		return new SellerDaoJDBC(DB.getConnection());
		

		
	}

	 public static DepartmentDaoJDBC createDepartmentDao() {
	 
	 return new DepartmentDaoJDBC(DB.getConnection());
	 
	 }
}
