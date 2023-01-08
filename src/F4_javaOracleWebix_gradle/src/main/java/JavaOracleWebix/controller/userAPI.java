package JavaOracleWebix.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
