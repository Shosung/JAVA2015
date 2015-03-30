package DAOs;

import entity.CMember;

public class CMemberDAO {
	// Data Access Object : Read or write data from persistent storage
	public CMember read() {return null;}
	public void write(CMember member) {
		System.out.println("사용자 ID : "+ member.getUserID());
		System.out.println("사용자 비밀번호 : "+ member.getPassword());
	};
	
/*	public static void MemberView() {
		System.out.println("입력하신 ID 입니다. :" + );
	}
*/
}
