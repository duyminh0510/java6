package asm.java6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LienHeController {
    @RequestMapping("/lienhe")
    public String requestMethodName(@RequestParam String param) {
        return "views/lienhe";
    }

}
