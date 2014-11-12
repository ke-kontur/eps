
package ru.acs.fts.schemas.album.sqcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * Уполномоченное должностное лицо
 */
public class AuthorizedPersonType extends CustomsPersonType
{
    private String personPost;

    /** 
     * Get the 'PersonPost' element value. Должность
     * 
     * @return value
     */
    public String getPersonPost() {
        return personPost;
    }

    /** 
     * Set the 'PersonPost' element value. Должность
     * 
     * @param personPost
     */
    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }
}
