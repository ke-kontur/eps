
package ru.acs.fts.schemas.album.explanationsalesterms;

/** 
 * Отличие вызвано нестандартной ситуацией на рынке
 */
public class NonStandardSituationMarketType
{
    private String dopRate;
    private String increaseRate;
    private String glutMarket;
    private String deficitMarket;
    private String other;
    private String countryType;
    private String comments;

    /** 
     * Get the 'DopRate' element value. Признак факта резкого падения курса национальной валюты
     * 
     * @return value
     */
    public String getDopRate() {
        return dopRate;
    }

    /** 
     * Set the 'DopRate' element value. Признак факта резкого падения курса национальной валюты
     * 
     * @param dopRate
     */
    public void setDopRate(String dopRate) {
        this.dopRate = dopRate;
    }

    /** 
     * Get the 'IncreaseRate' element value. Признак факта резкого повышения курса национальной валюты
     * 
     * @return value
     */
    public String getIncreaseRate() {
        return increaseRate;
    }

    /** 
     * Set the 'IncreaseRate' element value. Признак факта резкого повышения курса национальной валюты
     * 
     * @param increaseRate
     */
    public void setIncreaseRate(String increaseRate) {
        this.increaseRate = increaseRate;
    }

    /** 
     * Get the 'GlutMarket' element value. Признак факта затоваривания рынка
     * 
     * @return value
     */
    public String getGlutMarket() {
        return glutMarket;
    }

    /** 
     * Set the 'GlutMarket' element value. Признак факта затоваривания рынка
     * 
     * @param glutMarket
     */
    public void setGlutMarket(String glutMarket) {
        this.glutMarket = glutMarket;
    }

    /** 
     * Get the 'DeficitMarket' element value. Признак факта дефицита на рынке
     * 
     * @return value
     */
    public String getDeficitMarket() {
        return deficitMarket;
    }

    /** 
     * Set the 'DeficitMarket' element value. Признак факта дефицита на рынке
     * 
     * @param deficitMarket
     */
    public void setDeficitMarket(String deficitMarket) {
        this.deficitMarket = deficitMarket;
    }

    /** 
     * Get the 'Other' element value. Признак того, что отличие вызвано иной нестандартной ситуацией на рынке
     * 
     * @return value
     */
    public String getOther() {
        return other;
    }

    /** 
     * Set the 'Other' element value. Признак того, что отличие вызвано иной нестандартной ситуацией на рынке
     * 
     * @param other
     */
    public void setOther(String other) {
        this.other = other;
    }

    /** 
     * Get the 'CountryType' element value. Информация относится к стране: 1 -  отправления, 0 - происхождения
     * 
     * @return value
     */
    public String getCountryType() {
        return countryType;
    }

    /** 
     * Set the 'CountryType' element value. Информация относится к стране: 1 -  отправления, 0 - происхождения
     * 
     * @param countryType
     */
    public void setCountryType(String countryType) {
        this.countryType = countryType;
    }

    /** 
     * Get the 'Comments' element value. Иные (указать подробности)
     * 
     * @return value
     */
    public String getComments() {
        return comments;
    }

    /** 
     * Set the 'Comments' element value. Иные (указать подробности)
     * 
     * @param comments
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
}
