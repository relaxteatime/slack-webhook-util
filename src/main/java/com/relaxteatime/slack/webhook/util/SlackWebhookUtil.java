package com.relaxteatime.slack.webhook.util;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.relaxteatime.slack.webhook.util.bean.RequestMessage;

public class SlackWebhookUtil {

	private String webhookURL;
	private static ObjectMapper mapper = new ObjectMapper();
	private static Client client = ClientBuilder.newBuilder().build();

	/**
	 *
	 * @param url WebHook URL. ex. https://hooks.slack.com/services/xxxxxxx/yyyyyyyy/zzzzzzzzzzzzzz
	 */
	public SlackWebhookUtil(String url) {
		webhookURL = url;
	}

	public String sendMessage(String text) throws JsonProcessingException {
		RequestMessage message = new RequestMessage();
		message.setText(text);

		return sendMessage(message);
	}

	public String sendMessage(RequestMessage message) throws JsonProcessingException {
		return sendSlack(mapper.writeValueAsString(message));
	}

	private String sendSlack(String requestMessage) {
		WebTarget target = client.target(webhookURL);
		Entity<Form> entity = Entity.entity(new Form().param("payload", requestMessage),
			    MediaType.APPLICATION_FORM_URLENCODED_TYPE);

		return target.request().post(entity,String.class);

	}


}
