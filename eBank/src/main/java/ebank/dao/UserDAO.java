package ebank.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import ebank.bean.User;

@Mapper
public interface UserDAO {

	@Select("SELECT user_id, password, user_name, saving FROM account WHERE user_id = #{userId}")
	User findByUserId(String userId);

}
