package by.htp.les02.hometask;

/* 15. Написать программу, которая выводит на экран первые четыре степени числа π. */

public class Task15 {

	public static void main(String[] args) {
		
		double p = Math.PI;
		double s;
		
		for(int x = 1; x <= 4; x++) {
			s = Math.pow(p, x);
			System.out.println("����� PI � ������� " + x + " ����� " + s);
		}

	}

}
