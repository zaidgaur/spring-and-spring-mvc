package com.zaid.spm.sp_aw_bpMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class A {
	@Autowired
	B b;
	public void m1(){
		b.m2();
		System.out.println("m1() of A using basepackage");
	}
	

}
