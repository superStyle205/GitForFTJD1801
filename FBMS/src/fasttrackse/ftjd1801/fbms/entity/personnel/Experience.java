package fasttrackse.ftjd1801.fbms.entity.personnel;
// Generated Dec 26, 2018 8:20:37 PM by Hibernate Tools 5.2.11.Final

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
 * Experience generated by hbm2java
 */
@Entity
@Table(name = "experience", catalog = "project")
public class Experience implements java.io.Serializable {

	private Integer idExperience;
	private Date timeLine;
	private String workPlace;
	private String describe;
	private Integer idEmployee;

	public Experience() {
	}

	public Experience(Date timeLine, String workPlace, String describe, Integer idEmployee) {
		this.timeLine = timeLine;
		this.workPlace = workPlace;
		this.describe = describe;
		this.idEmployee = idEmployee;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_experience", unique = true, nullable = false)
	public Integer getIdExperience() {
		return this.idExperience;
	}

	public void setIdExperience(Integer idExperience) {
		this.idExperience = idExperience;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "timeLine", length = 10)
	public Date getTimeLine() {
		return this.timeLine;
	}

	public void setTimeLine(Date timeLine) {
		this.timeLine = timeLine;
	}

	@Column(name = "workPlace", length = 150)
	public String getWorkPlace() {
		return this.workPlace;
	}

	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}

	@Column(name = "describe", length = 65535)
	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	@Column(name = "id_employee")
	public Integer getIdEmployee() {
		return this.idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

}
