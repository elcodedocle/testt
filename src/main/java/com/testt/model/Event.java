package com.testt.model;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="event")
@ViewScoped
public class Event implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Number idEvent;
	private Number idIssue;
	private String comment;
	private Date eventDate;
	
	public Number getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(Number idEvent) {
		this.idEvent = idEvent;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public Number getIdIssue() {
		return idIssue;
	}
	public void setIdIssue(Number idIssue) {
		this.idIssue = idIssue;
	}

}
