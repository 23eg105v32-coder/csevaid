package jar.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.dto.Sumdto;

@RestController
public class Sum {
    @PostMapping("/sum/{n}")
    Sumdto m1(@PathVariable int n) {
        int result = n*((n+1)/2);
        Sumdto x = new Sumdto();
        x.setNumber(5);
       x.setSumofN(result);
        return x;


    }

}
