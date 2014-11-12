
package ru.acs.fts.schemas.album.goodscheckreport;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Описание документа
 */
public class DescriptionDocumentType extends DocumentBaseType
{
    private String presentedDocumentModeCode;
    private String goodsPostiton;
    private LocalDate documentBeginActionsDate;
    private LocalDate documentEndActionsDate;

    /** 
     * Get the 'PresentedDocumentModeCode' element value. Код вида представляемого документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44
     * 
     * @return value
     */
    public String getPresentedDocumentModeCode() {
        return presentedDocumentModeCode;
    }

    /** 
     * Set the 'PresentedDocumentModeCode' element value. Код вида представляемого документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44
     * 
     * @param presentedDocumentModeCode
     */
    public void setPresentedDocumentModeCode(String presentedDocumentModeCode) {
        this.presentedDocumentModeCode = presentedDocumentModeCode;
    }

    /** 
     * Get the 'GoodsPostiton' element value. Номер товара в документе
     * 
     * @return value
     */
    public String getGoodsPostiton() {
        return goodsPostiton;
    }

    /** 
     * Set the 'GoodsPostiton' element value. Номер товара в документе
     * 
     * @param goodsPostiton
     */
    public void setGoodsPostiton(String goodsPostiton) {
        this.goodsPostiton = goodsPostiton;
    }

    /** 
     * Get the 'DocumentBeginActionsDate' element value. Дата начала действия документа
     * 
     * @return value
     */
    public LocalDate getDocumentBeginActionsDate() {
        return documentBeginActionsDate;
    }

    /** 
     * Set the 'DocumentBeginActionsDate' element value. Дата начала действия документа
     * 
     * @param documentBeginActionsDate
     */
    public void setDocumentBeginActionsDate(LocalDate documentBeginActionsDate) {
        this.documentBeginActionsDate = documentBeginActionsDate;
    }

    /** 
     * Get the 'DocumentEndActionsDate' element value. Дата окончания действия документа
     * 
     * @return value
     */
    public LocalDate getDocumentEndActionsDate() {
        return documentEndActionsDate;
    }

    /** 
     * Set the 'DocumentEndActionsDate' element value. Дата окончания действия документа
     * 
     * @param documentEndActionsDate
     */
    public void setDocumentEndActionsDate(LocalDate documentEndActionsDate) {
        this.documentEndActionsDate = documentEndActionsDate;
    }
}
