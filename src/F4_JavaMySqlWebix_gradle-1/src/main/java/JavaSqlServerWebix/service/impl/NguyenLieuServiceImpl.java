package JavaSqlServerWebix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JavaSqlServerWebix.entity.NguyenLieu;
import JavaSqlServerWebix.mapper.NguyenLieuMapper;
import JavaSqlServerWebix.service.NguyenLieuService;

@Service
public class NguyenLieuServiceImpl implements NguyenLieuService{

	@Autowired
	private NguyenLieuMapper mapper;
	@Override
	public List<NguyenLieu> getAllNguyenLieus() {
		// TODO Auto-generated method stub
		return mapper.getAllNguyenLieus();
	}
	
}
