
package ru.acs.fts.schemas.album.commercialact;

/** 
 * Описание несоответствия количества мест товара сведениям, заявленным в товаросопроводительных документах
 */
public class PlaceNumberType
{
    private String placeNumberByDocs;
    private String placeNumberByFact;

    /** 
     * Get the 'PlaceNumberByDocs' element value. Количество грузовых мест согласно товаросопроводительным документам
     * 
     * @return value
     */
    public String getPlaceNumberByDocs() {
        return placeNumberByDocs;
    }

    /** 
     * Set the 'PlaceNumberByDocs' element value. Количество грузовых мест согласно товаросопроводительным документам
     * 
     * @param placeNumberByDocs
     */
    public void setPlaceNumberByDocs(String placeNumberByDocs) {
        this.placeNumberByDocs = placeNumberByDocs;
    }

    /** 
     * Get the 'PlaceNumberByFact' element value. Количество грузовых мест фактическое
     * 
     * @return value
     */
    public String getPlaceNumberByFact() {
        return placeNumberByFact;
    }

    /** 
     * Set the 'PlaceNumberByFact' element value. Количество грузовых мест фактическое
     * 
     * @param placeNumberByFact
     */
    public void setPlaceNumberByFact(String placeNumberByFact) {
        this.placeNumberByFact = placeNumberByFact;
    }
}
