package by.htp.les02.hometask;

/* Дано значение х. Получить значения  -2х + 3х2 - 4х3  и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций. */

public class Task40 {

	public static void main(String[] args) {
		
		int x = 2;
		int y;
		int z;
		
		y = -2*x + x*x*3 - x*x*x*4;
		z = 1 + 2*x + x*x*3 + x*x*x*4;
		
		System.out.println(y);
		System.out.println(z);

	}

}
