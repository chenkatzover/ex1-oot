package myMath;
import java.util.LinkedList;

public class myMonomTest {
	public static void main(String[] args) {
		Monom m = new Monom ("x^2");
		System.out.println("1 "+m.toString());
		Monom m2 = new Monom ("-5x^3");
		
		m.add(m2);
		System.out.println("2 "+m.toString());
		
		Monom m3 = new Monom ("-2x^2");
		//System.out.println(m3.toString());
		m.multipy(m3);
		System.out.println("3 "+m.toString());
		
		LinkedList <Monom> l= new LinkedList <Monom> ();
		Monom s= new Monom ("2x^6");
		Monom s2= new Monom ("2x^5");
		l.add(s); l.add(s2);
		System.out.println(l.getFirst());
		Monom t= l.getFirst();
		System.out.println(t);
		


		
		
		
	}
}
