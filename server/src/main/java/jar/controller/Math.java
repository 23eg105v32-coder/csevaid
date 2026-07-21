package jar.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Math {

    @GetMapping("/api/{n}")
    Map<Object, Object> m1(@PathVariable int n) {
        Map<Object, Object> m = new HashMap<>();
        m.put("msg", "maths api ..");
        m.put("status", 200);
        List<Object> l = new ArrayList<>();
        l.add(0);
        l.add(1);
        for (int i = 2; i <= n; i++) {
            l.add(new Math().fib(i));
        }
        m.put("fibonnaci", l);

        return m;

    }

    int fib(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
