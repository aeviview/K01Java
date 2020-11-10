package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery 
{
	//멤버변수
	Connection con; //DB연결을 위한 객체
	Statement stmt; //쿼리전송 및 실행을 위한 객체
	
	
	//생성자 메소드 => 클래스명과 같아야 한다!
	public InsertQuery()
	{
		try
		{
			//1. 오라클 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//2. 커넥션 객체를 통해 DB연결
			con = DriverManager.getConnection("jdbc:oracle:thin://@localhost:1521:orcl", "kosmo", "1234");
			System.out.println("오라클 DB 연결성공");
		}
		catch (ClassNotFoundException e)
		{
			//ojdbc6.jar 파일이 없거나 연동되지 않았을 때 예외발생
			System.out.println("오라클 드라이버 로딩 실패");
			e.printStackTrace();
		}
		catch (SQLException e)
		{
			//커넥션URL이나 게정명이 잘못되었을 때 예외발생
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		catch (Exception e)
		{
			System.out.println("알 수 없는 예외발생");
		}
	}//end of InsertQuery
	
	//쿼리작성 및 실행 메소드
	private void execute()
	{
		try
		{
			//3.Statement 객체 생성을 위한 메소드 호출
			stmt = con.createStatement();
			
			//4.SQL문(쿼리문) 작성
			String sql = "INSERT INTO member VALUES " + " ('test3', '4444', '사길동', SYSDATE) ";
			//5.쿼리실행 및 결과값 반환
			/*
			 executeUpdate() : 쿼리문이 insert/update/delete와 같이 기존레코드에 영향을 미치는 경우에 사용!
			 				실행 후 영향을 받은 행의 갯수가 int형으로 반환된다.
			 excuteQuery() : select 쿼리를 실행할 때 호출하는 메소드로 레코드에 영향을 미치지 않고 조회만 할 때 사용!
			 				조회한 레코드를 반환값으로 받아야 하므로 ResultSet 객체를 반환타입으로 사용하게 된다.
			 */
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected + "행이 입력되었습니다.");
		}
		catch(SQLException e)
		{
			System.out.println("쿼리실행에 문제가 발생하였습니다.");
			e.printStackTrace();
		}
		finally
		{
			close();
		}
	}//end of execute
	
	private void close()
	{
		try
		{
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
			System.out.println("DB자원반납완료");
		}
		catch(SQLException e)
		{
			System.out.println("자원반납시 오류가 발생하였습니다.");
		}
	}//end of close
	

	
	public static void main(String[] args) 
	{
		//실행방법(1) : 객체생성 후 참조변수에 대입 후 메소드 호출
//		InsertQuery iSQL = new InsertQuery();
//		iSQL.execute();
		
		//실행방법(2) : 객체생성과 동시에 메소드 호출
		new InsertQuery().execute();
		
	}//end of main
}
