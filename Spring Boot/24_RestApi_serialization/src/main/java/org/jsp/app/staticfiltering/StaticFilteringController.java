package org.jsp.app.staticfiltering;

import java.util.Arrays;
import java.util.List;

import org.jsp.app.filterclasspackage.DemoClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticFilteringController {
	
	@GetMapping("/static-filtering")
	public DemoClass filteringMethod() {
		return new DemoClass("value1","value2","value3");
	}
	
	@GetMapping("/static-filtering-list")
	public List<DemoClass> filteringListMethod() {
		return Arrays.asList(new DemoClass("value1","value2","value3"),
							new DemoClass("value4","value5","value6")) ;
	}
}
