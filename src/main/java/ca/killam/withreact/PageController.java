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

/** the injected string displayed on the message page */
@Value("${me.message}")
private String message;

/**
 * Returns a page that displays the message injected from application.yml
 * 
 * @param model
 * 
 * @return
 */
@RequestMapping("/message")
public String message(Model model) {
	logger.debug(message);
	model.addAttribute("message", message);
	return "message";
}

}
