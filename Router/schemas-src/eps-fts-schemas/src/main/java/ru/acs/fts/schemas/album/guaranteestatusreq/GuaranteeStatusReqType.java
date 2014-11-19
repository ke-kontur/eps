
package ru.acs.fts.schemas.album.guaranteestatusreq;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Запрос статуса процесса работы с дополнением к договору поручительства.
 */
public class GuaranteeStatusReqType extends BaseDocType
{
    private String GRN;
    private GuaranteeIDType guaranteeID;
    private String documentModeID;

    /** 
     * Get the 'GRN' element value. Cсылочный номер гарантии в транзите 
     * 
     * @return value
     */
    public String getGRN() {
        return GRN;
    }

    /** 
     * Set the 'GRN' element value. Cсылочный номер гарантии в транзите 
     * 
     * @param GRN
     */
    public void setGRN(String GRN) {
        this.GRN = GRN;
    }

    /** 
     * Get the 'GuaranteeID' element value. Уникальный идентификатор
     * 
     * @return value
     */
    public GuaranteeIDType getGuaranteeID() {
        return guaranteeID;
    }

    /** 
     * Set the 'GuaranteeID' element value. Уникальный идентификатор
     * 
     * @param guaranteeID
     */
    public void setGuaranteeID(GuaranteeIDType guaranteeID) {
        this.guaranteeID = guaranteeID;
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
