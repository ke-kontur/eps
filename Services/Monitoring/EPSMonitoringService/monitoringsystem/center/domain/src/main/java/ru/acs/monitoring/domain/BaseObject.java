package ru.acs.monitoring.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Базовый хранимый объект.
 *
 * @author fmv
 * @author Алексей Селиванов
 */
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class BaseObject implements Serializable {
	
	@GeneratedValue
	@Id private Long id;

    /**
     * Возвращает идентификатор.
     * @return идентификатор.
     */
	public Long getId() { return id; }

    /**
     * Устанавливает идентификатор.
     * @param id идентификатор.
     */
	public void setId(Long id) { this.id = id; }


// java.lang.Object
    /** {@inheritDoc} */
	@Override public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

    /** {@inheritDoc} */
	@Override public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (getClass() != o.getClass()) return false;
		if (!(o instanceof BaseObject)) return super.equals(o);

		BaseObject that = (BaseObject) o;
		if (this.getId() == null && that.getId() == null)
			return super.equals(o);
		if (this.getId() == null || that.getId() == null)
			return false;
		else
			return this.getId().equals(((BaseObject) o).getId());
	}
}
