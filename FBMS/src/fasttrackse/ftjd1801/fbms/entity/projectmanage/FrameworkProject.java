package fasttrackse.ftjd1801.fbms.entity.projectmanage;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * FrameworkProject generated by hbm2java
 */
@Entity
@Table(name = "framework_project", catalog = "companymanagement")
public class FrameworkProject implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private FrameworkProjectId id;

	public FrameworkProject() {
	}

	public FrameworkProject(FrameworkProjectId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idProject", column = @Column(name = "id_project")),
			@AttributeOverride(name = "idFramework", column = @Column(name = "id_framework", length = 45)),
			@AttributeOverride(name = "note", column = @Column(name = "note", length = 65535)) })
	public FrameworkProjectId getId() {
		return this.id;
	}

	public void setId(FrameworkProjectId id) {
		this.id = id;
	}

}