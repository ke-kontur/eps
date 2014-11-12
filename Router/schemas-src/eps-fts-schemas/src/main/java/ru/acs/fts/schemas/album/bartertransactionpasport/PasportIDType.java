
package ru.acs.fts.schemas.album.bartertransactionpasport;

/** 
 * Номер паспорта бартерной сделки 
 */
public class PasportIDType
{
    private String sign;
    private String OKPOID;
    private String number3;
    private String number10;

    /** 
     * Get the 'Sign' element value. Признак сделки (всегда равен 3) 
     * 
     * @return value
     */
    public String getSign() {
        return sign;
    }

    /** 
     * Set the 'Sign' element value. Признак сделки (всегда равен 3) 
     * 
     * @param sign
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /** 
     * Get the 'OKPOID' element value. Код ОКПО Управления уполномоченного МВЭС России    
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. Код ОКПО Управления уполномоченного МВЭС России    
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }

    /** 
     * Get the 'Number3' element value. Номер переоформленного паспорта бартерной сделки
     * 
     * @return value
     */
    public String getNumber3() {
        return number3;
    }

    /** 
     * Set the 'Number3' element value. Номер переоформленного паспорта бартерной сделки
     * 
     * @param number3
     */
    public void setNumber3(String number3) {
        this.number3 = number3;
    }

    /** 
     * Get the 'Number10' element value. Номер первоначального паспорта бартерной сделки, присвоенный управлением уполномоченным Минэкономразвития 
     * 
     * @return value
     */
    public String getNumber10() {
        return number10;
    }

    /** 
     * Set the 'Number10' element value. Номер первоначального паспорта бартерной сделки, присвоенный управлением уполномоченным Минэкономразвития 
     * 
     * @param number10
     */
    public void setNumber10(String number10) {
        this.number10 = number10;
    }
}
