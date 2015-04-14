package entity;

import java.util.Scanner;

public class CGwamok extends CEntity {
	
	private static final long serialVersionUID = 1L;
	
	// Attributes
	private String ID1;
	private String ID2;
	private String name;
	private int hakjeom;
	
	// setters & getters
	public String getID1() {return ID1;}
	public void setID1(String iD1) {ID1 = iD1;}
	public String getID2() {return ID2;}
	public void setID2(String iD2) {ID2 = iD2;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getHakjeom() {return hakjeom;}
	public void setHakjeom(int hakjeom) {this.hakjeom = hakjeom;}
	@Override
	public void read(Scanner scanner) {
		// TODO Auto-generated method stub
		name = scanner.next();
		ID1 = scanner.next();
		ID2 = scanner.next();
	}
	@Override
	public void write(Scanner scanner) {
		
	}
	
}
