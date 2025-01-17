package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBConn {
	
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
			
			System.out.print("삭제할 학생의 이름 입력 : ");
			String name = scan.next();
//			System.out.println("DELETE FROM STUDENT WHERE STU_NAME = "+name);
//			>> DELETE FROM STUDENT WHERE STU_NAME = 홍길동 <<'홍길동' 따옴표 붙여줘야함
			int num = stmt.executeUpdate("DELETE FROM STUDENT WHERE STU_NAME = '"+name+"'");
//			>> 실행 후 영향을 받은 행의 개수가 반환됨.
			if(num == 0) { //>> 영향을 받은 행이 0개. 
				System.out.println("삭제할 대상이 존재하지 않습니다.");
			}else {
				System.out.println("삭제되었습니다.");
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

}
