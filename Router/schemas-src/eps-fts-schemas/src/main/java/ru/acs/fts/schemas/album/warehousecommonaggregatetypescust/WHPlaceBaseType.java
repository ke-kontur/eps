
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * Комплексный тип для описания размещения на складе
 */
public class WHPlaceBaseType
{
    private String area;
    private String square;
    private String comments;

    /** 
     * Get the 'Area' element value. Номер площадки / зона
     * 
     * @return value
     */
    public String getArea() {
        return area;
    }

    /** 
     * Set the 'Area' element value. Номер площадки / зона
     * 
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /** 
     * Get the 'Square' element value. Занимаемая площадь в кв.м.
     * 
     * @return value
     */
    public String getSquare() {
        return square;
    }

    /** 
     * Set the 'Square' element value. Занимаемая площадь в кв.м.
     * 
     * @param square
     */
    public void setSquare(String square) {
        this.square = square;
    }

    /** 
     * Get the 'Comments' element value. Комментарий к размещению
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Комментарий к размещению
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
