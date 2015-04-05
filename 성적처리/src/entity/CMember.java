package entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Entity class or Value class
public class CMember extends CEntity{
	// attributes
	private String[] userID;
	private String[] password;
	
	// setters & getters
	public String[] getUserID() {return userID;}
	public void setUserID(String[] userID) {this.userID = userID;}
	public String[] getPassword() {return password;}
	public void setPassword(String[] password) {this.password = password;}
	
	@Override
	public void read() {
		String[] userID = new String[10];
		String[] password= new String[10];
		String line;
		try {
			FileReader in = new FileReader("member.txt");
			BufferedReader buffer = new BufferedReader(in);
			
			for(int i = 0; (line = buffer.readLine())!=null;i++){
				String[] s = line.split (" ");
				userID[i] = s[0];
				password[i] = s[1];
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setUserID(this.userID);
		setPassword(this.password);
	}

	@Override
	public void write(String fileName) {
		try {
			FileWriter out = new FileWriter("outmember.txt");
			for(int i =0; getUserID()[i]!=null;i++){
				String Sdata = this.userID[i];
				out.write(Sdata+" ");
				Sdata = this.password[i];
				out.write(Sdata+"\n");
				
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		
	}
}
