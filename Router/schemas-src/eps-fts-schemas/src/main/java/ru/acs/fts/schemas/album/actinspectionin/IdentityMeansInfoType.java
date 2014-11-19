
package ru.acs.fts.schemas.album.actinspectionin;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� �������������
 */
public class IdentityMeansInfoType
{
    private String identBeforeNum;
    private String identCrashFlag;
    private String identEndNum;
    private String identMeansDesc;
    private List<IdentifyMeanType> identifyMeanList = new ArrayList<IdentifyMeanType>();

    /** 
     * Get the 'IdentBeforeNum' element value. ���-�� ������� ������������� �� ������ ���������� �������� (0 - ��� ������� �������������)
     * 
     * @return value
     */
    public String getIdentBeforeNum() {
        return identBeforeNum;
    }

    /** 
     * Set the 'IdentBeforeNum' element value. ���-�� ������� ������������� �� ������ ���������� �������� (0 - ��� ������� �������������)
     * 
     * @param identBeforeNum
     */
    public void setIdentBeforeNum(String identBeforeNum) {
        this.identBeforeNum = identBeforeNum;
    }

    /** 
     * Get the 'IdentCrashFlag' element value. ������� ��������� ������� ������������� ("0" - �� ��������, "1" - ��������)
     * 
     * @return value
     */
    public String getIdentCrashFlag() {
        return identCrashFlag;
    }

    /** 
     * Set the 'IdentCrashFlag' element value. ������� ��������� ������� ������������� ("0" - �� ��������, "1" - ��������)
     * 
     * @param identCrashFlag
     */
    public void setIdentCrashFlag(String identCrashFlag) {
        this.identCrashFlag = identCrashFlag;
    }

    /** 
     * Get the 'IdentEndNum' element value. ���-�� ���������� ������� ������������� ����� ���������� ����������� �������� (0 - ��� ������� �������������)
     * 
     * @return value
     */
    public String getIdentEndNum() {
        return identEndNum;
    }

    /** 
     * Set the 'IdentEndNum' element value. ���-�� ���������� ������� ������������� ����� ���������� ����������� �������� (0 - ��� ������� �������������)
     * 
     * @param identEndNum
     */
    public void setIdentEndNum(String identEndNum) {
        this.identEndNum = identEndNum;
    }

    /** 
     * Get the 'IdentMeansDesc' element value. ����� ���������� �� ��������� �������������
     * 
     * @return value
     */
    public String getIdentMeansDesc() {
        return identMeansDesc;
    }

    /** 
     * Set the 'IdentMeansDesc' element value. ����� ���������� �� ��������� �������������
     * 
     * @param identMeansDesc
     */
    public void setIdentMeansDesc(String identMeansDesc) {
        this.identMeansDesc = identMeansDesc;
    }

    /** 
     * Get the list of 'IdentifyMean' element items. C������� �������������
     * 
     * @return list
     */
    public List<IdentifyMeanType> getIdentifyMeanList() {
        return identifyMeanList;
    }

    /** 
     * Set the list of 'IdentifyMean' element items. C������� �������������
     * 
     * @param list
     */
    public void setIdentifyMeanList(List<IdentifyMeanType> list) {
        identifyMeanList = list;
    }
}
