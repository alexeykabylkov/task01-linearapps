package by.htp.les02.hometask;

/* 17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел*/

public class Task17 {

	public static void main(String[] args) {
		
		double x = 2;
		double y = -3;
		
		double sum;
		double pr;
		
		sum = (Math.pow(x, 3) + Math.pow(y, 3)) / 2;
		System.out.println(sum);
		
		if (x<0) {
			x = x * -1;
		}
		if (y<0) {
			y = y * -1;
		}
		
		pr = Math.sqrt(x * y);
		System.out.println(pr);
		
		
		
		
		
	}

}
