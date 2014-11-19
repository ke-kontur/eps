
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationType;

/** 
 * Перевозчик
 */
public class TransporterType extends OrganizationType
{
    private List<DocumentBaseType> driverDocList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the list of 'DriverDocs' element items. Паспортные данные физического лица
     * 
     * @return list
     */
    public List<DocumentBaseType> getDriverDocList() {
        return driverDocList;
    }

    /** 
     * Set the list of 'DriverDocs' element items. Паспортные данные физического лица
     * 
     * @param list
     */
    public void setDriverDocList(List<DocumentBaseType> list) {
        driverDocList = list;
    }
}
