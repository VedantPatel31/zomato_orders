package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer orderId;
	
	Integer userId;
	Integer totalFinalAmount;
	Integer deliveryCharge;
	Integer gst;
	Boolean offerApplied;
	Integer offerId;
	Integer restaurnatId;
	Integer addressId;
	String receiverContactName;
	String receiverContactNum;
	Boolean status;
}
