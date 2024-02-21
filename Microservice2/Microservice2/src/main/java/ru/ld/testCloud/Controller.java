package ru.ld.testCloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceB")
public class Controller {

    @GetMapping
    public String get() {
        return "Hello2";
    }
}
