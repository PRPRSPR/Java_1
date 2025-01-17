package day16;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt; 
			String colKor[] = {"이름","학과","키"};
			String colEng[] = {"STU_NAME","STU_DEPT","STU_HEIGHT"};
			
			// 학생 추가, 수정, 삭제, 조회
			
			while(true) {
				System.out.println("[(1) 학생 추가 (2) 수정 (3) 삭제 (4) 조회 (5) 종료]");
				int menu = scan.nextInt();
				if(menu == 1) {
					String stuNo;
					for(;;) {
						System.out.print("학번 : ");
						stuNo = scan.next();
						if(stuNo.length()!=8) {
							System.out.println("올바른 학번을 입력하세요.");
						}else {
							break;
						}
					}
					
					System.out.print("이름 : ");
					String stuName = scan.next();
					System.out.print("학과 : ");
					String stuDept = scan.next();
					
					
					String sql = "INSERT INTO STUDENT(STU_NO,STU_NAME,STU_DEPT) VALUES ('"+stuNo+"','"+stuName+"','"+stuDept+"')";
					System.out.println(sql);
					int num = stmt.executeUpdate(sql);
					if(num>0) {
						System.out.println("추가되었음!");
					}else {
						System.out.println("오류발생!");
					}
				}else if(menu==2) {
					// 이름, 학과, 키
					System.out.print("학번 : ");
					String stuNo = scan.next();
					ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT WHERE STU_NO = '"+stuNo+"'");
//					>> 유일한 값 -> PK
					if(rs.next()) {
						System.out.println("수정할 데이터 선택");
						System.out.print("1.이름  2.학과  3.키  >> ");
						int column = scan.nextInt();
//						if(column == 1) {
//							System.out.print("변경할 이름 : ");
//							String stuName = scan.next();
//							String sql = "UPDATE STUDENT SET STU_NAME = '"+stuName+"' WHERE STU_NO = '"+stuNo+"'";
//							stmt.executeUpdate(sql);
//						}else if(column == 2) {
//							System.out.print("변경할 학과 : ");
//							String stuDept = scan.next();
//							String sql = "UPDATE STUDENT SET STU_DEPT = '"+stuDept+"' WHERE STU_NO = '"+stuNo+"'";
//							stmt.executeUpdate(sql);
//						}else if(column == 3) {
//							System.out.print("변경할 키 : ");
//							int height = scan.nextInt();
//							String sql = "UPDATE STUDENT SET STU_HEIGHT = '"+height+"' WHERE STU_NO = '"+stuNo+"'";
//							stmt.executeUpdate(sql);
//						}else {
//							System.out.println("잘못된 메뉴 선택");
//						} // >> 배열의 키-값 이용해 간단하게 만들 수 있다.
						if(column>3||column<1) {
							System.out.println("없는 정보입니다.");
							continue;
						}
						System.out.println(colKor[column-1]+"입력 : ");
						String value = scan.next();
						stmt.executeUpdate("UPDATE STUDENT SET "+colEng[column-1]+"= '"+value+"' WHERE STU_NO = '"+stuNo+"'");
						System.out.println("수정되었습니다.");
						
					} else {
						System.out.println("해당 학번의 학생 없음.");
					}
					
					
				}else if(menu==3) {
					
				}else if(menu==4) {
					
				}else if(menu==5) {
					System.out.println("종료되었습니다.");
					break;
				}else {
					System.out.println("없는 메뉴입니다.");
				}
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
