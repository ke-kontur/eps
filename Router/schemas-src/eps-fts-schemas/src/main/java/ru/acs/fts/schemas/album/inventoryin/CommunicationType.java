
package ru.acs.fts.schemas.album.inventoryin;

/** 
 * Средство связи
 */
public class CommunicationType
{
    private String commCode;
    private String commNumber;

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
     * Get the 'CommNumber' element value. Номер средства связи
     * 
     * @return value
     */
    public String getCommNumber() {
        return commNumber;
    }

    /** 
     * Set the 'CommNumber' element value. Номер средства связи
     * 
     * @param commNumber
     */
    public void setCommNumber(String commNumber) {
        this.commNumber = commNumber;
    }
}
