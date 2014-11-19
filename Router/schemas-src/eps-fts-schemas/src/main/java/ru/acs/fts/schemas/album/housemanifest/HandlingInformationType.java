
package ru.acs.fts.schemas.album.housemanifest;

/** 
 * ����� ���������
 */
public class HandlingInformationType
{
    private String serviceTypeCode;
    private String description;

    /** 
     * Get the 'ServiceTypeCode' element value. ��� ������ ���������
     * 
     * @return value
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    /** 
     * Set the 'ServiceTypeCode' element value. ��� ������ ���������
     * 
     * @param serviceTypeCode
     */
    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    /** 
     * Get the 'Description' element value. �������� ������ ���������
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. �������� ������ ���������
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
