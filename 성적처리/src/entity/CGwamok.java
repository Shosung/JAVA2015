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
			FileReader in = new FileReader("gangjwa.txt");
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
		setID(this.ID);
		setName(this.name);
		setHakjeom(this.hakjeom);
	}

	@Override
	public void write(String fileName) {
		try {
			FileWriter out = new FileWriter("outgangjwa.txt");
			for(int i =0; this.getID()[i]!=-1;i++){
				int Idata = this.ID[i];
				out.write(Idata+" ");
				String Sdata = this.name[i];
				out.write(Sdata+" ");
				Idata = this.hakjeom[i];
				out.write(Idata+" \n");
				
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		
	}

	
}
