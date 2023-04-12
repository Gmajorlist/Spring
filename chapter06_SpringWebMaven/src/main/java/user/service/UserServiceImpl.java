package user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void write(UserDTO userDTO) {
		userDAO.write(userDTO);
		
	}

	@Override
	public List<UserDTO> getUserList() {
		List<UserDTO> list = userDAO.getUserList();
		 return list;
	}

	@Override
	public String isExistId(String id) {
		UserDTO userDTO = userDAO.getUser(id);
		
		if(userDTO == null)
			return "non_exist";
		else
			return "exist";
		
	}

}
