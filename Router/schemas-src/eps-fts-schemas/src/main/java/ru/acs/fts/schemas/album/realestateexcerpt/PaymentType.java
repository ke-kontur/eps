
package ru.acs.fts.schemas.album.realestateexcerpt;

import java.util.ArrayList;
import java.util.List;

/** 
 * Оплата
 */
public class PaymentType
{
    private String freeServiceSign;
    private List<PresentedDocsType> reasonsDocumentList = new ArrayList<PresentedDocsType>();

    /** 
     * Get the 'FreeServiceSign' element value. Признак наличия права на безвозмездное предоставление сведений в соответствии со статьей 8 Закона о регистрации (122-ФЗ)
     * 
     * @return value
     */
    public String getFreeServiceSign() {
        return freeServiceSign;
    }

    /** 
     * Set the 'FreeServiceSign' element value. Признак наличия права на безвозмездное предоставление сведений в соответствии со статьей 8 Закона о регистрации (122-ФЗ)
     * 
     * @param freeServiceSign
     */
    public void setFreeServiceSign(String freeServiceSign) {
        this.freeServiceSign = freeServiceSign;
    }

    /** 
     * Get the list of 'ReasonsDocuments' element items. Документы основания получение сведений без оплаты
     * 
     * @return list
     */
    public List<PresentedDocsType> getReasonsDocumentList() {
        return reasonsDocumentList;
    }

    /** 
     * Set the list of 'ReasonsDocuments' element items. Документы основания получение сведений без оплаты
     * 
     * @param list
     */
    public void setReasonsDocumentList(List<PresentedDocsType> list) {
        reasonsDocumentList = list;
    }
}
