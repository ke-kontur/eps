
package ru.acs.fts.schemas.album.atdclosecontrol;

import java.util.ArrayList;
import java.util.List;

/** 
 * Ошибки
 */
public class PZKErrorsType
{
    private String ATDGoodsNumber;
    private ATDinTableType ATDinTable;
    private ErrorType error;
    private CheckNormativeDocumentType checkNormativeDocument;
    private List<CloseReasonType> closeReasonList = new ArrayList<CloseReasonType>();

    /** 
     * Get the 'ATDGoodsNumber' element value. Номер товара по АТД
     * 
     * @return value
     */
    public String getATDGoodsNumber() {
        return ATDGoodsNumber;
    }

    /** 
     * Set the 'ATDGoodsNumber' element value. Номер товара по АТД
     * 
     * @param ATDGoodsNumber
     */
    public void setATDGoodsNumber(String ATDGoodsNumber) {
        this.ATDGoodsNumber = ATDGoodsNumber;
    }

    /** 
     * Get the 'ATDinTable' element value. Информация в таблице внутреннего формата электронной копии АТД (формат DBF)
     * 
     * @return value
     */
    public ATDinTableType getATDinTable() {
        return ATDinTable;
    }

    /** 
     * Set the 'ATDinTable' element value. Информация в таблице внутреннего формата электронной копии АТД (формат DBF)
     * 
     * @param ATDinTable
     */
    public void setATDinTable(ATDinTableType ATDinTable) {
        this.ATDinTable = ATDinTable;
    }

    /** 
     * Get the 'Error' element value. Описание ошибки.
     * 
     * @return value
     */
    public ErrorType getError() {
        return error;
    }

    /** 
     * Set the 'Error' element value. Описание ошибки.
     * 
     * @param error
     */
    public void setError(ErrorType error) {
        this.error = error;
    }

    /** 
     * Get the 'CheckNormativeDocument' element value. Нормативный документ, в соответствии с которым выполняется контроль
     * 
     * @return value
     */
    public CheckNormativeDocumentType getCheckNormativeDocument() {
        return checkNormativeDocument;
    }

    /** 
     * Set the 'CheckNormativeDocument' element value. Нормативный документ, в соответствии с которым выполняется контроль
     * 
     * @param checkNormativeDocument
     */
    public void setCheckNormativeDocument(
            CheckNormativeDocumentType checkNormativeDocument) {
        this.checkNormativeDocument = checkNormativeDocument;
    }

    /** 
     * Get the list of 'CloseReason' element items. Причины закрытия
     * 
     * @return list
     */
    public List<CloseReasonType> getCloseReasonList() {
        return closeReasonList;
    }

    /** 
     * Set the list of 'CloseReason' element items. Причины закрытия
     * 
     * @param list
     */
    public void setCloseReasonList(List<CloseReasonType> list) {
        closeReasonList = list;
    }
}
