package com.gmv.training.spring.aj.exercise.aspects;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping("/spring-aspects-exercise")
public class AspectsLogController {
	
	// add annotation here
    @GetMapping()
    public @ResponseBody String get() {
        return "Hola mundo";
    }
}
