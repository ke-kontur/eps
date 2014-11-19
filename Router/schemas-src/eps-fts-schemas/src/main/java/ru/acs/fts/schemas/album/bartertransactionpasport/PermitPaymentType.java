
package ru.acs.fts.schemas.album.bartertransactionpasport;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * ��������� � ������� ���������� ���� ������ �� �������� �������
 */
public class PermitPaymentType extends DocumentBaseType
{
    private String deferment;

    /** 
     * Get the 'Deferment' element value. �������� �������� (����� 180 ����) ��������� �������� �������, ���������� �����, �����, �������� ���� �� ���������� ���������������� ������������ �������� ���������������� ���������� ���� ������. ����������� � ��� �����, � ����� ���� ���� ������ � ������ ����������.
     * 
     * @return value
     */
    public String getDeferment() {
        return deferment;
    }

    /** 
     * Set the 'Deferment' element value. �������� �������� (����� 180 ����) ��������� �������� �������, ���������� �����, �����, �������� ���� �� ���������� ���������������� ������������ �������� ���������������� ���������� ���� ������. ����������� � ��� �����, � ����� ���� ���� ������ � ������ ����������.
     * 
     * @param deferment
     */
    public void setDeferment(String deferment) {
        this.deferment = deferment;
    }
}
