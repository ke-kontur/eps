package ru.acs.fts.eps2.model.entities;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

public class Edecl_Action_Event_Condition_Ids implements Serializable // NO_UCD (use default)
{
	private static final long serialVersionUID = 1L;

	public Edecl_Action_Event_Condition_Ids(){

    }

    private String eventName;
    private String conditionName;

    public String getEventName() {
        return eventName;
    }

    public String getConditionName() {
        return conditionName;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (obj.getClass() != getClass())
            return false;
        Edecl_Action_Event_Condition_Ids ids = (Edecl_Action_Event_Condition_Ids)obj;
        return new EqualsBuilder().append(eventName, ids.getEventName()).
                                   append(conditionName, ids.getConditionName()).isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 31).append(eventName).append(conditionName).toHashCode();
    }
}
