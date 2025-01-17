package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBInsertEx1 {
	
	public static void printData(ResultSet rs) {
		try { //try-catch = 예외처리
			while(rs.next()) { // 다음커서가 있다면 true
				String name = rs.getString("STU_NAME");
				int height = rs.getInt("STU_HEIGHT");
				System.out.print(name+"\t");
				System.out.println(height);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		Statement stmt = null;
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			
			stmt = conn.createStatement();
			
			// 학번(String-8글자), 이름, 학과 입력받아 STUDENT 테이블에 저장
			
			System.out.print("학번 : ");
			String stuNo = scan.next();
			System.out.print("이름 : ");
			String stuName = scan.next();
			System.out.print("학과 : ");
			String stuDept = scan.next();
//			stmt.executeUpdate("INSERT INTO STUDENT(STU_NO,STU_NAME,STU_DEPT) VALUES ('"+stuNo+"','"+stuName+"','"+stuDept+"')");
//			"INSERT INTO STUDENT(STU_NO,STU_NAME,STU_DEPT) 
//			VALUES ('"+stuNo+"','"+stuName+"','"+stuDept+"')"
//			>> )끝에 ;붙이지 않도록 주의. 자동으로 붙여지기 때문에 오류 발생함.
			String sql = "INSERT INTO STUDENT(STU_NO,STU_NAME,STU_DEPT) VALUES ('"+stuNo+"','"+stuName+"','"+stuDept+"')";
			System.out.println(sql);
			int num = stmt.executeUpdate(sql);
			if(num>0) {
				System.out.println("추가되었음!");
			}else {
				System.out.println("오류발생!");
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

}
