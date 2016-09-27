package Structures;

import java.util.Random;

public class Item implements Comparable<Item>{
	private Type type;
	private int indexI;
	private int indexJ;
	private int value;

	
	public Item(Type type,int indexI, int indexJ) {
		super();
		setType(type);
		this.indexI = indexI;
		this.indexJ = indexJ;
	}
	
	public int getIndexI() {
		return indexI;
	}

	public void setIndexI(int indexI) {
		this.indexI = indexI;
	}

	public int getIndexJ() {
		return indexJ;
	}

	public void setIndexJ(int indexJ) {
		this.indexJ = indexJ;
	}

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Type getType() {
		return type;
	}
	
	public void setType(Type type) {
		this.type = type;
		if (type == Type.fuel){
			setValue(randInt(10,100));
		}
		else if (type == Type.increaseTail){
			setValue(randInt(1,10));
		}
		else if (type == Type.shield || type == Type.turbo){
			setValue(randInt(5,20));
		}
	}
	
	public static enum Type {
		bomb(1), fuel(2), increaseTail(3), shield(4), turbo(5);
		private int value;
		private Type(int value) {
			this.value = value;
		}
	}
	private static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return this.type.compareTo(o.getType());
	}
}
