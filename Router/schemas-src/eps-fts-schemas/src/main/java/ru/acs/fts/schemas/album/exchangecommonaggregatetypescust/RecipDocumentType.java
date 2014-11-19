
package ru.acs.fts.schemas.album.exchangecommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ���������� ���������
 */
public class RecipDocumentType extends DocumentBaseType
{
    private String recipDocumentID;
    private String recipDocumentModeID;
    private String recipDocTime;
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
     * Get the 'RecipDocumentModeID' element value. ��� ���� ����������� ���������
     * 
     * @return value
     */
    public String getRecipDocumentModeID() {
        return recipDocumentModeID;
    }

    /** 
     * Set the 'RecipDocumentModeID' element value. ��� ���� ����������� ���������
     * 
     * @param recipDocumentModeID
     */
    public void setRecipDocumentModeID(String recipDocumentModeID) {
        this.recipDocumentModeID = recipDocumentModeID;
    }

    /** 
     * Get the 'RecipDocTime' element value. ����� �������� ����������� ���������.
     * 
     * @return value
     */
    public String getRecipDocTime() {
        return recipDocTime;
    }

    /** 
     * Set the 'RecipDocTime' element value. ����� �������� ����������� ���������.
     * 
     * @param recipDocTime
     */
    public void setRecipDocTime(String recipDocTime) {
        this.recipDocTime = recipDocTime;
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
