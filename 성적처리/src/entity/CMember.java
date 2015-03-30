package entity;

import java.io.Serializable;

// Entity class or Value class
public class CMember implements Serializable{
	// attributes
	private String userID;
	private String password;
	// setters & getters
	public String getUserID() {return userID;}
	public void setUserID(String userID) {this.userID = userID;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}

}
