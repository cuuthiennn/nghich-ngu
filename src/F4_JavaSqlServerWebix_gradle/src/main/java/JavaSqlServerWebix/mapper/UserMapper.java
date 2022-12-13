package JavaSqlServerWebix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import JavaSqlServerWebix.entity.User;
@Mapper
public interface UserMapper {
	List<User> getAllUser();
}
