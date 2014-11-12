
package ru.acs.fts.schemas.album.liquidationapplicationin;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Таможенные отметки
 */
public class CustomsMarkType
{
    private String customsDecision;
    private LocalDate composeDate;
    private String customsControl;
    private List<String> refusalReasonList = new ArrayList<String>();
    private LocalDate finalLiquidationDate;
    private DocumentBaseType prolongFoundation;
    private CustomsPersonType customsPerson;

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
     * Get the 'FinalLiquidationDate' element value. Срок уничтожения по решению таможенного органа
     * 
     * @return value
     */
    public LocalDate getFinalLiquidationDate() {
        return finalLiquidationDate;
    }

    /** 
     * Set the 'FinalLiquidationDate' element value. Срок уничтожения по решению таможенного органа
     * 
     * @param finalLiquidationDate
     */
    public void setFinalLiquidationDate(LocalDate finalLiquidationDate) {
        this.finalLiquidationDate = finalLiquidationDate;
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
}
