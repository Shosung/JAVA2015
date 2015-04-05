package view;

import entity.CEntity;
import entity.CGangjwa;

public class CGangjwaView {

	public CEntity getGangjwa() {
		// TODO Auto-generated method stub
		CEntity gangjwa = new CGangjwa();
		gangjwa.read();
		
		return gangjwa;
		
	}

}
