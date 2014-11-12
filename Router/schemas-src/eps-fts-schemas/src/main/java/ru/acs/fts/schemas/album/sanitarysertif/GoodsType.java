
package ru.acs.fts.schemas.album.sanitarysertif;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о сертифицируемой продукции
 */
public class GoodsType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private String ruUseInf;
    private List<String> normTechDocList = new ArrayList<String>();
    private List<String> investigProtocolList = new ArrayList<String>();
    private String goodsEntry;
    private List<String> sanitaryCharachterList = new ArrayList<String>();
    private String fieldOfUse;
    private String reqConditions;
    private String labelInf;
    private List<String> sanitaryRegulationList = new ArrayList<String>();

    /** 
     * Get the list of 'GoodsDescription' element items. Общее описание продукции
     * 
     * @return list
     */
    public List<String> getGoodsDescriptionList() {
        return goodsDescriptionList;
    }

    /** 
     * Set the list of 'GoodsDescription' element items. Общее описание продукции
     * 
     * @param list
     */
    public void setGoodsDescriptionList(List<String> list) {
        goodsDescriptionList = list;
    }

    /** 
     * Get the 'RuUseInf' element value. Информация об использовании на территории РФ
     * 
     * @return value
     */
    public String getRuUseInf() {
        return ruUseInf;
    }

    /** 
     * Set the 'RuUseInf' element value. Информация об использовании на территории РФ
     * 
     * @param ruUseInf
     */
    public void setRuUseInf(String ruUseInf) {
        this.ruUseInf = ruUseInf;
    }

    /** 
     * Get the list of 'NormTechDocs' element items. Нормативная и технологическая документация в соответствии с которой произведена продукция (ГОСТы, ТУ и прочее)
     * 
     * @return list
     */
    public List<String> getNormTechDocList() {
        return normTechDocList;
    }

    /** 
     * Set the list of 'NormTechDocs' element items. Нормативная и технологическая документация в соответствии с которой произведена продукция (ГОСТы, ТУ и прочее)
     * 
     * @param list
     */
    public void setNormTechDocList(List<String> list) {
        normTechDocList = list;
    }

    /** 
     * Get the list of 'InvestigProtocols' element items. Протоколы исследований
     * 
     * @return list
     */
    public List<String> getInvestigProtocolList() {
        return investigProtocolList;
    }

    /** 
     * Set the list of 'InvestigProtocols' element items. Протоколы исследований
     * 
     * @param list
     */
    public void setInvestigProtocolList(List<String> list) {
        investigProtocolList = list;
    }

    /** 
     * Get the 'GoodsEntry' element value. Реквизиты импортной продукции
     * 
     * @return value
     */
    public String getGoodsEntry() {
        return goodsEntry;
    }

    /** 
     * Set the 'GoodsEntry' element value. Реквизиты импортной продукции
     * 
     * @param goodsEntry
     */
    public void setGoodsEntry(String goodsEntry) {
        this.goodsEntry = goodsEntry;
    }

    /** 
     * Get the list of 'SanitaryCharachter' element items. Гигиеническая характеристика продукции
     * 
     * @return list
     */
    public List<String> getSanitaryCharachterList() {
        return sanitaryCharachterList;
    }

    /** 
     * Set the list of 'SanitaryCharachter' element items. Гигиеническая характеристика продукции
     * 
     * @param list
     */
    public void setSanitaryCharachterList(List<String> list) {
        sanitaryCharachterList = list;
    }

    /** 
     * Get the 'FieldOfUse' element value. Область применения
     * 
     * @return value
     */
    public String getFieldOfUse() {
        return fieldOfUse;
    }

    /** 
     * Set the 'FieldOfUse' element value. Область применения
     * 
     * @param fieldOfUse
     */
    public void setFieldOfUse(String fieldOfUse) {
        this.fieldOfUse = fieldOfUse;
    }

    /** 
     * Get the 'ReqConditions' element value. Необходимые условия использования, хранения, транспортировки и меры безопасности
     * 
     * @return value
     */
    public String getReqConditions() {
        return reqConditions;
    }

    /** 
     * Set the 'ReqConditions' element value. Необходимые условия использования, хранения, транспортировки и меры безопасности
     * 
     * @param reqConditions
     */
    public void setReqConditions(String reqConditions) {
        this.reqConditions = reqConditions;
    }

    /** 
     * Get the 'LabelInf' element value. Информация, наносимая на этикетку
     * 
     * @return value
     */
    public String getLabelInf() {
        return labelInf;
    }

    /** 
     * Set the 'LabelInf' element value. Информация, наносимая на этикетку
     * 
     * @param labelInf
     */
    public void setLabelInf(String labelInf) {
        this.labelInf = labelInf;
    }

    /** 
     * Get the list of 'SanitaryRegulations' element items. Описание санитарных  правил, которым соответствует продукция
     * 
     * @return list
     */
    public List<String> getSanitaryRegulationList() {
        return sanitaryRegulationList;
    }

    /** 
     * Set the list of 'SanitaryRegulations' element items. Описание санитарных  правил, которым соответствует продукция
     * 
     * @param list
     */
    public void setSanitaryRegulationList(List<String> list) {
        sanitaryRegulationList = list;
    }
}
