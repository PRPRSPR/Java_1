package day1;

public class cOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 1;
//		a = a+1;
//		a++;
//		a--; //a = a-1;
//		System.out.println(a);
		
//		int x = 10;
//		++x; // x = 11
//		int y = x++; // x = 12  y = 11
//		int z = --y; // y = 10  z = 10
//		System.out.println(x); // x = 12
//		System.out.println(y); // y = 10
//		System.out.println(z); // z = 10
		
		int a = 10;
		a=a+1; //a++;  a = 11
		a++; //++a;  a = 12
		
		int b = a++; //b = 12  a = 13
		b = --a; //b = 12  a = 12
		
		
		int x = 5;
		int y = ++x; //x=6 y=6
		y = x--; //x=5 y=6
		int z = x+y; //z=11
		++x; //x=6
		x = z++; //x=11 z=12
		//x=11 y=6 z=12
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
	}

}
