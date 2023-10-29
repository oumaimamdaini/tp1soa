package service;

import java.util.ArrayList;
import java.util.List;

public class BanqueService {
	
	public double conversion(double montant) {
		return montant*3.36; 
	}
 	public Compte getCompte(int code) {
		return new Compte(code,1245.2,12) ;
 		
 	}
 	public List<Compte> getComptes(){
 		ArrayList<Compte> comptes= new ArrayList<Compte>();
 		Compte c1 = new Compte(1,1258.5,8);
 		Compte c2 = new Compte(2,1258.5,4);
		return comptes ;
 		
 	}
 
	
	
	public static void main(String[] args) {
		BanqueService b=new BanqueService();
		double montant=23.5;
		System.out.println(b.conversion(montant));
		
	}

	

}
