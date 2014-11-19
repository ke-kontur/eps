
package ru.acs.fts.schemas.album.realestateresponse;

/** 
 * Площадь объекта недвижимости
 */
public class ObjectAreaType
{
    private String areaValue;
    private String areaUnit;
    private String areaText;

    /** 
     * Get the 'AreaValue' element value. Площадь объекта
     * 
     * @return value
     */
    public String getAreaValue() {
        return areaValue;
    }

    /** 
     * Set the 'AreaValue' element value. Площадь объекта
     * 
     * @param areaValue
     */
    public void setAreaValue(String areaValue) {
        this.areaValue = areaValue;
    }

    /** 
     * Get the 'AreaUnit' element value. Единица измерения площади
     * 
     * @return value
     */
    public String getAreaUnit() {
        return areaUnit;
    }

    /** 
     * Set the 'AreaUnit' element value. Единица измерения площади
     * 
     * @param areaUnit
     */
    public void setAreaUnit(String areaUnit) {
        this.areaUnit = areaUnit;
    }

    /** 
     * Get the 'AreaText' element value. Значение площади текстом
     * 
     * @return value
     */
    public String getAreaText() {
        return areaText;
    }

    /** 
     * Set the 'AreaText' element value. Значение площади текстом
     * 
     * @param areaText
     */
    public void setAreaText(String areaText) {
        this.areaText = areaText;
    }
}
