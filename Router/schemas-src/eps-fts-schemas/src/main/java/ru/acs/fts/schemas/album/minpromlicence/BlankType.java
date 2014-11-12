
package ru.acs.fts.schemas.album.minpromlicence;

/** 
 * Бланк
 */
public class BlankType
{
    private String blankSer;
    private String blankNum;
    private String blankType;

    /** 
     * Get the 'BlankSer' element value. Серия бланка
     * 
     * @return value
     */
    public String getBlankSer() {
        return blankSer;
    }

    /** 
     * Set the 'BlankSer' element value. Серия бланка
     * 
     * @param blankSer
     */
    public void setBlankSer(String blankSer) {
        this.blankSer = blankSer;
    }

    /** 
     * Get the 'BlankNum' element value. Номер бланка
     * 
     * @return value
     */
    public String getBlankNum() {
        return blankNum;
    }

    /** 
     * Set the 'BlankNum' element value. Номер бланка
     * 
     * @param blankNum
     */
    public void setBlankNum(String blankNum) {
        this.blankNum = blankNum;
    }

    /** 
     * Get the 'BlankType' element value. Бланк (оригинал, дубликат)
     * 
     * @return value
     */
    public String getBlankType() {
        return blankType;
    }

    /** 
     * Set the 'BlankType' element value. Бланк (оригинал, дубликат)
     * 
     * @param blankType
     */
    public void setBlankType(String blankType) {
        this.blankType = blankType;
    }
}
