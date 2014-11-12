
package ru.acs.fts.schemas.album.gtdoutcustomsmark;

/** 
 * ������� ������������� � ����� ����������� ���������� ��������� (��. 43 ��) 
 */
public class CustCostMethodType
{
    private String customsCostCorrectMark;
    private String customsCostCorrectMethod;

    /** 
     * Get the 'CustomsCostCorrectMark' element value. ������� ������������� ���������� ���������.
     * 
     * @return value
     */
    public String getCustomsCostCorrectMark() {
        return customsCostCorrectMark;
    }

    /** 
     * Set the 'CustomsCostCorrectMark' element value. ������� ������������� ���������� ���������.
     * 
     * @param customsCostCorrectMark
     */
    public void setCustomsCostCorrectMark(String customsCostCorrectMark) {
        this.customsCostCorrectMark = customsCostCorrectMark;
    }

    /** 
     * Get the 'CustomsCostCorrectMethod' element value. ����� ������ ����������� ���������� ���������. ����������� � ������������ � ��������������� ������� ����������� ���������� ���������.
     * 
     * @return value
     */
    public String getCustomsCostCorrectMethod() {
        return customsCostCorrectMethod;
    }

    /** 
     * Set the 'CustomsCostCorrectMethod' element value. ����� ������ ����������� ���������� ���������. ����������� � ������������ � ��������������� ������� ����������� ���������� ���������.
     * 
     * @param customsCostCorrectMethod
     */
    public void setCustomsCostCorrectMethod(String customsCostCorrectMethod) {
        this.customsCostCorrectMethod = customsCostCorrectMethod;
    }
}
