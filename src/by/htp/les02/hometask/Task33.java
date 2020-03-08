package by.htp.les02.hometask;

/*33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы. */

public class Task33 {

	public static void main(String[] args) {
		
		char s = 'м';
		char ps;
		char ns;
		int a;
		int p;
		int n;
		
		a = s;
		System.out.println("Порядковый номер " + a);
		p = a - 1;
		n = a + 1;
		ps = (char)p;
		ns = (char)n;
		
		System.out.println("Предыдущий символ " + ps);
		System.out.println("Следующий символ " + ns);
		
				

	}

}
