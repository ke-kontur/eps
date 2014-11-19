
package ru.acs.fts.schemas.album.goodscheckreport;

import java.util.ArrayList;
import java.util.List;

/** 
 * Таблица сверки
 */
public class GoodsCheckTableType
{
    private String GTDValue;
    private String GTDValueFlag;
    private String trueValue;
    private List<String> GTDValueNoteList = new ArrayList<String>();
    private ElementLocationType checkElementLocation;
    private DescriptionDocumentType trueValueRefDocumentDT;
    private FactValueDocumentType trueValueRefDocument;

    /** 
     * Get the 'GTDValue' element value. Значение в ДТ
     * 
     * @return value
     */
    public String getGTDValue() {
        return GTDValue;
    }

    /** 
     * Set the 'GTDValue' element value. Значение в ДТ
     * 
     * @param GTDValue
     */
    public void setGTDValue(String GTDValue) {
        this.GTDValue = GTDValue;
    }

    /** 
     * Get the 'GTDValueFlag' element value. Признак совпадения/несовпадения значения в ДТ с предоставленными документами: 0 - совпало, 1 – не совпало
     * 
     * @return value
     */
    public String getGTDValueFlag() {
        return GTDValueFlag;
    }

    /** 
     * Set the 'GTDValueFlag' element value. Признак совпадения/несовпадения значения в ДТ с предоставленными документами: 0 - совпало, 1 – не совпало
     * 
     * @param GTDValueFlag
     */
    public void setGTDValueFlag(String GTDValueFlag) {
        this.GTDValueFlag = GTDValueFlag;
    }

    /** 
     * Get the 'TrueValue' element value. Значение фактическое (в соответствии с товаросопроводительными документами или документами, оформленными в результате таможенного контроля (акт досмотра и т.д.)
     * 
     * @return value
     */
    public String getTrueValue() {
        return trueValue;
    }

    /** 
     * Set the 'TrueValue' element value. Значение фактическое (в соответствии с товаросопроводительными документами или документами, оформленными в результате таможенного контроля (акт досмотра и т.д.)
     * 
     * @param trueValue
     */
    public void setTrueValue(String trueValue) {
        this.trueValue = trueValue;
    }

    /** 
     * Get the list of 'GTDValueNote' element items. Значение в ДТ примечание
     * 
     * @return list
     */
    public List<String> getGTDValueNoteList() {
        return GTDValueNoteList;
    }

    /** 
     * Set the list of 'GTDValueNote' element items. Значение в ДТ примечание
     * 
     * @param list
     */
    public void setGTDValueNoteList(List<String> list) {
        GTDValueNoteList = list;
    }

    /** 
     * Get the 'CheckElementLocation' element value. Идентификация атрибута сверки (номера графы ДТ)
     * 
     * @return value
     */
    public ElementLocationType getCheckElementLocation() {
        return checkElementLocation;
    }

    /** 
     * Set the 'CheckElementLocation' element value. Идентификация атрибута сверки (номера графы ДТ)
     * 
     * @param checkElementLocation
     */
    public void setCheckElementLocation(ElementLocationType checkElementLocation) {
        this.checkElementLocation = checkElementLocation;
    }

    /** 
     * Get the 'TrueValueRefDocumentDT' element value. Описание документа, содержащего значение из ДТ 
     * 
     * @return value
     */
    public DescriptionDocumentType getTrueValueRefDocumentDT() {
        return trueValueRefDocumentDT;
    }

    /** 
     * Set the 'TrueValueRefDocumentDT' element value. Описание документа, содержащего значение из ДТ 
     * 
     * @param trueValueRefDocumentDT
     */
    public void setTrueValueRefDocumentDT(
            DescriptionDocumentType trueValueRefDocumentDT) {
        this.trueValueRefDocumentDT = trueValueRefDocumentDT;
    }

    /** 
     * Get the 'TrueValueRefDocument' element value. Описание документа, содержащего фактическое значение
     * 
     * @return value
     */
    public FactValueDocumentType getTrueValueRefDocument() {
        return trueValueRefDocument;
    }

    /** 
     * Set the 'TrueValueRefDocument' element value. Описание документа, содержащего фактическое значение
     * 
     * @param trueValueRefDocument
     */
    public void setTrueValueRefDocument(
            FactValueDocumentType trueValueRefDocument) {
        this.trueValueRefDocument = trueValueRefDocument;
    }
}
