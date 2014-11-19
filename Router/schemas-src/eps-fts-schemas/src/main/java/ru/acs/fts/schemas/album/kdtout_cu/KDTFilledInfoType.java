
package ru.acs.fts.schemas.album.kdtout_cu;

import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.CUESADCustomsRepresentativeType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;

/** 
 * �������� � ���������� ���
 */
public class KDTFilledInfoType
{
    private ESADFilledPersonType filledPerson;
    private CUESADCustomsRepresentativeType customsRepresentative;

    /** 
     * Get the 'FilledPerson' element value. �������� � ����, ����������� ���
     * 
     * @return value
     */
    public ESADFilledPersonType getFilledPerson() {
        return filledPerson;
    }

    /** 
     * Set the 'FilledPerson' element value. �������� � ����, ����������� ���
     * 
     * @param filledPerson
     */
    public void setFilledPerson(ESADFilledPersonType filledPerson) {
        this.filledPerson = filledPerson;
    }

    /** 
     * Get the 'CustomsRepresentative' element value. ���������� �������������
     * 
     * @return value
     */
    public CUESADCustomsRepresentativeType getCustomsRepresentative() {
        return customsRepresentative;
    }

    /** 
     * Set the 'CustomsRepresentative' element value. ���������� �������������
     * 
     * @param customsRepresentative
     */
    public void setCustomsRepresentative(
            CUESADCustomsRepresentativeType customsRepresentative) {
        this.customsRepresentative = customsRepresentative;
    }
}
