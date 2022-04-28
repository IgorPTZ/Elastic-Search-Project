package elasticsearch.project.document;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Vehicle {
	
	private String id;
	
	private String number;
	
	private String name;
	
	@JsonFormat(pattern = "yyy-MM-dd")
	private Date created;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
