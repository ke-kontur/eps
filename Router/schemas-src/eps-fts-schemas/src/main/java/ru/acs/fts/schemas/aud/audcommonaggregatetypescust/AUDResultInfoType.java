
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Информация о результате обработки.
 */
public class AUDResultInfoType
{
    private String resultCode;
    private String description;

    /** 
     * Get the 'ResultCode' element value. Код результата обработки.
     * 
     * @return value
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * Set the 'ResultCode' element value. Код результата обработки.
     * 
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /** 
     * Get the 'Description' element value. Текстовое описание результата обработки.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. Текстовое описание результата обработки.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
