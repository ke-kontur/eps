
package ru.acs.fts.schemas.album.reqcorrectpayment;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание необходимых изменений (дополнений) ДТ
 */
public class DeclarationChangesType
{
    private String GRNumber;
    private List<String> previousDataList = new ArrayList<String>();
    private List<String> modifiedDataList = new ArrayList<String>();

    /** 
     * Get the 'GRNumber' element value. Обозначение графы (подраздела графы)
     * 
     * @return value
     */
    public String getGRNumber() {
        return GRNumber;
    }

    /** 
     * Set the 'GRNumber' element value. Обозначение графы (подраздела графы)
     * 
     * @param GRNumber
     */
    public void setGRNumber(String GRNumber) {
        this.GRNumber = GRNumber;
    }

    /** 
     * Get the list of 'PreviousData' element items. Ранее указанные сведения
     * 
     * @return list
     */
    public List<String> getPreviousDataList() {
        return previousDataList;
    }

    /** 
     * Set the list of 'PreviousData' element items. Ранее указанные сведения
     * 
     * @param list
     */
    public void setPreviousDataList(List<String> list) {
        previousDataList = list;
    }

    /** 
     * Get the list of 'ModifiedData' element items. Скорректированные сведения
     * 
     * @return list
     */
    public List<String> getModifiedDataList() {
        return modifiedDataList;
    }

    /** 
     * Set the list of 'ModifiedData' element items. Скорректированные сведения
     * 
     * @param list
     */
    public void setModifiedDataList(List<String> list) {
        modifiedDataList = list;
    }
}
