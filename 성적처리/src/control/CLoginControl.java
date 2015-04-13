package control;

import java.io.FileNotFoundException;

import entity.CLoginInfo;
import entity.CLoginInfo.ELoginResult;

public class CLoginControl extends CControl {

	public CLoginInfo login(CLoginInfo loginInfo) {
		CLoginInfo loginInfoDAO = new CLoginInfo();
		try {
			this.getDao().connect("member.txt");
			while(loginInfo.geteLoginResult().equals(ELoginResult.error)){
				if(loginInfoDAO.getUserID().equals(loginInfo.getUserID())){
					if(loginInfoDAO.getPassword().equals(loginInfo.getPassword())){
						loginInfo.seteLoginResult(ELoginResult.succees);
						break;
					} else {
						loginInfo.seteLoginResult(ELoginResult.passwordError);
						break;
					}
				
				}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return loginInfo;
	}
}
