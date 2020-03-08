package by.htp.les02.hometask;

/*14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R */

public class Task14 {

	public static void main(String[] args) {
		
		int r = 5;
		double s;
		double c;
		
		if (r > 0){
			c = 2 * Math.PI * r;
			s = Math.PI * (r*r);
			System.out.println("The length is " + c);
			System.out.println("The area is " + s);
		} else {
			System.out.println("������ ��������� ���������� � ����!");
		}
	}
}
