
package ru.acs.fts.schemas.album.resultrd;

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
    private ItemInfoType itemInfo;

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
     * Get the 'ItemInfo' element value. Ссылка на элемент с ошибкой.
     * 
     * @return value
     */
    public ItemInfoType getItemInfo() {
        return itemInfo;
    }

    /** 
     * Set the 'ItemInfo' element value. Ссылка на элемент с ошибкой.
     * 
     * @param itemInfo
     */
    public void setItemInfo(ItemInfoType itemInfo) {
        this.itemInfo = itemInfo;
    }
}
