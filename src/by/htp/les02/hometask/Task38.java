package by.htp.les02.hometask;
/* Для данных областей составить линейную программу, которая печатает true, 
 * если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:  
 */

public class Task38 {

	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;
		
		// a)
		int x1 = 4;
		int y1 = 0;
		
		if (x1>=0 && y1<=4-x1) {
			System.out.println(t);
		}else if (x1<0 && y1<=x1+4) {
			System.out.println(t);
		} else {
			System.out.println(f);
		}
		
		// b)
		int x2 = 3;
		int y2 = -2;
		
		if ((y2>=0 && y2<=4) && (x2>=-2 && x2<=2)) {
			System.out.println(t);
		} else if ((y2<=0 && y2>=-3) && (x2>=-4 && x2<=4)) {
			System.out.println(t);
		} else {
			System.out.println(f);
		}
		
		// c)
		int x3 = 5;
		int y3 = -4;
		
		double d3;
		
		d3 = Math.sqrt((x3-0)*(x3-0) + (y3 -0)*(y3 -0));
		
		if ((x3>=0 && x3<=4) && d3<=4 && (y3>=0 && y3<=4)) {
			System.out.println(t);
		} else if ((x3>=0 && x3<=5) && d3<=5 && (y3<=0 && y3>=-5)) {
			System.out.println(t);
		} else {
			System.out.println(f);
		}

	}

}
