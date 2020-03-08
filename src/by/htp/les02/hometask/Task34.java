package by.htp.les02.hometask;

/*34. Дана величина А, выражающая объем информации в байтах. 
 * Перевести А в более крупные единицы измерения информации.  */

public class Task34 {

	public static void main(String[] args) {
		double a = 512000;
		double kb;
		double mb;
		double gb;
		
		kb = a / 1024;
		mb = a / 1024/1024;
		gb = a / 1024/1024/1024 ;
		
		System.out.println(kb + " kb");
		System.out.println(mb + " mb");
		System.out.println(gb + " gb");
	}

}
