package com.example.examen.Domain;

public class IntentoToken {
    private String localToken;
    private String productCode;
    private Double total;

    public IntentoToken() {
    }

    public IntentoToken(String localToken, String productCode, Double total) {
        this.localToken = localToken;
        this.productCode = productCode;
        this.total = total;
    }

    public String getLocalToken() {
        return localToken;
    }

    public void setLocalToken(String localToken) {
        this.localToken = localToken;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
}
