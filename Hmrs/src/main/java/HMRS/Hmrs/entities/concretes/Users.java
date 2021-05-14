package HMRS.Hmrs.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jabposition")
public class Users {
	@Id
	@GeneratedValue
	@Column(name="jabposition_id")
	private int id;
	@Column(name="jabposition_pozitionname")
	private String positionname;
	
	
	public Users(int id, String positionname) {
		super();
		this.id = id;
		this.positionname = positionname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPositionname() {
		return positionname;
	}
	public void setPositionname(String positionname) {
		this.positionname = positionname;
	}

}
