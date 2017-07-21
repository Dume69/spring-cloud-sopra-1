package com.sopra.cloud.invoiceserviceclient.model;

import java.util.Date;

public class Invoice {
	private long id;
	private Date date;

	public Invoice() {

	}

	public Invoice(long id, Date date) {
		this.id = id;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
