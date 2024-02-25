package com.zaid.spm.object_injectiondemo;

import lombok.Data;

@Data
public class Car {
	private String cName;
	private Engine eng;
	public void move(){
		eng.engine();
		System.out.println(cName+" starts moving");
	}
	

}
