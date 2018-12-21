package fasttrackse.ftjd1801.fbms.entity.projectmanage;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "customer", catalog = "companymanagement")
public class Customer implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCustomer;
	private String nameCustomer;
	private Integer contact;
	private String email;
	private Integer sex;
	private String address;
	private Date dayOfBirth;

	public Customer() {
	}

	public Customer(String nameCustomer, Integer contact, String email, Integer sex, String address, Date dayOfBirth) {
		this.nameCustomer = nameCustomer;
		this.contact = contact;
		this.email = email;
		this.sex = sex;
		this.address = address;
		this.dayOfBirth = dayOfBirth;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_customer", unique = true, nullable = false)
	public Integer getIdCustomer() {
		return this.idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	@Column(name = "name_customer", length = 45)
	public String getNameCustomer() {
		return this.nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	@Column(name = "contact")
	public Integer getContact() {
		return this.contact;
	}

	public void setContact(Integer contact) {
		this.contact = contact;
	}

	@Column(name = "email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "sex")
	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	@Column(name = "address", length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dayOfBirth", length = 10)
	public Date getDayOfBirth() {
		return this.dayOfBirth;
	}

	public void setDayOfBirth(Date dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

}
