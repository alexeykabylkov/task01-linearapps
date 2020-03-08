package by.htp.les02.hometask;

/* 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r) */

public class Task23 {

	public static void main(String[] args) {
		
		int r = 5;
		int t = 7;
		
		double st;
		double sr;
		double areac;
		
		sr = (r*r) * Math.PI;
		st = (t*t) * Math.PI;
		
		areac = st - sr;
		
		System.out.println(areac);

	}

}
