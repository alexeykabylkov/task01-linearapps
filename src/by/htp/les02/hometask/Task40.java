package by.htp.les02.hometask;

/* ���� �������� �. �������� ��������  -2� + 3�2 - 4�3  � 1 + 2� + 3�2 + 4�3 . ������������ �� �������� ��������. */

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
