package com.chu.Controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chu.Model.ChatClientModel;
import com.chu.Model.ServerResponseModel;


public class CharRoomController {
	@MessageMapping("/messageControl")
	@SendTo("topic/getResponse")
		public ServerResponseModel said(ChatClientModel responseMessage) throws InterruptedException{
			Thread.sleep(3000);
			return new ServerResponseModel("歡迎來到," + responseMessage.getClientname());
	}
	
	@RequestMapping("/index")
	public String login() {
		return "index";
	}

}
