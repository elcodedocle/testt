package com.testt.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.testt.model.Event;
import com.testt.model.Issue;

@ManagedBean(name="issueStore")
@ApplicationScoped
public class IssueStore implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<Issue> issuesList;

	public List<Issue> getIssuesList() {
		return issuesList;
	}
	public void setIssuesList(List<Issue> issuesList) {
		this.issuesList = issuesList;
	}
	
	@PostConstruct
	public void init(){
		
		issuesList = new ArrayList<Issue>();
		Issue newIssue;
		
		for (int i=1; i<=4; i++){
			newIssue = new Issue();
			newIssue.setEvents(new ArrayList<Event>());
			newIssue.setIdIssue(i);
			newIssue.setTitle("Issue "+String.valueOf(i));
			issuesList.add(newIssue);
		}
		
	}
	
}
