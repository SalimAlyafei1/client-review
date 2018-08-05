package com.sogeti.clientreview.documents;

import java.util.ArrayList;


public class Question {
	
	private String question;
	
	private ArrayList<String> multipleChoseAnswer;
	
	public Question()
	{
		this.multipleChoseAnswer = new ArrayList<String>();
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public ArrayList<String> getMultipleChoseAnswer() {
		return multipleChoseAnswer;
	}

	public void setMultipleChoseAnswer(ArrayList<String> multipleChoseAnswer) {
		this.multipleChoseAnswer = multipleChoseAnswer;
	}

	
	
	

}
