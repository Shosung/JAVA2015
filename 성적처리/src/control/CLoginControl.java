package control;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import entity.CLoginInfo;

public class CLoginControl extends CControl {

	public CLoginInfo login(CLoginInfo loginInfo) {
	
		try {
			
			Scanner scanner = new Scanner((Readable) this.getDao().connect("member.txt"));
			while(true){
				if(CLoginInfo.getUserID().equals(scanner.next())){
					if(CLoginInfo.getPassword().equals(scanner.next())){
						System.out.println("ȯ���մϴ�.");
						break;
					}else{
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						break;
					}
				}
			}
			if(scanner.next()!= null){
				System.out.println("�������� �ʴ� ID�Դϴ�.");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loginInfo;
	}
}
