package com.rest.services.util;

import java.io.Serializable;
import java.util.List;

public class RestObject<T> implements  Serializable {

	private Integer responseCode;
	private String responseDesc;
	private T responseData;
	private List<T> responseList;
	
	
	public RestObject(T responseData, Integer status, String responseDesc)
	{
		this.responseData = responseData;
		this.responseCode = status;
		this.responseDesc = responseDesc;
	}
	
	
	public RestObject(List<T> responseList, Integer status, String responseDesc)
	{
		this.responseList = responseList;
		this.responseCode = status;
		this.responseDesc = responseDesc;
	}
	/**
	 * @return the responseCode
	 */
	public Integer getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	/**
	 * @return the responseDesc
	 */
	public String getResponseDesc() {
		return responseDesc;
	}
	/**
	 * @param responseDesc the responseDesc to set
	 */
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}
	/**
	 * @return the responseDate
	 */
	public T getResponseData() {
		return responseData;
	}
	/**
	 * @param responseDate the responseDate to set
	 */
	public void setResponseData(T responseData) {
		this.responseData = responseData;
	}
	/**
	 * @return the responseList
	 */
	public List<T> getResponseList() {
		return responseList;
	}
	/**
	 * @param responseList the responseList to set
	 */
	public void setResponseList(List<T> responseList) {
		this.responseList = responseList;
	}
	
	
	
	
}
