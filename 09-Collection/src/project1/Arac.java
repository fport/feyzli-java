package project1;

public class Arac implements Comparable<Arac>{

	public String surucuAdi;
	public String aracTuru;
	public int geciUstunlugu;
	
	public Arac(String surucuAdi, String aracTuru) {
		this.surucuAdi = surucuAdi;
		this.aracTuru = aracTuru;
			if(aracTuru.equals("Kargo")) {
				this.geciUstunlugu=1;
			}
			else if(aracTuru.equals("Polis")) {
				this.geciUstunlugu =2;
			}
			else if(aracTuru.equals("Itfaiye")) {
				this.geciUstunlugu =3;
			}
			else if(aracTuru.equals("Ambulans")) {
				this.geciUstunlugu =4;
			}
			else {
				this.geciUstunlugu=0;
			}
	}

	@Override
	public int compareTo(Arac o) {
		
		if(this.geciUstunlugu < o.geciUstunlugu) {
			return 2;
		}
		else if(this.geciUstunlugu > o.geciUstunlugu) {
			return -2;
		}
		else return 0;
	}

	@Override
	public String toString() {
		return "Arac [surucuAdi = " + surucuAdi +
				", \n aracTuru = " + aracTuru +
				", \n geciUstunlugu = " + geciUstunlugu + "]";
	}


}
