package entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CGangjwa extends CEntity{
	private static final long serialVersionUID = 1L;
	// Attributes
	private int[] ID;
	private String[] name;
	private int[] suganginwon;
	private String[] times;
	private int[] gyosuID;
	private int[] gwamokID;
	
	// setters & getters
	public int[] getID() {return ID;}
	public void setID(int[] iD2) {ID = iD2;}
	public String[] getName() {return name;}
	public void setName(String[] name) {this.name = name;}
	public int[] getSuganginwon() {return suganginwon;}
	public void setSuganginwon(int[] suganginwon) {this.suganginwon = suganginwon;}
	public String[] getTimes() {return times;}
	public void setTimes(String[] times) {this.times = times;}
	public int[] getGyosuID() {return gyosuID;}
	public void setGyosuID(int[] gyosuID) {this.gyosuID = gyosuID;}
	public int[] getGwamokID() {return gwamokID;}
	public void setGwamokID(int[] gwamokID) {this.gwamokID = gwamokID;}
	public static long getSerialversionuid() {return serialVersionUID;}
	
	@Override
	public void read() {
		int[] ID = new int[10];
		String[] name= new String[10];
		int[] gyosuID = new int[10];
		int[] suganginwon = new int[10];
		String[] times= new String[10];
		String line= null;
		try {
			FileReader in = new FileReader("gangjwa.txt");
			BufferedReader bin = new BufferedReader(in);
			
			for(int i = 0; (line = bin.readLine())!=null;i++){
				String[] s = line.split (" ");
				ID[i] = Integer.parseInt(s[0]);
				name[i] = s[1];
				gyosuID[i] = Integer.parseInt(s[2]);
				suganginwon[i] = Integer.parseInt(s[3]);
				times[i] = s[4];
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		setID(this.ID);
		setName(this.name);
		setGyosuID(this.gyosuID);
		setSuganginwon(this.suganginwon);
		setTimes(this.times);
		
	}
	@Override
	public void write(String fileName) {
		
		
		try {
			FileWriter out = new FileWriter("outgangjwa.txt");
			BufferedWriter bout = new BufferedWriter(out);
			
			int[] ID= this.getID();
			String[] name = this.getName();
			int[] gyosuID = this.getGyosuID();
			int[] suganginwon = this.getSuganginwon();
			String[] times = this.getTimes();
			
			
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		
	}
	
	
}

