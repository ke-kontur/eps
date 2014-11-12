
package ru.acs.fts.schemas.album.commissioninspection;

/** 
 * Место назначения
 */
public class DestinationType
{
    private String importExport;
    private String nameCountry;

    /** 
     * Get the 'ImportExport' element value. Если значение поля "true" - "ввоз - населенный пункт",  "false" - "вывоз - стана назначения"
     * 
     * @return value
     */
    public String getImportExport() {
        return importExport;
    }

    /** 
     * Set the 'ImportExport' element value. Если значение поля "true" - "ввоз - населенный пункт",  "false" - "вывоз - стана назначения"
     * 
     * @param importExport
     */
    public void setImportExport(String importExport) {
        this.importExport = importExport;
    }

    /** 
     * Get the 'NameCountry' element value. Название населенного пункта/страны назначения
     * 
     * @return value
     */
    public String getNameCountry() {
        return nameCountry;
    }

    /** 
     * Set the 'NameCountry' element value. Название населенного пункта/страны назначения
     * 
     * @param nameCountry
     */
    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }
}
