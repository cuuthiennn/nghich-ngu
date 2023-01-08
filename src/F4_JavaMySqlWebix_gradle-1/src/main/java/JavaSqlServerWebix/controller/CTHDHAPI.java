package JavaSqlServerWebix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaSqlServerWebix.entity.CTHDH;
import JavaSqlServerWebix.service.CTHDHService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/Cthdh")
public class CTHDHAPI {
	@Autowired
	private CTHDHService service;
	@GetMapping("/getAllCthdhs")
	ResponseEntity<?> getCthdhs(){
		return ResponseEntity.ok(service.getAllCthdhs());
	}
}
