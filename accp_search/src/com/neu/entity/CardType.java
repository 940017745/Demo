package com.neu.entity;

public class CardType {
	private String stype;
	private String cardname;
	public CardType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CardType(String stype, String cardname) {
		super();
		this.stype = stype;
		this.cardname = cardname;
	}
	@Override
	public String toString() {
		return "CardType [stype=" + stype + ", cardname=" + cardname + "]";
	}
	public String getStype() {
		return stype;
	}
	public void setStype(String stype) {
		this.stype = stype;
	}
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
}
