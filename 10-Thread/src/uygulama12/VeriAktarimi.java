package uygulama12;

import java.io.*;
import java.nio.Buffer;

class VeriYazici extends Thread {
	Integer[] aDizi = { 1, 3, 5, 7 };
	OutputStream o;

	public VeriYazici(OutputStream o) {
		this.o = o;
	}

	@Override
	public void run() {
		super.run();
		try {
			BufferedOutputStream bfo = new BufferedOutputStream(o);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

public class VeriAktarimi {

}
