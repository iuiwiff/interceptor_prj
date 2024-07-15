package kr.co.sist.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	@GetMapping("admin/board_list.do")
	public String boardList(Model model) {
		return "admin/board/board_list";
	}
}
