
package ru.acs.fts.schemas.aud.aud_statusresponse;

import ru.acs.fts.schemas.aud.audcommonaggregatetypescust.AUDBaseEnvelopeType;

/** 
 * ����� �� ������ ���������� � ������� ���������������� �������.
 */
public class AUDStatusResponseType extends AUDBaseEnvelopeType
{
    private boolean testModeIndicator;
    private String documentModeID;

    /** 
     * Get the 'TestModeIndicator' element value. ������� ����, ��� ������� ������������� � �������� ������.
     * 
     * @return value
     */
    public boolean isTestModeIndicator() {
        return testModeIndicator;
    }

    /** 
     * Set the 'TestModeIndicator' element value. ������� ����, ��� ������� ������������� � �������� ������.
     * 
     * @param testModeIndicator
     */
    public void setTestModeIndicator(boolean testModeIndicator) {
        this.testModeIndicator = testModeIndicator;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������������� ��������� (�������, ������)
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
