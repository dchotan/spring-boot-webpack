package com.patrickgrimard;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created on 2016-01-18
 *
 * @author Patrick
 */
@Entity
@Table(name = "CARRDNUPF")
@IdClass(CarrierDoNotUsePk.class)
public class CarrierDoNotUse {

    @Id
    @Column(name = "CDUCM", columnDefinition = "char")
    private String company;

    @Id
    @Column(name = "CDUPVDR")
    private BigDecimal carrier;

    @Id
    @Column(name = "CDUCODE", columnDefinition = "char")
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
