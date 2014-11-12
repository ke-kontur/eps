
package ru.acs.fts.schemas.album.collectionletter;

import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.DepartmentalInfoType;

/** 
 * Ведомственная информация по инкассовому поручению
 */
public class DepartmentalDetailsType extends DepartmentalInfoType
{
    private String uniqueID;

    /** 
     * Get the 'UniqueID' element value. Уникальный идентификатор платежа/начисления (графа Код)
     * 
     * @return value
     */
    public String getUniqueID() {
        return uniqueID;
    }

    /** 
     * Set the 'UniqueID' element value. Уникальный идентификатор платежа/начисления (графа Код)
     * 
     * @param uniqueID
     */
    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
}
