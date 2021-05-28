package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Survey;
import com.example.demo.repository.SurveyDao;
import com.example.demo.repository.SurveyDaoImpl;

@Service
public class SurveyServiceImpl implements SurveyService {
	
	@Autowired
	SurveyDao dao;

	@Override
	public void save(Survey survey) {
		dao.insertSurvey(survey);

	}

	@Override
	public List<Survey> getAll() {
		return dao.getAll();
	}

}
