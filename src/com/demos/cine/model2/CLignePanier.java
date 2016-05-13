package com.demos.cine.model2;

public class CLignePanier {
	private CArticle art;
	private int qte;
	public CLignePanier(CArticle art, int qte) {
		super();
		this.art = art;
		this.qte = qte;
	}
	public CArticle getArt() {
		return art;
	}
	public int getQte() {
		return qte;
	}
	
	
}