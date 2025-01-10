package day11;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = new String(" C#"); //String 객체 a = " C#"
		String b = new String(",C++ "); //String 객체 b = ",C++ "
		
		System.out.println(a + "의 길이는 " + a.length()); // 문자열의 길이(문자개수)
		// ==> C#의 길이는 3 (공백도 문자개수에 포함)
		
		System.out.println(a.contains("#")); // 문자열의 포함관계
		// ==> true 리턴. " C#"에 #이 포함되어있음.
		
		a = a.concat(b); // 문자열 연결
		System.out.println(a);
		// ==> " C#,C++ " a에 b가 합쳐진 값이 새로 a가 됨.
		// >> a = " C#,C++ " / b = ",C++ "
		
		a = a.trim(); // 문자열 앞뒤의 공백 제거
		System.out.println(a);
		// ==> a = "C#,C++" 앞뒤 공백 제거
		
		a = a.replace("C#", "Java"); // 문자열 대치
		System.out.println(a);
		// ==> C#을 Java로 변경(대치)
		// >> a = "Java,C++"
		
		String s[] = a.split(","); // 문자열 분리
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열" + (i+1) + " : " + s[i]);
		}
		// ==> ","를 기준으로 분리하여 배열 s[]에 저장해 리턴.
		// >> for 문으로 배열 출력. 분리된 문자열1 : Java, 분리된 문자열2 : C++
		// s[0] = "Java", s[1] = "C++"
		
		a = a.substring(5); // 인덱스 5부터 끝까지 서브스트링 리턴
		System.out.println(a);
		// ==> "Java,C++"의 낱말을 배열 a[]로 생각하기 인덱스 0부터 시작.
		// >> a[5] = "C", a[6] = "+", a[7] = "+"
		// >> a = "C++"
		
		// substring ex)
		a = "Java,C++";
		a = a.substring(0, 4);
		System.out.println(a);
		// ==> 인덱스 0번째 부터 인덱스 4번 "전"까지 리턴.
		// >> a = "Java"
		
		char c = a.charAt(2); // 인덱스 2의 문자 리턴
		System.out.println(c);
		// ==> "Java"의 인덱스 2 문자 리턴. 
		// >> a[0] = "J", a[1] = "a", a[2] = "v", a[3] = "a"
		// >> c = "v"
	}

}
