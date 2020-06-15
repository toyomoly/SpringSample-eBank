package ebank.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import ebank.bean.History;

@Mapper
public interface HistoryDAO {

	@Select("SELECT user_id, status, price, created_at FROM history WHERE user_id = #{userId} ORDER BY id DESC")
	List<History> findByUserId(String userId);

}
