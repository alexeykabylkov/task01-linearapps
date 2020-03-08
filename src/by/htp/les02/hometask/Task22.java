package by.htp.les02.hometask;

/* 22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.  */

public class Task22 {

	public static void main(String[] args) {
		
		int t = 67334;
		int h;
		int min;
		int sec;
		
		h = t / 3600;
		t = t - (h*3600);
		
		min = t/60;
		sec = t - (min*60);
		
		System.out.println(h + "h " + min + "min " + sec + "sec");
		
	}

}
