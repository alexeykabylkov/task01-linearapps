package by.htp.les02.hometask;

/* 20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью. */

public class Task20 {

	public static void main(String[] args) {
		
		double l = 7;
		double r;
		double s;
		
		if (l > 0) {
			
			r = l / (Math.PI * 2);
			s = (r*r) * Math.PI;
			
			System.out.println("The area is " + s);
		} else {
			System.out.println("Give me something more than 0, please.");
		}
	}

}
