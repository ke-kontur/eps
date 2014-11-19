
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.ESADFilledPersonType;

/** 
 * Дата заполнения и лицо, заполнившее ДТС
 */
public class DTSFilledPersonType extends ESADFilledPersonType
{
    private LocalDate filledDate;
    private String regNumberDoc;
    private String securityLabelCode;

    /** 
     * Get the 'FilledDate' element value. Дата заполнения ДТС
     * 
     * @return value
     */
    public LocalDate getFilledDate() {
        return filledDate;
    }

    /** 
     * Set the 'FilledDate' element value. Дата заполнения ДТС
     * 
     * @param filledDate
     */
    public void setFilledDate(LocalDate filledDate) {
        this.filledDate = filledDate;
    }

    /** 
     * Get the 'RegNumberDoc' element value. Исходящий номер регистрации документов в соответствии с системой (регламентом) учета исходящих документов декларанта или таможенного представителя  в Республике Беларусь
     * 
     * @return value
     */
    public String getRegNumberDoc() {
        return regNumberDoc;
    }

    /** 
     * Set the 'RegNumberDoc' element value. Исходящий номер регистрации документов в соответствии с системой (регламентом) учета исходящих документов декларанта или таможенного представителя  в Республике Беларусь
     * 
     * @param regNumberDoc
     */
    public void setRegNumberDoc(String regNumberDoc) {
        this.regNumberDoc = regNumberDoc;
    }

    /** 
     * Get the 'SecurityLabelCode' element value. Код защитной наклейки для РК
     * 
     * @return value
     */
    public String getSecurityLabelCode() {
        return securityLabelCode;
    }

    /** 
     * Set the 'SecurityLabelCode' element value. Код защитной наклейки для РК
     * 
     * @param securityLabelCode
     */
    public void setSecurityLabelCode(String securityLabelCode) {
        this.securityLabelCode = securityLabelCode;
    }
}
