package by.htp.les02.hometask;

/* 21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное значение числа. */

public class Task21 {

	public static void main(String[] args) {
		
		double r = 594.965;
		double t;
		int a;
		
		a = (int) r;
		r = r * 1000;
		r = r % 1000;
		t = (double)a;
		r = r + t/1000;
		
		System.out.println(r);
	}

}
