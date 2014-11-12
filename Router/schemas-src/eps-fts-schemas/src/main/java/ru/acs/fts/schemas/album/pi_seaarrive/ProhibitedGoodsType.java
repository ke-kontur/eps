
package ru.acs.fts.schemas.album.pi_seaarrive;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ����������� ��� ������������ � ����� ������
 */
public class ProhibitedGoodsType
{
    private List<ProhibitedSubjectInfoType> armsInfoList = new ArrayList<ProhibitedSubjectInfoType>();
    private List<DrugsSubstanceInfoType> drugsSubstanceInfoList = new ArrayList<DrugsSubstanceInfoType>();
    private List<CurrencyInfoType> currencyInfoList = new ArrayList<CurrencyInfoType>();
    private List<DocumentBaseType> permitionDocList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the list of 'ArmsInfo' element items. ���������� � ������� ������ � �����������
     * 
     * @return list
     */
    public List<ProhibitedSubjectInfoType> getArmsInfoList() {
        return armsInfoList;
    }

    /** 
     * Set the list of 'ArmsInfo' element items. ���������� � ������� ������ � �����������
     * 
     * @param list
     */
    public void setArmsInfoList(List<ProhibitedSubjectInfoType> list) {
        armsInfoList = list;
    }

    /** 
     * Get the list of 'DrugsSubstanceInfo' element items. �������� � ������� ������������� �������
     * 
     * @return list
     */
    public List<DrugsSubstanceInfoType> getDrugsSubstanceInfoList() {
        return drugsSubstanceInfoList;
    }

    /** 
     * Set the list of 'DrugsSubstanceInfo' element items. �������� � ������� ������������� �������
     * 
     * @param list
     */
    public void setDrugsSubstanceInfoList(List<DrugsSubstanceInfoType> list) {
        drugsSubstanceInfoList = list;
    }

    /** 
     * Get the list of 'CurrencyInfo' element items. ���������� � ������ � �������� ���������
     * 
     * @return list
     */
    public List<CurrencyInfoType> getCurrencyInfoList() {
        return currencyInfoList;
    }

    /** 
     * Set the list of 'CurrencyInfo' element items. ���������� � ������ � �������� ���������
     * 
     * @param list
     */
    public void setCurrencyInfoList(List<CurrencyInfoType> list) {
        currencyInfoList = list;
    }

    /** 
     * Get the list of 'PermitionDocs' element items. ���������� � �������������� ����������
     * 
     * @return list
     */
    public List<DocumentBaseType> getPermitionDocList() {
        return permitionDocList;
    }

    /** 
     * Set the list of 'PermitionDocs' element items. ���������� � �������������� ����������
     * 
     * @param list
     */
    public void setPermitionDocList(List<DocumentBaseType> list) {
        permitionDocList = list;
    }
}
