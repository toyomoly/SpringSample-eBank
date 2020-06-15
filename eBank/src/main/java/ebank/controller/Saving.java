package ebank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ebank.bean.History;
import ebank.bean.User;
import ebank.dao.HistoryDAO;

@Controller
public class Saving extends SuperController {

	@Autowired
	HistoryDAO historyDao;

	// 預金画面表示
	@RequestMapping(value = "/saving", method = RequestMethod.GET)
	public ModelAndView showSaving(ModelAndView mv) {

		mv.setViewName("saving");
		return mv;
	}

	// フォームから送信された場合
	@RequestMapping(value = "/saving", method = RequestMethod.POST)
	public ModelAndView changeSaving(@RequestParam(value = "price", defaultValue = "0") int price,
			@RequestParam("p_status") int status, ModelAndView mv) {

		mv.setViewName("saving");
		return mv;
	}

}
