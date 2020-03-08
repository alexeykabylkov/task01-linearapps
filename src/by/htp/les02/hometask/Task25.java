package by.htp.les02.hometask;

/* Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с 
 * (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).  */

public class Task25 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 4;
		int c = 3;
		
		double x;
		double x1;
		double x2;
		int d;
		
		d = b*b - 4*a*c;
		
		if (d == 0) {
			x = (b*(-1)) / (2*a);
			System.out.println("x = " + x);
		} else if (d > 0) {
			x1 = ((-1*b) + Math.sqrt(d)) / (2*a);
			x2 = ((-1*b) - Math.sqrt(d)) / (2*a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else if(d < 0) {
			System.out.println("error");
		}
		

	}

}
