package com.testt.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.testt.model.CommissionSession;
import com.testt.model.Issue;

@ManagedBean(name="commissionSessionStore")
@ApplicationScoped
public class CommissionSessionStore implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<CommissionSession> commissionSessionList;
	
	@ManagedProperty(value="#{issueStore}")
	private IssueStore issueStore;

	public List<CommissionSession> getCommissionSessionList() {
		return commissionSessionList;
	}
	public void setCommissionSessionList(List<CommissionSession> commissionSessionList) {
		this.commissionSessionList = commissionSessionList;
	}
	public IssueStore getIssueStore() {
		return issueStore;
	}
	public void setIssueStore(IssueStore issueStore) {
		this.issueStore = issueStore;
	}
	
	@PostConstruct
	public void init(){
		
		commissionSessionList = new ArrayList<CommissionSession>();
		
		CommissionSession cSession;
		
		for (int i=1;i<=2;i++){
			cSession = new CommissionSession();
			cSession.setIdCommissionSession(i);
			ArrayList<Issue> issuesList = new ArrayList<Issue>();
			issuesList.add(this.issueStore.getIssuesList().get(2*i-2));
			issuesList.add(this.issueStore.getIssuesList().get(2*i-1));
			cSession.setIssues(issuesList);
			cSession.setSession("Session "+String.valueOf(i));
			commissionSessionList.add(cSession);
		}
		
	}

}
