
package ru.acs.fts.schemas.album.hemicalmeansprotectionplants;

import ru.acs.fts.schemas.album.sqcommonaggregatetypescust.AuthorizedPersonType;

/** 
 * �������������� ����������� ����, ����������� ����������
 */
public class PersonConclusionType extends AuthorizedPersonType
{
    private String stampNumber;

    /** 
     * Get the 'StampNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getStampNumber() {
        return stampNumber;
    }

    /** 
     * Set the 'StampNumber' element value. ����� ������
     * 
     * @param stampNumber
     */
    public void setStampNumber(String stampNumber) {
        this.stampNumber = stampNumber;
    }
}
