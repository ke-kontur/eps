
package ru.acs.fts.schemas.album.mistakeletter;

import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.TransportDocRegNumType;

/** 
 * ������ � ��������������� ������ ���������
 */
public class WaybillRegNumberMistakeType
{
    private TransportDocRegNumType mistakeValue;
    private TransportDocRegNumType validValue;

    /** 
     * Get the 'MistakeValue' element value. ��������� ��������, ��������� � ������ �� ����� ��-1
     * 
     * @return value
     */
    public TransportDocRegNumType getMistakeValue() {
        return mistakeValue;
    }

    /** 
     * Set the 'MistakeValue' element value. ��������� ��������, ��������� � ������ �� ����� ��-1
     * 
     * @param mistakeValue
     */
    public void setMistakeValue(TransportDocRegNumType mistakeValue) {
        this.mistakeValue = mistakeValue;
    }

    /** 
     * Get the 'ValidValue' element value. ���������� ��������. ���� �� �������, �� ���������, ��� ��������������� ����� ������ ��� ������������ �����
     * 
     * @return value
     */
    public TransportDocRegNumType getValidValue() {
        return validValue;
    }

    /** 
     * Set the 'ValidValue' element value. ���������� ��������. ���� �� �������, �� ���������, ��� ��������������� ����� ������ ��� ������������ �����
     * 
     * @param validValue
     */
    public void setValidValue(TransportDocRegNumType validValue) {
        this.validValue = validValue;
    }
}
