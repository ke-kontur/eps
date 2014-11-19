
package ru.acs.fts.schemas.album.cwqueryresult;

/** 
 * Информация о передаваемых документах одного типа
 */
public class ResultBodyType
{
    private Object any;

    /** 
     * Get the 'ResultBodyType' complexType value. Прикладной документ
     * 
     * @return value
     */
    public Object getAny() {
        return any;
    }

    /** 
     * Set the 'ResultBodyType' complexType value. Прикладной документ
     * 
     * @param any
     */
    public void setAny(Object any) {
        this.any = any;
    }
}
