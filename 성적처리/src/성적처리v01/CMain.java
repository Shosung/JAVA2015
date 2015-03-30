package 성적처리v01;

import java.io.IOException;

import DAOs.CGangjwaDAO;
import DAOs.CGwamokDAO;
import DAOs.CMemberDAO;
import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CMember;
import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;


public class CMain {

	public static void main(String[] args) throws IOException {
		// Login
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();
		CLoginControl loginControl = new CLoginControl();
		member = loginControl.login(member);
		CMemberDAO memberDAO = new CMemberDAO();
		memberDAO.write(member);
		
		// 과목개설
		@SuppressWarnings("unused")
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = CGwamokView.getGwamok();
		CGwamokControl gwamokControl = new CGwamokControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		CGwamokDAO gwamokDAO = new CGwamokDAO() ; 
		gwamokDAO.write(gwamok);
		// 강좌개설
		@SuppressWarnings("unused")
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = CGangjwaView.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
		CGangjwaDAO gangjwaDAO = new CGangjwaDAO() ; 
		gangjwaDAO.write(gangjwa);
	}
}
		

		
