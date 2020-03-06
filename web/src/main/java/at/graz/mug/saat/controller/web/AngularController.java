package at.graz.mug.saat.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class AngularController {
    @GetMapping
    public String home() {
        return "forward:/index.html";
    }
}
