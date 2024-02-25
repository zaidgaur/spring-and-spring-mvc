package com.zaid.spm.springpropertydemo;

import lombok.Data;

@Data
public class TurboEngine implements Engine{
	private String teName;

	public void starts() {
	  System.out.println(teName+"starts");
		
	}
	

}
