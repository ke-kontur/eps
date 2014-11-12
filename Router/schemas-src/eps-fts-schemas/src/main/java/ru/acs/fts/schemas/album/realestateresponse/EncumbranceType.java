
package ru.acs.fts.schemas.album.realestateresponse;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Ограничение права
 */
public class EncumbranceType
{
    private LocalDate regDate;
    private String regNum;
    private String shareText;
    private LocalDate startDate;
    private LocalDate endDate;
    private String term;
    private String allShareOwner;
    private AddDescriptionType encumbranceDetails;
    private List<OwnerType> ownerList = new ArrayList<OwnerType>();
    private List<FoundationDocType> foundationDocList = new ArrayList<FoundationDocType>();

    /** 
     * Get the 'RegDate' element value. Дата государственной регистрации
     * 
     * @return value
     */
    public LocalDate getRegDate() {
        return regDate;
    }

    /** 
     * Set the 'RegDate' element value. Дата государственной регистрации
     * 
     * @param regDate
     */
    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    /** 
     * Get the 'RegNum' element value. Номер государственной регистрации 
     * 
     * @return value
     */
    public String getRegNum() {
        return regNum;
    }

    /** 
     * Set the 'RegNum' element value. Номер государственной регистрации 
     * 
     * @param regNum
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    /** 
     * Get the 'ShareText' element value. Предмет ограничения
     * 
     * @return value
     */
    public String getShareText() {
        return shareText;
    }

    /** 
     * Set the 'ShareText' element value. Предмет ограничения
     * 
     * @param shareText
     */
    public void setShareText(String shareText) {
        this.shareText = shareText;
    }

    /** 
     * Get the 'StartDate' element value. Дата начала действия
     * 
     * @return value
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /** 
     * Set the 'StartDate' element value. Дата начала действия
     * 
     * @param startDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /** 
     * Get the 'EndDate' element value. Дата прекращения действия
     * 
     * @return value
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /** 
     * Set the 'EndDate' element value. Дата прекращения действия
     * 
     * @param endDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /** 
     * Get the 'Term' element value. Продолжительность
     * 
     * @return value
     */
    public String getTerm() {
        return term;
    }

    /** 
     * Set the 'Term' element value. Продолжительность
     * 
     * @param term
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /** 
     * Get the 'AllShareOwner' element value. Участники  долевого строительства по договорам участия в долевом строительстве
     * 
     * @return value
     */
    public String getAllShareOwner() {
        return allShareOwner;
    }

    /** 
     * Set the 'AllShareOwner' element value. Участники  долевого строительства по договорам участия в долевом строительстве
     * 
     * @param allShareOwner
     */
    public void setAllShareOwner(String allShareOwner) {
        this.allShareOwner = allShareOwner;
    }

    /** 
     * Get the 'EncumbranceDetails' element value. Описание ограничения права
     * 
     * @return value
     */
    public AddDescriptionType getEncumbranceDetails() {
        return encumbranceDetails;
    }

    /** 
     * Set the 'EncumbranceDetails' element value. Описание ограничения права
     * 
     * @param encumbranceDetails
     */
    public void setEncumbranceDetails(AddDescriptionType encumbranceDetails) {
        this.encumbranceDetails = encumbranceDetails;
    }

    /** 
     * Get the list of 'Owner' element items. Лица, в пользу которых ограничиваются права
     * 
     * @return list
     */
    public List<OwnerType> getOwnerList() {
        return ownerList;
    }

    /** 
     * Set the list of 'Owner' element items. Лица, в пользу которых ограничиваются права
     * 
     * @param list
     */
    public void setOwnerList(List<OwnerType> list) {
        ownerList = list;
    }

    /** 
     * Get the list of 'FoundationDoc' element items. Документы - основания регистрации ограничения
     * 
     * @return list
     */
    public List<FoundationDocType> getFoundationDocList() {
        return foundationDocList;
    }

    /** 
     * Set the list of 'FoundationDoc' element items. Документы - основания регистрации ограничения
     * 
     * @param list
     */
    public void setFoundationDocList(List<FoundationDocType> list) {
        foundationDocList = list;
    }
}
