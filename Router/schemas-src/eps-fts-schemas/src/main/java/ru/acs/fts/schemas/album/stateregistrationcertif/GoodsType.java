
package ru.acs.fts.schemas.album.stateregistrationcertif;

import java.util.ArrayList;
import java.util.List;

/** 
 * Сведения о продукции
 */
public class GoodsType
{
    private List<String> goodsDescriptionList = new ArrayList<String>();
    private List<String> normTechDocList = new ArrayList<String>();
    private List<String> investigProtocolList = new ArrayList<String>();
    private List<String> sanitaryCharachterList = new ArrayList<String>();
    private String labelInf;
    private List<String> sanitaryRegulationList = new ArrayList<String>();
    private String usageArea;

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

    /** 
     * Get the 'UsageArea' element value. Область применения
     * 
     * @return value
     */
    public String getUsageArea() {
        return usageArea;
    }

    /** 
     * Set the 'UsageArea' element value. Область применения
     * 
     * @param usageArea
     */
    public void setUsageArea(String usageArea) {
        this.usageArea = usageArea;
    }
}
