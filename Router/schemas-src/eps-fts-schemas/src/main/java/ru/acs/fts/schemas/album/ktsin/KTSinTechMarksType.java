
package ru.acs.fts.schemas.album.ktsin;

import org.joda.time.LocalDate;

/** 
 * ���. ���������� ������. ��������������� �������.
 */
public class KTSinTechMarksType
{
    private LocalDate modificationDate;
    private String modificationTime;

    /** 
     * Get the 'ModificationDate' element value. ���� ���������� �������� ��������� � ��������.
     * 
     * @return value
     */
    public LocalDate getModificationDate() {
        return modificationDate;
    }

    /** 
     * Set the 'ModificationDate' element value. ���� ���������� �������� ��������� � ��������.
     * 
     * @param modificationDate
     */
    public void setModificationDate(LocalDate modificationDate) {
        this.modificationDate = modificationDate;
    }

    /** 
     * Get the 'ModificationTime' element value. ����� ���������� �������� ��������� � ���.
     * 
     * @return value
     */
    public String getModificationTime() {
        return modificationTime;
    }

    /** 
     * Set the 'ModificationTime' element value. ����� ���������� �������� ��������� � ���.
     * 
     * @param modificationTime
     */
    public void setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
    }
}
