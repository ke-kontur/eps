
package ru.acs.fts.schemas.album.prohibitedgoods;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ���������� � �������������� ����������
 */
public class PermitionDocsType extends DocumentBaseType
{
    private String documentDescriprion;
    private String permitDocOrganization;

    /** 
     * Get the 'DocumentDescriprion' element value. �������� ��������������� ���������
     * 
     * @return value
     */
    public String getDocumentDescriprion() {
        return documentDescriprion;
    }

    /** 
     * Set the 'DocumentDescriprion' element value. �������� ��������������� ���������
     * 
     * @param documentDescriprion
     */
    public void setDocumentDescriprion(String documentDescriprion) {
        this.documentDescriprion = documentDescriprion;
    }

    /** 
     * Get the 'PermitDocOrganization' element value. ������������ �����������, �������� �������������� ��������
     * 
     * @return value
     */
    public String getPermitDocOrganization() {
        return permitDocOrganization;
    }

    /** 
     * Set the 'PermitDocOrganization' element value. ������������ �����������, �������� �������������� ��������
     * 
     * @param permitDocOrganization
     */
    public void setPermitDocOrganization(String permitDocOrganization) {
        this.permitDocOrganization = permitDocOrganization;
    }
}
