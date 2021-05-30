package com.lti.core.services;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lti.core.daos.VotingDao;
import com.lti.core.entities.*;



@Transactional
@Service("AdminService")
public class VotingServiceImpl implements VotingService {
	@Autowired
	private VotingDao votingDao;

	@Override
	public List<Votes> viewVotes1() {
		 List<Votes> votesList1=votingDao.viewVotes0();
			return votesList1;
	}

	@Override
	public boolean insertFirst1(Votes votes) {
		int result = votingDao.insertFirst0(votes);
		if(result==1) {
			return true;
		} else {
		return false;
		}
	}

	@Override
	public boolean updateVotes1(String radio) {
		int result=votingDao.updateVotes0(radio);
		if(result==1) {
			return true;
		} else {
		return false;
		}
	}

	

	
}
