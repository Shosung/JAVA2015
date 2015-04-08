package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import control.CLoginControl;
import entity.CLoginInfo;


public class CLoginView extends CView {
	
	public void login() {
		
		Scanner scanner = new Scanner(System.in);
		
		// input from key board using scanner
		CLoginInfo logininfo = new CLoginInfo();
		String IDS;
		String PasswordS;
		String s;
		
		
		try {
			BufferedReader IDin = new BufferedReader(new FileReader("member.txt"));
			System.out.print("id를 입력하시오");
			IDS = scanner.next();
			for(int i = 0;(s=IDin.readLine()) != null; i++){
				String[] IDPS = s.split (" ");
				if(IDS.equals(IDPS[0])){
					System.out.print("password를 입력하시오 ");
					PasswordS = scanner.next();	
					if(PasswordS.equals(IDPS[1])){
						System.out.print("환영합니다 ");
						break;
					} else {
						System.out.print("패스워드가 틀렸습니다 ");
						break;
					}
				}
				
			}
			if(s == null){
				System.out.println("해당 사용자 아이디가 없습니다  ");
			}
			IDin.close();
			scanner.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		// close scanner
		scanner.close();
		
		logininfo = (CLoginInfo) ((CLoginControl) this.getControl()).login(logininfo);

	}


	
}
