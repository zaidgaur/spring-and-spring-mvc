package com.zaid.spm.springpropertydemo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Demo {
	private int id;
	private String name;
	public void m1(){
		System.out.println("m() method exxecute");
	}

}
