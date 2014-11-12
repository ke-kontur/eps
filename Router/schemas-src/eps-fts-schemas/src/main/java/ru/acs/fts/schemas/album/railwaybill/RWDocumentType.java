
package ru.acs.fts.schemas.album.railwaybill;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.DocumentType;

/** 
 * ���������, ����������� ������������
 */
public class RWDocumentType extends DocumentType
{
    private LocalDate expirationDate;
    private String releaseCustoms;

    /** 
     * Get the 'ExpirationDate' element value. ���� ��������� �������� ���������
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. ���� ��������� �������� ���������
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /** 
     * Get the 'ReleaseCustoms' element value. ���������� ����� �������� ��������
     * 
     * @return value
     */
    public String getReleaseCustoms() {
        return releaseCustoms;
    }

    /** 
     * Set the 'ReleaseCustoms' element value. ���������� ����� �������� ��������
     * 
     * @param releaseCustoms
     */
    public void setReleaseCustoms(String releaseCustoms) {
        this.releaseCustoms = releaseCustoms;
    }
}
