package JavaOracleWebix.service;

import java.sql.SQLException;
import java.util.List;
import JavaOracleWebix.entity.User;

public interface userService {
	List<User> getAllUser() throws SQLException;
	List<User> getUserByRoleName(String roleName) throws SQLException;
	List<User> getUserByRoleNameN(String roleName) throws SQLException;
	List<User> getUserByIsUse(String isUse) throws SQLException;
}
