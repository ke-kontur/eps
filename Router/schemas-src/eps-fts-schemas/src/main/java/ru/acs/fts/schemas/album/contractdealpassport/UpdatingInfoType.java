
package ru.acs.fts.schemas.album.contractdealpassport;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о переоформлении ПС
 */
public class UpdatingInfoType
{
    private DocumentBaseType restructuring;
    private DocumentBaseType reasonsDocuments;

    /** 
     * Get the 'Restructuring' element value. Переоформление ПС (порядковый номер и дата переоформления)
     * 
     * @return value
     */
    public DocumentBaseType getRestructuring() {
        return restructuring;
    }

    /** 
     * Set the 'Restructuring' element value. Переоформление ПС (порядковый номер и дата переоформления)
     * 
     * @param restructuring
     */
    public void setRestructuring(DocumentBaseType restructuring) {
        this.restructuring = restructuring;
    }

    /** 
     * Get the 'ReasonsDocuments' element value. Сведения о документе, на основании которого внесены изменения в ПС (номер и дата)
     * 
     * @return value
     */
    public DocumentBaseType getReasonsDocuments() {
        return reasonsDocuments;
    }

    /** 
     * Set the 'ReasonsDocuments' element value. Сведения о документе, на основании которого внесены изменения в ПС (номер и дата)
     * 
     * @param reasonsDocuments
     */
    public void setReasonsDocuments(DocumentBaseType reasonsDocuments) {
        this.reasonsDocuments = reasonsDocuments;
    }
}
