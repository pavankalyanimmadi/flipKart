package com.pojo;

public class Mobile extends Product{
	private String name;
	private String model;
	private int ram;
	private int internalStorage;
	private String size;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", model=" + model + ", ram=" + ram + ", internalStorage=" + internalStorage
				+ ", size=" + size + ", getProductId()=" + getProductId() + ", getProductPrice()=" + getProductPrice()
				+ "]";
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getInternalStorage() {
		return internalStorage;
	}
	public void setInternalStorage(int internalStorage) {
		this.internalStorage = internalStorage;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	} 
	

}
