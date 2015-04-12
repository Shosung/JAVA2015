package entity;

import java.io.Serializable;
import java.util.Scanner;

// Entity class or Value class
public class CLoginInfo extends CEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	// attributes
	public static enum ELoginResult { succees, idError, passwordError, error };
	private ELoginResult eLoginResult;

	private static String userID;
	private static String password;
	
	// setters & getters
	public static String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public static String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public ELoginResult geteLoginResult() {return eLoginResult;}
	public void seteLoginResult(ELoginResult eLoginResult) {this.eLoginResult = eLoginResult;}
	
	public void read(Scanner scanner){
		userID = scanner.next();
		password = scanner.next();
	};
	public void write(){};
//	@Override
//	public void read() {
//		String[] userID = new String[10];
//		String[] password= new String[10];
//		String line;
//		try {
//			FileReader in = new FileReader("member.txt");
//			BufferedReader buffer = new BufferedReader(in);
//			
//			for(int i = 0; (line = buffer.readLine())!=null;i++){
//				String[] s = line.split (" ");
//				userID[i] = s[0];
//				password[i] = s[1];
//			}
//			in.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		setUserID(userID);
//		setPassword(password);
//	}
//
//	@Override
//	public void write(String fileName) {
//		try {
//			FileWriter out = new FileWriter("outmember.txt");
//			
//			String[] userID = this.getUserID();
//			String[] password = this.getPassword();
//			String line = new String();
//			for(int i = 0; (line = userID[i]) != null; i++){
//				line = userID[i] + " ";
//				out.write(line);
//				line = password[i] + "\n";
//				out.write(line);
//			}
//			
//			out.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		// TODO Auto-generated method stub
		
}

