
package ru.acs.fts.schemas.album.liquidationcustomsmark;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Отметки таможенного органа на Заявлении об уничтожении товаров и (или) упаковки, пришедших в негодность
 */
public class LiquidationCustomsMarkType extends BaseDocType
{
    private LocalDate composeDate;
    private String customsDecision;
    private LocalDate liquidationDate;
    private String customsControl;
    private List<String> refusalReasonList = new ArrayList<String>();
    private ApplicationRegNumberType applicationRegNumber;
    private CustomsPersonType customsPerson;
    private CUCustomsType customs;
    private DocumentBaseType prolongFoundation;
    private String documentModeID;

    /** 
     * Get the 'ComposeDate' element value. Дата проставления таможенных отметок
     * 
     * @return value
     */
    public LocalDate getComposeDate() {
        return composeDate;
    }

    /** 
     * Set the 'ComposeDate' element value. Дата проставления таможенных отметок
     * 
     * @param composeDate
     */
    public void setComposeDate(LocalDate composeDate) {
        this.composeDate = composeDate;
    }

    /** 
     * Get the 'CustomsDecision' element value. Тип решения таможенного органа: 1 - разрешение на уничтожение; 2 - продление срока уничтожения; 3 - отказ в выдаче разрешения; 4 - отказ в продлении срока уничтожения
     * 
     * @return value
     */
    public String getCustomsDecision() {
        return customsDecision;
    }

    /** 
     * Set the 'CustomsDecision' element value. Тип решения таможенного органа: 1 - разрешение на уничтожение; 2 - продление срока уничтожения; 3 - отказ в выдаче разрешения; 4 - отказ в продлении срока уничтожения
     * 
     * @param customsDecision
     */
    public void setCustomsDecision(String customsDecision) {
        this.customsDecision = customsDecision;
    }

    /** 
     * Get the 'LiquidationDate' element value. Срок уничтожения
     * 
     * @return value
     */
    public LocalDate getLiquidationDate() {
        return liquidationDate;
    }

    /** 
     * Set the 'LiquidationDate' element value. Срок уничтожения
     * 
     * @param liquidationDate
     */
    public void setLiquidationDate(LocalDate liquidationDate) {
        this.liquidationDate = liquidationDate;
    }

    /** 
     * Get the 'CustomsControl' element value. Признак необходимости применения таможенного наблюдения
     * 
     * @return value
     */
    public String getCustomsControl() {
        return customsControl;
    }

    /** 
     * Set the 'CustomsControl' element value. Признак необходимости применения таможенного наблюдения
     * 
     * @param customsControl
     */
    public void setCustomsControl(String customsControl) {
        this.customsControl = customsControl;
    }

    /** 
     * Get the list of 'RefusalReasons' element items. Причины невозможности выдачи разрешения на уничтожение/отказа в продлении срока
     * 
     * @return list
     */
    public List<String> getRefusalReasonList() {
        return refusalReasonList;
    }

    /** 
     * Set the list of 'RefusalReasons' element items. Причины невозможности выдачи разрешения на уничтожение/отказа в продлении срока
     * 
     * @param list
     */
    public void setRefusalReasonList(List<String> list) {
        refusalReasonList = list;
    }

    /** 
     * Get the 'ApplicationRegNumber' element value. Регистрационный номер заявления на уничтожение
     * 
     * @return value
     */
    public ApplicationRegNumberType getApplicationRegNumber() {
        return applicationRegNumber;
    }

    /** 
     * Set the 'ApplicationRegNumber' element value. Регистрационный номер заявления на уничтожение
     * 
     * @param applicationRegNumber
     */
    public void setApplicationRegNumber(
            ApplicationRegNumberType applicationRegNumber) {
        this.applicationRegNumber = applicationRegNumber;
    }

    /** 
     * Get the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @return value
     */
    public CustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Должностное лицо таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(CustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Customs' element value. Уполномоченный таможенный орган
     * 
     * @return value
     */
    public CUCustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Уполномоченный таможенный орган
     * 
     * @param customs
     */
    public void setCustoms(CUCustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'ProlongFoundation' element value. Основание продления срока уничтожения
     * 
     * @return value
     */
    public DocumentBaseType getProlongFoundation() {
        return prolongFoundation;
    }

    /** 
     * Set the 'ProlongFoundation' element value. Основание продления срока уничтожения
     * 
     * @param prolongFoundation
     */
    public void setProlongFoundation(DocumentBaseType prolongFoundation) {
        this.prolongFoundation = prolongFoundation;
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
