
package ru.acs.fts.schemas.album.commonaggregatetypescust;

import org.joda.time.LocalDate;

/** 
 * �������� � ���������, �������������� ����������
 */
public class AuthoritesDocumentType extends DocumentBaseType
{
    private LocalDate complationAuthorityDate;

    /** 
     * Get the 'ComplationAuthorityDate' element value. ���� ��������� ����������
     * 
     * @return value
     */
    public LocalDate getComplationAuthorityDate() {
        return complationAuthorityDate;
    }

    /** 
     * Set the 'ComplationAuthorityDate' element value. ���� ��������� ����������
     * 
     * @param complationAuthorityDate
     */
    public void setComplationAuthorityDate(LocalDate complationAuthorityDate) {
        this.complationAuthorityDate = complationAuthorityDate;
    }
}
