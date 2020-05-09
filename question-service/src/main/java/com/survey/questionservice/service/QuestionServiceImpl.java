package com.survey.questionservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.questionservice.Pojo.QuestionPojo;
import com.survey.questionservice.dao.QuestionDao;
import com.survey.questionservice.entity.QuestionEntity;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionDao queDao;

	@Override
	// Returning the questions using this method
	public QuestionPojo getQuestions() {
		// TODO Auto-generated method stub

		Optional result = queDao.findById(1);
		System.out.println(result);
		if (result.isPresent()) {
			QuestionEntity queEntity = (QuestionEntity) result.get();
			System.out.println(queEntity);
			QuestionPojo quePojo = new QuestionPojo(queEntity.getqId(), queEntity.getQuestion1(),
					queEntity.getQuestion2(), queEntity.getQuestion3(), queEntity.getQuestion4(),
					queEntity.getQuestion5(), queEntity.getQuestion6());

			// TODO Auto-generated method stub
			return quePojo;

		}
		return null;
	}

}
