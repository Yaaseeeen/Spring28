package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonFilter("SomeBeanFilter")
//@JsonIgnoreProperties(value = {"field1","field2"})
public class SomeBean {

//	@JsonIgnore
	private String field1;
	
	private String field2;
	
	private String field3;

}
