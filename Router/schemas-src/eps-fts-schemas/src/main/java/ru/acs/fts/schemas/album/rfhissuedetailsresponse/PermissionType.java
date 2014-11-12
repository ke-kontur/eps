
package ru.acs.fts.schemas.album.rfhissuedetailsresponse;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����������
 */
public class PermissionType extends DocumentBaseType
{
    private LocalDate endDate;

    /** 
     * Get the 'EndDate' element value. ������������� ��
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. ������������� ��
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
