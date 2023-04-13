package view;

import Controller.FatController;


public class Principal {

	public static void main(String[] args) {
		
		
		int v;
		do {
			v =(int)((Math.random()*100) +1);
		}while((v>=0) && (v <=10));
		FatController f = new FatController(v);
				
		}


}
