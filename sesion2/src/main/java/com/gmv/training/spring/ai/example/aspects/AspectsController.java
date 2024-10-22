package com.gmv.training.spring.ai.example.aspects;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/spring-aspects")
public class AspectsController {

	@Autowired
	private AspectsService aspectsService;
	
    @GetMapping("/without")
    public @ResponseBody String getHolaMundoWithoutAspect() {
    	System.out.println("Ejecutando metodo String getHolaMundoWithoutAspect()");
        return aspectsService.printHolaMundoWithoutAspect();
    }

	
	@LogMethodAnnotation
    @GetMapping("/with")
    public @ResponseBody String get() {
        return aspectsService.printHolaMundoWithAspect();
    }
}
