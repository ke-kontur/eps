
package ru.acs.fts.schemas.album.guaranteestatusreq;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Запрос статуса процесса работы с дополнением к договору поручительства.
 */
public class GuaranteeStatusReqType extends BaseDocType
{
    private String GRN;
    private String additionalID;
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
     * Get the 'AdditionalID' element value. Уникальный идентификатор, присваиваемый дополнению к договору поручительства при регистрации
     * 
     * @return value
     */
    public String getAdditionalID() {
        return additionalID;
    }

    /** 
     * Set the 'AdditionalID' element value. Уникальный идентификатор, присваиваемый дополнению к договору поручительства при регистрации
     * 
     * @param additionalID
     */
    public void setAdditionalID(String additionalID) {
        this.additionalID = additionalID;
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
