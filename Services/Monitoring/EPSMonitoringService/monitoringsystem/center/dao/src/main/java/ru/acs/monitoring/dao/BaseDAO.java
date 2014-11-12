package ru.acs.monitoring.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Интерфейс для базового дао
 * @author fmv
 *
 * @param <T>
 */
public interface BaseDAO<T> {
	/**
	 * Найти все объекты
	 * @return
	 */
	public List<T> findAll();

	/**
	 * Найти объект по id 
	 * @param id
	 * @return
	 */
	public T findById(Serializable id);

	/**
	 * Сохранить объект 
	 * @param entity
	 */
	public void save(T entity);

	/**
	 * Удалить объект 
	 * @param entity
	 */
	public void remove(T entity);

	/**
	 * Обновить объект
	 * @param entity
	 * @return
	 */
	T update(T entity);

    /**
     * Возвращает {@code true} если источник содержит заданный объект.
     *
     * @return {@code true} если источник содержит заданный объект.
     */
    boolean contains(T entity);
}
