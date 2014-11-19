
package ru.acs.fts.schemas.album.cuesaddtscommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������������� ����������, ��� ������� �� ������������� ����������� ���������
 */
public class AdditionalDataType
{
    private String positionNumber;
    private List<String> additionalInformationList = new ArrayList<String>();

    /** 
     * Get the 'PositionNumber' element value. ����� �����
     * 
     * @return value
     */
    public String getPositionNumber() {
        return positionNumber;
    }

    /** 
     * Set the 'PositionNumber' element value. ����� �����
     * 
     * @param positionNumber
     */
    public void setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
    }

    /** 
     * Get the list of 'AdditionalInformation' element items. �������������� ������
     * 
     * @return list
     */
    public List<String> getAdditionalInformationList() {
        return additionalInformationList;
    }

    /** 
     * Set the list of 'AdditionalInformation' element items. �������������� ������
     * 
     * @param list
     */
    public void setAdditionalInformationList(List<String> list) {
        additionalInformationList = list;
    }
}
