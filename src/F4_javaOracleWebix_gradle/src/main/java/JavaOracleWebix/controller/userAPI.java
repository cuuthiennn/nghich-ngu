package JavaOracleWebix.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import JavaOracleWebix.entity.User;
import JavaOracleWebix.service.userService;

@RestController
@RequestMapping("/api/user")
public class userAPI {
	
	@Autowired
	private userService usrServ;
	
	@GetMapping("/getAllUser")
	ResponseEntity<?> doGetAllUser() {
		List<User> result = new ArrayList<>();
		try {
			result = usrServ.getAllUser();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/getUserByRoleName")
	ResponseEntity<?> getUserByRoleName(@RequestParam("roleName") String roleName) throws SQLException{
		List<User> temp = new ArrayList<>();
		try {
			temp = usrServ.getUserByRoleName(roleName);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ResponseEntity.ok(temp);
	}
	
	@GetMapping("/getUserByRoleNameN")
	ResponseEntity<?> getUserByRoleNameN(@RequestParam("roleName") String roleName) throws SQLException{

		return ResponseEntity.ok(usrServ.getUserByRoleNameN(roleName));
	}
	
	@GetMapping("/getUserByIsUse")
	ResponseEntity<?> getUserByIsUse(@RequestParam("isUse") String isUse) throws SQLException{
		List<User> temp = new ArrayList<>();
		try {
			temp = usrServ.getUserByIsUse(isUse);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ResponseEntity.ok(temp);
	}
}
