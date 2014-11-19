
package ru.acs.fts.schemas.admin.statusupdaterequest;

/** 
 * Список статусов 
 */
public class StatusesType
{
    private String stateCode;
    private String statusDescription;

    /** 
     * Get the 'StateCode' element value. Код статуса
     * 
     * @return value
     */
    public String getStateCode() {
        return stateCode;
    }

    /** 
     * Set the 'StateCode' element value. Код статуса
     * 
     * @param stateCode
     */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    /** 
     * Get the 'StatusDescription' element value. Описание статуса
     * 
     * @return value
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /** 
     * Set the 'StatusDescription' element value. Описание статуса
     * 
     * @param statusDescription
     */
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }
}
