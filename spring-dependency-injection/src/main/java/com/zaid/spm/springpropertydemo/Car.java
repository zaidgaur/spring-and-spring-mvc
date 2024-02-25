package com.zaid.spm.springpropertydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class Car {
	@Value("fortuner")
	private String cName;
	@Autowired
	private Engine eng;
	public void move(){
		eng.starts();
		System.out.println(cName+"starts moving");
	}
	

}
