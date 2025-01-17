package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDeleteEx1 {
	
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
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");
//			>> 최초 커서위치 = 빈칸
//			rs.next(); // 커서이동
//			String name = rs.getString("STU_NAME");
//			int height = rs.getInt("STU_HEIGHT");
//			System.out.println(name); //name에 담아서 출력
//			System.out.println(height);
//			rs.next(); // 커서이동
//			System.out.println(rs.getString("STU_NAME")); //담지않고 바로 출력
//			rs.next(); // 커서이동
//			System.out.println(rs.getString("STU_NAME"));
//			
//			while(rs.next()) { // 다음커서가 있다면 true
//				String name = rs.getString("STU_NAME");
//				int height = rs.getInt("STU_HEIGHT");
//				System.out.print(name+"\t");
//				System.out.println(height);
//			} >> 메소드로 만들어서 사용해보기
			printData(rs);
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

}
