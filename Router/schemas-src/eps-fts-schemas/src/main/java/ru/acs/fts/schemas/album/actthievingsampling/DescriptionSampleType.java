
package ru.acs.fts.schemas.album.actthievingsampling;

import java.util.ArrayList;
import java.util.List;

/** 
 * Описание отобранных проб (образцов)
 */
public class DescriptionSampleType
{
    private String danger;
    private String perishable;
    private List<String> dangerKindList = new ArrayList<String>();
    private String periodStorage;
    private List<String> storageConditionList = new ArrayList<String>();

    /** 
     * Get the 'Danger' element value. Признак того, что пробы (образцы) являются опасными
     * 
     * @return value
     */
    public String getDanger() {
        return danger;
    }

    /** 
     * Set the 'Danger' element value. Признак того, что пробы (образцы) являются опасными
     * 
     * @param danger
     */
    public void setDanger(String danger) {
        this.danger = danger;
    }

    /** 
     * Get the 'Perishable' element value. Признак того, что пробы (образцы) являются скоропортящимися
     * 
     * @return value
     */
    public String getPerishable() {
        return perishable;
    }

    /** 
     * Set the 'Perishable' element value. Признак того, что пробы (образцы) являются скоропортящимися
     * 
     * @param perishable
     */
    public void setPerishable(String perishable) {
        this.perishable = perishable;
    }

    /** 
     * Get the list of 'DangerKind' element items. Вид опасности
     * 
     * @return list
     */
    public List<String> getDangerKindList() {
        return dangerKindList;
    }

    /** 
     * Set the list of 'DangerKind' element items. Вид опасности
     * 
     * @param list
     */
    public void setDangerKindList(List<String> list) {
        dangerKindList = list;
    }

    /** 
     * Get the 'PeriodStorage' element value. Срок хранения для скоропортящихся проб (образцов)
     * 
     * @return value
     */
    public String getPeriodStorage() {
        return periodStorage;
    }

    /** 
     * Set the 'PeriodStorage' element value. Срок хранения для скоропортящихся проб (образцов)
     * 
     * @param periodStorage
     */
    public void setPeriodStorage(String periodStorage) {
        this.periodStorage = periodStorage;
    }

    /** 
     * Get the list of 'StorageConditions' element items. Условия хранения для скоропортящихся проб (образцов)
     * 
     * @return list
     */
    public List<String> getStorageConditionList() {
        return storageConditionList;
    }

    /** 
     * Set the list of 'StorageConditions' element items. Условия хранения для скоропортящихся проб (образцов)
     * 
     * @param list
     */
    public void setStorageConditionList(List<String> list) {
        storageConditionList = list;
    }
}
