package com.survey.questionservice.Pojo;

public class QuestionPojo {
 private int qid;
 private String question;
public QuestionPojo() {
	super();
	// TODO Auto-generated constructor stub
}
public QuestionPojo(int qid, String question) {
	super();
	this.qid = qid;
	this.question = question;
}
@Override
public String toString() {
	return "QuestionPojo [qid=" + qid + ", question=" + question + "]";
}
public int getQid() {
	return qid;
}
public void setQid(int qid) {
	this.qid = qid;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
 
 
}
