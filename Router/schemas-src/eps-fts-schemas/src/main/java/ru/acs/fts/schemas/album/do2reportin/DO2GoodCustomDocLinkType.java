
package ru.acs.fts.schemas.album.do2reportin;

/** 
 * ����������� ��� ��� �������� ������������ ����������� ������ ����������� ���������
 */
public class DO2GoodCustomDocLinkType
{
    private String goodNumber;
    private String customDocNumber;

    /** 
     * Get the 'GoodNumber' element value. ������� ����� ������ �� ������ � ������
     * 
     * @return value
     */
    public String getGoodNumber() {
        return goodNumber;
    }

    /** 
     * Set the 'GoodNumber' element value. ������� ����� ������ �� ������ � ������
     * 
     * @param goodNumber
     */
    public void setGoodNumber(String goodNumber) {
        this.goodNumber = goodNumber;
    }

    /** 
     * Get the 'CustomDocNumber' element value. ���������� ����� ����������� ��������� � ������ � ������
     * 
     * @return value
     */
    public String getCustomDocNumber() {
        return customDocNumber;
    }

    /** 
     * Set the 'CustomDocNumber' element value. ���������� ����� ����������� ��������� � ������ � ������
     * 
     * @param customDocNumber
     */
    public void setCustomDocNumber(String customDocNumber) {
        this.customDocNumber = customDocNumber;
    }
}
