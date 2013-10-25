package lv.intrade.cp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 13.25.10
 * Time: 00:19
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value="/customer")
public class CustomerNavigation {
    @RequestMapping(value="/")
    public ModelAndView getUserHome(){
        return new ModelAndView("customer/index");
    }
}
