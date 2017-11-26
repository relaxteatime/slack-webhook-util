package com.relaxteatime.slack.webhook.util.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Slack WebHook Message Attachments Bean.<br>
 * Using Incoming WebHooks
 * @author relaxteatime
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestMessageAttachments {

	@JsonProperty("title")
	private String title;
	@JsonProperty("title_link")
	private String titleLink;
	@JsonProperty("image_url")
	private String imageURL;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitleLink() {
		return titleLink;
	}
	public void setTitleLink(String titleLink) {
		this.titleLink = titleLink;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	@Override
	public String toString() {
		return "RequestMessageAttachments [title=" + title + ", titleLink=" + titleLink + ", imageURL=" + imageURL
				+ "]";
	}






}
