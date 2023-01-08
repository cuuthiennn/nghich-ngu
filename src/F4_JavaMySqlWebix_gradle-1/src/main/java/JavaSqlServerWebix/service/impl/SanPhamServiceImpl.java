package JavaSqlServerWebix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaSqlServerWebix.entity.SanPham;
import JavaSqlServerWebix.mapper.SanPhamMapper;
import JavaSqlServerWebix.service.SanPhamService;

@Service
public class SanPhamServiceImpl implements SanPhamService{

	@Autowired
	private SanPhamMapper mapper;
	@Override
	public List<SanPham> getAllSanPhams() {
		// TODO Auto-generated method stub
		return mapper.getAllSanPhams();
	}

}
