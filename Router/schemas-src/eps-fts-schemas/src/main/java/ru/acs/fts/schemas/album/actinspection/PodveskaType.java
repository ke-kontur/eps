
package ru.acs.fts.schemas.album.actinspection;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� �����
 */
public class PodveskaType
{
    private String frontSuspension;
    private List<String> rearSuspensionList = new ArrayList<String>();

    /** 
     * Get the 'FrontSuspension' element value. ��� �������� �������� ���: "1" - ���������, "2" - ��������������, "3" - ����������
     * 
     * @return value
     */
    public String getFrontSuspension() {
        return frontSuspension;
    }

    /** 
     * Set the 'FrontSuspension' element value. ��� �������� �������� ���: "1" - ���������, "2" - ��������������, "3" - ����������
     * 
     * @param frontSuspension
     */
    public void setFrontSuspension(String frontSuspension) {
        this.frontSuspension = frontSuspension;
    }

    /** 
     * Get the list of 'RearSuspension' element items. ��� ������ �������� ���: "1" - ���������, "2" - ��������������, "3" - ����������
     * 
     * @return list
     */
    public List<String> getRearSuspensionList() {
        return rearSuspensionList;
    }

    /** 
     * Set the list of 'RearSuspension' element items. ��� ������ �������� ���: "1" - ���������, "2" - ��������������, "3" - ����������
     * 
     * @param list
     */
    public void setRearSuspensionList(List<String> list) {
        rearSuspensionList = list;
    }
}
