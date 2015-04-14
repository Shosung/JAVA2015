package main;


import view.CGwamokView;
import view.CLoginView;
import view.CView;
import DAOs.IDAO;
import DAOs.TextDAO;
import control.CControl;
import control.CGwamokControl;
import control.CLoginControl;


public class CMain {

	public static void main(String[] args) {

		// create objects

		// view
		CLoginView loginView = new CLoginView();
		CGwamokView gwamokView = new CGwamokView();
		
		// control
		CLoginControl loginControl = new CLoginControl();
		CGwamokControl gwamokControl = new CGwamokControl();
		
		// DAO
		IDAO dao = new TextDAO();

		//association
		loginView.setControl(loginControl);
		loginControl.setDao(dao);
		gwamokView.setControl(gwamokControl);
		gwamokControl.setDao(dao);
		
		//start program
		gwamokView.getGwamok(loginView.login());

		

	}	
}
