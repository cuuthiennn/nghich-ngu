package JavaOracleWebix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import JavaOracleWebix.entity.User;
import JavaOracleWebix.mapper.UserMapper;
import JavaOracleWebix.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper mapper;
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return mapper.getAllUser();
	}

}
