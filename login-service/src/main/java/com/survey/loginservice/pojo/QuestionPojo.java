package com.survey.loginservice.pojo;

public class QuestionPojo {

	private int qid;

	private String question1;

	private String question2;

	private String question3;

	private String question4;

	private String question5;

	private String question6;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuestion1() {
		return question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	public String getQuestion2() {
		return question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}

	public String getQuestion3() {
		return question3;
	}

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}

	public String getQuestion4() {
		return question4;
	}

	public void setQuestion4(String question4) {
		this.question4 = question4;
	}

	public String getQuestion5() {
		return question5;
	}

	public void setQuestion5(String question5) {
		this.question5 = question5;
	}

	public String getQuestion6() {
		return question6;
	}

	public void setQuestion6(String question6) {
		this.question6 = question6;
	}

	@Override
	public String toString() {
		return "QuestionPojo [qid=" + qid + ", question1=" + question1 + ", question2=" + question2 + ", question3="
				+ question3 + ", question4=" + question4 + ", question5=" + question5 + ", question6=" + question6
				+ "]";
	}

	public QuestionPojo(int qid, String question1, String question2, String question3, String question4,
			String question5, String question6) {
		super();
		this.qid = qid;
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.question4 = question4;
		this.question5 = question5;
		this.question6 = question6;
	}

	public QuestionPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
