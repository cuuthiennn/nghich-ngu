package JavaSqlServerWebix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import JavaSqlServerWebix.entity.SanPham;
@Mapper
public interface SanPhamMapper {
	List<SanPham> getAllSanPhams();
}
