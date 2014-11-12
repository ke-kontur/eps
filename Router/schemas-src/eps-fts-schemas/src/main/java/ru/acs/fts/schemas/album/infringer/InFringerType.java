
package ru.acs.fts.schemas.album.infringer;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Сведения из реестра нарушителей
 */
public class InFringerType extends BaseDocType
{
    private String docSign;
    private List<ViolatorsListType> violatorsList = new ArrayList<ViolatorsListType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Признак документа (0 - Сведения из реестра нарушителей; 1 - Сведения из реестра нарушителей - отметка об оплате штрафа)
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак документа (0 - Сведения из реестра нарушителей; 1 - Сведения из реестра нарушителей - отметка об оплате штрафа)
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the list of 'ViolatorsList' element items. Список сведений из реестра нарушителей
     * 
     * @return list
     */
    public List<ViolatorsListType> getViolatorsList() {
        return violatorsList;
    }

    /** 
     * Set the list of 'ViolatorsList' element items. Список сведений из реестра нарушителей
     * 
     * @param list
     */
    public void setViolatorsList(List<ViolatorsListType> list) {
        violatorsList = list;
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
