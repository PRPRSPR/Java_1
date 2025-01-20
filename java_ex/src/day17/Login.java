package day17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day16.DBClass;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			//아이디/패스워드 입력받아서 아이디/패스워드 둘 다 만족하는 데이터가 있으면 
			//로그인 성공, 아닐 경우 로그인 실패
			while(true) {
				System.out.print("아이디 : ");
				String id = scan.next();
				System.out.print("비밀번호 : ");
				String pwd = scan.next();
				String sql = "SELECT * FROM TBL_USER WHERE USERID = '"+id+"' AND PASSWORD = '"+pwd+"'";
//				System.out.println(sql);
				ResultSet rs = stmt.executeQuery(sql);
				if(rs.next()) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패");
				}
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
