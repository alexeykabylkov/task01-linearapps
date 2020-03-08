package by.htp.les02.hometask;

/* Вычислить значение выражения по формуле (все переменные принимают действительные значения): */

public class Task9 {

	public static void main(String[] args) {
		double a = 1;
		double b = 2;
		double c = 3;
		double d = 4;
		
		double res;
		
		if (c==0 || d == 0) {
			System.out.println("error");
		} else {
			res = (a / c) * (b / d) - (a * b - c) / (c * d);	
			System.out.println("The result is " + res);
		}

	}

}
