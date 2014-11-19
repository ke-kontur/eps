
package ru.acs.fts.schemas.album.pi_notifviolation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� ���������� ��������� � ��������������.
 */
public class ViolationInfoType
{
    private List<String> violationTextList = new ArrayList<String>();
    private String lawArticle;
    private List<DocumentBaseType> violationDocList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the list of 'ViolationText' element items. �������� ���������� ��������� � ��������������.
     * 
     * @return list
     */
    public List<String> getViolationTextList() {
        return violationTextList;
    }

    /** 
     * Set the list of 'ViolationText' element items. �������� ���������� ��������� � ��������������.
     * 
     * @param list
     */
    public void setViolationTextList(List<String> list) {
        violationTextList = list;
    }

    /** 
     * Get the 'LawArticle' element value. ������ �� ��, ������ ����������� ����� � ������� � ���, ���������� ��� ��������� ��������.
     * 
     * @return value
     */
    public String getLawArticle() {
        return lawArticle;
    }

    /** 
     * Set the 'LawArticle' element value. ������ �� ��, ������ ����������� ����� � ������� � ���, ���������� ��� ��������� ��������.
     * 
     * @param lawArticle
     */
    public void setLawArticle(String lawArticle) {
        this.lawArticle = lawArticle;
    }

    /** 
     * Get the list of 'ViolationDoc' element items. ��������, �������� ���������� � ���������� ���������. (��������, ��� �������� � �.�.)
     * 
     * @return list
     */
    public List<DocumentBaseType> getViolationDocList() {
        return violationDocList;
    }

    /** 
     * Set the list of 'ViolationDoc' element items. ��������, �������� ���������� � ���������� ���������. (��������, ��� �������� � �.�.)
     * 
     * @param list
     */
    public void setViolationDocList(List<DocumentBaseType> list) {
        violationDocList = list;
    }
}
