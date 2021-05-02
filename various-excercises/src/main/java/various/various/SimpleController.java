package various.various;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello!";
    }
}
