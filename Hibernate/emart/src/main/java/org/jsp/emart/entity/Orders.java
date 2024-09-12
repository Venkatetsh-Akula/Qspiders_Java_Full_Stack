package org.jsp.emart.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	@CreationTimestamp
	private LocalDateTime orderdtime;
	@UpdateTimestamp
	private LocalDateTime deliverytime;

	private double totalamount;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Items> items;

	private String decsription;

	public String getDecsription() {
		return decsription;
	}

	public void setDecsription(String decsription) {
		this.decsription = decsription;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public LocalDateTime getOrderdtime() {
		return orderdtime;
	}

	public void setOrderdtime(LocalDateTime orderdtime) {
		this.orderdtime = orderdtime;
	}

	public LocalDateTime getDeliverytime() {
		return deliverytime;
	}

	public void setDeliverytime(LocalDateTime deliverytime) {
		this.deliverytime = deliverytime;
	}

	public double getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}

}
