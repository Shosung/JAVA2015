package control;

import java.io.FileNotFoundException;

import entity.CLoginInfo;
import entity.CLoginInfo.ELoginResult;

public class CLoginControl extends CControl {

	public CLoginInfo login(CLoginInfo loginInfo) {
		try {
			CLoginInfo loginInfoDAO;
			this.getDao().connect("member.txt");
			while (true) {
				CLoginInfo logininfoDAO = (CLoginInfo) this.getDao().read();
				if(logininfoDAO.getUserID() == loginInfo.getUserID()) {
					if(logininfoDAO.getPassword() == loginInfo.getPassword()){
						loginInfo.seteLoginResult(ELoginResult.succees);
					}
				}
			}
			this.getDao().disconnect();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loginInfo;
	}
}
