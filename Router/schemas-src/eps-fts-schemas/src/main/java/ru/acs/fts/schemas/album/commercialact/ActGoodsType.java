
package ru.acs.fts.schemas.album.commercialact;

/** 
 * �������� � ������ �������� ������ � ��������
 */
public class ActGoodsType
{
    private String DO1GoodNumber;
    private String comments;

    /** 
     * Get the 'DO1GoodNumber' element value. ����� ������ � ������ ��-1
     * 
     * @return value
     */
    public String getDO1GoodNumber() {
        return DO1GoodNumber;
    }

    /** 
     * Set the 'DO1GoodNumber' element value. ����� ������ � ������ ��-1
     * 
     * @param DO1GoodNumber
     */
    public void setDO1GoodNumber(String DO1GoodNumber) {
        this.DO1GoodNumber = DO1GoodNumber;
    }

    /** 
     * Get the 'Comments' element value. ���������� � ���������� �� ������ (����� 11 ������), ���������� ������� � �������������� ���������� ������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. ���������� � ���������� �� ������ (����� 11 ������), ���������� ������� � �������������� ���������� ������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
