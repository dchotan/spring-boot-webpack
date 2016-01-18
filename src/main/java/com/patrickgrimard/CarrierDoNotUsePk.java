package com.patrickgrimard;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created on 2016-01-18
 *
 * @author Patrick
 */
public class CarrierDoNotUsePk implements Serializable {

    private String company;

    private BigDecimal carrier;

    private String reason;

    public String getCompany() {
        return company;
    }

    public BigDecimal getCarrier() {
        return carrier;
    }

    public String getReason() {
        return reason;
    }
}
