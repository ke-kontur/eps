package ru.acs.fts.eps2.model.entities;

import javax.persistence.*;

/**
 * User: CAA
 * Date: 28.12.2012
 * Time: 12:00
 */

@Entity
@IdClass(Edecl_Action_Event_Condition_Ids.class)
@Table(name = "EDECL_ACTION_EVENT_CONDITION")
@Deprecated
public class Edecl_Action_Event_Condition { // NO_UCD (marked for remove)
    public Edecl_Action_Event_Condition(){

    }

    @Id
    @Column(name="AEC_EVENTNAME", length = 100, nullable = false)
    private String eventName;
    @Id
    @Column(name="AEC_CONDITIONNAME", nullable = false, length = 100)
    private String conditionName;

    public String getEventName() {
        return eventName;
    }

    public String getConditionName() {
        return conditionName;
    }
}
