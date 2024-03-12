package TP_2023;

public abstract class Piece {
	private String nom;
	public Piece (String n) {
		this.nom = n;
	}
	public String getn() {
		return nom;
	}
	abstract float fab_time();
	abstract void ajout(Piece p);
}