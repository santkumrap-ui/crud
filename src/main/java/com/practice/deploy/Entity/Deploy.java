package com.practice.deploy.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "deploy1")
public class Deploy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Auto-generated ID

    private String name;
    private String location;

    // No-args constructor
    public Deploy() {}

    // All-args constructor
    public Deploy(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for location
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Optional: toString() for debugging
    @Override
    public String toString() {
        return "Deploy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

/* 
 
 error fix;
 
 alter table deploy modify column id BIGINT;
CREATE TABLE deploy1 (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    location VARCHAR(255)
);
 
 *@Entity
@Table(name ="deploy")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Deploy {
    
	@Id
	private Integer id;
	private String name;
	private String location;
	
	public Deploy() {
		
	}
	public Deploy(Integer i, String string, String string2) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.location=string2;
		this.name=string;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}*/
