package by.htp.les02.hometask;

/*36. Найти частное произведений четных и нечетных цифр четырехзначного числа.*/

public class Task36 {

	public static void main(String[] args) {
		
		int n =7436;
		int a, b, c, d; 
		int p1 = 1;
		int p2 = 1;
		double chas;
		
		a = n%10;
		n = n/10;
		
		b = n%10;
		n = n/10;
		
		c = n%10;
		d = n/10;
		
		if (a%2==0) {
			p1 = p1*a;
		} else {
			p2 = p2*a;
		}
		
		if (b%2==0) {
			p1 = p1*b;
		} else {
			p2 = p2*b;
		}
		
		if (c%2==0) {
			p1 = p1*c;
		} else {
			p2 = p2*c;
		}
		
		if (d%2==0) {
			p1 = p1*d;
		} else {
			p2 = p2*d;
		}
		if (p2 != 0) {
			chas = (double)p1 / p2;
			System.out.println(chas);
		} else {
			System.out.println("error");
		}
		
	}

}
