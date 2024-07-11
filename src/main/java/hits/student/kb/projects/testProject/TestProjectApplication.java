package hits.student.kb.projects.testProject;

import hits.student.kb.projects.testProject.impl.HelloWorldConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(HelloWorldConfiguration.class)
public class TestProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}
}
