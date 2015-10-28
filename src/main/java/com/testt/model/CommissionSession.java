package com.testt.model;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="commissionSession")
@ViewScoped
public class CommissionSession implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Number idCommissionSession;
	private String session;
	private List<Issue> issues;
	
	public Number getIdCommissionSession() {
		return idCommissionSession;
	}
	public void setIdCommissionSession(Number idCommissionSession) {
		this.idCommissionSession = idCommissionSession;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public List<Issue> getIssues() {
		return issues;
	}
	public void setIssues(List<Issue> issues) {
		this.issues = issues;
	}
	
}
