
package ru.acs.fts.schemas.album.housemanifest;

/** 
 * Метод обработки
 */
public class HandlingInformationType
{
    private String serviceTypeCode;
    private String description;

    /** 
     * Get the 'ServiceTypeCode' element value. Код метода обработки
     * 
     * @return value
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    /** 
     * Set the 'ServiceTypeCode' element value. Код метода обработки
     * 
     * @param serviceTypeCode
     */
    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    /** 
     * Get the 'Description' element value. Описание метода обработки
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Описание метода обработки
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
