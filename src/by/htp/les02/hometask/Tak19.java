package by.htp.les02.hometask;

/*19. Дана сторона равностороннего треугольника. 
 * Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей. */

public class Tak19 {

	public static void main(String[] args) {
		double a = 0;
		double s;
		double h;
		double rin;
		double rout;
		
		if (a > 0) {
			s = ((a*a) * Math.sqrt(3)) / 4;
			h = (a * Math.sqrt(3)) / 2;
			rin = (a * Math.sqrt(3)) / 6;
			rout = rin * 2;
			
			System.out.println(s);
			System.out.println(h);
			System.out.println(rin);
			System.out.println(rout);
		} else {
			System.out.println("Oops. Not a triangle...");
		}

	}

}
