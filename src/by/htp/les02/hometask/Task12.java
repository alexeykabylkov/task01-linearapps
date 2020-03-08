package by.htp.les02.hometask;

/*12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).  */

public class Task12 {

	public static void main(String[] args) {
		int x1 = 0;
		int y1 = 4;
		
		int x2 = -1;
		int y2 = -2;
		
		double dist;
		
		dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.println("The distance is " + dist);
	}

}
