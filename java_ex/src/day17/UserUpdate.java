package day17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day16.DBClass;

public class UserUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//아이디 입럭받아서 없는 아이디면 '없는 아이디입니다'->다시입력
		//있는 아이디일 경우 나이값 입력받아서 업데이트
		
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			while(true) {
				System.out.print("아이디 : ");
				String id = scan.next();
				ResultSet rs = stmt.executeQuery("SELECT * FROM TBL_USER WHERE USERID = '"+id+"'");
				if(rs.next()) {
					String name = rs.getString("USERNAME");
					System.out.println(name+"님, 반갑습니다.");
					System.out.print("나이 : ");
					int age = scan.nextInt();
					if(age<0||age>100) {
						System.out.println("올바른 나이 입력");
					}else {
						String sql = "UPDATE TBL_USER SET AGE = "+age+" WHERE USERID = '"+id+"'";
						int checkAge = stmt.executeUpdate(sql);
						if(checkAge!=0) {
							System.out.println("나이 입력 완료");
						}
					}
					break;
				} else {
					System.out.println("없는 아이디 입니다.");
				}
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
	}

}
