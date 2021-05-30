package com.lti.core.daos;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.core.entities.*;

@Repository("VotingDao")
public class VotingDaoImpl implements VotingDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Votes> viewVotes0() {
		
		Query qry1 =entityManager.createQuery("select v from votes v");
		  
		  List<Votes> votesList0=qry1.getResultList();
			return votesList0;
	}

	@Override
	public int insertFirst0(Votes votes) {
		entityManager.persist(votes);
		return 1;
	}

	@Override
	public int updateVotes0(String radio) {
		
			Query qry2 =entityManager.createQuery("select v from votes v");
			Votes votes=(Votes) qry2.getSingleResult();
			int voteId=1;
			if(radio.contentEquals("migeul")) {
		int migeul=votes.getMigeul()+1;
		Query qry3 =entityManager.createQuery("update votes v set v.migeul= :migeul where v.voteId= :voteId");
		qry3.setParameter("migeul", migeul);
		qry3.setParameter("voteId", voteId);
		qry3.executeUpdate();
		} else if(radio.contentEquals("charles")) {
			int charles=votes.getCharles()+1;
			Query qry4 =entityManager.createQuery("update votes v set v.charles= :charles where v.voteId= :voteId");
			qry4.setParameter("charles", charles);
			qry4.setParameter("voteId", voteId);
			qry4.executeUpdate();
			} else if(radio.contentEquals("antoine")) {
				int antoine=votes.getAntoine()+1;
				Query qry5 =entityManager.createQuery("update votes v set v.antoine= :antoine where v.voteId= :voteId");
				qry5.setParameter("antoine", antoine);
				qry5.setParameter("voteId", voteId);
				qry5.executeUpdate();
				} else if(radio.contentEquals("tolkien")) {
					int tolkien=votes.getTolkien()+1;
					Query qry6 =entityManager.createQuery("update votes v set v.tolkien= :tolkien where v.voteId= :voteId");
					qry6.setParameter("tolkien", tolkien);
					qry6.setParameter("voteId", voteId);
					qry6.executeUpdate();
					}
		
		return 1;
	}

	
}
