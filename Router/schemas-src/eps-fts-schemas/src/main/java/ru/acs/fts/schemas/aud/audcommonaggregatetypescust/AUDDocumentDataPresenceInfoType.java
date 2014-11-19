
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * �������� ������������� �������������� ��������� ������, ��������� � ����������.
 */
public class AUDDocumentDataPresenceInfoType
{
    private boolean bodyPresenceIndicator;
    private boolean signatureEvidencePresenceIndicator;

    /** 
     * Get the 'BodyPresenceIndicator' element value. ������� - ��������� �� ������������ ���� ���������: 0 (false) - �� ���������; 1 (true) - ���������.
     * 
     * @return value
     */
    public boolean isBodyPresenceIndicator() {
        return bodyPresenceIndicator;
    }

    /** 
     * Set the 'BodyPresenceIndicator' element value. ������� - ��������� �� ������������ ���� ���������: 0 (false) - �� ���������; 1 (true) - ���������.
     * 
     * @param bodyPresenceIndicator
     */
    public void setBodyPresenceIndicator(boolean bodyPresenceIndicator) {
        this.bodyPresenceIndicator = bodyPresenceIndicator;
    }

    /** 
     * Get the 'SignatureEvidencePresenceIndicator' element value. ������� - ��������� �� ������������ �������������� ����������� ��� �� ��������: 0 (false) - �� ���������; 1 (true) - ���������.
     * 
     * @return value
     */
    public boolean isSignatureEvidencePresenceIndicator() {
        return signatureEvidencePresenceIndicator;
    }

    /** 
     * Set the 'SignatureEvidencePresenceIndicator' element value. ������� - ��������� �� ������������ �������������� ����������� ��� �� ��������: 0 (false) - �� ���������; 1 (true) - ���������.
     * 
     * @param signatureEvidencePresenceIndicator
     */
    public void setSignatureEvidencePresenceIndicator(
            boolean signatureEvidencePresenceIndicator) {
        this.signatureEvidencePresenceIndicator = signatureEvidencePresenceIndicator;
    }
}
