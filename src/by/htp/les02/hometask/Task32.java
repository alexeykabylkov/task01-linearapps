package by.htp.les02.hometask;

/*32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). 
 * Какое время будут показывать часы через р ч q мин r с? */

public class Task32 {

	public static void main(String[] args) {
		
		int h1 = 23;
		int m1 = 59;
		int s1 = 59;
		int p = 0;
		int q = 0;
		int r = 2;
		int h2;
		int m2;
		int s2;
		
		
		s2 = s1 + r;
		if (s2>59) {
			s2 = s2 - 60;
			m1 = m1+1;
		}
		
		
		m2 = m1 + q;
		if (m2>59) {
			m2 = m2 - 60;
			h1 = h1 + 1;
		}
		
		
		h2 = h1 + p;
		if (h2>23) {
			h2 = h2 - 24;
		}
		
		System.out.println(h2 + " h " + m2 + " min " + s2 + " sec ");
		
	}

}
