package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.output.PostOfficeResponseBean;
import com.main.service.PostService;

@RestController
@RequestMapping("/postal")
public class PostDetailsController {
	
	@Autowired
	private PostService postService;

	@RequestMapping(value = "/byCity", method = RequestMethod.GET,
			consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public PostOfficeResponseBean getPostalByCity(@RequestParam String city) {

		PostOfficeResponseBean postResponse;
		postResponse = postService.fetchPostOfficeDetailsByCity(city);
		return postResponse;
	}

}
