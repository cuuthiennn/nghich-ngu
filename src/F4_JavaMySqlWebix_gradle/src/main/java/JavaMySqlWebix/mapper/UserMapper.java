package JavaMySqlWebix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import JavaMySqlWebix.entity.User;
@Mapper
public interface UserMapper {
	List<User> getAllUser();
}
