
package ru.acs.fts.schemas.album.realestateresponse;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ��������� - ��������� ����������� �����
 */
public class FoundationDocType extends DocumentBaseType
{
    private String docType;
    private String docSeries;
    private String organizationName;

    /** 
     * Get the 'DocType' element value. ��� ���������
     * 
     * @return value
     */
    public String getDocType() {
        return docType;
    }

    /** 
     * Set the 'DocType' element value. ��� ���������
     * 
     * @param docType
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /** 
     * Get the 'DocSeries' element value. ����� ���������
     * 
     * @return value
     */
    public String getDocSeries() {
        return docSeries;
    }

    /** 
     * Set the 'DocSeries' element value. ����� ���������
     * 
     * @param docSeries
     */
    public void setDocSeries(String docSeries) {
        this.docSeries = docSeries;
    }

    /** 
     * Get the 'OrganizationName' element value. ������������ �����������, �������� ��������
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ �����������, �������� ��������
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
