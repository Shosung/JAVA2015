package view;

import java.util.Scanner;

import control.CLoginControl;
import entity.CLoginInfo;


public class CLoginView extends CView {
	
	public void login() {
		
		Scanner scanner = new Scanner(System.in);
		
		// input from key board using scanner
		CLoginInfo logininfo = new CLoginInfo();
		System.out.print("user ID�� �Է��Ͻÿ�. ");
		logininfo.setUserID(scanner.next());
		System.out.print("user password�� �Է��Ͻÿ�. ");
		logininfo.setPassword(scanner.next());
		

		
		// close scanner
		
		
		logininfo = (CLoginInfo) ((CLoginControl) this.getControl()).login(logininfo);
		

	}


	
}
