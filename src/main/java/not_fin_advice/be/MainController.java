package not_fin_advice.be;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("/")
  public String index() {
    return "Greetings from Spring Boot!";
  }

}