package TP_2023;

public class Complexe extends Piece{
  
  Piece tab[] = new Piece[10];
  private int tmp_assemblage;
  int cpt = 0;
  
  public Complexe (String n,int t) {
    super(n);
    this.tmp_assemblage = t;
  }
  public void ajout (Piece p) {
	  tab[cpt] = p;
	  cpt++;
  }
  public float fab_time () {
	float total = 0;
    for(int i = 0; i < cpt; i++) {
      total += tab[i].fab_time();
    }
    return total+tmp_assemblage;
  }
}