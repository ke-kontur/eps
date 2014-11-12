
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * ����������� ��� ��� �������� ���������� �� ������
 */
public class WHPlaceBaseType
{
    private String area;
    private String square;
    private String comments;

    /** 
     * Get the 'Area' element value. ����� �������� / ����
     * 
     * @return value
     */
    public String getArea() {
        return area;
    }

    /** 
     * Set the 'Area' element value. ����� �������� / ����
     * 
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /** 
     * Get the 'Square' element value. ���������� ������� � ��.�.
     * 
     * @return value
     */
    public String getSquare() {
        return square;
    }

    /** 
     * Set the 'Square' element value. ���������� ������� � ��.�.
     * 
     * @param square
     */
    public void setSquare(String square) {
        this.square = square;
    }

    /** 
     * Get the 'Comments' element value. ����������� � ����������
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. ����������� � ����������
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
