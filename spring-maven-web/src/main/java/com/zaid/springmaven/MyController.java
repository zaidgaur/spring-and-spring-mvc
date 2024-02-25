package com.zaid.springmaven;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@RequestMapping
//@Component
@Controller												
public class MyController {
	
 @RequestMapping("/link1")
	
	public ModelAndView m1(){
		return new ModelAndView("rsp1.jsp","msg","login successfull");
	}
	@RequestMapping("/link2")
		public ModelAndView m2(){
		return new ModelAndView("rsp2.jsp","msg","login failed");
		}

}
