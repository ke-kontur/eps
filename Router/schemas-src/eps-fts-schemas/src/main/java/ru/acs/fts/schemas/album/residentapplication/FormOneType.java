
package ru.acs.fts.schemas.album.residentapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ����� �1. �������� � �������, �������������� � ����� �� ���������� ��� � ������������ � ���������� ������� ��������� ���������� ����, ��� ���������� � ��������� ��� ��������, �� ��������� � ������������ ������� � ������������� ��������� �� �����������. 
 */
public class FormOneType
{
    private PersonSignatureType residentPersonSignature;
    private PersonSignatureType econZonePersonSignature;
    private List<OperationType> operationList = new ArrayList<OperationType>();

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
     * Get the list of 'Operation' element items. ������������ �������� � ������������ � ��������� ���������� 
     * 
     * @return list
     */
    public List<OperationType> getOperationList() {
        return operationList;
    }

    /** 
     * Set the list of 'Operation' element items. ������������ �������� � ������������ � ��������� ���������� 
     * 
     * @param list
     */
    public void setOperationList(List<OperationType> list) {
        operationList = list;
    }
}
