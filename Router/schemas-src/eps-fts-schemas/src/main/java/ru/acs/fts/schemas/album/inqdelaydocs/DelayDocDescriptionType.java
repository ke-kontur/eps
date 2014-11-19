
package ru.acs.fts.schemas.album.inqdelaydocs;

import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.DocumentDescriptionType;

/** 
 * �������� ����������, ������� �������������� ����������� � ������������ ����
 */
public class DelayDocDescriptionType extends DocumentDescriptionType
{
    private String delayReason;
    private String documentFormSign;
    private String requestPositionID;

    /** 
     * Get the 'DelayReason' element value. �������, �� ������� �������� �� ����� ���� ����������� ����������
     * 
     * @return value
     */
    public String getDelayReason() {
        return delayReason;
    }

    /** 
     * Set the 'DelayReason' element value. �������, �� ������� �������� �� ����� ���� ����������� ����������
     * 
     * @param delayReason
     */
    public void setDelayReason(String delayReason) {
        this.delayReason = delayReason;
    }

    /** 
     * Get the 'DocumentFormSign' element value. ������� ����� ������������� ���������: 0 - � ����������� �����, 1 - � ���� ��������� ���������
     * 
     * @return value
     */
    public String getDocumentFormSign() {
        return documentFormSign;
    }

    /** 
     * Set the 'DocumentFormSign' element value. ������� ����� ������������� ���������: 0 - � ����������� �����, 1 - � ���� ��������� ���������
     * 
     * @param documentFormSign
     */
    public void setDocumentFormSign(String documentFormSign) {
        this.documentFormSign = documentFormSign;
    }

    /** 
     * Get the 'RequestPositionID' element value. ������������� ������� � �������
     * 
     * @return value
     */
    public String getRequestPositionID() {
        return requestPositionID;
    }

    /** 
     * Set the 'RequestPositionID' element value. ������������� ������� � �������
     * 
     * @param requestPositionID
     */
    public void setRequestPositionID(String requestPositionID) {
        this.requestPositionID = requestPositionID;
    }
}
