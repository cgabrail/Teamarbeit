import java.util.Arrays;
import java.util.LinkedList;


public class Zahlen {
	private double summe, min, max;
	private LinkedList<Double> list;
	public Zahlen(double zahl){
				list =new LinkedList<>();
				list.add(zahl);
	}
	public void add(double zahl){
		list.add(zahl);
	}
	
	public double summe(){
		summe=0;
		for(double d : list)
			summe+=d;
		return summe;
	}
	
	public double min(){
		Double l[]=list.toArray(new Double[0]);
		Arrays.sort(l);
		return l[0];
	}
	
	public double max(double zahl){
		Double l[]=list.toArray(new Double[0]);
		Arrays.sort(l);
		return l[l.length-1];		
	}
}
