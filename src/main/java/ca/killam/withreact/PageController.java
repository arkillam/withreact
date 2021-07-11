package ca.killam.withreact;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Serves up JSP pages.
 * 
 * @author arkillam@gmail.com
 */

@Controller
public class PageController {

/** should always have logging :) */
private Logger logger = LoggerFactory.getLogger(PageController.class);

/**
 * injecting a string just for the sake of doing so; this is passed through and
 * displayed on the index JSP
 */
@Value("${me.message}")
private String message;

@RequestMapping("/")
public String homepage(Model model) {
	logger.debug(message);
	model.addAttribute("message", message);
	return "index";
}

}
