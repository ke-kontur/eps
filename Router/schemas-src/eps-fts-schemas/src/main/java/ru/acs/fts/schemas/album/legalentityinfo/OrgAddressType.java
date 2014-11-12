
package ru.acs.fts.schemas.album.legalentityinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;

/** 
 * �������� �� ������ (����� ����������) ��������� ������������ ��������������� ������ ��. ����
 */
public class OrgAddressType extends AddressType
{
    private String KLADRCode;
    private String subjectCode;
    private String impossibleContact;
    private RecordDataType recordData;

    /** 
     * Get the 'KLADRCode' element value. ��� ������ �� �����
     * 
     * @return value
     */
    public String getKLADRCode() {
        return KLADRCode;
    }

    /** 
     * Set the 'KLADRCode' element value. ��� ������ �� �����
     * 
     * @param KLADRCode
     */
    public void setKLADRCode(String KLADRCode) {
        this.KLADRCode = KLADRCode;
    }

    /** 
     * Get the 'SubjectCode' element value. ��� �������� ��
     * 
     * @return value
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /** 
     * Set the 'SubjectCode' element value. ��� �������� ��
     * 
     * @param subjectCode
     */
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    /** 
     * Get the 'ImpossibleContact' element value. ������� ������������� �������������� � ����������� ����� �� ������������� � ����� ������: 0 - ���� ��. ���� �� ������������� �� ������, ���������� ��� ��������������� �����������; 1 - ���� �����, ��������� ��. ����� ��� ��������������� �����������, �� ����������
     * 
     * @return value
     */
    public String getImpossibleContact() {
        return impossibleContact;
    }

    /** 
     * Set the 'ImpossibleContact' element value. ������� ������������� �������������� � ����������� ����� �� ������������� � ����� ������: 0 - ���� ��. ���� �� ������������� �� ������, ���������� ��� ��������������� �����������; 1 - ���� �����, ��������� ��. ����� ��� ��������������� �����������, �� ����������
     * 
     * @param impossibleContact
     */
    public void setImpossibleContact(String impossibleContact) {
        this.impossibleContact = impossibleContact;
    }

    /** 
     * Get the 'RecordData' element value. �������� � ������
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. �������� � ������
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }
}
