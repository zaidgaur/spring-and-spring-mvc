package com.zaid.spm.springpropertydemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class PowerEngine implements Engine{
	@Value("four cylinder engine ")
	private String peName;

	public void starts() {
	  System.out.println(peName+"starts");
		
	}
	

}
