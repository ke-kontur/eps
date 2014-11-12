
package ru.acs.fts.schemas.album.goodsexportdecision;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.scvvcommonaggregatetypescust.SCVVConsigmentDecisionType;

/** 
 * Решение о разрешении/запрете вывоза товаров с превышением
 */
public class GoodsExportDecisionType extends BaseDocType
{
    private String decisionDate;
    private String processNumber;
    private List<SCVVConsigmentDecisionType> shipmentFactInfoList = new ArrayList<SCVVConsigmentDecisionType>();
    private String documentModeID;

    /** 
     * Get the 'DecisionDate' element value. Дата и время принятия решения
     * 
     * @return value
     */
    public String getDecisionDate() {
        return decisionDate;
    }

    /** 
     * Set the 'DecisionDate' element value. Дата и время принятия решения
     * 
     * @param decisionDate
     */
    public void setDecisionDate(String decisionDate) {
        this.decisionDate = decisionDate;
    }

    /** 
     * Get the 'ProcessNumber' element value. Уникальный идентификатор процесса.
     * 
     * @return value
     */
    public String getProcessNumber() {
        return processNumber;
    }

    /** 
     * Set the 'ProcessNumber' element value. Уникальный идентификатор процесса.
     * 
     * @param processNumber
     */
    public void setProcessNumber(String processNumber) {
        this.processNumber = processNumber;
    }

    /** 
     * Get the list of 'ShipmentFactInfo' element items. Сведения об итоговом решении по товарной партии.
     * 
     * @return list
     */
    public List<SCVVConsigmentDecisionType> getShipmentFactInfoList() {
        return shipmentFactInfoList;
    }

    /** 
     * Set the list of 'ShipmentFactInfo' element items. Сведения об итоговом решении по товарной партии.
     * 
     * @param list
     */
    public void setShipmentFactInfoList(List<SCVVConsigmentDecisionType> list) {
        shipmentFactInfoList = list;
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
