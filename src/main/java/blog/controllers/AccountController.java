package blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/31.
 */
@Controller
@RequestMapping(value = "/account")
public class AccountController {
    @RequestMapping(value = "/index")
    public String Index() {
        return "account/index";
    }
    @RequestMapping(value = "/list")
    public String List() {
        return "account/list";
    }
}
