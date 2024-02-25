package com.zaid.spm.object_injectiondemo;

public class EngineFactory {
	public static Engine createEngine(String type){
		if (type.equals("power")) {
			Engine engine=new PowerEngine();
			engine.setEName("power Engine");
			return engine;
			
		} else {
			Engine engine=new TurboEngine();
			engine.setEName("turbo engine");
			return engine;

		}
	}

}
