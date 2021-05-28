package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Inquiry;
import com.example.demo.repository.InquiryDao;

@Service
public class InquiryServiceImpl implements InquiryService {
	
	private final InquiryDao dao;
	
	public InquiryServiceImpl(InquiryDao dao) {
		this.dao = dao;
	}

	@Override
	public void save(Inquiry inquiry) {
		dao.insertInquiry(inquiry);

	}
	
	@Override
	public void update(Inquiry inquiry) {
		if(dao.updateInquiry(inquiry) == 0) {
			throw new InquiryNotFoundException("inquiry ID doesn't exist.");
		}
		
	}

	@Override
	public List<Inquiry> getAll() {
		return dao.getAll();
	}

	@Override
	public Inquiry getInquiryOnId(int id) {
		return dao.getInquiryOnId(id);
	}

}
