
package ru.acs.fts.schemas.album.reportclosecontrol;

import java.util.ArrayList;
import java.util.List;

/** 
 * Ошибки
 */
public class PZKErrorsType
{
    private String GTDGoodsNumber;
    private GTDinTableType GTDinTable;
    private ErrorType error;
    private CheckNormativeDocumentType checkNormativeDoc;
    private List<CloseReasonType> closeReasonList = new ArrayList<CloseReasonType>();

    /** 
     * Get the 'GTDGoodsNumber' element value. Номер товара по ДТ
     * 
     * @return value
     */
    public String getGTDGoodsNumber() {
        return GTDGoodsNumber;
    }

    /** 
     * Set the 'GTDGoodsNumber' element value. Номер товара по ДТ
     * 
     * @param GTDGoodsNumber
     */
    public void setGTDGoodsNumber(String GTDGoodsNumber) {
        this.GTDGoodsNumber = GTDGoodsNumber;
    }

    /** 
     * Get the 'GTDinTable' element value. Информация в таблице внутреннего формата электронной копии ДТ (формат DBF)
     * 
     * @return value
     */
    public GTDinTableType getGTDinTable() {
        return GTDinTable;
    }

    /** 
     * Set the 'GTDinTable' element value. Информация в таблице внутреннего формата электронной копии ДТ (формат DBF)
     * 
     * @param GTDinTable
     */
    public void setGTDinTable(GTDinTableType GTDinTable) {
        this.GTDinTable = GTDinTable;
    }

    /** 
     * Get the 'Error' element value. Ошибка ПЗК
     * 
     * @return value
     */
    public ErrorType getError() {
        return error;
    }

    /** 
     * Set the 'Error' element value. Ошибка ПЗК
     * 
     * @param error
     */
    public void setError(ErrorType error) {
        this.error = error;
    }

    /** 
     * Get the 'CheckNormativeDoc' element value. Нормативный документ, в соответствии с которым выполняется контроль
     * 
     * @return value
     */
    public CheckNormativeDocumentType getCheckNormativeDoc() {
        return checkNormativeDoc;
    }

    /** 
     * Set the 'CheckNormativeDoc' element value. Нормативный документ, в соответствии с которым выполняется контроль
     * 
     * @param checkNormativeDoc
     */
    public void setCheckNormativeDoc(
            CheckNormativeDocumentType checkNormativeDoc) {
        this.checkNormativeDoc = checkNormativeDoc;
    }

    /** 
     * Get the list of 'CloseReason' element items. Причина закрытия
     * 
     * @return list
     */
    public List<CloseReasonType> getCloseReasonList() {
        return closeReasonList;
    }

    /** 
     * Set the list of 'CloseReason' element items. Причина закрытия
     * 
     * @param list
     */
    public void setCloseReasonList(List<CloseReasonType> list) {
        closeReasonList = list;
    }
}
