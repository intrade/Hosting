package lv.intrade.cp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 13.25.10
 * Time: 00:18
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class LinkNavigation {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getLoginPage(){
        return new ModelAndView("index");
    }

}
