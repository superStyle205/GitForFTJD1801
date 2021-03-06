package fasttrackse.ftjd1801.fbms.dao.projectmanage;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fasttrackse.ftjd1801.fbms.entity.projectmanage.ProgramingLanguage;

@Repository
public class ProgramingLanguageDaoImpl extends AbstractDao<Integer, ProgramingLanguage>
		implements ProgramingLanguageDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public ProgramingLanguage findById(int id) {
		return getByKey(id);
	}

	@Override
	public void addNew(ProgramingLanguage pl) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(pl);
		tx.commit();
		session.close();
	}

	@Override
	public void update(ProgramingLanguage pl) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(pl);
		tx.commit();
		session.close();
	}

	@Override
	public void delete(int id) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(session.get(ProgramingLanguage.class, id));
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProgramingLanguage> listAll(String search) {
		Criteria criteria = createEntityCriteria();
		Criterion cond = Restrictions.ilike("nameLanguage", "%" + search + "%");
		criteria.add(cond);
		return (List<ProgramingLanguage>) criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProgramingLanguage> listForPagination(int fromIndex, int toIndex, String search) {
		Criteria criteria = createEntityCriteria();
		Criterion cond = Restrictions.ilike("nameLanguage", "%" + search + "%");
		criteria.add(cond);
		return (List<ProgramingLanguage>) criteria.list().subList(fromIndex, toIndex);
	}

}
