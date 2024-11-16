package com.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.main.output.PostOfficeDetailsBean;
import com.main.output.PostOfficeResponseBean;
import com.main.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public PostOfficeResponseBean fetchPostOfficeDetailsByCity(String cityValue) {
		// TODO Auto-generated method stub

		String url = "https://api.postalpincode.in/postoffice/{city}";
		url = url.replace("{city}", cityValue);
		System.out.println("URL is :" + url);

		ResponseEntity<PostOfficeResponseBean[]> postResponseEntity = restTemplate.getForEntity(url,
				PostOfficeResponseBean[].class);

		System.out.println("Response status code is :" + postResponseEntity.getStatusCodeValue());

		PostOfficeResponseBean[] resposneBeanArray = postResponseEntity.getBody();

		for (PostOfficeResponseBean responseBean : resposneBeanArray) {
			List<PostOfficeDetailsBean> postOfficeDetailsBeans = responseBean.getPostOffice();
			for (PostOfficeDetailsBean pob : postOfficeDetailsBeans) {
				System.out.println(pob.getName() + " " + pob.getCountry() + " " + pob.getPinCode());
			}
		}

		return resposneBeanArray[0];
	}

}
