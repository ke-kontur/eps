
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ����������� ���� ����������� ������, �������������� � ����������� ���������� �������
 */
public class ATDCustomPersonType extends PersonBaseType
{
    private String signatureFlag;
    private String LNP;
    private String officialStatus;
    private String OTOFlag;
    private String lawAct;
    private String recordNumber;

    /** 
     * Get the 'SignatureFlag' element value. �������, �������������� ���� ������� ���
     * 
     * @return value
     */
    public String getSignatureFlag() {
        return signatureFlag;
    }

    /** 
     * Set the 'SignatureFlag' element value. �������, �������������� ���� ������� ���
     * 
     * @param signatureFlag
     */
    public void setSignatureFlag(String signatureFlag) {
        this.signatureFlag = signatureFlag;
    }

    /** 
     * Get the 'LNP' element value. ��� ������������ ���� ����������� ������
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. ��� ������������ ���� ����������� ������
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }

    /** 
     * Get the 'OfficialStatus' element value. ������ ������������ ���� ��� ���������� ����������� �������� 1 -  ���������� ��������, 2 - �������������� ��� ��������
     * 
     * @return value
     */
    public String getOfficialStatus() {
        return officialStatus;
    }

    /** 
     * Set the 'OfficialStatus' element value. ������ ������������ ���� ��� ���������� ����������� �������� 1 -  ���������� ��������, 2 - �������������� ��� ��������
     * 
     * @param officialStatus
     */
    public void setOfficialStatus(String officialStatus) {
        this.officialStatus = officialStatus;
    }

    /** 
     * Get the 'OTOFlag' element value. ��� ��������������� ����: 1 - ����������� ����, �� ���������� ����������� ����� ����������� ����� (������); 2- �������������� ����������� ���� ����������� ����� (������);
     * 
     * @return value
     */
    public String getOTOFlag() {
        return OTOFlag;
    }

    /** 
     * Set the 'OTOFlag' element value. ��� ��������������� ����: 1 - ����������� ����, �� ���������� ����������� ����� ����������� ����� (������); 2- �������������� ����������� ���� ����������� ����� (������);
     * 
     * @param OTOFlag
     */
    public void setOTOFlag(String OTOFlag) {
        this.OTOFlag = OTOFlag;
    }

    /** 
     * Get the 'LawAct' element value. ��������� ��� ����������� ��� ���������� �������� ����������� ���, �� ���������� ������������ ������ ����������� ����� (������)
     * 
     * @return value
     */
    public String getLawAct() {
        return lawAct;
    }

    /** 
     * Set the 'LawAct' element value. ��������� ��� ����������� ��� ���������� �������� ����������� ���, �� ���������� ������������ ������ ����������� ����� (������)
     * 
     * @param lawAct
     */
    public void setLawAct(String lawAct) {
        this.lawAct = lawAct;
    }

    /** 
     * Get the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @return value
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /** 
     * Set the 'RecordNumber' element value. ���������� ����� ������ � ������� ��
     * 
     * @param recordNumber
     */
    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }
}
