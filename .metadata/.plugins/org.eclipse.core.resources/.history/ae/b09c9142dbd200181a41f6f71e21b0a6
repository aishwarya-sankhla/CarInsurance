package com.training.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.training.beans.InsuranceInfo;
import com.training.beans.InsuranceType;
import com.training.ifaces.Dao;
import com.training.utils.DbConnection;

public class DaoImpl implements Dao{
	
	
	private Connection conn;
	public DaoImpl() {
		DbConnection dbConnection=new DbConnection();
		try {
			conn=dbConnection.getConnection();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public InsuranceInfo getInsuranceInfo(String regNo) {
		InsuranceInfo info=null;
		String sql= "select * from policy_info_ri natural join insurance_info_ri where insurance_info_ri.REGNO=?";
		try {
			PreparedStatement pstm=conn.prepareStatement(sql);
			pstm.setString(1, regNo);
			ResultSet rs= pstm.executeQuery();
			while(rs.next()){
				String policyNo=rs.getString("POLICYNO");
				String model=rs.getString("CAR_MODEL");
				double maxCoverage = rs.getDouble("MAX_COVERAGE");
				String insuranceType = rs.getString("INSURANCE_TYPE");
				info=new InsuranceInfo(regNo, policyNo, model, maxCoverage, insuranceType);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return info;
	}

	@Override
	public InsuranceType getInsuranceTypeInfo(String insuranceType) {

		InsuranceType insuranceTypeInfo=null;
		String sql= "select * from TYPE_INFO_RI where INSURANCE_TYPE=?";
		try {
			PreparedStatement pstm=conn.prepareStatement(sql);
			pstm.setString(1, insuranceType);
			ResultSet rs= pstm.executeQuery();
			while(rs.next()){
				double plastic=rs.getDouble("plastic");
				double metal=rs.getDouble("metal");
				double labour=rs.getDouble("labour");
				insuranceTypeInfo = new InsuranceType(plastic, metal, labour, insuranceType);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return insuranceTypeInfo;
	}

}
