package by.htp.les02.hometask;

/* 10. Вычислить значение выражения по формуле (все переменные принимают действительные значения): */

public class Task10 {

	public static void main(String[] args) {
		
		double x = 2;
		double y = 1;
		
		double res;
		
		res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		System.out.print("The result is " + res);

	}

}
