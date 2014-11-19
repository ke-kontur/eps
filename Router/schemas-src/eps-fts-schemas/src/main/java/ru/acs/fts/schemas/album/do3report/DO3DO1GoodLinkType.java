
package ru.acs.fts.schemas.album.do3report;

import org.joda.time.LocalDate;

/** 
 * ����������� ��� ��� �������� ������ �� ��3 �� ����� ������ ��1
 */
public class DO3DO1GoodLinkType
{
    private LocalDate DO1Date;
    private String DO1Number;
    private String DO1GoodNumber;

    /** 
     * Get the 'DO1Date' element value. ���� ������ ��1, ����� �� �������� ��������
     * 
     * @return value
     */
    public LocalDate getDO1Date() {
        return DO1Date;
    }

    /** 
     * Set the 'DO1Date' element value. ���� ������ ��1, ����� �� �������� ��������
     * 
     * @param DO1Date
     */
    public void setDO1Date(LocalDate DO1Date) {
        this.DO1Date = DO1Date;
    }

    /** 
     * Get the 'DO1Number' element value. ����� ������ ��1, ����������� ����������� �������� ��������� ���, ����� �� �������� ��������
     * 
     * @return value
     */
    public String getDO1Number() {
        return DO1Number;
    }

    /** 
     * Set the 'DO1Number' element value. ����� ������ ��1, ����������� ����������� �������� ��������� ���, ����� �� �������� ��������
     * 
     * @param DO1Number
     */
    public void setDO1Number(String DO1Number) {
        this.DO1Number = DO1Number;
    }

    /** 
     * Get the 'DO1GoodNumber' element value. ������� ����� ������ � ������ ��1
     * 
     * @return value
     */
    public String getDO1GoodNumber() {
        return DO1GoodNumber;
    }

    /** 
     * Set the 'DO1GoodNumber' element value. ������� ����� ������ � ������ ��1
     * 
     * @param DO1GoodNumber
     */
    public void setDO1GoodNumber(String DO1GoodNumber) {
        this.DO1GoodNumber = DO1GoodNumber;
    }
}
