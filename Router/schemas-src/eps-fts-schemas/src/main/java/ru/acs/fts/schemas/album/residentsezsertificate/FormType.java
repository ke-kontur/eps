
package ru.acs.fts.schemas.album.residentsezsertificate;

/** 
 * Серия и номер бланка
 */
public class FormType
{
    private String formSerial;
    private String formNumber;

    /** 
     * Get the 'FormSerial' element value. Серия бланка
     * 
     * @return value
     */
    public String getFormSerial() {
        return formSerial;
    }

    /** 
     * Set the 'FormSerial' element value. Серия бланка
     * 
     * @param formSerial
     */
    public void setFormSerial(String formSerial) {
        this.formSerial = formSerial;
    }

    /** 
     * Get the 'FormNumber' element value. Номер бланка
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. Номер бланка
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }
}
