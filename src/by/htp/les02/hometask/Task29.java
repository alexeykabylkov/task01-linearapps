package by.htp.les02.hometask;



/*29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.  */

public class Task29 {

	public static void main(String[] args) {
		
		double a = 5;
		double b = 6;
		double c = 7;
		
		double c1;
		double c2;
		double c3;
		
		double sumc;
		
		
		c1 = (b*b + c*c - a*a) / (2*b*c);
		c2 = (b*b + a*a - c*c) / (2*b*a);
		
		sumc = Math.cos(180);
		c3 = sumc - c2 - c1;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}

}
