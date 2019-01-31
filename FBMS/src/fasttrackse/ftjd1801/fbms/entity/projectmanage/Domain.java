package fasttrackse.ftjd1801.fbms.entity.projectmanage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Domain generated by hbm2java
 */
@Entity
@Table(name = "domain", catalog = "project")
public class Domain implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idDomain;
	private String nameDomain;

	public Domain() {
	}

	public Domain(String nameDomain) {
		this.nameDomain = nameDomain;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_domain", unique = true, nullable = false)
	public Integer getIdDomain() {
		return this.idDomain;
	}

	public void setIdDomain(Integer idDomain) {
		this.idDomain = idDomain;
	}

	@Column(name = "name_domain", length = 45)
	@NotNull
	public String getNameDomain() {
		return this.nameDomain;
	}

	public void setNameDomain(String nameDomain) {
		this.nameDomain = nameDomain;
	}

}
