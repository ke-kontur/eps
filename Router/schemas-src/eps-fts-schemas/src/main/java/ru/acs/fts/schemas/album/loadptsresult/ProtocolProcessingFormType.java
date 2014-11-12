
package ru.acs.fts.schemas.album.loadptsresult;

/** 
 * Сведения о результатах проведения форматного и структурного контроля по каждому бланку. 
 */
public class ProtocolProcessingFormType
{
    private String MSGCode;
    private String GUID;
    private String addInformation;

    /** 
     * Get the 'MSG_Code' element value. Код сообщения (ошибки)
     * 
     * @return value
     */
    public String getMSGCode() {
        return MSGCode;
    }

    /** 
     * Set the 'MSG_Code' element value. Код сообщения (ошибки)
     * 
     * @param MSGCode
     */
    public void setMSGCode(String MSGCode) {
        this.MSGCode = MSGCode;
    }

    /** 
     * Get the 'GUID' element value. Уникальный идентификатор бланка
     * 
     * @return value
     */
    public String getGUID() {
        return GUID;
    }

    /** 
     * Set the 'GUID' element value. Уникальный идентификатор бланка
     * 
     * @param GUID
     */
    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    /** 
     * Get the 'AddInformation' element value. Дополнительная информация об ошибке (COMMENT)
     * 
     * @return value
     */
    public String getAddInformation() {
        return addInformation;
    }

    /** 
     * Set the 'AddInformation' element value. Дополнительная информация об ошибке (COMMENT)
     * 
     * @param addInformation
     */
    public void setAddInformation(String addInformation) {
        this.addInformation = addInformation;
    }
}
