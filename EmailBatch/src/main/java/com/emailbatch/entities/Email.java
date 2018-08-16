package com.emailbatch.entities;

public class Email {

	private String id;
	private String emailId;
	private String created;
	private String postName;
	private String group;
	private String status;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Email(String id, String emailId, String date, String postName) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.created = date;
		this.postName = postName;
	}

	public Email() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return created;
	}

	public void setDate(String date) {
		this.created = date;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	@Override
	public String toString() {
		return "Email [id=" + id + ", emailId=" + emailId + ", date=" + created + ", postName=" + postName + "]";
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
