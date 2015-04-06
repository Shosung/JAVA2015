package control;

import DAOs.IDAO;
import entity.CEntity;

public class CControl {
	// association
	private IDAO dao;
	public IDAO getDao() {return dao;}
	public void setDao(IDAO dao) {this.dao = dao;};

	public void process() {
//		dao.read(0, fileName);
	}
	public CEntity process(CEntity entity) {
		// TODO Auto-generated method stub
		entity = dao.read(entity, "member.txt");
		return entity;
	}
	
	
	
}
