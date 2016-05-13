package com.demos.cine.model2;

public class CMain {


	public static void main(String args[]) {

		CPanier pa = new CPanier();
		CArticle art1 = new CArticle("12345", "La vie de Coppola", 12.5, 9);
		CArticle art2 = new CArticle("12346", "Le parrain", 8.5);
		pa.ajouter(art1, 3);
		pa.ajouter(art2, 1);
		System.out.println(art2);
		System.out.println(pa);
		System.out.println(pa.getPrixTotalHT());
	}
}