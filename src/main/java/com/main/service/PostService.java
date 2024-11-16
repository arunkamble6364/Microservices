package com.main.service;

import com.main.output.PostOfficeResponseBean;

public interface PostService {
	
	public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String city);

}
