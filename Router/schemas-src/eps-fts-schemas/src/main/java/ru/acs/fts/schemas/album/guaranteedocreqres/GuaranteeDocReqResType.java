
package ru.acs.fts.schemas.album.guaranteedocreqres;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Запрос/Информация о документе обеспечения
 */
public class GuaranteeDocReqResType extends BaseDocType
{
    private String documentDateTime;
    private String documentSign;
    private DocumentInfoType documentInfo;
    private GTDIDType guaranteeUseDocument;
    private CUOrganizationType declarant;
    private CUOrganizationType customsRepresentative;
    private String documentModeID;

    /** 
     * Get the 'DocumentDateTime' element value. Дата и время формирования электронного документа
     * 
     * @return value
     */
    public String getDocumentDateTime() {
        return documentDateTime;
    }

    /** 
     * Set the 'DocumentDateTime' element value. Дата и время формирования электронного документа
     * 
     * @param documentDateTime
     */
    public void setDocumentDateTime(String documentDateTime) {
        this.documentDateTime = documentDateTime;
    }

    /** 
     * Get the 'DocumentSign' element value. Признак документа: 0 - Запрос информации о документе обеспечения; 1 - Информация о документе обеспечения
     * 
     * @return value
     */
    public String getDocumentSign() {
        return documentSign;
    }

    /** 
     * Set the 'DocumentSign' element value. Признак документа: 0 - Запрос информации о документе обеспечения; 1 - Информация о документе обеспечения
     * 
     * @param documentSign
     */
    public void setDocumentSign(String documentSign) {
        this.documentSign = documentSign;
    }

    /** 
     * Get the 'DocumentInfo' element value. Информация о документе обеспечения
     * 
     * @return value
     */
    public DocumentInfoType getDocumentInfo() {
        return documentInfo;
    }

    /** 
     * Set the 'DocumentInfo' element value. Информация о документе обеспечения
     * 
     * @param documentInfo
     */
    public void setDocumentInfo(DocumentInfoType documentInfo) {
        this.documentInfo = documentInfo;
    }

    /** 
     * Get the 'GuaranteeUseDocument' element value. Информация о документе, в котором используется обеспечение
     * 
     * @return value
     */
    public GTDIDType getGuaranteeUseDocument() {
        return guaranteeUseDocument;
    }

    /** 
     * Set the 'GuaranteeUseDocument' element value. Информация о документе, в котором используется обеспечение
     * 
     * @param guaranteeUseDocument
     */
    public void setGuaranteeUseDocument(GTDIDType guaranteeUseDocument) {
        this.guaranteeUseDocument = guaranteeUseDocument;
    }

    /** 
     * Get the 'Declarant' element value. Сведения о декларанте
     * 
     * @return value
     */
    public CUOrganizationType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Сведения о декларанте
     * 
     * @param declarant
     */
    public void setDeclarant(CUOrganizationType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'CustomsRepresentative' element value. Сведения о таможенном представителе
     * 
     * @return value
     */
    public CUOrganizationType getCustomsRepresentative() {
        return customsRepresentative;
    }

    /** 
     * Set the 'CustomsRepresentative' element value. Сведения о таможенном представителе
     * 
     * @param customsRepresentative
     */
    public void setCustomsRepresentative(
            CUOrganizationType customsRepresentative) {
        this.customsRepresentative = customsRepresentative;
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
