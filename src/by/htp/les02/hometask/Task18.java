package by.htp.les02.hometask;

/* 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.*/

public class Task18 {

	public static void main(String[] args) {
		
		int a = 2;
		
		int sg;
		int sp;
		int v;
		
		if (a>0) {
			sg = a*a;
			sp = 6 * (a*a);
			v = a*a*a;
		
			System.out.println("Площадь грани равна " + sg);
			System.out.println("Площадь полной поверхности равна " + sp);
			System.out.println("Объем равен " + v);
		} else {
			System.out.println("Это не куб");
		}

	}

}
