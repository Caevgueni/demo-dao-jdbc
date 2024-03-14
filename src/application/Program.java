package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		//Department obj = new Department(1, "Books");
         
		SellerDao sellerDao = DaoFactory.createSellerDao(); // desta forma o meu programa nao conhece a implementacao,
															// ele so conhece a interface
		// é uma forma de fazer a ingecao de dependencia sem explicitar a implementacao
		//System.out.println(obj);
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

	}

}
