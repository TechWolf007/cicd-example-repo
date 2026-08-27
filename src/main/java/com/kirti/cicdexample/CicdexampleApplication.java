package com.kirti.cicdexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdexampleApplication.class, args);
	}

	@GetMapping
	public String sayHello(){
		return "Hello";
	}
}
//echo "# cicd-example-repo" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/TechWolf007/cicd-example-repo.git
//git push -u origin main