package JavaOracleWebix.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import JavaOracleWebix.entity.User;
@Mapper
public interface userMapper {
	List<User> getAllUser() throws SQLException;
	
	List<User> getUserByRoleName(@Param("roleName") String roleName) throws SQLException;
	
	List<User> getUserByRoleNameN(@Param("roleName") String roleName) throws SQLException;
	
	List<User> getUserByIsUse(@Param("isUse") String isUse) throws SQLException;
}
