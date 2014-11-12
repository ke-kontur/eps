
package ru.acs.fts.schemas.album.loadptsresult;

/** 
 * Результат загрузки / обработки пакета 
 */
public class ProtocolProcessingPacketType
{
    private String MSGCode;
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
