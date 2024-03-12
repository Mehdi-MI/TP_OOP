package TP_2023;

public class Simple extends Piece {
	private int fab_time;
	public Simple (String n, int t) {
		super(n);
		fab_time = t;
	}
	public float fab_time () {
		return this.fab_time;
	}
	void ajout(Piece p) {
		System.out.println("les pieces simple ne sont pas composes.");
	}
}