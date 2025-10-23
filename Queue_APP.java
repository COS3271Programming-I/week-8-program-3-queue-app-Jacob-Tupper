package queue_app;

import java.util.LinkedList;
import java.util.Queue;
import java.io.PrintStream;

public class Queue_APP {
	public static void main(String[] args) {
		PrintStream so = System.out;
		Queue<String> line = new LinkedList<>(), line2 = new LinkedList<>();
		
		char let = 'A';
		int time = 0, rn;
		String person = "" + let + let + let;
		line.add(person);
		line2.add(person);
		
		while (time < 40) {
			rn = (int)(Math.random()*11);
			if ((rn == 1) || (rn == 2)) {line.poll();}
			if ((rn == 3) || (rn == 4)) {line2.poll();}
			if ((rn == 5) || (rn == 6) || (rn == 7)) {let++; person = "" + let + let + let; line.add(person);}
			if ((rn == 8) || (rn == 9) || (rn == 10)) {let++; person = "" + let + let + let; line2.add(person);}
			
			so.println("Time: " + time + " : " + line + " : " + line2);
			time ++;
		}
	}
}
