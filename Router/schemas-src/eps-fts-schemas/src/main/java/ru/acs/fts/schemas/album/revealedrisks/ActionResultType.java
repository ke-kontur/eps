
package ru.acs.fts.schemas.album.revealedrisks;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Результаты применения мер по минимизации рисков
 */
public class ActionResultType
{
    private String actionResultCode;
    private String inspectedGoodsWeight;
    private String delictGoodsWeight;
    private String changeTNVEDMargin;
    private String KTSMargin;
    private String newGoodsNumeric;
    private String kodeksPunkt;
    private String kodeksPartPunkt;
    private GTDIDType GTDIDNew;

    /** 
     * Get the 'ActionResultCode' element value. Код результата применения меры по минимизации риска (значение указывается в соответствии с классификатором "Результатов применения прямых мер по минимизации рисков")
     * 
     * @return value
     */
    public String getActionResultCode() {
        return actionResultCode;
    }

    /** 
     * Set the 'ActionResultCode' element value. Код результата применения меры по минимизации риска (значение указывается в соответствии с классификатором "Результатов применения прямых мер по минимизации рисков")
     * 
     * @param actionResultCode
     */
    public void setActionResultCode(String actionResultCode) {
        this.actionResultCode = actionResultCode;
    }

    /** 
     * Get the 'InspectedGoodsWeight' element value. Вес нетто досмотренных товаров (Резерв)
     * 
     * @return value
     */
    public String getInspectedGoodsWeight() {
        return inspectedGoodsWeight;
    }

    /** 
     * Set the 'InspectedGoodsWeight' element value. Вес нетто досмотренных товаров (Резерв)
     * 
     * @param inspectedGoodsWeight
     */
    public void setInspectedGoodsWeight(String inspectedGoodsWeight) {
        this.inspectedGoodsWeight = inspectedGoodsWeight;
    }

    /** 
     * Get the 'DelictGoodsWeight' element value. Вес нетто товаров, являющихся объектом правонарушения (Резерв)
     * 
     * @return value
     */
    public String getDelictGoodsWeight() {
        return delictGoodsWeight;
    }

    /** 
     * Set the 'DelictGoodsWeight' element value. Вес нетто товаров, являющихся объектом правонарушения (Резерв)
     * 
     * @param delictGoodsWeight
     */
    public void setDelictGoodsWeight(String delictGoodsWeight) {
        this.delictGoodsWeight = delictGoodsWeight;
    }

    /** 
     * Get the 'ChangeTNVEDMargin' element value. Разность между суммой подлежащих к уплате таможенных платежей до и после принятия решений (руб.)
     * 
     * @return value
     */
    public String getChangeTNVEDMargin() {
        return changeTNVEDMargin;
    }

    /** 
     * Set the 'ChangeTNVEDMargin' element value. Разность между суммой подлежащих к уплате таможенных платежей до и после принятия решений (руб.)
     * 
     * @param changeTNVEDMargin
     */
    public void setChangeTNVEDMargin(String changeTNVEDMargin) {
        this.changeTNVEDMargin = changeTNVEDMargin;
    }

    /** 
     * Get the 'KTSMargin' element value. Разность между причитающимися таможенными платежами до и после корректировки таможенной стоимости товаров (Резерв)
     * 
     * @return value
     */
    public String getKTSMargin() {
        return KTSMargin;
    }

    /** 
     * Set the 'KTSMargin' element value. Разность между причитающимися таможенными платежами до и после корректировки таможенной стоимости товаров (Резерв)
     * 
     * @param KTSMargin
     */
    public void setKTSMargin(String KTSMargin) {
        this.KTSMargin = KTSMargin;
    }

    /** 
     * Get the 'NewGoodsNumeric' element value. Номер товара по вновь поданной ДТ
     * 
     * @return value
     */
    public String getNewGoodsNumeric() {
        return newGoodsNumeric;
    }

    /** 
     * Set the 'NewGoodsNumeric' element value. Номер товара по вновь поданной ДТ
     * 
     * @param newGoodsNumeric
     */
    public void setNewGoodsNumeric(String newGoodsNumeric) {
        this.newGoodsNumeric = newGoodsNumeric;
    }

    /** 
     * Get the 'KodeksPunkt' element value. Номер статьи Кодекса Российской Федерации об административных правонарушениях (КоАП России) или Уголовного кодекса России (УК России) 
     * 
     * @return value
     */
    public String getKodeksPunkt() {
        return kodeksPunkt;
    }

    /** 
     * Set the 'KodeksPunkt' element value. Номер статьи Кодекса Российской Федерации об административных правонарушениях (КоАП России) или Уголовного кодекса России (УК России) 
     * 
     * @param kodeksPunkt
     */
    public void setKodeksPunkt(String kodeksPunkt) {
        this.kodeksPunkt = kodeksPunkt;
    }

    /** 
     * Get the 'KodeksPartPunkt' element value. Номер части статьи КоАП России или УК России
     * 
     * @return value
     */
    public String getKodeksPartPunkt() {
        return kodeksPartPunkt;
    }

    /** 
     * Set the 'KodeksPartPunkt' element value. Номер части статьи КоАП России или УК России
     * 
     * @param kodeksPartPunkt
     */
    public void setKodeksPartPunkt(String kodeksPartPunkt) {
        this.kodeksPartPunkt = kodeksPartPunkt;
    }

    /** 
     * Get the 'GTDIDNew' element value. Регистрационный номер вновь поданной ДТ
     * 
     * @return value
     */
    public GTDIDType getGTDIDNew() {
        return GTDIDNew;
    }

    /** 
     * Set the 'GTDIDNew' element value. Регистрационный номер вновь поданной ДТ
     * 
     * @param GTDIDNew
     */
    public void setGTDIDNew(GTDIDType GTDIDNew) {
        this.GTDIDNew = GTDIDNew;
    }
}
