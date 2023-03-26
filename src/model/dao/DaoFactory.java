package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createdSellerDao() {
		return new SellerDaoJDBC(DB.getConnetion());
	}
	
	public static DepartmentDao createdDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnetion());
	}

}
