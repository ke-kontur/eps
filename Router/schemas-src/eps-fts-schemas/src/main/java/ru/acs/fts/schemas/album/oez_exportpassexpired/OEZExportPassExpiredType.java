
package ru.acs.fts.schemas.album.oez_exportpassexpired;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;

/** 
 * ����������� �� ������������� ����������
 */
public class OEZExportPassExpiredType extends BaseDocType
{
    private LocalDate dateEnd;
    private PassRegNumberType passRegNumber;
    private CustomsPersonType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'DateEnd' element value. ���� �������������
     * 
     * @return value
     */
    public LocalDate getDateEnd() {
        return dateEnd;
    }

    /** 
     * Set the 'DateEnd' element value. ���� �������������
     * 
     * @param dateEnd
     */
    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    /** 
     * Get the 'PassRegNumber' element value. ��������������� ����� ����������
     * 
     * @return value
     */
    public PassRegNumberType getPassRegNumber() {
        return passRegNumber;
    }

    /** 
     * Set the 'PassRegNumber' element value. ��������������� ����� ����������
     * 
     * @param passRegNumber
     */
    public void setPassRegNumber(PassRegNumberType passRegNumber) {
        this.passRegNumber = passRegNumber;
    }

    /** 
     * Get the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. ����������� ���� ����������� ������
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
