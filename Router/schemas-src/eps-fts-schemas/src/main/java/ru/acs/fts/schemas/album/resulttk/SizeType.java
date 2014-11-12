
package ru.acs.fts.schemas.album.resulttk;

/** 
 * Габаритные параметры ТС
 */
public class SizeType
{
    private String height;
    private String width;
    private String length;

    /** 
     * Get the 'Height' element value. Высота ТС, м
     * 
     * @return value
     */
    public String getHeight() {
        return height;
    }

    /** 
     * Set the 'Height' element value. Высота ТС, м
     * 
     * @param height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /** 
     * Get the 'Width' element value. Ширина ТС, м
     * 
     * @return value
     */
    public String getWidth() {
        return width;
    }

    /** 
     * Set the 'Width' element value. Ширина ТС, м
     * 
     * @param width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /** 
     * Get the 'Length' element value. Длина ТС, м
     * 
     * @return value
     */
    public String getLength() {
        return length;
    }

    /** 
     * Set the 'Length' element value. Длина ТС, м
     * 
     * @param length
     */
    public void setLength(String length) {
        this.length = length;
    }
}
