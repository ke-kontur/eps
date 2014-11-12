
package ru.acs.fts.schemas.album.goodscheckreport;

/** 
 * Сведения о штампах
 */
public class MarksType
{
    private String nameMarks;
    private String value;

    /** 
     * Get the 'NameMarks' element value. Наименование штампа
     * 
     * @return value
     */
    public String getNameMarks() {
        return nameMarks;
    }

    /** 
     * Set the 'NameMarks' element value. Наименование штампа
     * 
     * @param nameMarks
     */
    public void setNameMarks(String nameMarks) {
        this.nameMarks = nameMarks;
    }

    /** 
     * Get the 'Value' element value. Присутствие штампа. 0- отсутствует, 1 - есть
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /** 
     * Set the 'Value' element value. Присутствие штампа. 0- отсутствует, 1 - есть
     * 
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
