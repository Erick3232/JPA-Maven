package dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private Integer phone;
	private Date date;
	private Integer CPF;
	private double salary;
	private String department;
	
	
	public Pessoa() {
	}
	public Pessoa(Integer id, String name, String email, Integer phone, Date date, Integer CPF, double salary, String department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.date = date;
		this.CPF = CPF;
		this.salary = salary;
		this.department = department;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getCPF() {
		return CPF;
	}
	public void setCPF(Integer cPF) {
		CPF = cPF;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", date=" + date
				+ ", CPF=" + CPF + ", salary=" + salary + "]";
	}
	
	
	
}
