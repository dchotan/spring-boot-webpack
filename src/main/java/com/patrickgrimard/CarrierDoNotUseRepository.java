package com.patrickgrimard;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 2016-01-18
 *
 * @author Patrick
 */
@Repository
public interface CarrierDoNotUseRepository extends CrudRepository<CarrierDoNotUse, CarrierDoNotUsePk> {
}
