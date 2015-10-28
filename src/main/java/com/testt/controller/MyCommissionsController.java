package com.testt.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.primefaces.event.SelectEvent;

import com.testt.data.CommissionSessionStore;
import com.testt.model.CommissionSession;

@ManagedBean(name="myCommissionsController")
@RequestScoped
public class MyCommissionsController {
	
	@ManagedProperty(value="#{commissionSessionStore}")
	private CommissionSessionStore commissionSessionStore;
	
	@ManagedProperty(value="#{selectedCommissionSession}")
	private CommissionSession selectedCommissionSession;
	
	public CommissionSessionStore getCommissionSessionStore() {
		return commissionSessionStore;
	}
	public void setCommissionSessionStore(CommissionSessionStore commissionSessionStore) {
		this.commissionSessionStore = commissionSessionStore;
	}
	public CommissionSession getSelectedCommissionSession() {
		return selectedCommissionSession;
	}
	public void setSelectedCommissionSession(CommissionSession selectedCommissionSession) {
		this.selectedCommissionSession = selectedCommissionSession;
	}
	
	public void onSelectOneRow(SelectEvent event){
		selectedCommissionSession.setIdCommissionSession(((CommissionSession)event.getObject()).getIdCommissionSession());
		selectedCommissionSession.setIssues(((CommissionSession)event.getObject()).getIssues());
		selectedCommissionSession.setSession(((CommissionSession)event.getObject()).getSession());
	}
	
}
