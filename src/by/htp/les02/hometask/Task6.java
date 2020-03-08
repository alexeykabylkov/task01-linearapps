package by.htp.les02.hometask;

/* 6. Написать код для решения задачи. В n малых бидонах 80 л молока. 
 * Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?   */

public class Task6 {

	public static void main(String[] args) {
		int n = 4;
		int m = 8;
		
		double y;
		
		y = (80 / (double)n + 12) * m;
		
		System.out.println("В m беольших бидонах " + y + " литров молока.");

	}

}
