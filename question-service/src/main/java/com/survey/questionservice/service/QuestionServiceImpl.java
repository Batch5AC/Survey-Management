package com.survey.questionservice.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	public List<QuestionPojo> getQuestions() {
		// TODO Auto-generated method stub
		
		
		List<QuestionPojo> allquePojo= new ArrayList();
		Iterable<QuestionEntity> allqueEntity = queDao.findAll();
		Iterator itr= (Iterator) allqueEntity.iterator();
		while(itr.hasNext()) {
			QuestionEntity queEntity = (QuestionEntity) itr.next();
			QuestionPojo quePojo = new QuestionPojo(queEntity.getqId(),queEntity.getQuestion());
					allquePojo.add(quePojo);
		}
		
		
		// TODO Auto-generated method stub
		return allquePojo;
	
	}

}
