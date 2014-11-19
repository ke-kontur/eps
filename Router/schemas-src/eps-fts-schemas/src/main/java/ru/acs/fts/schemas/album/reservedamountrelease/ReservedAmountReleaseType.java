
package ru.acs.fts.schemas.album.reservedamountrelease;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * ���������� � ����������������� ����� �� ���������� � �������� ��������������
 */
public class ReservedAmountReleaseType extends BaseDocType
{
    private LocalDate reserveDate;
    private String reserveAmount;
    private LocalDate releaseReserveDate;
    private String releaseReason;
    private String operationIndicator;
    private AdditionalInfoType additionalInfo;
    private String documentModeID;

    /** 
     * Get the 'ReserveDate' element value. ���� ��������������  �����
     * 
     * @return value
     */
    public LocalDate getReserveDate() {
        return reserveDate;
    }

    /** 
     * Set the 'ReserveDate' element value. ���� ��������������  �����
     * 
     * @param reserveDate
     */
    public void setReserveDate(LocalDate reserveDate) {
        this.reserveDate = reserveDate;
    }

    /** 
     * Get the 'ReserveAmount' element value. �����, ������� ���� ���������������/ ������������.
     * 
     * @return value
     */
    public String getReserveAmount() {
        return reserveAmount;
    }

    /** 
     * Set the 'ReserveAmount' element value. �����, ������� ���� ���������������/ ������������.
     * 
     * @param reserveAmount
     */
    public void setReserveAmount(String reserveAmount) {
        this.reserveAmount = reserveAmount;
    }

    /** 
     * Get the 'ReleaseReserveDate' element value. ���� ������������� ����������������� �����.
     * 
     * @return value
     */
    public LocalDate getReleaseReserveDate() {
        return releaseReserveDate;
    }

    /** 
     * Set the 'ReleaseReserveDate' element value. ���� ������������� ����������������� �����.
     * 
     * @param releaseReserveDate
     */
    public void setReleaseReserveDate(LocalDate releaseReserveDate) {
        this.releaseReserveDate = releaseReserveDate;
    }

    /** 
     * Get the 'ReleaseReason' element value. ������� ������������� ����������������� �����.
     * 
     * @return value
     */
    public String getReleaseReason() {
        return releaseReason;
    }

    /** 
     * Set the 'ReleaseReason' element value. ������� ������������� ����������������� �����.
     * 
     * @param releaseReason
     */
    public void setReleaseReason(String releaseReason) {
        this.releaseReason = releaseReason;
    }

    /** 
     * Get the 'OperationIndicator' element value. ��������� ���� ����������� ��������: 1 - �������������� �����, 0 - ������������� ����������������� �����
     * 
     * @return value
     */
    public String getOperationIndicator() {
        return operationIndicator;
    }

    /** 
     * Set the 'OperationIndicator' element value. ��������� ���� ����������� ��������: 1 - �������������� �����, 0 - ������������� ����������������� �����
     * 
     * @param operationIndicator
     */
    public void setOperationIndicator(String operationIndicator) {
        this.operationIndicator = operationIndicator;
    }

    /** 
     * Get the 'AdditionalInfo' element value. �������� � ���������� � �������� ��������������
     * 
     * @return value
     */
    public AdditionalInfoType getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'AdditionalInfo' element value. �������� � ���������� � �������� ��������������
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(AdditionalInfoType additionalInfo) {
        this.additionalInfo = additionalInfo;
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
