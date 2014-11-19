
package ru.acs.fts.schemas.album.do2report;

import ru.acs.fts.schemas.album.warehousecommonaggregatetypescust.WhGoodType;

/** 
 * ����������� ��� ��� �������� ������ � ����� ������ �� ������ ��2. �������������� �������� (���, ���������, ���.�������) ����������� �� ������ ��1 � ������ ������ �� �������������� ������� ��2
 */
public class DO2GoodInputType extends WhGoodType
{
    private String MPOCaseNum1;
    private String WHNumber;
    private DO2DO1GoodLinkType DO1GoodLink;
    private DO2KeepingLimitType keepingLimit;

    /** 
     * Get the 'MPOCaseNum' element value. ����� ������� ���
     * 
     * @return value
     */
    public String getMPOCaseNum1() {
        return MPOCaseNum1;
    }

    /** 
     * Set the 'MPOCaseNum' element value. ����� ������� ���
     * 
     * @param MPOCaseNum1
     */
    public void setMPOCaseNum1(String MPOCaseNum1) {
        this.MPOCaseNum1 = MPOCaseNum1;
    }

    /** 
     * Get the 'WHNumber' element value. ��������� ����� ������
     * 
     * @return value
     */
    public String getWHNumber() {
        return WHNumber;
    }

    /** 
     * Set the 'WHNumber' element value. ��������� ����� ������
     * 
     * @param WHNumber
     */
    public void setWHNumber(String WHNumber) {
        this.WHNumber = WHNumber;
    }

    /** 
     * Get the 'DO1GoodLink' element value. �������� �� ����� ������ ��1, ������� ��������
     * 
     * @return value
     */
    public DO2DO1GoodLinkType getDO1GoodLink() {
        return DO1GoodLink;
    }

    /** 
     * Set the 'DO1GoodLink' element value. �������� �� ����� ������ ��1, ������� ��������
     * 
     * @param DO1GoodLink
     */
    public void setDO1GoodLink(DO2DO1GoodLinkType DO1GoodLink) {
        this.DO1GoodLink = DO1GoodLink;
    }

    /** 
     * Get the 'KeepingLimit' element value. �������� � ����� �������� ������
     * 
     * @return value
     */
    public DO2KeepingLimitType getKeepingLimit() {
        return keepingLimit;
    }

    /** 
     * Set the 'KeepingLimit' element value. �������� � ����� �������� ������
     * 
     * @param keepingLimit
     */
    public void setKeepingLimit(DO2KeepingLimitType keepingLimit) {
        this.keepingLimit = keepingLimit;
    }
}
