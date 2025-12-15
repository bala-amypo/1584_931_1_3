package com.example.demo.model;

public class CouponRule {
    private Long id;
    private String ruleName;
    private Double discountPercentage;
    private Double minPurchaseAmount;
    private int expiryDays;
    public CouponRule(String ruleName, Double discountPercentage, Double minPurchaseAmount, int expiryDays) {
        this.ruleName = ruleName;
        this.discountPercentage = discountPercentage;
        this.minPurchaseAmount = minPurchaseAmount;
        this.expiryDays = expiryDays;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public void setMinPurchaseAmount(Double minPurchaseAmount) {
        this.minPurchaseAmount = minPurchaseAmount;
    }
    public void setExpiryDays(int expiryDays) {
        this.expiryDays = expiryDays;
    }
    public Long getId() {
        return id;
    }
    public String getRuleName() {
        return ruleName;
    }
    public Double getDiscountPercentage() {
        return discountPercentage;
    }
    public Double getMinPurchaseAmount() {
        return minPurchaseAmount;
    }
    public int getExpiryDays() {
        return expiryDays;
    }
    
}
