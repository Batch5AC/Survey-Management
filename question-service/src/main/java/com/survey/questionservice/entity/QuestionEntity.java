package com.survey.questionservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="question_table")
public class QuestionEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="question_id")
	private int  qId;
	
	
	@Column(name="question")
    private String question;


	public QuestionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public QuestionEntity(int qId, String question) {
		super();
		this.qId = qId;
		this.question = question;
	}


	@Override
	public String toString() {
		return "QuestionEntity [qId=" + qId + ", question=" + question + "]";
	}


	public int getqId() {
		return qId;
	}


	public void setqId(int qId) {
		this.qId = qId;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}

}
