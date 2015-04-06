package 己利贸府v01;

import java.io.IOException;

import view.CLoginView;
import DAOs.IDAO;
import DAOs.ObjectDAO;
import control.CLoginControl;
import entity.CMember;


public class CMain {

	public static void main(String[] args) throws IOException {
		
		// 肺弊牢
		CLoginView loginView = new CLoginView();
		CMember member = (CMember) loginView.login();
		CLoginControl loginControl = new CLoginControl();
		member = loginControl.login(member);
		IDAO memberDAO = new ObjectDAO();
//		memberDAO.write(member, "member");
//		CMember member = new CMember();
		member = (CMember) memberDAO.read(member, "member.txt");


	}
}
		

		
