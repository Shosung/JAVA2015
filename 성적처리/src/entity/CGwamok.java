package entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CGwamok extends CEntity {
	
	private static final long serialVersionUID = 1L;
	// Attributes
	private int ID;
	private String name;
	private int hakjeom;
	
	
	// setters & getters
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getHakjeom() {return hakjeom;}
	public void setHakjeom(int hakjeom) {this.hakjeom = hakjeom;}
	public static long getSerialversionuid() {return serialVersionUID;}
	
	@Override
	public void read(Scanner scanner) {
		
	}

	@Override
	public void write() {}

	
}
