package loans.aas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import loans.aas.service.LoginService;

@RestController
@RequestMapping(path = "/api/services/aas/login-service")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(path = "login")
	public ResponseEntity<String> login() {
		return ResponseEntity.ok("");
	}
}
