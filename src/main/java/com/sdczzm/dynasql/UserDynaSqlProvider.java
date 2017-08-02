package com.sdczzm.dynasql;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.mysql.jdbc.StringUtils;





public class UserDynaSqlProvider {
	
	  public String selectUserByConditions(Map<String,Object> params)  
	    {  
		  final String name=(String)params.get("name");
		  final String code=(String)params.get("code");
	      String sql= new SQL()  
	        {  
	            {  
	                SELECT("name,code,create_date");  
	                FROM("user u"); 
	                if(!StringUtils.isNullOrEmpty(name)){
	                	WHERE("name=#{name}");
	                }
	                if(!StringUtils.isNullOrEmpty(code)){
	                	WHERE("code=#{code}");
	                }
	            }  
	        } .toString(); 
	        return sql;
	    } 
}
