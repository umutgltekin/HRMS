package HMRS.Hmrs.dataAccess.abstarcts;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import HMRS.Hmrs.entities.concretes.Users;

public interface usersdao extends JpaRepository<Users,Integer> {

}
