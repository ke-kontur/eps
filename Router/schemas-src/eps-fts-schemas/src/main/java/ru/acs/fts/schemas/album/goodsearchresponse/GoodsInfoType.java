
package ru.acs.fts.schemas.album.goodsearchresponse;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/** 
 * Описание товара
 */
public class GoodsInfoType
{
    private String goodsTNVEDCode;
    private List<String> containerList = new ArrayList<String>();
    private String ETSNG;
    private LocalDate issuanceDate;
    private PlaceType factStation;

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
     * Get the list of 'Container' element items. Контейнер
     * 
     * @return list
     */
    public List<String> getContainerList() {
        return containerList;
    }

    /** 
     * Set the list of 'Container' element items. Контейнер
     * 
     * @param list
     */
    public void setContainerList(List<String> list) {
        containerList = list;
    }

    /** 
     * Get the 'ETSNG' element value. Код ЕТСНГ
     * 
     * @return value
     */
    public String getETSNG() {
        return ETSNG;
    }

    /** 
     * Set the 'ETSNG' element value. Код ЕТСНГ
     * 
     * @param ETSNG
     */
    public void setETSNG(String ETSNG) {
        this.ETSNG = ETSNG;
    }

    /** 
     * Get the 'IssuanceDate' element value. Дата выдачи груза
     * 
     * @return value
     */
    public LocalDate getIssuanceDate() {
        return issuanceDate;
    }

    /** 
     * Set the 'IssuanceDate' element value. Дата выдачи груза
     * 
     * @param issuanceDate
     */
    public void setIssuanceDate(LocalDate issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    /** 
     * Get the 'FactStation' element value. Станция фактического прибытия
     * 
     * @return value
     */
    public PlaceType getFactStation() {
        return factStation;
    }

    /** 
     * Set the 'FactStation' element value. Станция фактического прибытия
     * 
     * @param factStation
     */
    public void setFactStation(PlaceType factStation) {
        this.factStation = factStation;
    }
}
