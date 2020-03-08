package by.htp.les02.hometask;

/* 8. Вычислить значение выражения по формуле (все переменные принимают действительные значения).� */

public class Task8 {

	public static void main(String[] args) {
		double a = 1;
		double b = 2;
		double c = 3;
		
		double res;
		
		if (a == 0) {
			System.out.println("ERROR - ������ �� 0 ������");
		} else {
			res = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
			System.out.println("The result is " + res);	
		  }
	}

}
