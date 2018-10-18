package com.training.ifaces;

import com.training.beans.InsuranceInfo;
import com.training.beans.InsuranceType;

public interface Dao {
	InsuranceInfo getInsuranceInfo (String regNo);
	InsuranceType getInsuranceTypeInfo(String insuranceType);
	
}
