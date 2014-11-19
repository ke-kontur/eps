
package ru.acs.fts.schemas.admin.intexchresult;

import java.util.ArrayList;
import java.util.List;

/** 
 * Информация  о  результате обработки документа
 */
public class ResultInformationType
{
    private String resultSource;
    private String resultCode;
    private List<String> resultDescriptionList = new ArrayList<String>();
    private String resultCategory;
    private String refLineID;
    private ItemInfoType itemInfo;
    private List<EADInfoType> EADInfoList = new ArrayList<EADInfoType>();
    private ProcInformationType procInformation;

    /** 
     * Get the 'ResultSource' element value. Источник ошибки. Код подсистемы, вернувшей ошибку.
     * 
     * @return value
     */
    public String getResultSource() {
        return resultSource;
    }

    /** 
     * Set the 'ResultSource' element value. Источник ошибки. Код подсистемы, вернувшей ошибку.
     * 
     * @param resultSource
     */
    public void setResultSource(String resultSource) {
        this.resultSource = resultSource;
    }

    /** 
     * Get the 'ResultCode' element value. Код ошибки.
     * 
     * @return value
     */
    public String getResultCode() {
        return resultCode;
    }

    /** 
     * Set the 'ResultCode' element value. Код ошибки.
     * 
     * @param resultCode
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /** 
     * Get the list of 'ResultDescription' element items. Текстовое описание ошибки.
     * 
     * @return list
     */
    public List<String> getResultDescriptionList() {
        return resultDescriptionList;
    }

    /** 
     * Set the list of 'ResultDescription' element items. Текстовое описание ошибки.
     * 
     * @param list
     */
    public void setResultDescriptionList(List<String> list) {
        resultDescriptionList = list;
    }

    /** 
     * Get the 'ResultCategory' element value. Степень критичности ошибки. Код или мнемоническое описание.
     * 
     * @return value
     */
    public String getResultCategory() {
        return resultCategory;
    }

    /** 
     * Set the 'ResultCategory' element value. Степень критичности ошибки. Код или мнемоническое описание.
     * 
     * @param resultCategory
     */
    public void setResultCategory(String resultCategory) {
        this.resultCategory = resultCategory;
    }

    /** 
     * Get the 'RefLineID' element value. Идентификатор строки запроса к электронному архиву
     * 
     * @return value
     */
    public String getRefLineID() {
        return refLineID;
    }

    /** 
     * Set the 'RefLineID' element value. Идентификатор строки запроса к электронному архиву
     * 
     * @param refLineID
     */
    public void setRefLineID(String refLineID) {
        this.refLineID = refLineID;
    }

    /** 
     * Get the 'ItemInfo' element value. Ссылка на элемент с ошибкой
     * 
     * @return value
     */
    public ItemInfoType getItemInfo() {
        return itemInfo;
    }

    /** 
     * Set the 'ItemInfo' element value. Ссылка на элемент с ошибкой
     * 
     * @param itemInfo
     */
    public void setItemInfo(ItemInfoType itemInfo) {
        this.itemInfo = itemInfo;
    }

    /** 
     * Get the list of 'EADInfo' element items. Информация о документах в архиве декларанта
     * 
     * @return list
     */
    public List<EADInfoType> getEADInfoList() {
        return EADInfoList;
    }

    /** 
     * Set the list of 'EADInfo' element items. Информация о документах в архиве декларанта
     * 
     * @param list
     */
    public void setEADInfoList(List<EADInfoType> list) {
        EADInfoList = list;
    }

    /** 
     * Get the 'ProcInformation' element value. Информация о процессе, для которого запрашивается статус/история
     * 
     * @return value
     */
    public ProcInformationType getProcInformation() {
        return procInformation;
    }

    /** 
     * Set the 'ProcInformation' element value. Информация о процессе, для которого запрашивается статус/история
     * 
     * @param procInformation
     */
    public void setProcInformation(ProcInformationType procInformation) {
        this.procInformation = procInformation;
    }
}
