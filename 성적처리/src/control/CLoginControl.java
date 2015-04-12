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
						System.out.println("환영합니다.");
						break;
					}else{
						System.out.println("비밀번호가 틀렸습니다.");
						break;
					}
				}
			}
			if(scanner.next()!= null){
				System.out.println("존재하지 않는 ID입니다.");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loginInfo;
	}
}
