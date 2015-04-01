package DAOs;

public interface IDAO {
	public Object read(String fileName);
	public void write(Object object, String fileName);
}
