package JavaOracleWebix.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import JavaOracleWebix.entity.Role;

@Mapper
public interface RoleMapper {
	List<Role> getAllRole();
}
