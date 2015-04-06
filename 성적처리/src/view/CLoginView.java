package view;

import java.util.Scanner;

import entity.CMember;


public class CLoginView extends CView {
	
	public void login() {
		
		Scanner scanner = new Scanner(System.in);
		
		// input from key board using scanner
		CMember member = new CMember();
		
		// String userID = scanner.next();
		member.setUserID("userID");
		
		//String password = scanner.next();
		member.setPassword("password");
		
		// close scanner
		scanner.close();
		
		member = (CMember) this.getControl().process(member);

	}


	
}
