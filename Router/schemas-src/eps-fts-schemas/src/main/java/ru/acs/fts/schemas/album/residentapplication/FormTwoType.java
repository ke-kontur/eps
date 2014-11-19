
package ru.acs.fts.schemas.album.residentapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ����� �2. �������� � �������, �������������� � ����� �� ���������� ��� � ������������ � ���������� ������� ��������� ���������� ���� � ����� ����������� �������, � ��������� ����������� � ������� 
 */
public class FormTwoType
{
    private PersonSignatureType residentPersonSignature;
    private PersonSignatureType econZonePersonSignature;
    private List<FormTwoSectionType> sectionList = new ArrayList<FormTwoSectionType>();

    /** 
     * Get the 'ResidentPersonSignature' element value. ��� � ������� ��������������� ���� ����������� - ��������� ���
     * 
     * @return value
     */
    public PersonSignatureType getResidentPersonSignature() {
        return residentPersonSignature;
    }

    /** 
     * Set the 'ResidentPersonSignature' element value. ��� � ������� ��������������� ���� ����������� - ��������� ���
     * 
     * @param residentPersonSignature
     */
    public void setResidentPersonSignature(
            PersonSignatureType residentPersonSignature) {
        this.residentPersonSignature = residentPersonSignature;
    }

    /** 
     * Get the 'EconZonePersonSignature' element value. ��� � ������� ��������������� ���� ������ ���������� ��� 
     * 
     * @return value
     */
    public PersonSignatureType getEconZonePersonSignature() {
        return econZonePersonSignature;
    }

    /** 
     * Set the 'EconZonePersonSignature' element value. ��� � ������� ��������������� ���� ������ ���������� ��� 
     * 
     * @param econZonePersonSignature
     */
    public void setEconZonePersonSignature(
            PersonSignatureType econZonePersonSignature) {
        this.econZonePersonSignature = econZonePersonSignature;
    }

    /** 
     * Get the list of 'Section' element items. ������ 
     * 
     * @return list
     */
    public List<FormTwoSectionType> getSectionList() {
        return sectionList;
    }

    /** 
     * Set the list of 'Section' element items. ������ 
     * 
     * @param list
     */
    public void setSectionList(List<FormTwoSectionType> list) {
        sectionList = list;
    }
}
