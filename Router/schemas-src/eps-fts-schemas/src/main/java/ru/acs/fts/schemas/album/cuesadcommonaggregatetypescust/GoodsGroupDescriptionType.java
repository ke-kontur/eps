
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание группы товаров одного наименования с отличающимися от других групп характеристиками
 */
public class GoodsGroupDescriptionType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String RKTNVED;
    private List<GoodsGroupInformationType> goodsGroupInformationList = new ArrayList<GoodsGroupInformationType>();

    /** 
     * Get the list of 'GoodsDescription' element items. Описание группы товаров с учетом дополнительных характеристик (качественных, технических, коммерческих), необходимых для классификации товара и для исчисления таможенной стоимости. В случае отсутствия описания группы товаров указывается символ ':' (двоеточие). Гр. 31 первый подраздел
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Описание группы товаров с учетом дополнительных характеристик (качественных, технических, коммерческих), необходимых для классификации товара и для исчисления таможенной стоимости. В случае отсутствия описания группы товаров указывается символ ':' (двоеточие). Гр. 31 первый подраздел
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'RKTNVED' element value. Код ТН ВЭД ТС компонента машины для РК
     * 
     * @return value
     */
    public String getRKTNVED() {
        return RKTNVED;
    }

    /** 
     * Set the 'RKTNVED' element value. Код ТН ВЭД ТС компонента машины для РК
     * 
     * @param RKTNVED
     */
    public void setRKTNVED(String RKTNVED) {
        this.RKTNVED = RKTNVED;
    }

    /** 
     * Get the list of 'GoodsGroupInformation' element items. Характеристика товаров в группе
     * 
     * @return list
     */
    public List<GoodsGroupInformationType> getGoodsGroupInformationList() {
        return goodsGroupInformationList;
    }

    /** 
     * Set the list of 'GoodsGroupInformation' element items. Характеристика товаров в группе
     * 
     * @param list
     */
    public void setGoodsGroupInformationList(
            List<GoodsGroupInformationType> list) {
        goodsGroupInformationList = list;
    }
}
