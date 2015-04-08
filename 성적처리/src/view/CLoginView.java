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
			System.out.print("id�� �Է��Ͻÿ�");
			IDS = scanner.next();
			for(int i = 0;(s=IDin.readLine()) != null; i++){
				String[] IDPS = s.split (" ");
				if(IDS.equals(IDPS[0])){
					System.out.print("password�� �Է��Ͻÿ� ");
					PasswordS = scanner.next();	
					if(PasswordS.equals(IDPS[1])){
						System.out.print("ȯ���մϴ� ");
						break;
					} else {
						System.out.print("�н����尡 Ʋ�Ƚ��ϴ� ");
						break;
					}
				}
				
			}
			if(s == null){
				System.out.println("�ش� ����� ���̵� �����ϴ�  ");
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
