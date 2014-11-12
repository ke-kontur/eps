
package ru.acs.fts.schemas.album.ruesaddtscommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * Расчет  стоимости.
 */
public class Method6CalculationType
{
    private List<String> calcilationDescriptionList = new ArrayList<String>();

    /** 
     * Get the list of 'CalcilationDescription' element items. Описание расчета.
     * 
     * @return list
     */
    public List<String> getCalcilationDescriptionList() {
        return calcilationDescriptionList;
    }

    /** 
     * Set the list of 'CalcilationDescription' element items. Описание расчета.
     * 
     * @param list
     */
    public void setCalcilationDescriptionList(List<String> list) {
        calcilationDescriptionList = list;
    }
}
