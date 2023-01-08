package JavaSqlServerWebix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaSqlServerWebix.entity.Lam;
import JavaSqlServerWebix.mapper.LamMapper;
import JavaSqlServerWebix.service.LamService;

@Service
public class LamServiceImpl implements LamService{

	@Autowired
	private LamMapper mapper;
	@Override
	public List<Lam> getAllLams() {
		// TODO Auto-generated method stub
		return mapper.getAllLams();
	}
	
}
