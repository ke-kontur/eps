
package ru.acs.fts.schemas.album.declarationconformity;

/** 
 * ѕриложени€
 */
public class AppendsType
{
    private String appendNumber;
    private String appendFormNumber;

    /** 
     * Get the 'AppendNumber' element value. ѕор€дковый номер приложени€
     * 
     * @return value
     */
    public String getAppendNumber() {
        return appendNumber;
    }

    /** 
     * Set the 'AppendNumber' element value. ѕор€дковый номер приложени€
     * 
     * @param appendNumber
     */
    public void setAppendNumber(String appendNumber) {
        this.appendNumber = appendNumber;
    }

    /** 
     * Get the 'AppendFormNumber' element value. Ќомер бланка приложени€ (заполн€етс€ в случае наличи€ приложени€)
     * 
     * @return value
     */
    public String getAppendFormNumber() {
        return appendFormNumber;
    }

    /** 
     * Set the 'AppendFormNumber' element value. Ќомер бланка приложени€ (заполн€етс€ в случае наличи€ приложени€)
     * 
     * @param appendFormNumber
     */
    public void setAppendFormNumber(String appendFormNumber) {
        this.appendFormNumber = appendFormNumber;
    }
}
