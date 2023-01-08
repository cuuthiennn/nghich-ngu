package JavaOracleWebix.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaOracleWebix.entity.User;
import JavaOracleWebix.mapper.userMapper;
import JavaOracleWebix.service.userService;

@Service
public class userServiceImpl implements userService{
	
	@Autowired
	private userMapper usrMapper;
	
	@Override
	public List<User> getAllUser() throws SQLException{
		// TODO Auto-generated method stub
		return usrMapper.getAllUser();
	}


	@Override
	public List<User> getUserByRoleName(String roleName) throws SQLException {
		// TODO Auto-generated method stub
		return usrMapper.getUserByRoleName(roleName);
	}

	@Override
	public List<User> getUserByRoleNameN(String roleName) throws SQLException {
		// TODO Auto-generated method stub
		return usrMapper.getUserByRoleNameN(roleName);
	}

	@Override
	public List<User> getUserByIsUse(String isUse) throws SQLException {
		// TODO Auto-generated method stub
		return usrMapper.getUserByIsUse(isUse);
	}

}
