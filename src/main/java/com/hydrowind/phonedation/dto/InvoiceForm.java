package com.hydrowind.phonedation.dto;

public class InvoiceForm {

  private long id;
  private String transactionNo;
  private String status;
  private long addressId;
  private long paymentId;
  private long shipmentId;
  private long cartId;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTransactionNo() {
    return transactionNo;
  }

  public void setTransactionNo(String transactionNo) {
    this.transactionNo = transactionNo;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getAddressId() {
    return addressId;
  }

  public void setAddressId(long addressId) {
    this.addressId = addressId;
  }

  public long getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(long paymentId) {
    this.paymentId = paymentId;
  }

  public long getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(long shipmentId) {
    this.shipmentId = shipmentId;
  }

  public long getCartId() {
    return cartId;
  }

  public void setCartId(long cartId) {
    this.cartId = cartId;
  }
}
