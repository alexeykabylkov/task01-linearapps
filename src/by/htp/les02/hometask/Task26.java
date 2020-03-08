package by.htp.les02.hometask;

/*26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у.  */

public class Task26 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		double y = 45;
		double s;
		double y1;
		double c;
		
		
		y1 = Math.toRadians(y);
		s = Math.sin(y1) * 1/2 * a*b;
		
		System.out.println(s);
		

	}

}