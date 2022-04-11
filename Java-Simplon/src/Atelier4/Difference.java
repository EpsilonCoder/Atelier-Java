package Atelier4;

public class Difference {
	
	private int a;
	private int b;
	
	public Difference(int a,int b) {
		this.a=a;
		this.b=b;	
	}
	
	public int Diff() {
		int d;
		d=a-b;	
		System.out.println("La differences entre a et b est egal a => " +d);
		return d;		
	}

}
