package my.board.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReplyController {
    @PostMapping("/reply/save")
    public String reply(String comment) {
        System.out.println("FDSFSDFSDF: " + comment);

        return "redirect:/";
    }
}
