package ebank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ebank.bean.User;

@Controller
public class SuperController {

	@Autowired
	HttpSession session;

	// session情報を全て削除
	void invalidateSession() {
		session.invalidate();
	}

	// sessionにログイン情報があるかどうかチェック
	protected boolean isLoginSession() {
		return (session.getAttribute("loginUser") != null);
	}

	// sessionからユーザー情報を取得
	protected User getLoginUser() {
		return (User) session.getAttribute("loginUser");
	}
}
