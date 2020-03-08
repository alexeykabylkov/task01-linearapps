package by.htp.les02.hometask;

/*11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов. */

public class Task11 {

	public static void main(String[] args) {
		
		double a = 3;
		double b = 4;
		double c;
		
		double s;
		double p;
		
		c = Math.sqrt(a * a + b * b);
		
		p = (a + b + c);
		
		s = (a * b / 2);
		
		System.out.println(p);

		System.out.println(s);
	}

}
