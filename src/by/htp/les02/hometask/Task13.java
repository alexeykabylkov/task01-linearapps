package by.htp.les02.hometask;

/* 13. Заданы координаты трех вершин треугольника  (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.  */

public class Task13 {

	public static void main(String[] args) {
	
		int x1 = -4;
		int y1 = 0;
		
		int x2 = 4;
		int y2 = 0;
		
		int x3 = 0;
		int y3 = 3;
		
		double s1;
		double s2;
		double s3;
		
		double pr;
		double area;
		
		
		s1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		s2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		s3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		
		pr = s1 + s2 + s3;
		System.out.println("The perimetr is " + pr);
		
		pr = pr / 2;
		
		area = Math.sqrt(pr * (pr-s1) * (pr-s2) * (pr-s3));
		System.out.println("The area is " + area);
	}

}
