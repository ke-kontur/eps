
package ru.acs.fts.schemas.album.servicelicense;

/** 
 * �������� ���� ����� (�����)
 */
public class ServiceDescriptionType
{
    private String serviceName;
    private String serviceCode;
    private String aerotechnicsName;
    private String aerotechnicsTypeCode;

    /** 
     * Get the 'ServiceName' element value. ������������ ���� ������������ (������������)
     * 
     * @return value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** 
     * Set the 'ServiceName' element value. ������������ ���� ������������ (������������)
     * 
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /** 
     * Get the 'ServiceCode' element value. ��� ���� ������������
     * 
     * @return value
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /** 
     * Set the 'ServiceCode' element value. ��� ���� ������������
     * 
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /** 
     * Get the 'AerotechnicsName' element value. ������������ ���� �����������
     * 
     * @return value
     */
    public String getAerotechnicsName() {
        return aerotechnicsName;
    }

    /** 
     * Set the 'AerotechnicsName' element value. ������������ ���� �����������
     * 
     * @param aerotechnicsName
     */
    public void setAerotechnicsName(String aerotechnicsName) {
        this.aerotechnicsName = aerotechnicsName;
    }

    /** 
     * Get the 'AerotechnicsTypeCode' element value. ��� ���� �����������
     * 
     * @return value
     */
    public String getAerotechnicsTypeCode() {
        return aerotechnicsTypeCode;
    }

    /** 
     * Set the 'AerotechnicsTypeCode' element value. ��� ���� �����������
     * 
     * @param aerotechnicsTypeCode
     */
    public void setAerotechnicsTypeCode(String aerotechnicsTypeCode) {
        this.aerotechnicsTypeCode = aerotechnicsTypeCode;
    }
}
