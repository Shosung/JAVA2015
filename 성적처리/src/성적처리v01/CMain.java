package 己利贸府v01;

import view.CLoginView;
import DAOs.IDAO;
import DAOs.TextDAO;
import control.CLoginControl;


public class CMain {

	public static void main(String[] args){
		
		// create objects
		CLoginView loginView = new CLoginView();
		CLoginControl loginControl = new CLoginControl();
		IDAO dao = new TextDAO();
		
		// associates
		loginView.setControl(loginControl);
		loginControl.setDao(dao);
		
		// start login
		loginView.login();
		



	}
}
		

		
