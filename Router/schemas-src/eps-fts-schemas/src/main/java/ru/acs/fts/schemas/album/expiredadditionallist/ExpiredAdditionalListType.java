
package ru.acs.fts.schemas.album.expiredadditionallist;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Перечень регистрационных номеров дополнений к договору поручительства, использование которых для обеспечения уплаты таможенных пошлин, налогов при таможенном транзите товаров невозможно в связи с истечением срока действия дополнений.
 */
public class ExpiredAdditionalListType extends BaseDocType
{
    private List<ExpiredAdditionalInfoType> expiredAdditionalInfoList = new ArrayList<ExpiredAdditionalInfoType>();
    private String documentModeID;

    /** 
     * Get the list of 'ExpiredAdditionalInfo' element items. Сведения о дополнении к договору поручительства, использование которого в качестве обеспечения невозможно в связи с истечением срока действия.
     * 
     * @return list
     */
    public List<ExpiredAdditionalInfoType> getExpiredAdditionalInfoList() {
        return expiredAdditionalInfoList;
    }

    /** 
     * Set the list of 'ExpiredAdditionalInfo' element items. Сведения о дополнении к договору поручительства, использование которого в качестве обеспечения невозможно в связи с истечением срока действия.
     * 
     * @param list
     */
    public void setExpiredAdditionalInfoList(
            List<ExpiredAdditionalInfoType> list) {
        expiredAdditionalInfoList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
