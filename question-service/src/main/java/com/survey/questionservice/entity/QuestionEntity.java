package com.survey.questionservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "question_table")
public class QuestionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int qId;

	@Column(name = "question1")
	private String question1;

	@Column(name = "question2")
	private String question2;
	@Column(name = "question3")
	private String question3;
	@Column(name = "question4")
	private String question4;
	@Column(name = "question5")
	private String question5;
	@Column(name = "question6")
	private String question6;

	public QuestionEntity(int qId, String question1, String question2, String question3, String question4,
			String question5, String question6) {
		super();
		this.qId = qId;
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.question4 = question4;
		this.question5 = question5;
		this.question6 = question6;
	}

	public QuestionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
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
		return "QuestionEntity [qId=" + qId + ", question1=" + question1 + ", question2=" + question2 + ", question3="
				+ question3 + ", question4=" + question4 + ", question5=" + question5 + ", question6=" + question6
				+ "]";
	}

}
