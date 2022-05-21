package org.phone;

public class InternalStorage {
	public void ramSize() {
		System.out.println("Ram size is : 8GB");
		
	}
	public static void main(String[] args) {
		InternalStorage i = new InternalStorage();
		i.ramSize();
		ExternalStorage e = new ExternalStorage();
		e.size();
		
	}

}
