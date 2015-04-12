package DAOs;

import java.io.FileNotFoundException;
import java.io.IOException;

import entity.CEntity;

public interface IDAO {
	public void connect(String name) throws FileNotFoundException;
	public CEntity read();
	public void write(CEntity entity);
	public void disconnect() throws IOException;
}
