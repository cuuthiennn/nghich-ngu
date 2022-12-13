package JavaOracleWebix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import JavaOracleWebix.entity.User;
@Mapper
public interface UserMapper {
	List<User> getAllUser();
}
