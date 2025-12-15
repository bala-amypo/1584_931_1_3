package com.example.demo.model;

import java.time.LocalDate;

public class Coupon {
    private Long id;
    private String couponCode;
    private Double discountPercentage;
    private String assignedToUser;
    private LocalDate expiryDate;
    private String status;
    public Coupon(String couponCode, Double discountPercentage, String assignedToUser, LocalDate expiryDate,
            String status) {
        this.couponCode = couponCode;
        this.discountPercentage = discountPercentage;
        this.assignedToUser = assignedToUser;
        this.expiryDate = expiryDate;
        this.status = status;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public void setAssignedToUser(String assignedToUser) {
        this.assignedToUser = assignedToUser;
    }
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Long getId() {
        return id;
    }
    public String getCouponCode() {
        return couponCode;
    }
    public Double getDiscountPercentage() {
        return discountPercentage;
    }
    public String getAssignedToUser() {
        return assignedToUser;
    }
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public String getStatus() {
        return status;
    }


}
