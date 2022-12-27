package com.chu.Model;

public class ServerResponseModel {
	private String responseMessage;

	public ServerResponseModel(String msg) {
		setResponseMessage(msg);
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
}