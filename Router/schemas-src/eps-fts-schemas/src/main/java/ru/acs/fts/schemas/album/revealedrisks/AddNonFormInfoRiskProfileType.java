
package ru.acs.fts.schemas.album.revealedrisks;

import java.util.ArrayList;
import java.util.List;

/** 
 * Дополнительная неформализованная информация - уровень профиля риска
 */
public class AddNonFormInfoRiskProfileType
{
    private String informationCode;
    private String lineNumber;
    private List<String> typicalNameList = new ArrayList<String>();
    private String pointCode;

    /** 
     * Get the 'InformationCode' element value. Код информации: 4 - применение мер по минимизации рисков на основании "рамочных" профилей риска; 5 - применение мер по минимизации рисков по самостоятельному решению должностного лица; 7 -  применение мер на основании профилей риска по информации правоохранительных подразделений; 8 - применение мер по минимизации рисков на основании профиля риска № 11/10000/10062011/01900 и его последующих актуализированных версий; 9 - применение мер по минимизации рисков на основании профиля риска № 11/10000/24092008/00340 и его последующих актуализированных версий
     * 
     * @return value
     */
    public String getInformationCode() {
        return informationCode;
    }

    /** 
     * Set the 'InformationCode' element value. Код информации: 4 - применение мер по минимизации рисков на основании "рамочных" профилей риска; 5 - применение мер по минимизации рисков по самостоятельному решению должностного лица; 7 -  применение мер на основании профилей риска по информации правоохранительных подразделений; 8 - применение мер по минимизации рисков на основании профиля риска № 11/10000/10062011/01900 и его последующих актуализированных версий; 9 - применение мер по минимизации рисков на основании профиля риска № 11/10000/24092008/00340 и его последующих актуализированных версий
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
     * Get the list of 'TypicalName' element items. Обоснование применения мер
     * 
     * @return list
     */
    public List<String> getTypicalNameList() {
        return typicalNameList;
    }

    /** 
     * Set the list of 'TypicalName' element items. Обоснование применения мер
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
