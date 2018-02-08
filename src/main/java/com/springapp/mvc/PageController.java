package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


//School Management Starts
@Controller
@RequestMapping("/")
public class PageController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
        return "Index";
	}
}
