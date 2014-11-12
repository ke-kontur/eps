
package ru.acs.fts.schemas.album.cwformular;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Должностное лицо таможенного органа
 */
public class InspectorType extends CustomsPersonType
{
    private String personPost;

    /** 
     * Get the 'PersonPost' element value. Должность.
     * 
     * @return value
     */
    public String getPersonPost() {
        return personPost;
    }

    /** 
     * Set the 'PersonPost' element value. Должность.
     * 
     * @param personPost
     */
    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }
}
