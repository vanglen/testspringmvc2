package blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/31.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {
    @RequestMapping(value = "index")
    public String Index() {
        return "index";
    }
}
