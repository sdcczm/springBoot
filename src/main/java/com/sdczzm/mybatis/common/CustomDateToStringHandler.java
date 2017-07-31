package com.sdczzm.mybatis.common;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;


public class CustomDateToStringHandler extends BaseTypeHandler<String> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i,
			String parameter, JdbcType jdbcType) throws SQLException {
		//插入数据库中
//		ps.setDate(i, String.valueOf(parameter.getTime()));
		
	}

	@Override
	public String getNullableResult(ResultSet rs, String columnName)
			throws SQLException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date sqlTimestamp = rs.getDate(columnName);
	    if (sqlTimestamp != null) {
	      return sdf.format(sqlTimestamp);
	    }
	    return null;
	}

	@Override
	public String getNullableResult(ResultSet rs, int columnIndex)
			throws SQLException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date sqlTimestamp = rs.getDate(columnIndex);
	    if (sqlTimestamp != null) {
	      return sdf.format(sqlTimestamp);
	    }
	    return null;
	}

	@Override
	public String getNullableResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date sqlTimestamp = cs.getDate(columnIndex);
	    if (sqlTimestamp != null) {
	      return sdf.format(sqlTimestamp);
	    }
	    return null;
	}
	
	

}
