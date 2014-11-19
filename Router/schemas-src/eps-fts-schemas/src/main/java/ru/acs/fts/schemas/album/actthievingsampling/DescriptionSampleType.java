
package ru.acs.fts.schemas.album.actthievingsampling;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� ���������� ���� (��������)
 */
public class DescriptionSampleType
{
    private String danger;
    private String perishable;
    private List<String> dangerKindList = new ArrayList<String>();
    private String periodStorage;
    private List<String> storageConditionList = new ArrayList<String>();

    /** 
     * Get the 'Danger' element value. ������� ����, ��� ����� (�������) �������� ��������
     * 
     * @return value
     */
    public String getDanger() {
        return danger;
    }

    /** 
     * Set the 'Danger' element value. ������� ����, ��� ����� (�������) �������� ��������
     * 
     * @param danger
     */
    public void setDanger(String danger) {
        this.danger = danger;
    }

    /** 
     * Get the 'Perishable' element value. ������� ����, ��� ����� (�������) �������� ����������������
     * 
     * @return value
     */
    public String getPerishable() {
        return perishable;
    }

    /** 
     * Set the 'Perishable' element value. ������� ����, ��� ����� (�������) �������� ����������������
     * 
     * @param perishable
     */
    public void setPerishable(String perishable) {
        this.perishable = perishable;
    }

    /** 
     * Get the list of 'DangerKind' element items. ��� ���������
     * 
     * @return list
     */
    public List<String> getDangerKindList() {
        return dangerKindList;
    }

    /** 
     * Set the list of 'DangerKind' element items. ��� ���������
     * 
     * @param list
     */
    public void setDangerKindList(List<String> list) {
        dangerKindList = list;
    }

    /** 
     * Get the 'PeriodStorage' element value. ���� �������� ��� ��������������� ���� (��������)
     * 
     * @return value
     */
    public String getPeriodStorage() {
        return periodStorage;
    }

    /** 
     * Set the 'PeriodStorage' element value. ���� �������� ��� ��������������� ���� (��������)
     * 
     * @param periodStorage
     */
    public void setPeriodStorage(String periodStorage) {
        this.periodStorage = periodStorage;
    }

    /** 
     * Get the list of 'StorageConditions' element items. ������� �������� ��� ��������������� ���� (��������)
     * 
     * @return list
     */
    public List<String> getStorageConditionList() {
        return storageConditionList;
    }

    /** 
     * Set the list of 'StorageConditions' element items. ������� �������� ��� ��������������� ���� (��������)
     * 
     * @param list
     */
    public void setStorageConditionList(List<String> list) {
        storageConditionList = list;
    }
}
