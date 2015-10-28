package com.testt.controller;

import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.primefaces.event.SelectEvent;

import com.testt.data.IssueStore;
import com.testt.model.Event;
import com.testt.model.Issue;
import com.testt.model.SelectedIssue;

@ManagedBean(name="myIssuesController")
@RequestScoped
public class MyIssuesController {
	
	@ManagedProperty(value="#{issueStore}")
	private IssueStore issueStore;
	
	@ManagedProperty(value="#{selectedIssue}")
	private SelectedIssue selectedIssue;
	
	@ManagedProperty(value="#{issue}")
	private Issue issue;
	
	@ManagedProperty(value="#{event}")
	private Event event;
	
	public IssueStore getIssueStore() {
		return issueStore;
	}
	public void setIssueStore(IssueStore issueStore) {
		this.issueStore = issueStore;
	}
	public SelectedIssue getSelectedIssue() {
		return selectedIssue;
	}
	public void setSelectedIssue(SelectedIssue selectedIssue) {
		this.selectedIssue = selectedIssue;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public Issue getIssue() {
		return issue;
	}
	public void setIssue(Issue issue) {
		this.issue = issue;
	}
	
	public void onSelectOneRow(SelectEvent event){
		if (event!=null && event.getObject()!=null){
			selectedIssue.setIdIssue(issue.getIdIssue());
			selectedIssue.setTitle(issue.getTitle());
			selectedIssue.setEvents(issue.getEvents());
		}
	}
	
	public void addIssueEvent(){
		if (selectedIssue == null){
			return;
		}
		if (selectedIssue.getEvents()==null){
			selectedIssue.setEvents(new ArrayList<Event>());
		}
		event.setIdEvent(selectedIssue.getEvents().size()+1);
		event.setIdIssue(selectedIssue.getIdIssue());
		event.setEventDate(new Date());
		Event newEvent = new Event();
		newEvent.setIdEvent(event.getIdEvent());
		newEvent.setIdIssue(event.getIdIssue());
		newEvent.setEventDate(event.getEventDate());
		newEvent.setComment(event.getComment());
		selectedIssue.getEvents().add(newEvent);
	}
	
	
}
