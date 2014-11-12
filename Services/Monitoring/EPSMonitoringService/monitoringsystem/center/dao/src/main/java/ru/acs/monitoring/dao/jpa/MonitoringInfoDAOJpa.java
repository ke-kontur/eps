package ru.acs.monitoring.dao.jpa;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.jpa.JpaCallback;

import ru.acs.monitoring.dao.MonitoringInfoDAO;
import ru.acs.monitoring.domain.Connection;
import ru.acs.monitoring.domain.MonitoringInf;
import ru.acs.monitoring.domain.MonitoringInfoData;

/**
 * JPA реализация MonitoringInfoDAO
 * 
 * @author fmv
 * 
 */
public class MonitoringInfoDAOJpa extends JpaBaseDAO<MonitoringInf> implements MonitoringInfoDAO {
	Logger log = LoggerFactory.getLogger(MonitoringInfoDAOJpa.class);
	/*
	 * (non-Javadoc)
	 * 
	 * @see ru.acs.monitoring.dao.jpa.JpaBaseDAO#findAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<MonitoringInf> findAll() {
		return getJpaTemplate().find("from " + MonitoringInf.class.getName() + " order by updatedate desc");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ru.acs.monitoring.dao.MonitoringInfoDAO#findLast()
	 */
	@SuppressWarnings("unchecked")
	public List<MonitoringInf> findLast() {
		return getJpaTemplate().find(
				"from " + MonitoringInf.class.getName() + " as M where M.id in (select max(m1.id) from "
						+ MonitoringInf.class.getName() + " m1 join m1.connection group by m1.connection) ");
	}
	
	/**
	 * Поиск предпоследней информации по всем мониторуемым объектам 
	 * @return
	 */
	public List<MonitoringInf> findPreLast() {
		return getJpaTemplate().find(
				"from " + MonitoringInf.class.getName() + " as M where M.id in (select max(m1.id) from "
						+ MonitoringInf.class.getName() + " m1 join m1.connection where m1.id not in (select max(m2.id) from "
						+ MonitoringInf.class.getName() + " m2 join m2.connection group by m2.connection) group by m1.connection) ");
	}

	@SuppressWarnings("unchecked")
	public List<MonitoringInf> find(final Date from, final Date to, final Connection connection, final String severity,
			final int limit, final int offset) {
		return (List<MonitoringInf>) getJpaTemplate().execute(new JpaCallback() {
			public Object doInJpa(EntityManager em) throws PersistenceException {
				String sql = "from " + MonitoringInf.class.getName()
						+ " as M where  m.updateDate>=:fromDate and m.updateDate<=:toDate";
				if (connection != null) {
					sql += " and m.connection=:connection";
				}
				if (severity != null) {
					sql += " and m.severity=:severity";
				}
				sql+= " order by m.updateDate desc";
				Query query = em.createQuery(sql);

				// это c параметрами не работает в derby 10.5.3 - в 10.6 исправили				
				//query=query.setFirstResult(offset).setMaxResults(limit);				
				
				query.setParameter("fromDate", from);
				query.setParameter("toDate", to);
				if (connection != null) {
					query.setParameter("connection", connection);
				}
				if (severity != null) {
					query.setParameter("severity", severity);
				}	
				List result = query.getResultList();
				return result;
			}
		});
	}
	
	public int delete(final Date to){
		return ((Integer) getJpaTemplate().execute(new JpaCallback() {			
			public Object doInJpa(EntityManager em) throws PersistenceException {
				return new Integer(em.createNativeQuery("delete from "+MonitoringInf.class.getSimpleName()+" m where m.updateDate<=:toDate").setParameter("toDate", to,TemporalType.DATE).executeUpdate());
			}
		})).intValue();
	}
	public void copmress(){
		getJpaTemplate().execute(new JpaCallback() {			
			public Object doInJpa(EntityManager em) throws PersistenceException {
				try{
					//Только для дерби
					em.createNativeQuery("call SYSCS_UTIL.SYSCS_COMPRESS_TABLE('APP', 'MONITORINGINF', 0)").executeUpdate();
				}catch(Exception e){
					log.warn("Ошибка компрессии таблиц, возможно БД не DERBY. Ошибка:"+ e.getMessage());
				}				
				return null;
			}
		});		
	}

	@Override
	public String getXML(final MonitoringInf inf) {
		return (String) getJpaTemplate().execute(new JpaCallback() {
			
			public Object doInJpa(EntityManager em) throws PersistenceException {
				/*String jpql = "from MonitoringInfoData data where data.id = ANY (select inf.monitoringInfoData.id from MonitoringInf inf where inf.id = :id)";
				Query query = em.createQuery(jpql);
				query.setParameter("id", inf.getId());
				List<MonitoringInfoData> result = (List<MonitoringInfoData>)query.getResultList();				
				return result.get(0).getMonitoringInfoXML();*/
				return findById(inf.getId()).getMonitoringInfoData().getMonitoringInfoXML();
				//return inf.getMonitoringInfoData().getMonitoringInfoXML();
			}
		});
	}
	
	

}
