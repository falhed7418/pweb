package sidep.pweb.mvc.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ForPebbleController {

    @RequestMapping(method=GET)
    public String index(Model model) {
        model.addAttribute("today", new java.util.Date());
        return "index";
    }
    
}
