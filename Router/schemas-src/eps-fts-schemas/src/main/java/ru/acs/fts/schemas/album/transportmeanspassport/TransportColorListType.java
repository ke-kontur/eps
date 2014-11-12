
package ru.acs.fts.schemas.album.transportmeanspassport;

/** 
 * Список цветов ТС, шасси ТС. Заполняется названиями основных  цветов,  если цвет - многоцветный.
 */
public class TransportColorListType
{
    private String colorCode;
    private String colorName;

    /** 
     * Get the 'ColorCode' element value. Код цвета кабины, кузова
     * 
     * @return value
     */
    public String getColorCode() {
        return colorCode;
    }

    /** 
     * Set the 'ColorCode' element value. Код цвета кабины, кузова
     * 
     * @param colorCode
     */
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    /** 
     * Get the 'ColorName' element value. Наименование цвета кабины, кузова
     * 
     * @return value
     */
    public String getColorName() {
        return colorName;
    }

    /** 
     * Set the 'ColorName' element value. Наименование цвета кабины, кузова
     * 
     * @param colorName
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
