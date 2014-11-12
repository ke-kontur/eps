
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * ����������� ��� ��� �������� ���������� ������ � ����������
 */
public class WHGoodContLinkType
{
    private String goodNumber;
    private String containerNumber;

    /** 
     * Get the 'GoodNumber' element value. ���������� ����� ������ � ������������ ���������
     * 
     * @return value
     */
    public String getGoodNumber() {
        return goodNumber;
    }

    /** 
     * Set the 'GoodNumber' element value. ���������� ����� ������ � ������������ ���������
     * 
     * @param goodNumber
     */
    public void setGoodNumber(String goodNumber) {
        this.goodNumber = goodNumber;
    }

    /** 
     * Get the 'ContainerNumber' element value. ���������� ����� ����������  � ������������ ���������
     * 
     * @return value
     */
    public String getContainerNumber() {
        return containerNumber;
    }

    /** 
     * Set the 'ContainerNumber' element value. ���������� ����� ����������  � ������������ ���������
     * 
     * @param containerNumber
     */
    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }
}
