
package ru.acs.fts.schemas.album.repuddeclregistration;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Лист отказа в регистрации таможенного документа
 */
public class RepudDeclRegistrationType extends BaseDocType
{
    private String regNumber;
    private String documentSign;
    private OrganizationBaseType organization;
    private List<DescriptionReasonsType> descriptionReasonList = new ArrayList<DescriptionReasonsType>();
    private CustomsPersonSignatureType customsPersonSignature;
    private GTDIDType declRegNumber;
    private DocumentBaseType declarantRequest;
    private String documentModeID;

    /** 
     * Get the 'RegNumber' element value. Регистрационный номер листа отказа в регистрации ДТ
     * 
     * @return value
     */
    public String getRegNumber() {
        return regNumber;
    }

    /** 
     * Set the 'RegNumber' element value. Регистрационный номер листа отказа в регистрации ДТ
     * 
     * @param regNumber
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /** 
     * Get the 'DocumentSign' element value. Признак документа: 0 - отказ в регистрации КДТ; 1 - иное
     * 
     * @return value
     */
    public String getDocumentSign() {
        return documentSign;
    }

    /** 
     * Set the 'DocumentSign' element value. Признак документа: 0 - отказ в регистрации КДТ; 1 - иное
     * 
     * @param documentSign
     */
    public void setDocumentSign(String documentSign) {
        this.documentSign = documentSign;
    }

    /** 
     * Get the 'Organization' element value. Наименование декларанта или таможенного представителя
     * 
     * @return value
     */
    public OrganizationBaseType getOrganization() {
        return organization;
    }

    /** 
     * Set the 'Organization' element value. Наименование декларанта или таможенного представителя
     * 
     * @param organization
     */
    public void setOrganization(OrganizationBaseType organization) {
        this.organization = organization;
    }

    /** 
     * Get the list of 'DescriptionReasons' element items. Описание причины отказа
     * 
     * @return list
     */
    public List<DescriptionReasonsType> getDescriptionReasonList() {
        return descriptionReasonList;
    }

    /** 
     * Set the list of 'DescriptionReasons' element items. Описание причины отказа
     * 
     * @param list
     */
    public void setDescriptionReasonList(List<DescriptionReasonsType> list) {
        descriptionReasonList = list;
    }

    /** 
     * Get the 'CustomsPersonSignature' element value. Подпись должностного лица
     * 
     * @return value
     */
    public CustomsPersonSignatureType getCustomsPersonSignature() {
        return customsPersonSignature;
    }

    /** 
     * Set the 'CustomsPersonSignature' element value. Подпись должностного лица
     * 
     * @param customsPersonSignature
     */
    public void setCustomsPersonSignature(
            CustomsPersonSignatureType customsPersonSignature) {
        this.customsPersonSignature = customsPersonSignature;
    }

    /** 
     * Get the 'DeclRegNumber' element value. Регистрационный номер таможенной декларации
     * 
     * @return value
     */
    public GTDIDType getDeclRegNumber() {
        return declRegNumber;
    }

    /** 
     * Set the 'DeclRegNumber' element value. Регистрационный номер таможенной декларации
     * 
     * @param declRegNumber
     */
    public void setDeclRegNumber(GTDIDType declRegNumber) {
        this.declRegNumber = declRegNumber;
    }

    /** 
     * Get the 'DeclarantRequest' element value. Обращение декларанта о внесении изменений (дополнений) в таможенную декларацию
     * 
     * @return value
     */
    public DocumentBaseType getDeclarantRequest() {
        return declarantRequest;
    }

    /** 
     * Set the 'DeclarantRequest' element value. Обращение декларанта о внесении изменений (дополнений) в таможенную декларацию
     * 
     * @param declarantRequest
     */
    public void setDeclarantRequest(DocumentBaseType declarantRequest) {
        this.declarantRequest = declarantRequest;
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
