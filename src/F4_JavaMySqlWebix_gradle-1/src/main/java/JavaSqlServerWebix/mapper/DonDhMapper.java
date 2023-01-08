package JavaSqlServerWebix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import JavaSqlServerWebix.entity.DonDh;

@Mapper
public interface DonDhMapper {
	List<DonDh> getAllDonDhs();
}
