package ca.killam.withreact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arkillam@gmail.com
 */

@RestController
@RequestMapping("/api")
public class RESTController {

/**
 * Full path is /api/hello ... returns "Hello, world!"
 * 
 * @return
 */
@GetMapping("/hello")
public String hello() {
	return "Hello, world!";
}

}
