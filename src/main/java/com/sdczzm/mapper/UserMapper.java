package com.sdczzm.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import com.sdczzm.dynasql.UserDynaSqlProvider;
import com.sdczzm.model.User;


/**
 * @Results 和 @ResultMap 效果相同 ，但是@ResultMap能复用
 * 使用@Options设置自增长时，数据库表的ID要设置为自增长
 * 
 * 
 * @author QiHuifang
 *
 */
public interface UserMapper {
		
	@Select("SELECT * FROM user limit 10")
//	@Results({
//		@Result(property = "activeState", column = "active_State"),
//		@Result(property = "createDate", column = "create_Date",javaType = Date.class)
//	})
	@ResultMap("com.sdczzm.mybatis.mapper.ResultMapper.UserResult")  
	List<User> getUserList();	
		
	@SelectProvider(type = UserDynaSqlProvider.class,method = "selectUserByConditions")
	@ResultMap("com.sdczzm.mybatis.mapper.ResultMapper.UserResult")  
	List<User> getUserListByConditions(Map<String, Object> params);	
			
	@Select("SELECT * FROM user where id = #{id}")
    User getUserById(Insert id);
	
	@Insert("INSERT INTO user(name,code,active_State,create_Date,create_By,update_Date,update_By) "
			+ " VALUES(#{name},#{code},1,sysdate(),#{createBy},sysdate(),#{updateBy} )")
	@Options(useGeneratedKeys = true, keyProperty = "id",keyColumn = "id")
	void insert(User user);

	@Update("UPDATE user SET name=#{name},code=#{code},active_State=#{activeState},"
			+ " update_Date=sysdate(),update_By=#{updateBy}  WHERE id = #{id}")
	void update(User user);

	@Delete("DELETE FROM users WHERE id = #{id}")
	void delete(Integer id);
	

}
