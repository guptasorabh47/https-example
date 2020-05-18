package ie.nenagh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @GetMapping("/hello")
    public String hello_Https() {
        return "Working with https on localhost!!!";
    }
}
