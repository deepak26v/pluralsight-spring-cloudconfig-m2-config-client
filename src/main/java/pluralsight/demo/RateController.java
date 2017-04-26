package pluralsight.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RefreshScope
public class RateController {

    @Value("${rate}")
    String rateamount;

    @Value("${lanecount}")
    String lanes;

    @Value("${tollstart}")
    String tollstart;

    @Value("${connstring}")
    String connstring;

    @RequestMapping(value = "/rate", method = RequestMethod.GET)
    public String getRate(Model m) {
        m.addAttribute("rateamount", rateamount);
        m.addAttribute("lanes", lanes);
        m.addAttribute("tollstart", tollstart);
        m.addAttribute("connstring", connstring);

        //return the view name
        return "rateview";
    }
}
