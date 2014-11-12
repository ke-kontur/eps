
package ru.acs.fts.schemas.album.liquidationactin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Акт об уничтожении (Внутренний формат)
 */
public class LiquidationActInType extends BaseDocType
{
    private String customsMark;
    private String neededActions;
    private LocalDate actPresentDate;
    private LiquidationParticipantType residentOEZ;
    private LiquidationParticipantType liquidator;
    private CUCustomsType CUCustoms;
    private AddressType liquidationPlace;
    private List<WasteProductsType> wasteProductList = new ArrayList<WasteProductsType>();
    private List<ParticipatedPersonType> participatedPersonList = new ArrayList<ParticipatedPersonType>();
    private ApplicationRegNumberType applicationRegNumber;
    private ActRegNumberType actRegNumber;
    private PersonSignatureType customsPerson;
    private String documentModeID;

    /** 
     * Get the 'CustomsMark' element value. Отметка должностного лица таможенного органа: 0 - сведения не соответствуют; 1 - товар снят с контроля
     * 
     * @return value
     */
    public String getCustomsMark() {
        return customsMark;
    }

    /** 
     * Set the 'CustomsMark' element value. Отметка должностного лица таможенного органа: 0 - сведения не соответствуют; 1 - товар снят с контроля
     * 
     * @param customsMark
     */
    public void setCustomsMark(String customsMark) {
        this.customsMark = customsMark;
    }

    /** 
     * Get the 'NeededActions' element value. Действие, которое необходимо совершить для устранения несоответствий
     * 
     * @return value
     */
    public String getNeededActions() {
        return neededActions;
    }

    /** 
     * Set the 'NeededActions' element value. Действие, которое необходимо совершить для устранения несоответствий
     * 
     * @param neededActions
     */
    public void setNeededActions(String neededActions) {
        this.neededActions = neededActions;
    }

    /** 
     * Get the 'ActPresentDate' element value. Срок представления акта об уничтожении
     * 
     * @return value
     */
    public LocalDate getActPresentDate() {
        return actPresentDate;
    }

    /** 
     * Set the 'ActPresentDate' element value. Срок представления акта об уничтожении
     * 
     * @param actPresentDate
     */
    public void setActPresentDate(LocalDate actPresentDate) {
        this.actPresentDate = actPresentDate;
    }

    /** 
     * Get the 'ResidentOEZ' element value. Резидент ОЭЗ/Нерезидент ОЭЗ
     * 
     * @return value
     */
    public LiquidationParticipantType getResidentOEZ() {
        return residentOEZ;
    }

    /** 
     * Set the 'ResidentOEZ' element value. Резидент ОЭЗ/Нерезидент ОЭЗ
     * 
     * @param residentOEZ
     */
    public void setResidentOEZ(LiquidationParticipantType residentOEZ) {
        this.residentOEZ = residentOEZ;
    }

    /** 
     * Get the 'Liquidator' element value. Лицо, осуществляющее уничтожение
     * 
     * @return value
     */
    public LiquidationParticipantType getLiquidator() {
        return liquidator;
    }

    /** 
     * Set the 'Liquidator' element value. Лицо, осуществляющее уничтожение
     * 
     * @param liquidator
     */
    public void setLiquidator(LiquidationParticipantType liquidator) {
        this.liquidator = liquidator;
    }

    /** 
     * Get the 'CUCustoms' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CUCustomsType getCUCustoms() {
        return CUCustoms;
    }

    /** 
     * Set the 'CUCustoms' element value. Сведения о таможенном органе
     * 
     * @param CUCustoms
     */
    public void setCUCustoms(CUCustomsType CUCustoms) {
        this.CUCustoms = CUCustoms;
    }

    /** 
     * Get the 'LiquidationPlace' element value. Место уничтожения
     * 
     * @return value
     */
    public AddressType getLiquidationPlace() {
        return liquidationPlace;
    }

    /** 
     * Set the 'LiquidationPlace' element value. Место уничтожения
     * 
     * @param liquidationPlace
     */
    public void setLiquidationPlace(AddressType liquidationPlace) {
        this.liquidationPlace = liquidationPlace;
    }

    /** 
     * Get the list of 'WasteProducts' element items. Отходы, полученные из товаров и (или) упаковки
     * 
     * @return list
     */
    public List<WasteProductsType> getWasteProductList() {
        return wasteProductList;
    }

    /** 
     * Set the list of 'WasteProducts' element items. Отходы, полученные из товаров и (или) упаковки
     * 
     * @param list
     */
    public void setWasteProductList(List<WasteProductsType> list) {
        wasteProductList = list;
    }

    /** 
     * Get the list of 'ParticipatedPerson' element items. Лицо, присутствующее при уничтожении
     * 
     * @return list
     */
    public List<ParticipatedPersonType> getParticipatedPersonList() {
        return participatedPersonList;
    }

    /** 
     * Set the list of 'ParticipatedPerson' element items. Лицо, присутствующее при уничтожении
     * 
     * @param list
     */
    public void setParticipatedPersonList(List<ParticipatedPersonType> list) {
        participatedPersonList = list;
    }

    /** 
     * Get the 'ApplicationRegNumber' element value. Регистрационный номер заявления
     * 
     * @return value
     */
    public ApplicationRegNumberType getApplicationRegNumber() {
        return applicationRegNumber;
    }

    /** 
     * Set the 'ApplicationRegNumber' element value. Регистрационный номер заявления
     * 
     * @param applicationRegNumber
     */
    public void setApplicationRegNumber(
            ApplicationRegNumberType applicationRegNumber) {
        this.applicationRegNumber = applicationRegNumber;
    }

    /** 
     * Get the 'ActRegNumber' element value. Регистрационный номер акта об уничтожении
     * 
     * @return value
     */
    public ActRegNumberType getActRegNumber() {
        return actRegNumber;
    }

    /** 
     * Set the 'ActRegNumber' element value. Регистрационный номер акта об уничтожении
     * 
     * @param actRegNumber
     */
    public void setActRegNumber(ActRegNumberType actRegNumber) {
        this.actRegNumber = actRegNumber;
    }

    /** 
     * Get the 'CustomsPerson' element value. Подпись уполномоченного лица таможенного органа
     * 
     * @return value
     */
    public PersonSignatureType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Подпись уполномоченного лица таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(PersonSignatureType customsPerson) {
        this.customsPerson = customsPerson;
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
