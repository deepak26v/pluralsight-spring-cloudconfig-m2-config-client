package pluralsight.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RateController {

    @Value("${rate}")
    String rateamount;

    @Value("${lanecount}")
    String lanes;

    @Value("${tollstart}")
    String tollstart;

    @RequestMapping(value = "/rate", method = RequestMethod.GET)
    public String getRate(Model m) {
        m.addAttribute("rateamount", rateamount);
        m.addAttribute("lanes", lanes);
        m.addAttribute("tollstart", tollstart);

        //return the view name
        return "rateview";
    }
}
