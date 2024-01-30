package no.ignite.githubActionsCourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionsCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsCourseApplication.class, args);
		String text = "HÆLLÆ WORLD";
		System.out.println(text);
	}

}
