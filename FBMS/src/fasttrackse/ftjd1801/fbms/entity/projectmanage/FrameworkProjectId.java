package fasttrackse.ftjd1801.fbms.entity.projectmanage;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 * FrameworkProjectId generated by hbm2java
 */
@Embeddable
public class FrameworkProjectId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idProject;
	private String idFramework;
	private String note;

	public FrameworkProjectId() {
	}

	public FrameworkProjectId(Integer idProject, String idFramework, String note) {
		this.idProject = idProject;
		this.idFramework = idFramework;
		this.note = note;
	}

	@Column(name = "id_project")
	public Integer getIdProject() {
		return this.idProject;
	}

	public void setIdProject(Integer idProject) {
		this.idProject = idProject;
	}

	@Column(name = "id_framework", length = 45)
	public String getIdFramework() {
		return this.idFramework;
	}

	public void setIdFramework(String idFramework) {
		this.idFramework = idFramework;
	}

	@Column(name = "note", length = 65535)
	@NotNull
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FrameworkProjectId))
			return false;
		FrameworkProjectId castOther = (FrameworkProjectId) other;

		return ((this.getIdProject() == castOther.getIdProject()) || (this.getIdProject() != null
				&& castOther.getIdProject() != null && this.getIdProject().equals(castOther.getIdProject())))
				&& ((this.getIdFramework() == castOther.getIdFramework())
						|| (this.getIdFramework() != null && castOther.getIdFramework() != null
								&& this.getIdFramework().equals(castOther.getIdFramework())))
				&& ((this.getNote() == castOther.getNote()) || (this.getNote() != null && castOther.getNote() != null
						&& this.getNote().equals(castOther.getNote())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdProject() == null ? 0 : this.getIdProject().hashCode());
		result = 37 * result + (getIdFramework() == null ? 0 : this.getIdFramework().hashCode());
		result = 37 * result + (getNote() == null ? 0 : this.getNote().hashCode());
		return result;
	}

}
