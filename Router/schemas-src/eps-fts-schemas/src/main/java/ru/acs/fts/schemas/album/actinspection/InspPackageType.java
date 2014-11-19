
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust.PackingInformationType;

/** 
 * ��� - �������� �� ���������
 */
public class InspPackageType extends PackingInformationType
{
    private List<String> packageDescriptionList = new ArrayList<String>();
    private String packDestructFlag;
    private List<String> packDestructDescList = new ArrayList<String>();

    /** 
     * Get the list of 'PackageDescription' element items. �������� �������� � ���������� ������
     * 
     * @return list
     */
    public List<String> getPackageDescriptionList() {
        return packageDescriptionList;
    }

    /** 
     * Set the list of 'PackageDescription' element items. �������� �������� � ���������� ������
     * 
     * @param list
     */
    public void setPackageDescriptionList(List<String> list) {
        packageDescriptionList = list;
    }

    /** 
     * Get the 'PackDestructFlag' element value. ������� ������� ����������� ������� � �������� 0 - ����������� ��� 1 - ����������� ����
     * 
     * @return value
     */
    public String getPackDestructFlag() {
        return packDestructFlag;
    }

    /** 
     * Set the 'PackDestructFlag' element value. ������� ������� ����������� ������� � �������� 0 - ����������� ��� 1 - ����������� ����
     * 
     * @param packDestructFlag
     */
    public void setPackDestructFlag(String packDestructFlag) {
        this.packDestructFlag = packDestructFlag;
    }

    /** 
     * Get the list of 'PackDestructDesc' element items. �������� ����������� ��������
     * 
     * @return list
     */
    public List<String> getPackDestructDescList() {
        return packDestructDescList;
    }

    /** 
     * Set the list of 'PackDestructDesc' element items. �������� ����������� ��������
     * 
     * @param list
     */
    public void setPackDestructDescList(List<String> list) {
        packDestructDescList = list;
    }
}
