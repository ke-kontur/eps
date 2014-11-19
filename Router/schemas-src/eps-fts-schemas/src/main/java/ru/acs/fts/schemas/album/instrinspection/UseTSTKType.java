
package ru.acs.fts.schemas.album.instrinspection;

/** 
 * Применение ТСТК
 */
public class UseTSTKType
{
    private String TSTKCode;
    private String comments;

    /** 
     * Get the 'TSTKCode' element value. Код применяемых ТСТК
     * 
     * @return value
     */
    public String getTSTKCode() {
        return TSTKCode;
    }

    /** 
     * Set the 'TSTKCode' element value. Код применяемых ТСТК
     * 
     * @param TSTKCode
     */
    public void setTSTKCode(String TSTKCode) {
        this.TSTKCode = TSTKCode;
    }

    /** 
     * Get the 'Comments' element value. Комментарии
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарии
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
