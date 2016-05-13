package com.demos.cine.model2;

import java.util.ArrayList;

public class CPanier {
	private ArrayList<CLignePanier> contenu = new ArrayList<>();

	public void ajouter(CArticle a,int qte){
		CLignePanier lp = new CLignePanier(a,qte);
		contenu.add(lp);
	}
	
	public String toString(){
		String description="";
		for(CLignePanier lp:contenu){
			description+=
	lp.getArt().getReference() +" "+lp.getQte()+"\n";		
		}
		return description;
	}
	
	public double getPrixTotalHT(){
		double prix=0;
		for(CLignePanier lp:contenu){
			prix+=lp.getArt().getPrixHT()*lp.getQte();
		}
		return prix;
	}
}