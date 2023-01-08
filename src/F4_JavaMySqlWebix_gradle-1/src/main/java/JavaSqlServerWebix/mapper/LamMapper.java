package JavaSqlServerWebix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import JavaSqlServerWebix.entity.Lam;

@Mapper
public interface LamMapper {
	List<Lam> getAllLams();
}
