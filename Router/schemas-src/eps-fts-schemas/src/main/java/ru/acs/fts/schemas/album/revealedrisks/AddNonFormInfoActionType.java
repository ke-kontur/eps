
package ru.acs.fts.schemas.album.revealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * Дополнительная неформализованная информация - уровень меры
 */
public class AddNonFormInfoActionType
{
    private String informationCode;
    private String lineNumber;
    private String violationsCode;
    private List<String> typicalNameList = new ArrayList<String>();
    private String pointCode;

    /** 
     * Get the 'InformationCode' element value. Код информации: 0 - Резерв; 1- Описание причины неприменения меры в силу объективных причин, применения не в соответствии с характеристиками, определенными в профиле риска, либо не в полном объеме; 2 - Отметка о результатах применения мер
     * 
     * @return value
     */
    public String getInformationCode() {
        return informationCode;
    }

    /** 
     * Set the 'InformationCode' element value. Код информации: 0 - Резерв; 1- Описание причины неприменения меры в силу объективных причин, применения не в соответствии с характеристиками, определенными в профиле риска, либо не в полном объеме; 2 - Отметка о результатах применения мер
     * 
     * @param informationCode
     */
    public void setInformationCode(String informationCode) {
        this.informationCode = informationCode;
    }

    /** 
     * Get the 'LineNumber' element value. Порядковый номер строки информации
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'LineNumber' element value. Порядковый номер строки информации
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    /** 
     * Get the 'ViolationsCode' element value. Код типа выявленного нарушения таможенного законодательства
     * 
     * @return value
     */
    public String getViolationsCode() {
        return violationsCode;
    }

    /** 
     * Set the 'ViolationsCode' element value. Код типа выявленного нарушения таможенного законодательства
     * 
     * @param violationsCode
     */
    public void setViolationsCode(String violationsCode) {
        this.violationsCode = violationsCode;
    }

    /** 
     * Get the list of 'TypicalName' element items. Обоснование применения (неприменения) мер
     * 
     * @return list
     */
    public List<String> getTypicalNameList() {
        return typicalNameList;
    }

    /** 
     * Set the list of 'TypicalName' element items. Обоснование применения (неприменения) мер
     * 
     * @param list
     */
    public void setTypicalNameList(List<String> list) {
        typicalNameList = list;
    }

    /** 
     * Get the 'PointCode' element value. Этап проведения проверки на соответствие профилям риска 
     * 
     * @return value
     */
    public String getPointCode() {
        return pointCode;
    }

    /** 
     * Set the 'PointCode' element value. Этап проведения проверки на соответствие профилям риска 
     * 
     * @param pointCode
     */
    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }
}
