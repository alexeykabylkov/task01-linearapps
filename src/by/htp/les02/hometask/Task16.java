package by.htp.les02.hometask;

/* 15. Написать программу, которая выводит на экран первые четыре степени числа π. */

public class Task16 {

	public static void main(String[] args) {
		
		int x = 6460;
		int y;
		int pr = 1;
		
		for (int i = 1; i <= 4; i++) {
			y = x%10;
			pr = pr * y;
			x = x/10;
			
		}
		System.out.println(pr);
		

	}

}
