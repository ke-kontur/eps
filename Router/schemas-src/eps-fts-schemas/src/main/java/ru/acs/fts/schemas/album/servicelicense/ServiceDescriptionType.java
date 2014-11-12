
package ru.acs.fts.schemas.album.servicelicense;

/** 
 * Описание вида услуг (работ)
 */
public class ServiceDescriptionType
{
    private String serviceName;
    private String serviceCode;
    private String aerotechnicsName;
    private String aerotechnicsTypeCode;

    /** 
     * Get the 'ServiceName' element value. Наименование вида деятельности (обслуживания)
     * 
     * @return value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** 
     * Set the 'ServiceName' element value. Наименование вида деятельности (обслуживания)
     * 
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /** 
     * Get the 'ServiceCode' element value. Код вида деятельности
     * 
     * @return value
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /** 
     * Set the 'ServiceCode' element value. Код вида деятельности
     * 
     * @param serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /** 
     * Get the 'AerotechnicsName' element value. Наименование типа авиатехники
     * 
     * @return value
     */
    public String getAerotechnicsName() {
        return aerotechnicsName;
    }

    /** 
     * Set the 'AerotechnicsName' element value. Наименование типа авиатехники
     * 
     * @param aerotechnicsName
     */
    public void setAerotechnicsName(String aerotechnicsName) {
        this.aerotechnicsName = aerotechnicsName;
    }

    /** 
     * Get the 'AerotechnicsTypeCode' element value. Код типа авиатехники
     * 
     * @return value
     */
    public String getAerotechnicsTypeCode() {
        return aerotechnicsTypeCode;
    }

    /** 
     * Set the 'AerotechnicsTypeCode' element value. Код типа авиатехники
     * 
     * @param aerotechnicsTypeCode
     */
    public void setAerotechnicsTypeCode(String aerotechnicsTypeCode) {
        this.aerotechnicsTypeCode = aerotechnicsTypeCode;
    }
}
