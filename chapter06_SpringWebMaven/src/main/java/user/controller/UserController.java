package user.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import user.bean.UserDTO;
import user.service.UserService;

//요청과 응답 

@Controller
@RequestMapping(value="user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping(value="writeForm")
	public String writeForm() {
		return "user/writeForm";
	}
	
	@PostMapping(value="write")
	@ResponseBody
	public void write(@ModelAttribute UserDTO userDTO){
		userService.write(userDTO);		
	}
	
	@GetMapping(value="list")
	public String list(@RequestParam(required = false, defaultValue = "1") String pg, Model model) {
		//DB를 거치지 않고 바로 화면에 틀만 띄운다.           아무말없으면 req = default 쓰는거는 페이징처리 1로선택
		model.addAttribute("pg", pg);
		return "user/list"; //jsp로 이동~
	}
	
	@PostMapping(value="getUserList")
	@ResponseBody
	public Map<String, Object> getUserList(@RequestParam String pg){
		return userService.getUserList(pg);
	}
	
	@PostMapping(value="isExistId")
	@ResponseBody
	public String isExistId(@RequestParam String id) {
		return userService.isExistId(id);
		
	}
	
	@GetMapping(value="updateForm")
	public String updateForm() {
		return "user/updateForm";
	}
	
	@PostMapping(value="getUser")
	@ResponseBody
	public UserDTO getUser(@RequestParam String id) {
		return userService.getUser(id);
	}
	@PostMapping(value="update")
	@ResponseBody
	public void update(@ModelAttribute UserDTO userDTO) {
		userService.update(userDTO);
	}
	
	@GetMapping(value="deleteForm")
	public String deleteForm() {
		return "user/deleteForm";
	}
	
	@PostMapping(value="delete")
	@ResponseBody
	public void delete(@RequestParam String id) {
		userService.delete(id);
	}
	
}













