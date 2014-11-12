
package ru.acs.fts.schemas.album.prolongcancelnotif;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������
 */
public class ApplicantType extends CUOrganizationType
{
    private String personPost;
    private DocumentBaseType OEZResidentCertif;

    /** 
     * Get the 'PersonPost' element value. ���������
     * 
     * @return value
     */
    public String getPersonPost() {
        return personPost;
    }

    /** 
     * Set the 'PersonPost' element value. ���������
     * 
     * @param personPost
     */
    public void setPersonPost(String personPost) {
        this.personPost = personPost;
    }

    /** 
     * Get the 'OEZ_ResidentCertif' element value. �������������, �������������� ����������� ���� � �������� ��������� ���
     * 
     * @return value
     */
    public DocumentBaseType getOEZResidentCertif() {
        return OEZResidentCertif;
    }

    /** 
     * Set the 'OEZ_ResidentCertif' element value. �������������, �������������� ����������� ���� � �������� ��������� ���
     * 
     * @param OEZResidentCertif
     */
    public void setOEZResidentCertif(DocumentBaseType OEZResidentCertif) {
        this.OEZResidentCertif = OEZResidentCertif;
    }
}
