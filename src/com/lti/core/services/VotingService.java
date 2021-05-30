package com.lti.core.services;
import java.util.List;
import com.lti.core.entities.*;


public interface VotingService {
	public List<Votes> viewVotes1();
	public boolean insertFirst1(Votes votes);
	public boolean updateVotes1(String radio);
	
}
