
package ru.acs.fts.schemas.album.representativeapplication;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о накладной
 */
public class WayBillType extends DocumentBaseType
{
    private String wayBillKind;

    /** 
     * Get the 'WayBillKind' element value. Тип: 2 - общая авианакладная; 3 - транспортная накладная
     * 
     * @return value
     */
    public String getWayBillKind() {
        return wayBillKind;
    }

    /** 
     * Set the 'WayBillKind' element value. Тип: 2 - общая авианакладная; 3 - транспортная накладная
     * 
     * @param wayBillKind
     */
    public void setWayBillKind(String wayBillKind) {
        this.wayBillKind = wayBillKind;
    }
}
