package com.lti.web.controllers;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.lti.core.services.VotingService;
import com.lti.core.entities.*;

@Controller
public class WorkController {
	@Autowired
	private VotingService votingService;
	
	
	//Voting And then Directed to see votes
	@RequestMapping(path="/voting.hr", method=RequestMethod.POST)
	public ModelAndView Voting1(Model model,HttpSession session,@RequestParam("radio") String radio) {
		
		//inserting votes
		List<Votes> votesList= votingService.viewVotes1();
       if(votesList.isEmpty())
       { Votes votes= new Votes();
           votes.setVoteId(1);
    	   switch(radio) {
    	   case "migeul": votes.setMigeul(1);
    	                  votes.setAntoine(0);
    	                  votes.setCharles(0);
    	                  votes.setTolkien(0);
    	                  break;
    	   case "charles": votes.setMigeul(0);
                           votes.setAntoine(0);
                           votes.setCharles(1);
                           votes.setTolkien(0);
                           break; 
    	   case "antoine": votes.setMigeul(0);
                           votes.setAntoine(1);
                           votes.setCharles(0);
                           votes.setTolkien(0);
                           break;     
    	   case "tolkien": votes.setMigeul(0);
    	   				   votes.setAntoine(0);
    	   				   votes.setCharles(0);
    	   				   votes.setTolkien(1);
    	   				   break;  
    	   	default : break;			   
    	   }
    	   boolean result=votingService.insertFirst1(votes);
       }else {
			
    	  boolean res=votingService.updateVotes1(radio); 
    	   
    	   
       }
		
		
		//directing to see votes
       List<Votes> votesList1= votingService.viewVotes1();
       HashMap<String, Integer> pieDataList= new HashMap<String, Integer> ();
		  for(Votes i:votesList1) {
		
		  pieDataList.put("Miguel de Cervantes", i.getMigeul());
		  pieDataList.put("Charles Dickens", i.getCharles());
		  pieDataList.put("J.R.R. Tolkien", i.getTolkien());
		  pieDataList.put("Antoine de saint-Exuper", i.getAntoine());
		  }
		  ModelAndView mAndV=new ModelAndView();
		  mAndV.addObject("pieDataList",pieDataList); String jspName= "First";
		  mAndV.setViewName(jspName); 
		  return mAndV; 
		  }
	
	 //See Votes
	@RequestMapping(path="/seevotes.hr", method=RequestMethod.GET)
	public ModelAndView seeVotes(){
		List<Votes> votesList1= votingService.viewVotes1();
		HashMap<String, Integer> pieDataList= new HashMap<String, Integer> ();	
		for(Votes i:votesList1) {
			pieDataList.put("Miguel de Cervantes", i.getMigeul());
			pieDataList.put("Charles Dickens", i.getCharles());
			pieDataList.put("J.R.R. Tolkien", i.getTolkien());
			pieDataList.put("Antoine de saint-Exuper", i.getAntoine());
			}
	
	      ModelAndView mAndV=new ModelAndView();
		  mAndV.addObject("pieDataList",pieDataList); String jspName= "First";
		  mAndV.setViewName(jspName); return mAndV;
	}
}
