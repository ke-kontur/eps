
package ru.acs.fts.schemas.album.revealedrisks;

/** 
 * Дела об административных правонарушениях, уголовные дела
 */
public class AdministrativeInfractionType
{
    private String lineNumber;
    private String pointCode;
    private String kodeksPunkt;
    private String kodeksPartPunkt;

    /** 
     * Get the 'LineNumber' element value. Порядковый номер строки информации
     * 
     * @return value
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'LineNumber' element value. Порядковый номер строки информации
     * 
     * @param lineNumber
     */
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    /** 
     * Get the 'PointCode' element value. Этап проведения проверки на соответствие профилям риска 
     * 
     * @return value
     */
    public String getPointCode() {
        return pointCode;
    }

    /** 
     * Set the 'PointCode' element value. Этап проведения проверки на соответствие профилям риска 
     * 
     * @param pointCode
     */
    public void setPointCode(String pointCode) {
        this.pointCode = pointCode;
    }

    /** 
     * Get the 'KodeksPunkt' element value. Номер статьи Кодекса Российской Федерации об административных правонарушениях (КоАП России), Уголовного Кодекса Российской Федерации (УК России)
     * 
     * @return value
     */
    public String getKodeksPunkt() {
        return kodeksPunkt;
    }

    /** 
     * Set the 'KodeksPunkt' element value. Номер статьи Кодекса Российской Федерации об административных правонарушениях (КоАП России), Уголовного Кодекса Российской Федерации (УК России)
     * 
     * @param kodeksPunkt
     */
    public void setKodeksPunkt(String kodeksPunkt) {
        this.kodeksPunkt = kodeksPunkt;
    }

    /** 
     * Get the 'KodeksPartPunkt' element value. Номер части статьи КоАП России, УК России
     * 
     * @return value
     */
    public String getKodeksPartPunkt() {
        return kodeksPartPunkt;
    }

    /** 
     * Set the 'KodeksPartPunkt' element value. Номер части статьи КоАП России, УК России
     * 
     * @param kodeksPartPunkt
     */
    public void setKodeksPartPunkt(String kodeksPartPunkt) {
        this.kodeksPartPunkt = kodeksPartPunkt;
    }
}
