package JavaOracleWebix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaOracleWebix.entity.Role;
import JavaOracleWebix.mapper.RoleMapper;
import JavaOracleWebix.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	private RoleMapper mapper;
	@Override
	public List<Role> getAllRole() {
		// TODO Auto-generated method stub
		return mapper.getAllRole();
	}
	
}
