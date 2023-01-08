package JavaSqlServerWebix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaSqlServerWebix.entity.DonDh;
import JavaSqlServerWebix.mapper.DonDhMapper;
import JavaSqlServerWebix.service.DonDhService;

@Service
public class DonDhServiceImpl implements DonDhService{

	@Autowired
	private DonDhMapper mapper;
	@Override
	public List<DonDh> getAllDonDhs() {
		// TODO Auto-generated method stub
		return mapper.getAllDonDhs();
	}
	
}
