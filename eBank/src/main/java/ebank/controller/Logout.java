package ebank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Logout extends SuperController {

	@RequestMapping(value = "/logout")
	public String logout() {

		// ログアウト処理
		this.invalidateSession();

		return "logout";
	}
}
