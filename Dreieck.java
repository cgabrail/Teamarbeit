//import java.lang.Math.PI;
public class Dreieck {
	private int a;
	private int b;
	private int c;
	private int h;
	private int Ad;
	private int Ak;
	private int Ar;
	private int d;
	private int r;
	private double f;
	
	public int Dreieck(){
		this.a= 50;
		this.b= 50;
		this.c= 50;
		this.f=Math.sqrt(3);	
		this.h= (int) ((this.a/2)*f);
		this.Ad= ((this.c)*(this.h))/2;
		
		return this.Ad;
	}
	public int Rechteck(){
		this.a= 50;
		this.b= 50;
		this.Ar = (int) a*b;
		return this.Ar;
		
	}
	public int Kreis(){
		this.d=60;
		this.r=d/2;
		this.Ak= (int) Math.PI*(this.r)^2;
		return this.Ak;
	}	
	
	public int getAd() {
		return Ad;
	}
	public void setAd(int ad) {
		Ad = ad;
	}
	public int getAk() {
		return Ak;
	}
	public void setAk(int ak) {
		Ak = ak;
	}
	public int getAr() {
		return Ar;
	}
	public void setAr(int ar) {
		Ar = ar;
	}
	
	public static void main(String[]args){
	System.out.println(getAr() );
	System.out.println(getAd());
	System.out.println(getAk());
	}
}
