package by.htp.les02.hometask;

/*37. Составить линейную программу, печатающую значение true, 
 * если указанное высказывание является истинным, и false — в противном случае
 */

public class Task37 {

	public static void main(String[] args) {
		
		boolean t = true;
		boolean f = false;
		
		//Целое число N является четным двузначным числом. 
		System.out.print("1. ");
		int n = -8;
		if (n>=10 && n%2==0) {
			System.out.println(t);
		} else if (n<=-10 && n%2==0){
			System.out.println(t);
		}else {
			System.out.println(f);
		
		}
		
		//Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр. 
		System.out.print("2. ");
		int n2 = 4538;
		int a, b, c, d;
		
		a = n2 % 10;
		n2 = n2 / 10;
		
		b = n2 % 10;
		n2 = n2 / 10;
		
		c = n2 % 10;
		d = n2 / 10;
		
		if ((d + c) == (b + a)) {
			System.out.println(t);
		} else {
			System.out.println(f);
		}
		
		//Сумма цифр данного трехзначного числа N является четным числом.
		System.out.print("3. ");
		int n3 = 453;
		int n31, n32, n33;
		
		n33 = n3 % 10;
		n3 = n3 / 10;
		
		n32 = n3 % 10;
		n31 = n3 / 10;
		
		if ((n31 + n32 + n33) % 2 == 0) {
			System.out.println(t);
		} else {
			System.out.println(f);
		}
		
		//Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).
		System.out.print("4. ");
		int x4 = 7;
		int y4 = -2;
		int m4 = -1;
		int n4 = 5;
		
		if (x4>=m4 && x4<=n4){
			System.out.println(t);
		} else {
			System.out.println(f);
		}
		
		//Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
		System.out.print("5. ");
		int n5 = 111;
		int n51, n52, n53, n55;
		int sum5;
		
		n55 = n5;
		
		n51 = n5 % 10;
		n5 = n5 / 10;
		
		n52 = n5 % 10;
		n53 = n5 / 10;
		
		sum5 = n51 + n52 + n53;
		
		if (n55*n55 == Math.pow(sum5, 3)) {
			System.out.println(t);
		} else {
			System.out.println(f);
		}
		
		//Треугольник со сторонами а,b,с является равнобедренным.
		System.out.print("6. ");
		int a6 = 5;
		int b6 = 9;
		int c6 = 6;
		
		if (a6==b6 || a6==c6 || b6==c6) {
			System.out.println(t);
		} else {
			System.out.println(f);
		}
		
		//Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре. 
		System.out.print("7. ");
		int n7 = 100;
		int n71, n72, n73;
		
		n71 = n7 % 10;
		n7 = n7 / 10;
		n72 = n7 % 10;
		n73 = n7 / 10;
		
		if (n71+n72==n73 || n71+n73==n72 || n72+n73==n71) {
			System.out.println(t);
		} else {
			System.out.println(f);
		}
		
		//Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4). 
		System.out.print("8. ");
		int n8 = 1;
		int a8 = 2;
		
		if (n8==1) {System.out.println(t);} 
		else if (a8==n8) {System.out.println(t);} 
		else if (a8*a8==n8) {System.out.println(t);} 
		else if (Math.pow(a8, 3)==n8) {System.out.println(t);} 
		else if (Math.pow(a8, 4)==n8) {System.out.println(t);} 
		else {System.out.println(f);}
		
		//График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п). 
		System.out.print("9. ");
		double m9 = 3;
		double n9 = 31;
		double x91, x92, x9, d9;
		double a9 = 2;
		double b9 = 4;
		double c9 = 1;
		double y9, y91 = 0, y92;
		
		d9 = b9*b9 - 4*a9*c9;
		
		if (d9 > 0) {
			x91 = (-1*b9 + d9) / (2*a9);
			x92 = (-1*b9 - d9) / (2*a9);
			y91 = a9*(x91*x91) + b9*x91 + c9;
			y92 = a9*(x92*x92) + b9*x92 + c9;
			y92 = y91;
			if ((m9==x91 || m9==x92) && n9 == y91) {
				System.out.println(t);
			} else {
				System.out.println(f);
			}
		} else if (d9 == 0) {
			x91 = (-1*b9) / (2*a9);
			x92 = x91;
			y91 = a9*(x91*x91) + b9*x91 + c9;
			y92 = y91;
			if ((m9==x91 || m9==x92) && n9 == y91) {
				System.out.println(t);
			} else {
				System.out.println(f);
			}
		} else if (d9 < 0) {
			System.out.println(f);
		}
		
		/*if (m9==x91 && n9 == y91) {
			System.out.println(t);
		} else {
			System.out.println(f);
		}*/
		
			
	}
}

