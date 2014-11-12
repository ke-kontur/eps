package ru.acs.monitoring.dao.jpa;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.orm.jpa.support.JpaDaoSupport;

import ru.acs.monitoring.dao.BaseDAO;

/**
 * JPA реализация для дао
 * @author fmv
 *
 * @param <T>
 */
public class JpaBaseDAO<T> extends JpaDaoSupport implements BaseDAO<T> {
	
	/*
	 * (non-Javadoc)
	 * @see ru.acs.monitoring.dao.BaseDAO#findAll()
	 */
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return getJpaTemplate().find("from " + getGenericClass().getName());
	}

	/*
	 * (non-Javadoc)
	 * @see ru.acs.monitoring.dao.BaseDAO#findById(java.io.Serializable)
	 */
	public T findById(Serializable id) {
		return getJpaTemplate().find(getGenericClass(), id);
	}

	
	@SuppressWarnings("unchecked")
	private Class<T> getGenericClass() {
		return ((Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0]);
	}

	/*
	 * (non-Javadoc)
	 * @see ru.acs.monitoring.dao.BaseDAO#remove(java.lang.Object)
	 */
	public void remove(T entity) {
		getJpaTemplate().remove(entity);
	}

	/*
	 * (non-Javadoc)
	 * @see ru.acs.monitoring.dao.BaseDAO#save(java.lang.Object)
	 */
	public void save(T entity) {
		getJpaTemplate().persist(entity);
	}

	/*
	 * (non-Javadoc)
	 * @see ru.acs.monitoring.dao.BaseDAO#update(java.lang.Object)
	 */
	public T update(T entity) {
		return getJpaTemplate().merge(entity);
	}

    /** {@inheritDoc} */
    public boolean contains(T entity) {
    return getJpaTemplate().contains(entity);
    }
}
