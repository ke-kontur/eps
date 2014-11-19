
package ru.acs.fts.schemas.album;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Обращение декларанта о внесении изменений (дополнений) в таможенную декларацию
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:ExchangeDocuments:DeclChangeRequest:5.4.3" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DeclChangeRequestType">
 *   &lt;xs:complexContent>
 *     &lt;xs:extension base="ns:BaseDocType">
 *       &lt;xs:sequence>
 *         &lt;xs:element type="xs:string" name="Reasons" maxOccurs="unbounded"/>
 *         &lt;xs:element type="xs:date" name="RequestDate" minOccurs="0"/>
 *         &lt;xs:element type="ns:GTDIDType" name="RegNumberDT"/>
 *         &lt;xs:element type="ns1:ChangesDescriptionType" name="ChangesDescription" maxOccurs="unbounded"/>
 *         &lt;xs:element type="ns:CUOrganizationType" name="Declarant" minOccurs="0"/>
 *         &lt;xs:element type="ns:CUCustomsType" name="Customs" minOccurs="0"/>
 *       &lt;/xs:sequence>
 *       &lt;xs:attribute type="xs:string" use="required" fixed="1004115E" name="DocumentModeID"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:complexContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DeclChangeRequestType extends BaseDocType
{
    private List<String> reasonList = new ArrayList<String>();
    private LocalDate requestDate;
    private GTDIDType regNumberDT;
    private List<ChangesDescriptionType> changesDescriptionList = new ArrayList<ChangesDescriptionType>();
    private CUOrganizationType declarant;
    private CUCustomsType customs;
    private String documentModeID;

    /** 
     * Get the list of 'Reasons' element items. Обоснование необходимости внесения изменений (дополнений)
     * 
     * @return list
     */
    public List<String> getReasonList() {
        return reasonList;
    }

    /** 
     * Set the list of 'Reasons' element items. Обоснование необходимости внесения изменений (дополнений)
     * 
     * @param list
     */
    public void setReasonList(List<String> list) {
        reasonList = list;
    }

    /** 
     * Get the 'RequestDate' element value. Дата обращения
     * 
     * @return value
     */
    public LocalDate getRequestDate() {
        return requestDate;
    }

    /** 
     * Set the 'RequestDate' element value. Дата обращения
     * 
     * @param requestDate
     */
    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    /** 
     * Get the 'RegNumberDT' element value. Регистрационный номер таможенной декларации
     * 
     * @return value
     */
    public GTDIDType getRegNumberDT() {
        return regNumberDT;
    }

    /** 
     * Set the 'RegNumberDT' element value. Регистрационный номер таможенной декларации
     * 
     * @param regNumberDT
     */
    public void setRegNumberDT(GTDIDType regNumberDT) {
        this.regNumberDT = regNumberDT;
    }

    /** 
     * Get the list of 'ChangesDescription' element items. Описание вносимых изменений (дополнений)
     * 
     * @return list
     */
    public List<ChangesDescriptionType> getChangesDescriptionList() {
        return changesDescriptionList;
    }

    /** 
     * Set the list of 'ChangesDescription' element items. Описание вносимых изменений (дополнений)
     * 
     * @param list
     */
    public void setChangesDescriptionList(List<ChangesDescriptionType> list) {
        changesDescriptionList = list;
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
     * Get the 'Customs' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Сведения о таможенном органе
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
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
