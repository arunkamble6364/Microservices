package com.main.output;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PostOfficeDetailsBean {

	@JsonProperty("Name")
	private String name;

	@JsonProperty("Description")
	private String description;

	@JsonProperty("BranchType")
	private String branchType;

	@JsonProperty("DeliveryStatus")
	private String deliveryStatus;

	@JsonProperty("Circle")
	private String circle;

	@JsonProperty("District")
	private String district;

	@JsonProperty("Division")
	private String division;

	@JsonProperty("Region")
	private String region;

	@JsonProperty("State")
	private String State;

	@JsonProperty("Country")
	private String Country;

	@JsonProperty("PinCode")
	private String PinCode;

}
