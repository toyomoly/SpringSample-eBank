package ebank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ebank.bean.User;
import ebank.dao.UserDAO;

@Controller
public class Login extends SuperController {

	@Autowired
	HttpSession session;

	@Autowired
	UserDAO userDao;

	// ログイン画面表示
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		return "login";
	}

	// 送信ボタンを押したときの処理
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("user-id") String userId, @RequestParam("password") String password,
			ModelAndView mv) {

		// saving画面へ
		mv.setViewName("redirect:/saving");
		return mv;
	}

	// 入力されたユーザーID,パスワードでユーザー情報を取得
	private User login(String userId, String password) {

		// TODO: ここはダミーデータなので、後で書き換える必要がある
		return new User("aoki", "stepstep", "青木 花子", 10000);
	}

	// sessionにログイン情報を登録
	private void setLoginSession(User user) {
		session.setAttribute("loginUser", user);
	}
}
