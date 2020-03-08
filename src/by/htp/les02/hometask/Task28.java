package by.htp.les02.hometask;

/*28. 28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.*/

public class Task28 {

	public static void main(String[] args) {
		
		double xrad = 1;
		int deg;
		int min;
		int sec;
		
		
		sec = (int)(xrad * (180 / Math.PI) * 3600);
		
		deg = sec / 3600;
		min = sec / 60;
		
		System.out.println(deg + " degrees or " + min + " minutes or " + sec + " seconds" );	
		//System.out.println(sec);			
	}

}
