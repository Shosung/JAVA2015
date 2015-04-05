package entity;

import java.io.Serializable;

abstract public class CEntity implements Serializable{
	public abstract void read();
	public void write(String fileName){};
}