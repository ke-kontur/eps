
package ru.acs.fts.schemas.album.sqcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * �������������� ����������� ����
 */
public class AuthorizedPersonType extends CustomsPersonType
{
    private String personPost;

    /** 
     * Get the 'PersonPost' element value. ���������
     * 
     * @return value
     */
    public String getPersonPost() {
        return personPost;
    }

    /** 
     * Set the 'PersonPost' element value. ���������
     * 
     * @param personPost
     */
    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }
}
