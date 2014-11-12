
package ru.acs.fts.schemas.album.actinspection;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AuthoritesDocumentType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * ����, �������������� ��� �������� (�������)
 */
public class InspectionParticipantType extends PersonBaseType
{
    private String status;
    private String reason;
    private String job;
    private String addresseeMPO;
    private String ATDReceiveCopy;
    private IdentityCardType participantDocs;
    private AuthoritesDocumentType authoritesDocs;

    /** 
     * Get the 'Status' element value. ������ ��� ��������� ����, ��������������� ��� �������� (�������): 3 - ��������� (���� ����, �������������� � ��������� �������, ���� �������������); 4 - �������; 5 - �������; 6 - �������� �������� �����
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. ������ ��� ��������� ����, ��������������� ��� �������� (�������): 3 - ��������� (���� ����, �������������� � ��������� �������, ���� �������������); 4 - �������; 5 - �������; 6 - �������� �������� �����
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'Reason' element value. ������� ���������� ����������� �������� � ���������� ���������� ��� ����� ����, ����������� ������������ � ��������� ������� (�� ��������������)
     * 
     * @return value
     */
    public String getReason() {
        return reason;
    }

    /** 
     * Set the 'Reason' element value. ������� ���������� ����������� �������� � ���������� ���������� ��� ����� ����, ����������� ������������ � ��������� ������� (�� ��������������)
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /** 
     * Get the 'Job' element value. ����� ������
     * 
     * @return value
     */
    public String getJob() {
        return job;
    }

    /** 
     * Set the 'Job' element value. ����� ������
     * 
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /** 
     * Get the 'AddresseeMPO' element value. ����� ���, � ������� ��������� ������ ���(�), � ����� ����, ����������� ������������ � ��������� �������
     * 
     * @return value
     */
    public String getAddresseeMPO() {
        return addresseeMPO;
    }

    /** 
     * Set the 'AddresseeMPO' element value. ����� ���, � ������� ��������� ������ ���(�), � ����� ����, ����������� ������������ � ��������� �������
     * 
     * @param addresseeMPO
     */
    public void setAddresseeMPO(String addresseeMPO) {
        this.addresseeMPO = addresseeMPO;
    }

    /** 
     * Get the 'ATDReceiveCopy' element value. �������, �������������� ���� ��������� ������� ���������� ���
     * 
     * @return value
     */
    public String getATDReceiveCopy() {
        return ATDReceiveCopy;
    }

    /** 
     * Set the 'ATDReceiveCopy' element value. �������, �������������� ���� ��������� ������� ���������� ���
     * 
     * @param ATDReceiveCopy
     */
    public void setATDReceiveCopy(String ATDReceiveCopy) {
        this.ATDReceiveCopy = ATDReceiveCopy;
    }

    /** 
     * Get the 'ParticipantDocs' element value. ��������, �������������� ��������
     * 
     * @return value
     */
    public IdentityCardType getParticipantDocs() {
        return participantDocs;
    }

    /** 
     * Set the 'ParticipantDocs' element value. ��������, �������������� ��������
     * 
     * @param participantDocs
     */
    public void setParticipantDocs(IdentityCardType participantDocs) {
        this.participantDocs = participantDocs;
    }

    /** 
     * Get the 'AuthoritesDocs' element value. ��������, �������������� ����������
     * 
     * @return value
     */
    public AuthoritesDocumentType getAuthoritesDocs() {
        return authoritesDocs;
    }

    /** 
     * Set the 'AuthoritesDocs' element value. ��������, �������������� ����������
     * 
     * @param authoritesDocs
     */
    public void setAuthoritesDocs(AuthoritesDocumentType authoritesDocs) {
        this.authoritesDocs = authoritesDocs;
    }
}
