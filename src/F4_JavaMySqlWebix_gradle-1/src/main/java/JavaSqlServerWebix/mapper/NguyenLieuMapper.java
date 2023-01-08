package JavaSqlServerWebix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import JavaSqlServerWebix.entity.NguyenLieu;

@Mapper
public interface NguyenLieuMapper {
	List<NguyenLieu> getAllNguyenLieus();
}
