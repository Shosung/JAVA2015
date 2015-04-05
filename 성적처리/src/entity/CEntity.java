package entity;

import java.io.Serializable;

abstract public class CEntity implements Serializable{
	public abstract void read();
	public abstract void write(String fileName);
}