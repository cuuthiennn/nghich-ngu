package JavaSqlServerWebix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import JavaSqlServerWebix.entity.CTHDH;

@Mapper
public interface CTHDHMapper {
	List<CTHDH> getAllCthdhs();
}
