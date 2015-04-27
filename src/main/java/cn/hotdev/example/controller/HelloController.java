package cn.hotdev.example.controller;

import cn.hotdev.example.model.Hello;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.LongAdder;

/**
 * Created by andy on 4/26/15.
 */
@RestController
public class HelloController {

    private static final String template = "Hello, %s!";
    private final LongAdder counter = new LongAdder();

    @RequestMapping(method = RequestMethod.GET, value = "/hello/{name}")
    public Hello hello(@PathVariable("name") String name,
                       @RequestParam(value = "msg", required = false, defaultValue = "Welcome!") String msg
    ) {
        counter.increment();
        return new Hello(counter.longValue(), String.format(template, name), msg);
    }
}
