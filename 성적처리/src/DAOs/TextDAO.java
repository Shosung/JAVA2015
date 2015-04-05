package DAOs;

import entity.CEntity;

public class TextDAO implements IDAO{
	
	@Override
	public Object read(String fileName) {
		return null;
	}

	@Override
	public void write(Object object, String fileName) {

		// TODO Auto-generated method stub
//		Field[] fields = object.getClass().getDeclaredFields();
		((CEntity) object).write(fileName);
	}

}
