
package ru.acs.fts.schemas.album.notiffinishrejectoperations;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Уведомление о завершении операций/об отказе в проведении операций в отношении товаров и транспортных средств
 */
public class NotifFinishRejectOperationsType extends BaseDocType
{
    private String documentSign;
    private List<String> operationDescriptionList = new ArrayList<String>();
    private GTDIDType GTDNumber;
    private DeclarantType declarant;
    private CUCustomsType customsOffice;
    private String documentModeID;

    /** 
     * Get the 'DocumentSign' element value. Признак: 0 - отказ, 1 - завершение
     * 
     * @return value
     */
    public String getDocumentSign() {
        return documentSign;
    }

    /** 
     * Set the 'DocumentSign' element value. Признак: 0 - отказ, 1 - завершение
     * 
     * @param documentSign
     */
    public void setDocumentSign(String documentSign) {
        this.documentSign = documentSign;
    }

    /** 
     * Get the list of 'OperationDescription' element items. Операция (Заполняется в случае отказа в выполнении конкретного вида операции): 1 - Транспортировка, 2 - Взвешивание, 3 - Иное определение количества товаров, 4 - Погрузка, 5 - Выгрузка, 6 - Перегрузка, 7 - Исправление поврежденной упаковки, 8 - Вскрытие упаковки, 9 - Упаковка, 10 - Переупаковка, 11- Вскрытие помещений, емкостей и других мест,  где находятся или могут находиться товары, 12 - Разделение товарной партии по отдельным видам и (или) наименованиям товаров
     * 
     * @return list
     */
    public List<String> getOperationDescriptionList() {
        return operationDescriptionList;
    }

    /** 
     * Set the list of 'OperationDescription' element items. Операция (Заполняется в случае отказа в выполнении конкретного вида операции): 1 - Транспортировка, 2 - Взвешивание, 3 - Иное определение количества товаров, 4 - Погрузка, 5 - Выгрузка, 6 - Перегрузка, 7 - Исправление поврежденной упаковки, 8 - Вскрытие упаковки, 9 - Упаковка, 10 - Переупаковка, 11- Вскрытие помещений, емкостей и других мест,  где находятся или могут находиться товары, 12 - Разделение товарной партии по отдельным видам и (или) наименованиям товаров
     * 
     * @param list
     */
    public void setOperationDescriptionList(List<String> list) {
        operationDescriptionList = list;
    }

    /** 
     * Get the 'GTDNumber' element value. Номер таможенной декларации
     * 
     * @return value
     */
    public GTDIDType getGTDNumber() {
        return GTDNumber;
    }

    /** 
     * Set the 'GTDNumber' element value. Номер таможенной декларации
     * 
     * @param GTDNumber
     */
    public void setGTDNumber(GTDIDType GTDNumber) {
        this.GTDNumber = GTDNumber;
    }

    /** 
     * Get the 'Declarant' element value. Сведения о декларанте/ином лице, обладающем полномочиями в отношении товаров и (или) транспортных средств, и их представителей.
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. Сведения о декларанте/ином лице, обладающем полномочиями в отношении товаров и (или) транспортных средств, и их представителей.
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'CustomsOffice' element value. Таможеннный орган
     * 
     * @return value
     */
    public CUCustomsType getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. Таможеннный орган
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(CUCustomsType customsOffice) {
        this.customsOffice = customsOffice;
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
