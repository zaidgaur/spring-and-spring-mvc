package com.zaid.spm.object_injectiondemo;

import lombok.Data;

@Data
public class Engine {
	String eName;
	public void engine(){ 
		System.out.println(eName+" engine starts");
	}

}
