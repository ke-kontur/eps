
package ru.acs.fts.schemas.album.actoperationindentif;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;

/** 
 * Акт об изменении, удалении, уничтожении или замене средств идентификации
 */
public class ActOperationIndentifType extends BaseDocType
{
    private LocalDate actDate;
    private String actNumber;
    private String descriptionCircumstances;
    private String operationIndentif;
    private List<String> transportIdentifierList = new ArrayList<String>();
    private String descriptionIdentif;
    private String descriptionNewIdentif;
    private LocalDate applicationIdentifiDate;
    private CUCustomsType customs;
    private CustomsPersonInfoType customsPerson;
    private OperationPlaceType operationPlace;
    private PersonType secondCopyReceived;
    private PersonType personGoods;
    private String documentModeID;

    /** 
     * Get the 'ActDate' element value. Дата акта
     * 
     * @return value
     */
    public LocalDate getActDate() {
        return actDate;
    }

    /** 
     * Set the 'ActDate' element value. Дата акта
     * 
     * @param actDate
     */
    public void setActDate(LocalDate actDate) {
        this.actDate = actDate;
    }

    /** 
     * Get the 'ActNumber' element value. Номер акта
     * 
     * @return value
     */
    public String getActNumber() {
        return actNumber;
    }

    /** 
     * Set the 'ActNumber' element value. Номер акта
     * 
     * @param actNumber
     */
    public void setActNumber(String actNumber) {
        this.actNumber = actNumber;
    }

    /** 
     * Get the 'DescriptionCircumstances' element value. Краткое описание обстоятельств
     * 
     * @return value
     */
    public String getDescriptionCircumstances() {
        return descriptionCircumstances;
    }

    /** 
     * Set the 'DescriptionCircumstances' element value. Краткое описание обстоятельств
     * 
     * @param descriptionCircumstances
     */
    public void setDescriptionCircumstances(String descriptionCircumstances) {
        this.descriptionCircumstances = descriptionCircumstances;
    }

    /** 
     * Get the 'OperationIndentif' element value. Операции со средствами идентификации. 1 - удаление, 2 - изменение, 3 - замена, 4 - уничтожение.
     * 
     * @return value
     */
    public String getOperationIndentif() {
        return operationIndentif;
    }

    /** 
     * Set the 'OperationIndentif' element value. Операции со средствами идентификации. 1 - удаление, 2 - изменение, 3 - замена, 4 - уничтожение.
     * 
     * @param operationIndentif
     */
    public void setOperationIndentif(String operationIndentif) {
        this.operationIndentif = operationIndentif;
    }

    /** 
     * Get the list of 'TransportIdentifier' element items. Номер транспортных средств и контейнеров, на которых удалены или изменены средства идентификации
     * 
     * @return list
     */
    public List<String> getTransportIdentifierList() {
        return transportIdentifierList;
    }

    /** 
     * Set the list of 'TransportIdentifier' element items. Номер транспортных средств и контейнеров, на которых удалены или изменены средства идентификации
     * 
     * @param list
     */
    public void setTransportIdentifierList(List<String> list) {
        transportIdentifierList = list;
    }

    /** 
     * Get the 'DescriptionIdentif' element value. Описание измененных,  удаленных,  уничтоженных или  замененных средств идентификации 
     * 
     * @return value
     */
    public String getDescriptionIdentif() {
        return descriptionIdentif;
    }

    /** 
     * Set the 'DescriptionIdentif' element value. Описание измененных,  удаленных,  уничтоженных или  замененных средств идентификации 
     * 
     * @param descriptionIdentif
     */
    public void setDescriptionIdentif(String descriptionIdentif) {
        this.descriptionIdentif = descriptionIdentif;
    }

    /** 
     * Get the 'DescriptionNewIdentif' element value. Описание новых средств идентификации
     * 
     * @return value
     */
    public String getDescriptionNewIdentif() {
        return descriptionNewIdentif;
    }

    /** 
     * Set the 'DescriptionNewIdentif' element value. Описание новых средств идентификации
     * 
     * @param descriptionNewIdentif
     */
    public void setDescriptionNewIdentif(String descriptionNewIdentif) {
        this.descriptionNewIdentif = descriptionNewIdentif;
    }

    /** 
     * Get the 'ApplicationIdentifiDate' element value. Дата применения средств(а) идентификации
     * 
     * @return value
     */
    public LocalDate getApplicationIdentifiDate() {
        return applicationIdentifiDate;
    }

    /** 
     * Set the 'ApplicationIdentifiDate' element value. Дата применения средств(а) идентификации
     * 
     * @param applicationIdentifiDate
     */
    public void setApplicationIdentifiDate(LocalDate applicationIdentifiDate) {
        this.applicationIdentifiDate = applicationIdentifiDate;
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
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonInfoType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonInfoType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'OperationPlace' element value. Описание места проведения операций по изменению, удалению, уничтожению или замене средств идентификации
     * 
     * @return value
     */
    public OperationPlaceType getOperationPlace() {
        return operationPlace;
    }

    /** 
     * Set the 'OperationPlace' element value. Описание места проведения операций по изменению, удалению, уничтожению или замене средств идентификации
     * 
     * @param operationPlace
     */
    public void setOperationPlace(OperationPlaceType operationPlace) {
        this.operationPlace = operationPlace;
    }

    /** 
     * Get the 'SecondCopyReceived' element value. Второй экземпляр акта на руки получил
     * 
     * @return value
     */
    public PersonType getSecondCopyReceived() {
        return secondCopyReceived;
    }

    /** 
     * Set the 'SecondCopyReceived' element value. Второй экземпляр акта на руки получил
     * 
     * @param secondCopyReceived
     */
    public void setSecondCopyReceived(PersonType secondCopyReceived) {
        this.secondCopyReceived = secondCopyReceived;
    }

    /** 
     * Get the 'PersonGoods' element value. Лицо, обладающее полномочиями в отношении товаров (представитель лица)
     * 
     * @return value
     */
    public PersonType getPersonGoods() {
        return personGoods;
    }

    /** 
     * Set the 'PersonGoods' element value. Лицо, обладающее полномочиями в отношении товаров (представитель лица)
     * 
     * @param personGoods
     */
    public void setPersonGoods(PersonType personGoods) {
        this.personGoods = personGoods;
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
