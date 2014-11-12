
package ru.acs.fts.schemas.album.commonaggregatetypescust;

/** 
 * Габариты
 */
public class DimensionsType
{
    private String dimensionsCode;
    private String lenght;
    private String wight;
    private String height;

    /** 
     * Get the 'DimensionsCode' element value. Код единицы измерения 
     * 
     * @return value
     */
    public String getDimensionsCode() {
        return dimensionsCode;
    }

    /** 
     * Set the 'DimensionsCode' element value. Код единицы измерения 
     * 
     * @param dimensionsCode
     */
    public void setDimensionsCode(String dimensionsCode) {
        this.dimensionsCode = dimensionsCode;
    }

    /** 
     * Get the 'Lenght' element value. Длина
     * 
     * @return value
     */
    public String getLenght() {
        return lenght;
    }

    /** 
     * Set the 'Lenght' element value. Длина
     * 
     * @param lenght
     */
    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    /** 
     * Get the 'Wight' element value. Ширина
     * 
     * @return value
     */
    public String getWight() {
        return wight;
    }

    /** 
     * Set the 'Wight' element value. Ширина
     * 
     * @param wight
     */
    public void setWight(String wight) {
        this.wight = wight;
    }

    /** 
     * Get the 'Height' element value. Высота
     * 
     * @return value
     */
    public String getHeight() {
        return height;
    }

    /** 
     * Set the 'Height' element value. Высота
     * 
     * @param height
     */
    public void setHeight(String height) {
        this.height = height;
    }
}
