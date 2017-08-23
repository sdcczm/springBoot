package com.sdczzm.dynasql;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.mysql.jdbc.StringUtils;





public class UserDynaSqlProvider {
	
	  public String selectUserByConditions(Map<String,Object> params)  
	    {  
		  String code=(String)params.get("code");
		  if(!StringUtils.isNullOrEmpty(code)){
          	code="%"+code+"%";
  		    params.put("code",code);
          }		  
		  final String name=(String)params.get("name");
		  final String codeL=(String)params.get("code");
	      String sql= new SQL()  
	        {  
	            {  
	                SELECT("name,code,create_date");  
	                FROM("user u"); 
	                if(!StringUtils.isNullOrEmpty(name)){
	                	WHERE("name=#{name}");
	                }
	                if(!StringUtils.isNullOrEmpty(codeL)){
	                	WHERE("code like #{code}");
	                }
	            }  
	        } .toString(); 
	        return sql;
	    } 
}
