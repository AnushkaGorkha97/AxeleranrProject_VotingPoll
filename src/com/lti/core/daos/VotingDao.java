package com.lti.core.daos;
import com.lti.core.entities.*;

import java.util.List;



public interface VotingDao {

	public List<Votes> viewVotes0();
	public int insertFirst0(Votes votes);
	public int updateVotes0(String radio);
	
	
}
