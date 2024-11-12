package logicaswiss.springframework.springsecurityoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class SpringSecurityOauth2Application {

	@GetMapping("/")
	public String message(Principal principal) {
		return "hi "+principal.getName();
	}

	@GetMapping("/home")
	public String home(Principal principal) {
		return "hi "+principal.getName();
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOauth2Application.class, args);
	}

}
