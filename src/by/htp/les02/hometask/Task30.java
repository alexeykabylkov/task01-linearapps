package by.htp.les02.hometask;

/*30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения. */

public class Task30 {

	public static void main(String[] args) {
		
		double r1 = 2;
		double r2 = 5;
		double r3 = 1;
		double rc;
		
		if (r1<=0 || r2<=0 || r3<=0) {
			System.out.println("error");
		}
		else { rc = 1 / (1/r1 + 1/r2 + 1/r3);
				System.out.println(rc);
			
		}
		
	}

}
