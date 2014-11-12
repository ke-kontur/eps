
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Комплексный тип для описания должностного лица таможенного органа
 */
public class WHCustomInspectorType extends PersonBaseType
{
    private String LNP;

    /** 
     * Get the 'LNP' element value. Л.Н.П. сотрудника таможенного органа, зарегистрировавшего отчет
     * 
     * @return value
     */
    public String getLNP() {
        return LNP;
    }

    /** 
     * Set the 'LNP' element value. Л.Н.П. сотрудника таможенного органа, зарегистрировавшего отчет
     * 
     * @param LNP
     */
    public void setLNP(String LNP) {
        this.LNP = LNP;
    }
}
