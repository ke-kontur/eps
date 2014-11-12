
package ru.acs.fts.schemas.album.transportcommonaggregatetypescust;

/** 
 * Габаритные размеры судна
 */
public class DimensionsType
{
    private String lenght;
    private String wight;
    private String fullyLoaded;
    private String empty;
    private String maximumHeight;

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
     * Get the 'FullyLoaded' element value. Осадка в полном грузу
     * 
     * @return value
     */
    public String getFullyLoaded() {
        return fullyLoaded;
    }

    /** 
     * Set the 'FullyLoaded' element value. Осадка в полном грузу
     * 
     * @param fullyLoaded
     */
    public void setFullyLoaded(String fullyLoaded) {
        this.fullyLoaded = fullyLoaded;
    }

    /** 
     * Get the 'Empty' element value. Осада порожнем
     * 
     * @return value
     */
    public String getEmpty() {
        return empty;
    }

    /** 
     * Set the 'Empty' element value. Осада порожнем
     * 
     * @param empty
     */
    public void setEmpty(String empty) {
        this.empty = empty;
    }

    /** 
     * Get the 'MaximumHeight' element value. Наибольшая высота с надстройками (от осадки порожнем)
     * 
     * @return value
     */
    public String getMaximumHeight() {
        return maximumHeight;
    }

    /** 
     * Set the 'MaximumHeight' element value. Наибольшая высота с надстройками (от осадки порожнем)
     * 
     * @param maximumHeight
     */
    public void setMaximumHeight(String maximumHeight) {
        this.maximumHeight = maximumHeight;
    }
}
