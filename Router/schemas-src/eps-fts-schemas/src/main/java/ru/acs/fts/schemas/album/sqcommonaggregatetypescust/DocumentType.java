
package ru.acs.fts.schemas.album.sqcommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ����������
 */
public class DocumentType extends DocumentBaseType
{
    private LocalDate dateTo;

    /** 
     * Get the 'DateTo' element value. ���� �������� ����������
     * 
     * @return value
     */
    public LocalDate getDateTo() {
        return dateTo;
    }

    /** 
     * Set the 'DateTo' element value. ���� �������� ����������
     * 
     * @param dateTo
     */
    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }
}
