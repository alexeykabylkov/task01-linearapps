package by.htp.les02.hometask;

/*31. Составить программу для вычисления пути, пройденного лодкой, 
 * если ее скорость в стоячей воде v км/ч, скорость течения реки v1 км/ч, время движения по озеру t1 ч, 
 * а против течения реки — t2 ч.  
 */

public class Task31 {

	public static void main(String[] args) {
		
		int v = 60;
		int v1 = 10;
		int vr;
		int t1 = 2;
		int t2 = 3;
		int s1;
		int s2;
		
		vr = v - v1;
		s1 = t1 * v;
		s2 = t2 * vr;
		
		System.out.println("Lake distance is " + s1);
		System.out.println("Up the river distance is " + s2);

	}

}
