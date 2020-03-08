package by.htp.les02.hometask;

/*27. 27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, 
 * получить значение а8 за три операции и  а10 за четыре операции.  */

public class Task27 {

	public static void main(String[] args) {
		
		int a = 2;
		int temp;         
		
		a = a*a;          //1
		temp = a;
		a = a*a;          //2
		a = a*a;          //3
		
		System.out.println("а в кубе равно = " + a);
		
		a = a*temp;       //4

		System.out.println("a в 10 степени равно = " + a);
	}

}
