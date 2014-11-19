
package ru.acs.fts.schemas.album.movementconfirmation;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ����������� � ����������� �����/������ ������
 */
public class MovementConfirmationType extends BaseDocType
{
    private String docSign;
    private LocalDate movementDate;
    private String comments;
    private RegistrationNumberType registrationNumber;
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. ������� �����������: 0 - � �����; 1 - �� ������ �������
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. ������� �����������: 0 - � �����; 1 - �� ������ �������
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'MovementDate' element value. ���� ������������ �����/������ �������
     * 
     * @return value
     */
    public LocalDate getMovementDate() {
        return movementDate;
    }

    /** 
     * Set the 'MovementDate' element value. ���� ������������ �����/������ �������
     * 
     * @param movementDate
     */
    public void setMovementDate(LocalDate movementDate) {
        this.movementDate = movementDate;
    }

    /** 
     * Get the 'Comments' element value. ����������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. ����������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� ����� ����������� � �����/������
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� ����� ����������� � �����/������
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
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
