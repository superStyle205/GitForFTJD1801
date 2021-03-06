package fasttrackse.ftjd1801.fbms.entity.projectmanage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ProgramingLanguageProject generated by hbm2java
 */
@Entity
@Table(name = "programing_language_project", catalog = "project")
public class ProgramingLanguageProject implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer idProject;
	private Integer idLanguage;

	public ProgramingLanguageProject() {
	}

	public ProgramingLanguageProject(Integer idLanguage) {
		this.idLanguage = idLanguage;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_project", unique = true, nullable = false)
	public Integer getIdProject() {
		return this.idProject;
	}

	public void setIdProject(Integer idProject) {
		this.idProject = idProject;
	}

	@Column(name = "id_language")
	public Integer getIdLanguage() {
		return this.idLanguage;
	}

	public void setIdLanguage(Integer idLanguage) {
		this.idLanguage = idLanguage;
	}

}
