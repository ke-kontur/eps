
package ru.acs.fts.schemas.admin.updatedb_result;

import java.util.ArrayList;
import java.util.List;

/** 
 * Результат обработки строки записи
 */
public class RowResultType
{
    private String rowID;
    private String resultCode;
    private List<String> resultDescriptionList = new ArrayList<String>();
    private String infoCode;

    /** 
     * Get the 'RowID' element value. Идентификатор записи
     * 
     * @return value
     */
    public String getRowID() {
        return rowID;
    }

    /** 
     * Set the 'RowID' element value. Идентификатор записи
     * 
     * @param rowID
     */
    public void setRowID(String rowID) {
        this.rowID = rowID;
    }

    /** 
     * Get the 'ResultCode' element value. Результат(код)
     * 
     * @return value
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * Set the 'ResultCode' element value. Результат(код)
     * 
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /** 
     * Get the list of 'ResultDescription' element items. Описание
     * 
     * @return list
     */
    public List<String> getResultDescriptionList() {
        return resultDescriptionList;
    }

    /** 
     * Set the list of 'ResultDescription' element items. Описание
     * 
     * @param list
     */
    public void setResultDescriptionList(List<String> list) {
        resultDescriptionList = list;
    }

    /** 
     * Get the 'InfoCode' element value. Информационный код
     * 
     * @return value
     */
    public String getInfoCode() {
        return infoCode;
    }

    /** 
     * Set the 'InfoCode' element value. Информационный код
     * 
     * @param infoCode
     */
    public void setInfoCode(String infoCode) {
        this.infoCode = infoCode;
    }
}
