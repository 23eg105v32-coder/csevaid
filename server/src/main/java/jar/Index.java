package jar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.dto.R;

@RestController
public class Index {

    @GetMapping("/")
    String index() {
        return "welcome to spring boot ...!";
    }

    @PostMapping("/dto")
    R m1() {
        return new R();
    }
}
