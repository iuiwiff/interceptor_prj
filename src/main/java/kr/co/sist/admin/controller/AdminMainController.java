package kr.co.sist.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@SessionAttributes("admin_id")
@Controller
@RequestMapping("/admin") //상위요청으로 만들 때
public class AdminMainController {

	@GetMapping("/login_frm.do")
	public String adminMain() {
		return "admin/admin_login_frm";
	}
	
	@GetMapping("/set_session.do")
	public String loginProcess(Model model) {
		model.addAttribute("admin_id", "admin");
		return "forward:dashboard.do";
	}
	
	@GetMapping("/remove_session.do")
	public String logout(SessionStatus ss) {
		ss.setComplete();
		return "redirect:login_frm.do";
	}
	
}
