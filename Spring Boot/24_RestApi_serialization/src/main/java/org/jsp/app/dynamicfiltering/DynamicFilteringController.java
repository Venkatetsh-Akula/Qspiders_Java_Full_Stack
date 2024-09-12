package org.jsp.app.dynamicfiltering;

import java.util.Arrays;
import java.util.List;

import org.jsp.app.filterclasspackage.DemoClass;
import org.jsp.app.filterclasspackage.DynamicFilteringDemoClass;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class DynamicFilteringController {
	@GetMapping("/dynamic-filtering")
	public MappingJacksonValue filteringMethod() {
		DynamicFilteringDemoClass df=new DynamicFilteringDemoClass("value1","value2","value3");
		MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(df);
		SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
		
		FilterProvider filters=new SimpleFilterProvider().addFilter("SomeBeanFilter", (BeanPropertyFilter) filters);
		mappingJacksonValue.setFilters(filters);
		
		return mappingJacksonValue;
	}
	
//	@GetMapping("/dynamic-filtering-list")
//	public List<MappingJacksonValue> filteringListMethod() {
//		List<MappingJacksonValue> mappingJacksonValueli=new MappingJacksonValue(Arrays.asList(new DynamicFilteringDemoClass("value1","value2","value3"),
//				new DynamicFilteringDemoClass("value4","value5","value6"))) ;
//		return mappingJacksonValueli;
//	}
}
