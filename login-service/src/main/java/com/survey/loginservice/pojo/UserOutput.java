package com.survey.loginservice.pojo;

public class UserOutput {
	private int id;
	private String username;
	private String password;
	private QuestionPojo questionPojo;

	public UserOutput() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserOutput(int id, String username, String password, QuestionPojo questionPojo) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.questionPojo = questionPojo;
	}

	@Override
	public String toString() {
		return "UserOutput [id=" + id + ", username=" + username + ", password=" + password + ", questionPojo="
				+ questionPojo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public QuestionPojo getQuestionPojo() {
		return questionPojo;
	}

	public void setQuestionPojo(QuestionPojo questionPojo) {
		this.questionPojo = questionPojo;
	}

}
