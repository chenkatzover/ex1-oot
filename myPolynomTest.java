package myMath;
import java.util.LinkedList;

public class myPolynomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Polynom poly=new Polynom ("4x^2+5x^3");
		//System.out.println(poly.root(-2, 2, 0.0000001));
		//System.out.println(poly.area(0, 1, 0.0000001));
		Polynom poly2=new Polynom ("3+4x^3");
		System.out.println(poly2.root(-1, 1, 0.0000001));

		
		
		
		Polynom poly=new Polynom ("0");
		//Polynom_able p1=p.derivative();
		//System.out.println(p.f(2));
		Polynom_able p1= new Polynom ("-2x");
		poly.multiply(p1);
		//Monom m1=new Monom ("2x");
		//p.substract(p1);
		System.out.println(poly.toString());
		

	}

}
