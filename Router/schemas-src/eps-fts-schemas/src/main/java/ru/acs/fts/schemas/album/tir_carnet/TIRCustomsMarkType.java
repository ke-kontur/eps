
package ru.acs.fts.schemas.album.tir_carnet;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * Отметки таможни
 */
public class TIRCustomsMarkType
{
    private String goodsAcceptInfo;
    private String identityNoBroken;
    private String transitTime;
    private String customsDocNum;
    private String comments;
    private String packProcFinish;
    private TIRCustomsPersonType customsPerson;
    private CustomsType customs;

    /** 
     * Get the 'GoodsAcceptInfo' element value. Свидетельство о принятии груза к оформлению (таможня отправления или таможня при въезде)/  Свидетельство о прекращении операции МДП (таможня места назначения или таможня при выезде)
     * 
     * @return value
     */
    public String getGoodsAcceptInfo() {
        return goodsAcceptInfo;
    }

    /** 
     * Set the 'GoodsAcceptInfo' element value. Свидетельство о принятии груза к оформлению (таможня отправления или таможня при въезде)/  Свидетельство о прекращении операции МДП (таможня места назначения или таможня при выезде)
     * 
     * @param goodsAcceptInfo
     */
    public void setGoodsAcceptInfo(String goodsAcceptInfo) {
        this.goodsAcceptInfo = goodsAcceptInfo;
    }

    /** 
     * Get the 'IdentityNoBroken' element value. Наложенные печати,  пломбы или опознавательные знаки признаны не поврежденными
     * 
     * @return value
     */
    public String getIdentityNoBroken() {
        return identityNoBroken;
    }

    /** 
     * Set the 'IdentityNoBroken' element value. Наложенные печати,  пломбы или опознавательные знаки признаны не поврежденными
     * 
     * @param identityNoBroken
     */
    public void setIdentityNoBroken(String identityNoBroken) {
        this.identityNoBroken = identityNoBroken;
    }

    /** 
     * Get the 'TransitTime' element value. Продолжительность транзитной перевозки
     * 
     * @return value
     */
    public String getTransitTime() {
        return transitTime;
    }

    /** 
     * Set the 'TransitTime' element value. Продолжительность транзитной перевозки
     * 
     * @param transitTime
     */
    public void setTransitTime(String transitTime) {
        this.transitTime = transitTime;
    }

    /** 
     * Get the 'CustomsDocNum' element value. Номер таможенного документа
     * 
     * @return value
     */
    public String getCustomsDocNum() {
        return customsDocNum;
    }

    /** 
     * Set the 'CustomsDocNum' element value. Номер таможенного документа
     * 
     * @param customsDocNum
     */
    public void setCustomsDocNum(String customsDocNum) {
        this.customsDocNum = customsDocNum;
    }

    /** 
     * Get the 'Comments' element value. Разное
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Разное
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /** 
     * Get the 'PackProcFinish' element value. Число грузовых мест в отношении которых  удостоверено прекращение операции МДП
     * 
     * @return value
     */
    public String getPackProcFinish() {
        return packProcFinish;
    }

    /** 
     * Set the 'PackProcFinish' element value. Число грузовых мест в отношении которых  удостоверено прекращение операции МДП
     * 
     * @param packProcFinish
     */
    public void setPackProcFinish(String packProcFinish) {
        this.packProcFinish = packProcFinish;
    }

    /** 
     * Get the 'CustomsPerson' element value. Подпись и печать должностного лица  таможенного органа
     * 
     * @return value
     */
    public TIRCustomsPersonType getCustomsPerson() {
        return customsPerson;
    }

    /** 
     * Set the 'CustomsPerson' element value. Подпись и печать должностного лица  таможенного органа
     * 
     * @param customsPerson
     */
    public void setCustomsPerson(TIRCustomsPersonType customsPerson) {
        this.customsPerson = customsPerson;
    }

    /** 
     * Get the 'Customs' element value. Зарегистрировано таможней (какой
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Зарегистрировано таможней (какой
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }
}
