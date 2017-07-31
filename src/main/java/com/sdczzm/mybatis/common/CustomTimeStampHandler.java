package com.sdczzm.mybatis.common;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;


public class CustomTimeStampHandler extends BaseTypeHandler<Date> {
	
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i,
			Date parameter, JdbcType jdbcType) throws SQLException {
		
		ps.setString(i, String.valueOf(parameter.getTime()));
		
	}
	

	@Override
	public Date getNullableResult(ResultSet rs, String columnName) throws SQLException {
	    return rs.getDate(columnName);
	}

	@Override
	public Date getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		   return rs.getDate(columnIndex);
	}

	@Override
	public Date getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		   return cs.getDate(columnIndex);
	}

}
