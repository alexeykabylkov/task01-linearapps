package by.htp.les02.hometask;

/*35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.  */

public class Task35 {

	public static void main(String[] args) {
		
		int m = 1364;
		int n = 19;
		double ch;
		int c;
		int d;
		
		ch = (double)m / n;
		c = (int)ch;
		ch = ch - c;
		ch = ch * 10;
		d = (int)ch;
		c = c % 10;
		
		System.out.println(c + " " + d);

	}

}
