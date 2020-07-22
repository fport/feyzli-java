package app7Queue;

import java.util.PriorityQueue;
import java.util.Queue;

// PriorityQueue (öncelikli kuyruk)
//alfabetik olarak ve sayilarýn en kucugu baslayarak islem olur.
// mesela silmede 

public class Islem2 {

	public static void main(String[] args) {
		
		Queue<String> q1 = new PriorityQueue<String>();
		q1.offer("a");
		q1.offer("b");
		q1.offer("c");
		q1.offer("d");
		
		for(int i=0; i<4 ; i++) {
			System.out.println("Veri siliniyor : "+q1.poll());
		}
		
		System.out.println("-------------------");
		Queue<Integer> q2 = new PriorityQueue<>();
	
		q2.offer(44);
		q2.offer(78);
		q2.offer(61);
		q2.offer(16);
		for(int i=0; i<4 ; i++) {
			System.out.println("Veri siliniyor : "+q2.poll());
		}
		//Queue<Integer> q3 = new PriorityQueue<>();
		PriorityQueue<Integer> q3 = new PriorityQueue<Integer>();
		q3.offer(6);
		q3.offer(3);
		q3.offer(4);
		q3.offer(2);
		System.out.println("-------------------");
		System.out.println("8 sayisini q3 içinde depolandý mý ?"+ q3.contains(8));
		System.out.println("8 sayisini q3 içinde depolandý mý ?"+ q3.contains(3));
		
		
	}
}
