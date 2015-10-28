package com.testt.model;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="issue")
@ViewScoped
public class Issue implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Number idIssue;
	private String title;
	private List<Event> events;
	
	public Number getIdIssue() {
		return idIssue;
	}
	public void setIdIssue(Number idIssue) {
		this.idIssue = idIssue;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
		
	
}
