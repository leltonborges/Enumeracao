package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	public Order(){
	}
	public Order(Integer id, Date moment, OrderStatus status) {
		this.id= id;
		this.moment = moment;
		this.status = status;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return this.id;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public String toString() {
		return
				"Processamento do pedido\n"+
				"\nId: "+ getId()+
				"\nData: "+ getMoment()+
				"\nStatus: "+ getStatus();
	}
}
