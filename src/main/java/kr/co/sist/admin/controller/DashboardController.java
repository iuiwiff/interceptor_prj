package kr.co.sist.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	
	@GetMapping("admin/dashboard.do")
	public String dashboard(Model model) {
		return "admin/dashboard/dashboard";
	}
}
