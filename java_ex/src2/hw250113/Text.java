package hw250113;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		ArrayList<HashMap<String, Object>> arr2 = new ArrayList<>();
		
		System.out.println("영문 텍스트 입력 후 세미콜론 입력");
		while(true) {
			String text = scan.next();
			arr.add(text);
			if(text.equals(";")) {
				for(int i=0; i<arr.size(); i++) {
					boolean countFlg = false;
					HashMap<String, Object> map = new HashMap<>();
					for(int j=0; j<arr.get(i).length()-1; j++) {
						int count = 1;
						String first = arr.get(i).substring(j, j+1);
						String word = arr.get(i).substring(j+1);
						if(word.contains(first)) {
							
						}
						map.put(first, count);
					}
				}
				
				break;
			}
		}
		
	}

}
