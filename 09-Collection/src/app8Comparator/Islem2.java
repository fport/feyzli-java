package app8Comparator;

import java.util.PriorityQueue;

class NesneSirala implements Comparable<NesneSirala>{
	private String isim;
	private int siraNo;
	public NesneSirala(String isim, int siraNo) {
		this.isim = isim;
		this.siraNo = siraNo;
	}
	@Override
	public int compareTo(NesneSirala o) {
		if(this.siraNo < o.siraNo) {
			return -2;
		}
		else if(this.siraNo > o.siraNo) {
			return 2;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "NesneSirala [isim=" + isim + ", siraNo=" + siraNo + "]";
	}
	
}

public class Islem2 {

	public static void main(String[] args) {
	
		PriorityQueue<NesneSirala> q1 = new PriorityQueue<NesneSirala>();
		q1.offer(new NesneSirala("Zafer", 1));
		q1.offer(new NesneSirala("Miray", 4));
		q1.offer(new NesneSirala("Gül", 2));
		q1.offer(new NesneSirala("Ahmet", 3));
		
		for(int i=0; i<4 ;i++) {
			System.out.println("Veri siliniyor"+q1.poll());
		}
		
	}
}
