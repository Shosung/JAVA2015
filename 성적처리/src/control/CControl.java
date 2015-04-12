package control;

import java.io.FileNotFoundException;

import DAOs.IDAO;
import entity.CEntity;

public class CControl {
	// association
	private IDAO dao;
	public IDAO getDao() {return dao;}
	public void setDao(IDAO dao) {this.dao = dao;};

	public CEntity login(CEntity entity) throws FileNotFoundException{
		return entity;
	}

	
	
}
