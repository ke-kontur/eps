
package ru.acs.fts.schemas.album.resolutionorigcountrypreference;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Решение (решения) о стране происхождения товаров и (или) предоставлении (отказе в предоставлении) тарифных преференций
 */
public class ResolutionOrigCountryPreferenceType extends BaseDocType
{
    private LocalDate resolutionDate;
    private String organizationName;
    private ResolutionNumberType resolutionNumber;
    private GTDIDType GTDID;
    private CustomsType customs;
    private PersonBaseType person;
    private List<ResolutionDescriptionType> resolutionDescriptionList = new ArrayList<ResolutionDescriptionType>();
    private String documentModeID;

    /** 
     * Get the 'ResolutionDate' element value. Дата решения
     * 
     * @return value
     */
    public LocalDate getResolutionDate() {
        return resolutionDate;
    }

    /** 
     * Set the 'ResolutionDate' element value. Дата решения
     * 
     * @param resolutionDate
     */
    public void setResolutionDate(LocalDate resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    /** 
     * Get the 'OrganizationName' element value. Наименование декларанта (таможенного представителя)
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование декларанта (таможенного представителя)
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'ResolutionNumber' element value. Номер решения
     * 
     * @return value
     */
    public ResolutionNumberType getResolutionNumber() {
        return resolutionNumber;
    }

    /** 
     * Set the 'ResolutionNumber' element value. Номер решения
     * 
     * @param resolutionNumber
     */
    public void setResolutionNumber(ResolutionNumberType resolutionNumber) {
        this.resolutionNumber = resolutionNumber;
    }

    /** 
     * Get the 'GTDID' element value. Регистрационный номер ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDID() {
        return GTDID;
    }

    /** 
     * Set the 'GTDID' element value. Регистрационный номер ДТ
     * 
     * @param GTDID
     */
    public void setGTDID(GTDIDType GTDID) {
        this.GTDID = GTDID;
    }

    /** 
     * Get the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Код и наименование таможенного органа
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Person' element value. Должностное лицо 
     * 
     * @return value
     */
    public PersonBaseType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. Должностное лицо 
     * 
     * @param person
     */
    public void setPerson(PersonBaseType person) {
        this.person = person;
    }

    /** 
     * Get the list of 'ResolutionDescription' element items. Решение
     * 
     * @return list
     */
    public List<ResolutionDescriptionType> getResolutionDescriptionList() {
        return resolutionDescriptionList;
    }

    /** 
     * Set the list of 'ResolutionDescription' element items. Решение
     * 
     * @param list
     */
    public void setResolutionDescriptionList(
            List<ResolutionDescriptionType> list) {
        resolutionDescriptionList = list;
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
