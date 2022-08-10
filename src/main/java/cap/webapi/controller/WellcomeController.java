package cap.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeController {
    @GetMapping
    public String wellcome(){
        return "Welcome to my spring boot web API";
    }
}
