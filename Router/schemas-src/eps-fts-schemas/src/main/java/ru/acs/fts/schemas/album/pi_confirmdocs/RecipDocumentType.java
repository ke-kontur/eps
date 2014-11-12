
package ru.acs.fts.schemas.album.pi_confirmdocs;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� � ���������� ����������.
 */
public class RecipDocumentType extends DocumentBaseType
{
    private String recipDocumentID;
    private LocalDate recipDocDate;
    private LocalDate recipDate;
    private String recipTime;

    /** 
     * Get the 'RecipDocumentID' element value. ���������� ������������� ����������� ���������
     * 
     * @return value
     */
    public String getRecipDocumentID() {
        return recipDocumentID;
    }

    /** 
     * Set the 'RecipDocumentID' element value. ���������� ������������� ����������� ���������
     * 
     * @param recipDocumentID
     */
    public void setRecipDocumentID(String recipDocumentID) {
        this.recipDocumentID = recipDocumentID;
    }

    /** 
     * Get the 'RecipDocDate' element value. ���� �������� ����������� ���������.
     * 
     * @return value
     */
    public LocalDate getRecipDocDate() {
        return recipDocDate;
    }

    /** 
     * Set the 'RecipDocDate' element value. ���� �������� ����������� ���������.
     * 
     * @param recipDocDate
     */
    public void setRecipDocDate(LocalDate recipDocDate) {
        this.recipDocDate = recipDocDate;
    }

    /** 
     * Get the 'RecipDate' element value. ���� ��������� ���������.
     * 
     * @return value
     */
    public LocalDate getRecipDate() {
        return recipDate;
    }

    /** 
     * Set the 'RecipDate' element value. ���� ��������� ���������.
     * 
     * @param recipDate
     */
    public void setRecipDate(LocalDate recipDate) {
        this.recipDate = recipDate;
    }

    /** 
     * Get the 'RecipTime' element value. ����� ��������� ���������.
     * 
     * @return value
     */
    public String getRecipTime() {
        return recipTime;
    }

    /** 
     * Set the 'RecipTime' element value. ����� ��������� ���������.
     * 
     * @param recipTime
     */
    public void setRecipTime(String recipTime) {
        this.recipTime = recipTime;
    }
}
