
package ru.acs.fts.schemas.album.semcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsGroupDescriptionType;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.GoodsItemBaseType;

/** 
 * Информация о товарах (для запросов)
 */
public class GoodsType extends GoodsItemBaseType
{
    private String goodsTNVEDCode;
    private String additionalSign;
    private String intellectPropertySign;
    private String goodsAddTNVEDCode;
    private List<String> presentedDocumentModeCodeList = new ArrayList<String>();
    private String procedure;
    private List<GoodsGroupDescriptionType> goodsGroupDescriptionList = new ArrayList<GoodsGroupDescriptionType>();

    /** 
     * Get the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @return value
     */
    public String getGoodsTNVEDCode() {
        return goodsTNVEDCode;
    }

    /** 
     * Set the 'GoodsTNVEDCode' element value. Код товара по ТН ВЭД ТС
     * 
     * @param goodsTNVEDCode
     */
    public void setGoodsTNVEDCode(String goodsTNVEDCode) {
        this.goodsTNVEDCode = goodsTNVEDCode;
    }

    /** 
     * Get the 'AdditionalSign' element value. Дополнительный признак нетарифного регулирования ("С"). Гр.33 второй раздел
     * 
     * @return value
     */
    public String getAdditionalSign() {
        return additionalSign;
    }

    /** 
     * Set the 'AdditionalSign' element value. Дополнительный признак нетарифного регулирования ("С"). Гр.33 второй раздел
     * 
     * @param additionalSign
     */
    public void setAdditionalSign(String additionalSign) {
        this.additionalSign = additionalSign;
    }

    /** 
     * Get the 'IntellectPropertySign' element value. Признак объекта интеллектуальной собственности ("И"). Гр.33 второй раздел в ДТ
     * 
     * @return value
     */
    public String getIntellectPropertySign() {
        return intellectPropertySign;
    }

    /** 
     * Set the 'IntellectPropertySign' element value. Признак объекта интеллектуальной собственности ("И"). Гр.33 второй раздел в ДТ
     * 
     * @param intellectPropertySign
     */
    public void setIntellectPropertySign(String intellectPropertySign) {
        this.intellectPropertySign = intellectPropertySign;
    }

    /** 
     * Get the 'GoodsAddTNVEDCode' element value. Код  товара по классификатору  дополнительной таможенной информации
     * 
     * @return value
     */
    public String getGoodsAddTNVEDCode() {
        return goodsAddTNVEDCode;
    }

    /** 
     * Set the 'GoodsAddTNVEDCode' element value. Код  товара по классификатору  дополнительной таможенной информации
     * 
     * @param goodsAddTNVEDCode
     */
    public void setGoodsAddTNVEDCode(String goodsAddTNVEDCode) {
        this.goodsAddTNVEDCode = goodsAddTNVEDCode;
    }

    /** 
     * Get the list of 'PresentedDocumentModeCode' element items. Код вида представляемого документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44.
     * 
     * @return list
     */
    public List<String> getPresentedDocumentModeCodeList() {
        return presentedDocumentModeCodeList;
    }

    /** 
     * Set the list of 'PresentedDocumentModeCode' element items. Код вида представляемого документа. Заполняется в соответствии с классификатором видов документов, используемых при заявлении сведений в графе 44.
     * 
     * @param list
     */
    public void setPresentedDocumentModeCodeList(List<String> list) {
        presentedDocumentModeCodeList = list;
    }

    /** 
     * Get the 'Procedure' element value. Код процедуры - графа 37
     * 
     * @return value
     */
    public String getProcedure() {
        return procedure;
    }

    /** 
     * Set the 'Procedure' element value. Код процедуры - графа 37
     * 
     * @param procedure
     */
    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    /** 
     * Get the list of 'GoodsGroupDescription' element items. Описание и характеристика товаров / Описание группы товаров одного наименования с отличающимися от других групп характеристиками 
     * 
     * @return list
     */
    public List<GoodsGroupDescriptionType> getGoodsGroupDescriptionList() {
        return goodsGroupDescriptionList;
    }

    /** 
     * Set the list of 'GoodsGroupDescription' element items. Описание и характеристика товаров / Описание группы товаров одного наименования с отличающимися от других групп характеристиками 
     * 
     * @param list
     */
    public void setGoodsGroupDescriptionList(
            List<GoodsGroupDescriptionType> list) {
        goodsGroupDescriptionList = list;
    }
}
