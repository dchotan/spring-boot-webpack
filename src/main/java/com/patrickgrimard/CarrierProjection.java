package com.patrickgrimard;

import java.math.BigDecimal;

/**
 * Created on 2016-01-18
 *
 * @author Patrick
 */
public class CarrierProjection {

    private final BigDecimal carrier;

    private final String reason;

    public CarrierProjection(BigDecimal carrier, String reason) {
        this.carrier = carrier;
        this.reason = reason;
    }

    public BigDecimal getCarrier() {
        return carrier;
    }

    public String getReason() {
        return reason;
    }
}
