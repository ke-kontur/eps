
package ru.acs.fts.schemas.album.actinspectionin;

import java.util.ArrayList;
import java.util.List;

/** 
 * �������� � ������������� ���
 */
public class MPOType
{
    private String MPONumber;
    private String MPOName;
    private String MPODamageFlag;
    private List<String> damageDescList = new ArrayList<String>();

    /** 
     * Get the 'MPO_Number' element value. ����� ���
     * 
     * @return value
     */
    public String getMPONumber() {
        return MPONumber;
    }

    /** 
     * Set the 'MPO_Number' element value. ����� ���
     * 
     * @param MPONumber
     */
    public void setMPONumber(String MPONumber) {
        this.MPONumber = MPONumber;
    }

    /** 
     * Get the 'MPO_Name' element value. ������������ ���: 1 - �������� ��������; 2 - ������; 3 - ���������; 4 - ������ �����; 5 - ����������; 6 - �������; 7 - ����� �̻; 8 - ����������� EMS; 9 - ����������
     * 
     * @return value
     */
    public String getMPOName() {
        return MPOName;
    }

    /** 
     * Set the 'MPO_Name' element value. ������������ ���: 1 - �������� ��������; 2 - ������; 3 - ���������; 4 - ������ �����; 5 - ����������; 6 - �������; 7 - ����� �̻; 8 - ����������� EMS; 9 - ����������
     * 
     * @param MPOName
     */
    public void setMPOName(String MPOName) {
        this.MPOName = MPOName;
    }

    /** 
     * Get the 'MPO_DamageFlag' element value. ������� ����������� ���: 0 -  ����������� �����������; 1 - ����������
     * 
     * @return value
     */
    public String getMPODamageFlag() {
        return MPODamageFlag;
    }

    /** 
     * Set the 'MPO_DamageFlag' element value. ������� ����������� ���: 0 -  ����������� �����������; 1 - ����������
     * 
     * @param MPODamageFlag
     */
    public void setMPODamageFlag(String MPODamageFlag) {
        this.MPODamageFlag = MPODamageFlag;
    }

    /** 
     * Get the list of 'DamageDesc' element items. �������� ����������� ���
     * 
     * @return list
     */
    public List<String> getDamageDescList() {
        return damageDescList;
    }

    /** 
     * Set the list of 'DamageDesc' element items. �������� ����������� ���
     * 
     * @param list
     */
    public void setDamageDescList(List<String> list) {
        damageDescList = list;
    }
}
