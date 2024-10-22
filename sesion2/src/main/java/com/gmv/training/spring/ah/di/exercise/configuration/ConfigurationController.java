package com.gmv.training.spring.ah.di.exercise.configuration;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/spring-configuration")
public class ConfigurationController {
	
	@Autowired
	private Engine engine;
	
	/**
	 * 
	 *  @Autowired
	 * 	@Qualifier("enginePlus")
	 *	private Engine enginePlus;
	 */
	
	
	@GetMapping()
	public @ResponseBody String get() {
		return "Moto de " + engine.getCilinders() + "cc con " + engine.getPistons() + " pistones";
	}
	
	@GetMapping("/engine-plus")
	public @ResponseBody String getEnginePlus() {
		return "TO_IMPLEMENT";
	}
	
}
