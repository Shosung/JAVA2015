package view;

import java.util.Scanner;

import control.CGwamokControl;
import entity.VGwamok;
import entity.VUser;

public class CGwamokView extends CView {

	public void getGwamok(VUser vUser) {
		Scanner scanner = new Scanner(System.in);
		VGwamok vGwamok = ((CGwamokControl) getControl()).login(vUser);
		System.out.println(vGwamok.getID1()+ " " + vGwamok.getID2());
	}


}
