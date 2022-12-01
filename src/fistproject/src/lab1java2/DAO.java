package lab1java2;

import java.util.List;

public interface DAO {
	
	void insert(List<Product> list);
	void update(String name, List<Product> list);
	void delete(String name, List<Product> list);
	void select(String name, List<Product> list);
}
