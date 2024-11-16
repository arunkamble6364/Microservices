package com.main.output;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PostOfficeResponseBean {

	@JsonProperty("Message")
	private String message;

	@JsonProperty("Status")
	private String status;

	@JsonProperty("PostOffice")
	private List<PostOfficeDetailsBean> postOffice;

}
