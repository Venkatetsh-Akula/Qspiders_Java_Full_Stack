package org.jsp.app.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {
	@RequestMapping("/hello")
	public String Hello() {
		return "Hii Hello Wolrld";
	}
	@RequestMapping("/htmlpage")
	public String webpage() {
		String htmlcode="""
				<html>
					<head>
						<title>My First HTML page</title>
					</head>
					<body>
						<h1>Hello World web page in string format</h1>
					</body>
				</html>
				""";
		return htmlcode;
	}
	@RequestMapping("/jsphtmlpage")
	public String helloJsp() {
		return "helloWorld";
	}
}
