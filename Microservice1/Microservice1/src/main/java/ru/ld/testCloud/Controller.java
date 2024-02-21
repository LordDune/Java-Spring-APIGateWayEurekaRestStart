package ru.ld.testCloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceA")
public class Controller {

    @GetMapping
    public String get() {
        return "Hello";
    }
}
