package by.htp.les02.hometask;
/*1. Даны два действительных числа х и  у. Вычислить их сумму, разность, произведение и частное.*/
public class Task1 {

	public static void main(String[] args) {
		int x = 2;
		int y = 7;
		
		int sum;
		int raz;
		int pr;
		double chas;
		
		sum = x + y;
		raz = x - y;
		pr = x * y;
		chas = (double)x / y;
		
		System.out.println("sum = " + sum);
		System.out.println("raz = " + raz);
		System.out.println("pr = " + pr);
		System.out.println("chas = " + chas);

	}

}
