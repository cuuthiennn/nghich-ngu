package JavaSqlServerWebix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaSqlServerWebix.entity.CTHDH;
import JavaSqlServerWebix.mapper.CTHDHMapper;
import JavaSqlServerWebix.service.CTHDHService;

@Service
public class CTHDHServiceImpl implements CTHDHService{
	
	@Autowired
	private CTHDHMapper mapper;
	@Override
	public List<CTHDH> getAllCthdhs() {
		// TODO Auto-generated method stub
		return mapper.getAllCthdhs();
	}

}
