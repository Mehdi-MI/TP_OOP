package TP_2023;

public class Test {

	public static void main(String[] args) {
		Piece ps1 = new Simple("Piece Simple 1", 2);
		Piece ps2 = new Simple("Piece Simple 2", 3);
		Piece pc1 = new Complexe("Piece Complexe 1", 3);
		pc1.ajout(ps1);
		pc1.ajout(ps2);
		Piece pc2 = new Complexe("Piece Complexe 2", 5);
		pc2.ajout(ps1);
		pc2.ajout(pc1);
		Piece pc3 = new Complexe("Piece Complexe 3", 7);
		pc3.ajout(pc1);
		pc3.ajout(pc2);
		System.out.printf("Temps de fabrication de %s est: %s\n", ps1.getn(), ps1.fab_time());
		System.out.printf("Temps de fabrication de %s est: %s\n", ps2.getn(), ps2.fab_time());
		System.out.printf("Temps de fabrication de %s est: %s\n", pc1.getn(), pc1.fab_time());
		System.out.printf("Temps de fabrication de %s est: %s\n", pc2.getn(), pc2.fab_time());
		System.out.printf("Temps de fabrication de %s est: %s  ", pc3.getn(), pc3.fab_time());
	}

}