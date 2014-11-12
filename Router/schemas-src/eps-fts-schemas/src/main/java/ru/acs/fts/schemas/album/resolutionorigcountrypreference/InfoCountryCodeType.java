
package ru.acs.fts.schemas.album.resolutionorigcountrypreference;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о СП
 */
public class InfoCountryCodeType
{
    private List<String> goodsNumberList = new ArrayList<String>();
    private String declCountryCode;
    private String adjCountryCode;
    private List<String> rationaleDecisionList = new ArrayList<String>();
    private List<DocumentBaseType> documentCountryCodeList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the list of 'GoodsNumber' element items. Номер товара по ДТ
     * 
     * @return list
     */
    public List<String> getGoodsNumberList() {
        return goodsNumberList;
    }

    /** 
     * Set the list of 'GoodsNumber' element items. Номер товара по ДТ
     * 
     * @param list
     */
    public void setGoodsNumberList(List<String> list) {
        goodsNumberList = list;
    }

    /** 
     * Get the 'DeclCountryCode' element value. Заявленный код СП
     * 
     * @return value
     */
    public String getDeclCountryCode() {
        return declCountryCode;
    }

    /** 
     * Set the 'DeclCountryCode' element value. Заявленный код СП
     * 
     * @param declCountryCode
     */
    public void setDeclCountryCode(String declCountryCode) {
        this.declCountryCode = declCountryCode;
    }

    /** 
     * Get the 'AdjCountryCode' element value. Скорректированный код СП
     * 
     * @return value
     */
    public String getAdjCountryCode() {
        return adjCountryCode;
    }

    /** 
     * Set the 'AdjCountryCode' element value. Скорректированный код СП
     * 
     * @param adjCountryCode
     */
    public void setAdjCountryCode(String adjCountryCode) {
        this.adjCountryCode = adjCountryCode;
    }

    /** 
     * Get the list of 'RationaleDecision' element items. Обоснование принятого решения
     * 
     * @return list
     */
    public List<String> getRationaleDecisionList() {
        return rationaleDecisionList;
    }

    /** 
     * Set the list of 'RationaleDecision' element items. Обоснование принятого решения
     * 
     * @param list
     */
    public void setRationaleDecisionList(List<String> list) {
        rationaleDecisionList = list;
    }

    /** 
     * Get the list of 'DocumentCountryCode' element items. Реквизиты документа, подтверждающего заявленную СП
     * 
     * @return list
     */
    public List<DocumentBaseType> getDocumentCountryCodeList() {
        return documentCountryCodeList;
    }

    /** 
     * Set the list of 'DocumentCountryCode' element items. Реквизиты документа, подтверждающего заявленную СП
     * 
     * @param list
     */
    public void setDocumentCountryCodeList(List<DocumentBaseType> list) {
        documentCountryCodeList = list;
    }
}
