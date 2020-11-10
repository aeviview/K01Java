package ex20io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/*
연습문제] 맨 밑에 있어요~
해당 프로그램은 친구의 정보를 저장하게 된다.
프로그램 종료시 Friend타입의 객체배열에 저장된 친구의 정보를
파일의 형태로 저장할 수 있도록 직렬화 하시오.
- 저장될 파일명 : friend_info.obj
*/




class Friend implements Serializable
{	//멤버변수
	String name;	//이름
	String phone;	//전화번호
	String addr;	//주소
	
	//생성자메소드
	public Friend(String name, String phone, String addr)
	{
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	//멤버메소드
	//멤버변수 전체정보를 출력하는 메소드
	public void showAllData()
	{
		System.out.println("이름 : "+ name);
		System.out.println("전화번호 : "+ phone);
		System.out.println("주소 : "+ addr);
	}
	/*
	 간략한 정보만을 출력하는 멤버메소드로,
	 현재 실행부가 없는 상태로 정의되었다.
	 해당 프로그램에서는 오버라이딩의 목적으로 정의되었다.
	 */
	public void showBasicInfo()
	{
	}	
}


//고딩친구
class HighFriend extends Friend
{
	String nickname; //자식쪽에서 확장한 멤버변수
	
	public HighFriend(String name, String phone, 
						String addr, String nickname)
	{
		super(name, phone, addr);
		this.nickname = nickname;
	}
	
	/*
	 고딩친구의 전체정보를 출력하기 위해 부모에서 정의된 메소드를 super를 통해 호출하고,
	 자식에게 확장한 변수를 별도의 print문을 통해 출력하고 있다.
	 */
	@Override
	public void showAllData()
	{
		System.out.println("==고딩친구(전체정보)==");
		super.showAllData();
		System.out.println("별명 : "+ nickname);
	}
	
	
	//자식쪽에서 오버라이딩 하여 재정의한 메소드로 고딩친구의 간략한 정보를 출력한다.
	@Override
	public void showBasicInfo()
	{
		System.out.println("==고딩친구==");
		System.out.println("별명 : "+ nickname);
		System.out.println("전번 : "+ phone);
	}
}

//대딩친구
class UnivFriend extends Friend
{
	String major; //자식쪽에서 확장한 멤버변수(전공)
	public UnivFriend(String name, String phone, 
						String addr, String major)
	{
		super(name, phone, addr);
		this.major = major;
	}
	@Override
	public void showAllData()
	{
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공 : "+ major);
	}
	@Override
	public void showBasicInfo()
	{
		System.out.println("==대딩친구==");
		System.out.println("이름 : "+ name);
		System.out.println("전번 : "+ phone);
	}

}


public class E13MyFriendSerializable
{
	
	public static void menuShow()
	{
		
		//프로그램에서의 입력메뉴 출력
		System.out.println("***메뉴를 선택하세요***");
		System.out.println("1.고딩친구입력");
		System.out.println("2.대딩친구입력");
		System.out.println("3.전체정보출력");
		System.out.println("4.간략정보출력");
		System.out.println("5.검색");
		System.out.println("6.삭제");
		System.out.println("7.프로그램종료");
		System.out.println("메뉴선택>>>");
		}
	
	
	//프로그램 전반의 흐름에 대해서만 기술하고 관련 함수를 호출하는 정도로만 작성
	public static void main(String[] args)
	{
		
		//프로그램의 비즈니스 로직을 가진 핸들러 객체를 생성.
		FriendInfoHandler handler = new FriendInfoHandler(100);
		//연락처 정보를 저장할 객체배열의 크기를 100으로 초기화한다.
		
		//무한루프로 구성하여 사용자가 종료하는 시점에 프로그램 종료된다.
		while(true) //메뉴출력을 위한 메소드호출
		{
			menuShow();
			
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			
			switch(choice)
			{
			//친구 정보 추가
			case 1: case 2:
				handler.addFriend(choice);
				break;
			//전체 정보 출력
			case 3:
				handler.showAllData();
				break;
			//간략 정보 출력
			case 4:
				handler.showSimpleData();
				break;
			//친구 정보 검색
			case 5:
				handler.searchInfo();
				break;
			//친구 정보 삭제
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				handler.saveFriendInfo();
				System.out.println("프로그램을 종료합니다");
				return;
			
			}
		}
	}
}


/*
<핸들러클래스>
 프로그램의 흐름을 제어할 목적으로 생성한 클래스로
 주로 컨트롤클래스 혹은 핸들러클래스라고 칭한다.
 해당 프로그램에서 전반적인 기능을 담당하게 된다.
 */


class FriendInfoHandler
{
	//멤버변수
	/*
	 Friend 타입의 객체배열을 선언하여 하위클래스인  High, Univ 객체를 저장한다.
	 부모타입의 배열에는 하위객체 전체를 저장할 수 있으므로 여러개의 객체를 하나의 타입으로
	 관리할 수 있다는 장점이 있다.
	 */
	private Friend[] myFriends;
	private int numOfFriends; //정보추가시 +1증가(저장된 친구의 갯수를 카운트)
	
	//생성자 : 인자로 전달되는 num크기의 객체배열을 생성한다.
	public FriendInfoHandler(int num)
	{
		myFriends = new Friend[num];
		numOfFriends = 0;
	}

	//새로운 친구(고딩,대딩) 연락처 추가
	public void addFriend(int choice)
	{
		Scanner scan = new Scanner(System.in);
		
		String iName, iPhone, iAddr, iNickname, iMajor;
		
		System.out.println("이름 : ");iName = scan.nextLine();
		System.out.println("전화번호 : ");iPhone = scan.nextLine();
		System.out.println("이름 : ");iAddr = scan.nextLine();
		
		if(choice==1)
		{
			System.out.println("별명 : "); iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			myFriends[numOfFriends++] = high;
		}
		else if(choice==2)
		{
			System.out.println("전공 : "); iMajor = scan.nextLine();
			myFriends[numOfFriends++] = new UnivFriend
					(iName, iPhone, iAddr, iMajor);
		}
	
		System.out.println("친구정보 입력이 완료되었습니다");
	}
	
	//친구정보 전체보기
	public void showAllData()
	{
		for(int i=0 ; i<numOfFriends ; i++)
		{
			myFriends[i].showAllData();
		}
		System.out.println("==전체정보가 출력되었습니다==");
	}
	//친구정보 간략보기
	public void showSimpleData()
	{
			for(int i=0 ; i<numOfFriends ; i++)
			{
				myFriends[i].showBasicInfo();
			}
			System.out.println("==간략정보가 출력되었습니다==");
	}
	//주소록 검색
	public void searchInfo()
	{
			boolean isFind = false; //검색한 정보가 있는지 확인을 위한 변수
			Scanner scan = new Scanner(System.in);
			System.out.println("검색할 이름을 입력하세요 : ");
			String searchName = scan.nextLine();
			
			//객체배열에 저장된 친구정보의 갯수만큼 반복
			for(int i=0 ; i<numOfFriends ; i++)
			{
				System.out.println("검색중인이름 : "+ myFriends[i].name);
				
				if(searchName.compareTo(myFriends[i].name)==0)
				{
					myFriends[i].showAllData();
					System.out.println("***귀하가 요청하는 정보를 찾았습니다***");
					isFind = true; //찾는 정보가 있다면  true로 변경
				}
			}
			
			if(isFind==false)
				System.out.println("***찾는 정보가 없습니다***");
	} //end of searchInfo

	
	
	//주소록 항목 삭제
	public void deleteInfo()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요 :");
		String deleteName = scan.next();
		
		/*
		 배열의 요소중 삭제된 요소의 인덱스값을 저장할 용도의 변수.
		 요소를 삭제한 후 빈자리를 채워넣을 때 사용할 것임.
		 */
		int deleteIndex = -1; //배열의  index값이므로 초기값은 -1로 설정
		
		for(int i=0 ; i<numOfFriends ; i++)
		{
			if(deleteName.compareTo(myFriends[i].name)==0)
			//요소를 삭제하기 위해  null값으로 변경
			{
				myFriends[i] = null;
				deleteIndex = i;	//삭제된 요소의 index를 저장
				numOfFriends--;		//전체카운트를 -1차감
				
			}
		}
	
		if(deleteIndex==-1)
		{
			System.out.println("==삭제된 데이터가 없습니다==");
		}
		else
		{
			for(int i=deleteIndex ; i<numOfFriends ; i++)
			{
				myFriends[i] = myFriends[i+1];
			}
			System.out.println("==데이터("+ deleteIndex +"번)가 삭제되었습니다==");
		}
	} //end of deleteInfo
	
	
	//친구 정보를 파일로 저장하기
	public void saveFriendInfo()
	{
	
		try
		{
			//파일 저장을 위한 스트림 생성
			ObjectOutputStream out = 
					new ObjectOutputStream(
							new FileOutputStream("src/ex20io/friend_info.obj"));

		
			//객체배열에 저장된 친구의 갯수만큼 반복하면서 객체를 가져와서 순서대로 파일에 저장한다.
			for(int i=0 ; i<numOfFriends ; i++)
			{
				out.writeObject(myFriends[i]);
			}
		}
		catch(Exception e)
		{
				System.out.println("친구정보 파일 저장 시 예외발생");
				e.printStackTrace();
		}
	}
	
	
	
	
} //end of FriendInfoHandler
