package com.example.demo.app;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	//database
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public SampleController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//pass data to html
	@GetMapping("/test")
	public String test(Model model) {
		
		//sql query
		String sql = "SELECT id, name, email FROM inquiry WHERE id = 1";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql);
		
		//pass variables to html
		model.addAttribute("title", "Sample Page");
		model.addAttribute("name", map.get("name"));
		model.addAttribute("email", map.get("email"));
		
		//return the file name of html
		return "test";
	}

}
