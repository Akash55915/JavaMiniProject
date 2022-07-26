package com.cybage.service;

import com.cybage.dao.AddFeedback;
import com.cybage.dao.AddFeedbackImpl;
import com.cybage.model.Feedback;

public class AddFeedbackServiceImpl implements AddFeedbackService {

	AddFeedback feedbackDao= new AddFeedbackImpl();
	@Override
	public boolean addFeedback(Feedback feedback) {
		
		return feedbackDao.addFeedback(feedback);
	}

}
