package ru.acs.monitoring.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import ru.acs.fts.dto.monitoring.DbAvailableSizeInfo;
import ru.acs.fts.dto.monitoring.MessageProcessingInfo;

/**
 * Класс для выполнения SQL запросов
 * 
 * @author fmv
 * 
 */
public class DBQuery {
	final static Logger log = LoggerFactory.getLogger(DBQuery.class);
	private JdbcTemplate jdbcTemplate;

	/**
	 * Запрос получения инф. о свободном месте в табл. простр-х
	 */
	final static String SQL_AVAILABLE = " SELECT   df.tablespace_name TABLESPACE,    df.total_space TOTAL_SPACE,    fs.free_space FREE_SPACE,    df.total_space_mb TOTAL_SPACE_MB,    (df.total_space_mb - fs.free_space_mb) USED_SPACE_MB,    fs.free_space_mb FREE_SPACE_MB,    df.MAX_BYTES_MB,    ROUND (100 * (fs.free_space / (df.total_space)), 2) PCT_FREE,    ROUND (   100   * ( (df.max_bytes - (df.total_space - fs.free_space))  /( df.max_bytes)),   2    )   PCT_AVAILABLE FROM   (  SELECT   tablespace_name,  SUM (bytes) TOTAL_SPACE,  ROUND (SUM (bytes) / 1048576) TOTAL_SPACE_MB,  ROUND(SUM(DECODE (maxbytes, 0, bytes, maxbytes)) / 1048576) MAX_BYTES_MB, sum(DECODE (maxbytes,0,BYTES,maxbytes)) MAX_BYTES   FROM   dba_data_files GROUP BY   tablespace_name) df,  (  SELECT   tablespace_name,  SUM (bytes) FREE_SPACE,  ROUND (SUM (bytes) / 1048576) FREE_SPACE_MB FROM   dba_free_space GROUP BY   tablespace_name) fs    WHERE   df.tablespace_name = fs.tablespace_name(+) ORDER BY   fs.tablespace_name";

	/**
	 * Используется для проверки соединения с БД
	 * 
	 * @return 0 если все ок
	 */
	public int getCount() {
		log.debug("Запрос проверки доступности БД");
		return this.jdbcTemplate.queryForInt("select count(null) from dual");
	}

	/**
	 * Вычисляет ифнормацию о таблицных пространствах БД
	 * 
	 * @return список с информацией о свободном месте в табл. пространствах
	 */
	@SuppressWarnings("unchecked")
	public Collection getAvailableInfo() {
		log.debug("Запрос проверки свободного места в БД");
		return this.jdbcTemplate.query(SQL_AVAILABLE, new AvailableInfoMapper());
	}

	/**
	 * Вычисляет ифнормацию о таблицных пространствах БД
	 * 
	 * @return список с информацией о свободном месте в табл. пространствах
	 */
	@SuppressWarnings("unchecked")
	public Collection<MessageProcessingInfo> getMessageProcessingInfo(String SQL) {
		log.debug("Запрос получения статистики обработанных сообщений");
		return this.jdbcTemplate.query(SQL, new MessageProcessingMapper());
	}
	
	/**
	 * Выполняет указанный поисковый sql-запрос
	 *  
	 * @return 
	 */
	@SuppressWarnings("unchecked")
	public <T> List<T> makeSearch(String sql, ParameterizedRowMapper<T> mapper) {
		log.debug("Выполнение поискового запроса");
		return this.jdbcTemplate.query(sql, mapper);
	}

	/**
	 * 
	 * @param dataSource
	 *            - на котором будут выполняться запросы
	 */
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/**
	 * Маппер для извлечения инфю из RS для SQL_AVAILABLE
	 * 
	 * @author fmv
	 * 
	 */
	private static final class AvailableInfoMapper implements RowMapper {

		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			DbAvailableSizeInfo info = new DbAvailableSizeInfo();
			info.setUsedSpace(rs.getDouble("USED_SPACE_MB"));
			info.setMaxSpace(rs.getDouble("MAX_BYTES_MB"));
			info.setAvailablePercent(rs.getDouble("PCT_AVAILABLE"));
			info.setTablespace(rs.getString("TABLESPACE"));
			return info;
		}
	}

	/**
	 * Маппер для запроса для обработанных сообщений
	 * 
	 * @author fmv
	 * 
	 */
	private static final class MessageProcessingMapper implements RowMapper {

		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			MessageProcessingInfo info = new MessageProcessingInfo();
			info.setMessageKind(rs.getString(1));
			info.setMessageDescription(rs.getString(2));
			info.setSuccessCount(rs.getLong(3));
			info.setFlkErrCount(rs.getLong(4));
			info.setErrCount(rs.getLong(5));
			if (rs.getMetaData().getColumnCount() > 5) {
				info.setNumberField1(rs.getLong(6));
			}
			if (rs.getMetaData().getColumnCount() > 6) {
				info.setNumberField2(rs.getLong(7));
			}
			if (rs.getMetaData().getColumnCount() > 7) {
				info.setNumberField3(rs.getLong(8));
			}

			return info;
		}
	}
}
