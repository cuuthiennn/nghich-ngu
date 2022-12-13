package JavaMySqlWebix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaMySqlWebix.entity.User;
import JavaMySqlWebix.mapper.UserMapper;
import JavaMySqlWebix.service.UserService;
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
