package HMRS.Hmrs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HMRS.Hmrs.business.abstracts.usersevice;
import HMRS.Hmrs.dataAccess.abstarcts.usersdao;
import HMRS.Hmrs.entities.concretes.Users;
@Service
public class usrmanager implements usersevice {
	private usersdao usersdaoo;
	@Autowired
	public usrmanager(usersdao usersdaoo) {
		super();
		this.usersdaoo = usersdaoo;
	}
	
	@Override
	public List<Users> getAll() {
	
		return this.usersdaoo.findAll();
	}



}
