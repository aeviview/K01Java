package ex21jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect 
{

	public static void main(String[] args) 
	{
		try
		{
		/*
		 JDBC 프로그래밍 절차
		 1) 오라클용 JDBC 드라이버를 메모리에 로드
		 	- new를 사용하지 않고 클래스명으로 직접 찾아서 객체 생성 후 메모리에 로드하는 forName()을 사용한다.
		 	- 메모리에 로드된 드라이버가 Drivermanager라는 클래스에 등록된다!
		 */
			Class.forName("oracle.jdbc.OracleDriver");
		
		/*
		 2) 오라클 연결을 위한 커넥션URL, 계정아이디, 패스워드를 준비한다.
		 	커넥션 URL => jdbc:oracle:thin:@IP주소:포트번호:SID
		 	서버환경에 따라 ip주소, 포트번호, sid는 변경될 수 있다
		 */
			String ur1 = "jdbc:oracle:thin:@localhost:1521:orcl";
			String userid ="hr";
			String userpw = "1234";
		
		/*
		 2-1) DriverManager 클래스의 메소드를 통해 오라클에 연결을 시도한다.
		 		연결에 성공할 경우 연결된 주소를 반환한다.
		 */
			Connection con = DriverManager.getConnection(ur1, userid, userpw);
			if(con!=null)
			{
				System.out.println("Oracle DB 연결성공");
			
		/*
		 3) 쿼리문작성
		 	- 쿼리문을 작성할 때 주의할 점은 줄바꿈을 할 때 앞뒤로 스페이스를 삽입하는 것이 좋다!
		 	그렇지 않으면 문장이 이어지게 되어 SyntaxError가 발생할 수 있다!
		 */
			
				String sql = "SELECT * FROM employees where " + " department_id=50 " 
								+ " ORDER BY employee_id DESC";
				System.out.println("sql =" + sql);
			
		/*
		 4) 쿼리문을 Oracle로 전송하기 위한 Statement 계열의 인터페이스를 사용한다.
		 		해당 객체는 주로 정적쿼리를 실행할 때 사용된다!
		 */
				Statement stmt = con.createStatement();
				
		/*
		 5) Statement 객체를 사용하여 Oracle로 작성된 쿼리문을 전송하고 실행한다.
		 		실행 후 결과를 반환하면 ResultSet 객체를 통해 받는다.
		 */
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next())
				/*
				 오라클이 반환해 준 ResultSet 객체의 객수만큼 반복하면서 콘솔에 내용을 출력한다.
				 getXXX() 계열의 함수는 문자, 숫자, 날짜를 사용하기 위해 생성되어 있다.
				 인자값으로는 컬럼의 순서에 따른 인덱스를 쓸 수도 있고, 컬럼명을 쓸 수도 있다.
				 */
				{
					String emp_id = rs.getString(1); //employee_id컬럼
					String f_name = rs.getString("first_name");
					String l_name = rs.getString(3); //last_name컬럼
					java.sql.Date h_date = rs.getDate("hire_date");
					int sal = rs.getInt("salary");
					//get String, Date, Int 이렇게 3가지밖에 없다!
					System.out.printf("%s %s %s %s %s%n", emp_id, f_name, l_name, h_date, sal);
				}
				/*
				 6) 자원반납 : 모든 작업을 마친 후에는 메모리 절약을 위해 연결했던 자원을 반납한다!
				 */
				rs.close(); //close로 반납한다!
				stmt.close();
				con.close();
			}	
			
			else
			{
				System.out.println("연결실패 ㅠㅠ");
			}
		}
		catch (SQLException e)
		{
			System.out.println("SQLException 예외발생");
			e.printStackTrace(); //예외처리 할 때는 꼭 넣어주세요!
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("ClassNotFoundException 예외발생");
			e.printStackTrace();
		}
		catch (Exception e)
		{
			System.out.println("DB연결시 예외발생");
			e.printStackTrace();
		}
	}
}
