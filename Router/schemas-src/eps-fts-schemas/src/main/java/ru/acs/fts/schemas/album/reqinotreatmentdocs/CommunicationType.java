
package ru.acs.fts.schemas.album.reqinotreatmentdocs;

/** 
 * Средство связи
 */
public class CommunicationType
{
    private String commCode;
    private String commNumberAddress;

    /** 
     * Get the 'CommCode' element value. Код средства связи: "1"-телефон, "2"-факс, "3"-телекс, "4"-телеграф, "5"-e-mail, "6"-почта
     * 
     * @return value
     */
    public String getCommCode() {
        return commCode;
    }

    /** 
     * Set the 'CommCode' element value. Код средства связи: "1"-телефон, "2"-факс, "3"-телекс, "4"-телеграф, "5"-e-mail, "6"-почта
     * 
     * @param commCode
     */
    public void setCommCode(String commCode) {
        this.commCode = commCode;
    }

    /** 
     * Get the 'CommNumberAddress' element value. Номер средства связи / адрес
     * 
     * @return value
     */
    public String getCommNumberAddress() {
        return commNumberAddress;
    }

    /** 
     * Set the 'CommNumberAddress' element value. Номер средства связи / адрес
     * 
     * @param commNumberAddress
     */
    public void setCommNumberAddress(String commNumberAddress) {
        this.commNumberAddress = commNumberAddress;
    }
}
