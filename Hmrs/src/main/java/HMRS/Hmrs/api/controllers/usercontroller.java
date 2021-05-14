package HMRS.Hmrs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HMRS.Hmrs.business.abstracts.usersevice;
import HMRS.Hmrs.entities.concretes.Users;

@RestController
@RequestMapping("/api/users")
public class usercontroller {
	private usersevice usrservice;
	@Autowired
	public usercontroller(usersevice usrservice) {
		super();
		this.usrservice = usrservice;
	}
	@GetMapping("/getall")
	public List<Users> getAll(){
		return this.usrservice.getAll();
		
	}

}
