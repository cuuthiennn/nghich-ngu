package JavaSqlServerWebix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import JavaSqlServerWebix.entity.LoaiSP;

@Mapper
public interface LoaiSPMapper {
	List<LoaiSP> getAllList();
}
