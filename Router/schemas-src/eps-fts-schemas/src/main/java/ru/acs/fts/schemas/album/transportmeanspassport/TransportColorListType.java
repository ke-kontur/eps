
package ru.acs.fts.schemas.album.transportmeanspassport;

/** 
 * ������ ������ ��, ����� ��. ����������� ���������� ��������  ������,  ���� ���� - ������������.
 */
public class TransportColorListType
{
    private String colorCode;
    private String colorName;

    /** 
     * Get the 'ColorCode' element value. ��� ����� ������, ������
     * 
     * @return value
     */
    public String getColorCode() {
        return colorCode;
    }

    /** 
     * Set the 'ColorCode' element value. ��� ����� ������, ������
     * 
     * @param colorCode
     */
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    /** 
     * Get the 'ColorName' element value. ������������ ����� ������, ������
     * 
     * @return value
     */
    public String getColorName() {
        return colorName;
    }

    /** 
     * Set the 'ColorName' element value. ������������ ����� ������, ������
     * 
     * @param colorName
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
