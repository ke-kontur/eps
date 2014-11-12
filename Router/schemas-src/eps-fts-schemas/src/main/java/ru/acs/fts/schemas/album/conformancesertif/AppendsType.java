
package ru.acs.fts.schemas.album.conformancesertif;

/** 
 * Приложения
 */
public class AppendsType
{
    private String appendNumber;
    private String appendFormNumber;

    /** 
     * Get the 'AppendNumber' element value. Порядковый номер приложения
     * 
     * @return value
     */
    public String getAppendNumber() {
        return appendNumber;
    }

    /** 
     * Set the 'AppendNumber' element value. Порядковый номер приложения
     * 
     * @param appendNumber
     */
    public void setAppendNumber(String appendNumber) {
        this.appendNumber = appendNumber;
    }

    /** 
     * Get the 'AppendFormNumber' element value. Номер бланка приложения (заполняется в случае наличия приложения)
     * 
     * @return value
     */
    public String getAppendFormNumber() {
        return appendFormNumber;
    }

    /** 
     * Set the 'AppendFormNumber' element value. Номер бланка приложения (заполняется в случае наличия приложения)
     * 
     * @param appendFormNumber
     */
    public void setAppendFormNumber(String appendFormNumber) {
        this.appendFormNumber = appendFormNumber;
    }
}
