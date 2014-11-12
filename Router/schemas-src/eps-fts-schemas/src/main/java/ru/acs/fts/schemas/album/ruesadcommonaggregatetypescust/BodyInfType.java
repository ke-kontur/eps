
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * Кузов
 */
public class BodyInfType
{
    private String bodyNumber;
    private String bodyKind;
    private String doorsNumber;

    /** 
     * Get the 'BodyNumber' element value. Номер кузова
     * 
     * @return value
     */
    public String getBodyNumber() {
        return bodyNumber;
    }

    /** 
     * Set the 'BodyNumber' element value. Номер кузова
     * 
     * @param bodyNumber
     */
    public void setBodyNumber(String bodyNumber) {
        this.bodyNumber = bodyNumber;
    }

    /** 
     * Get the 'BodyKind' element value. Тип кузова (заполняется согласно справочнику ATD_KZV.DBF)
     * 
     * @return value
     */
    public String getBodyKind() {
        return bodyKind;
    }

    /** 
     * Set the 'BodyKind' element value. Тип кузова (заполняется согласно справочнику ATD_KZV.DBF)
     * 
     * @param bodyKind
     */
    public void setBodyKind(String bodyKind) {
        this.bodyKind = bodyKind;
    }

    /** 
     * Get the 'DoorsNumber' element value. Количество дверей
     * 
     * @return value
     */
    public String getDoorsNumber() {
        return doorsNumber;
    }

    /** 
     * Set the 'DoorsNumber' element value. Количество дверей
     * 
     * @param doorsNumber
     */
    public void setDoorsNumber(String doorsNumber) {
        this.doorsNumber = doorsNumber;
    }
}
