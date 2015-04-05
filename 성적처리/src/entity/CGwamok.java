package entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CGwamok extends CEntity {
	
	private static final long serialVersionUID = 1L;
	// Attributes
	private int[] ID;
	private String[] name;
	private int[] hakjeom;
	
	
	// setters & getters
	public int[] getID() {return ID;}
	public void setID(int[] iD) {ID = iD;}
	public String[] getName() {return name;}
	public void setName(String[] name) {this.name = name;}
	public int[] getHakjeom() {return hakjeom;}
	public void setHakjeom(int[] hakjeom) {this.hakjeom = hakjeom;}
	public static long getSerialversionuid() {return serialVersionUID;}
	
	@Override
	public void read() {
		int[] ID = new int[10];
		String[] name= new String[10];
		int[] hakjeom = new int[10];
		String line;
		try {
			FileReader in = new FileReader("gwamok.txt");
			BufferedReader bin = new BufferedReader(in);
			
			for(int i = 0; (line = bin.readLine())!=null;i++){
				String[] s = line.split (" ");
				ID[i] = Integer.parseInt(s[0]);
				name[i] = s[1];
				hakjeom[i] =  Integer.parseInt(s[2]);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setID(ID);
		setName(name);
		setHakjeom(hakjeom);
	}

	@Override
	public void write(String fileName) {
		try {
			FileWriter out = new FileWriter("outgwamok.txt");
			
			int[] ID= this.getID();
			String[] name = this.getName();
			int[] hakjeom = this.getHakjeom();
			String line = new String();
			for(int i = 0; (line = name[i]) != null; i++){
				line = ID[i] + " ";
				out.write(line);
				line = name[i] + " ";
				out.write(line);
				line = hakjeom[i] + "\n";
				out.write(line);
				
			}
			
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
