package by.htp.les02.hometask;

/* 24. Найти площадь равнобедренной трапеции с основаниями а и  b  и углом α при большем основании а.*/

public class Task24 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 6;
		
		double a1 = Math.max(a, b);
		double b1 = Math.min(a, b);
		
		double c = 45;
		double h;
		double s;
		
		Math.toRadians(c);
		h = Math.tan(c) * ((a1-b1)/2);
		
		s = ((a+b) / 2) * h;
		
		System.out.println(s);
		

	}

}
