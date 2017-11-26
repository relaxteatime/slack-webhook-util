package com.relaxteatime.slack.webhook.util.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Slack WebHook Message Bean.<br>
 * Using Incoming WebHooks
 * @author relaxteatime
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestMessage {

	@JsonProperty("text")
	private String text;
	@JsonProperty("username")
	private String username;
	@JsonProperty("icon_emoji")
	private String iconEmoji;
	@JsonProperty("icon_url")
	private String iconUrl;
	@JsonProperty("link_names")
	private int linkNames=1;
	@JsonProperty("attachments")
	private List<RequestMessageAttachments> attachments;


	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getIconEmoji() {
		return iconEmoji;
	}
	public void setIconEmoji(String iconEmoji) {
		this.iconEmoji = iconEmoji;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public int getLinkNames() {
		return linkNames;
	}
	public void setLinkNames(int linkNames) {
		this.linkNames = linkNames;
	}
	public List<RequestMessageAttachments> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<RequestMessageAttachments> attachments) {
		this.attachments = attachments;
	}
	@Override
	public String toString() {
		return "RequestMessage [text=" + text + ", username=" + username + ", iconEmoji=" + iconEmoji + ", iconUrl="
				+ iconUrl + ", linkNames=" + linkNames + ", attachments=" + attachments + "]";
	}





}
