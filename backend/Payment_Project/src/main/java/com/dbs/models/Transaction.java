package com.dbs.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="transaction")
public class Transaction {
	@Id
	@Column(name="transaction_Id")
	 private long transaction_Id ;
	
	@JoinColumn(name="sender_id")
	 private long sender_id;
	
	@Column(name="receiver_name")
	 private String receiver_name ;
	
	@Column(name="receiver_Id")
	 private String receiver_Id ;
	
	@Column(name="bic")
	 private String bic ;
	
	@Column(name="amount")
	 private double amount  ;
	
	@Column(name="transfer")
	 private double transfer ;
	
	@Column(name="clear_balance")
	 private double clear_balance;
	
	@Column(name="trans_date")
	 private String trans_date ;
	
	@Column(name="message_real")
	private String message_real;
	
	@Column(name="transfer_type")
	private String transfer_type;
	
	@Column(name="currency_type")
	private String currency_type;
	
	@Column(name="status")
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getTransaction_Id() {
		return transaction_Id;
	}
	public void setTransaction_Id(long transaction_Id) {
		this.transaction_Id = transaction_Id;
	}
	public long getSender_id() {
		return sender_id;
	}
	public void setSender_id(long sender_id) {
		this.sender_id = sender_id;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	public String getReceiver_Id() {
		return receiver_Id;
	}
	public void setReceiver_Id(String receiver_Id) {
		this.receiver_Id = receiver_Id;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTransfer() {
		return transfer;
	}
	public void setTransfer(double transfer) {
		this.transfer = transfer;
	}
	public double getClear_balance() {
		return clear_balance;
	}
	public void setClear_balance(double clear_balance) {
		this.clear_balance = clear_balance;
	}
	public String getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(String trans_date) {
		this.trans_date = trans_date;
	}
	public String getMessage_real() {
		return message_real;
	}
	public void setMessage_real(String message_real) {
		this.message_real = message_real;
	}
	public String getTransfer_type() {
		return transfer_type;
	}
	public void setTransfer_type(String transfer_type) {
		this.transfer_type = transfer_type;
	}
	
	public String getCurrency_type() {
		return currency_type;
	}
	public void setCurrency_type(String currency_type) {
		this.currency_type = currency_type;
	}
	public Transaction() {
		
	}
	public Transaction(long transaction_Id, long sender_id, String receiver_name, String receiver_Id, String bic,
			double amount, double transfer, double clear_balance, String trans_date, String message_real,
			String transfer_type, String currency_type, String status) {
		super();
		this.transaction_Id = transaction_Id;
		this.sender_id = sender_id;
		this.receiver_name = receiver_name;
		this.receiver_Id = receiver_Id;
		this.bic = bic;
		this.amount = amount;
		this.transfer = transfer;
		this.clear_balance = clear_balance;
		this.trans_date = trans_date;
		this.message_real = message_real;
		this.transfer_type = transfer_type;
		this.currency_type = currency_type;
		this.status = status;
	}
	
	
	
}
