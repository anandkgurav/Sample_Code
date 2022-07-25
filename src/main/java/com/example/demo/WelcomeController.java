package com.example.demo;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class WelcomeController {
Logger logger=LoggerFactory.getLogger(WelcomeController.class); 	
	
@GetMapping("/welcome")
public String welcome()
{
    logger.error("not error ouucrance");
	return "hello team";

}

@PostMapping("/welcome1")
public String welCome()
{
    logger.error("not error ouucrance");
	return "hello team";

	
}


}
	