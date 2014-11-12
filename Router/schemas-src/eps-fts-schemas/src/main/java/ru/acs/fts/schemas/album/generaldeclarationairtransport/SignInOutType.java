
package ru.acs.fts.schemas.album.generaldeclarationairtransport;

/** 
 * Признак совершения промежуточной, вынужденной (технической) посадки воздушного судна на территории РФ и на его борту отсутствуют товары, подлежащие разгрузке (выгрузке) или погрузке в месте посадки
 */
public class SignInOutType
{
    private String landingSign;
    private String goodSign;

    /** 
     * Get the 'LandingSign' element value. Признак о совершении промежуточной, вынужденной (технической) посадки воздушного судна на территории РФ.
     * 
     * @return value
     */
    public String getLandingSign() {
        return landingSign;
    }

    /** 
     * Set the 'LandingSign' element value. Признак о совершении промежуточной, вынужденной (технической) посадки воздушного судна на территории РФ.
     * 
     * @param landingSign
     */
    public void setLandingSign(String landingSign) {
        this.landingSign = landingSign;
    }

    /** 
     * Get the 'GoodSign' element value. На борту воздушного судна отсутствуют товары, подлежащие разгрузке (выгрузке) или погрузке в месте посадки
     * 
     * @return value
     */
    public String getGoodSign() {
        return goodSign;
    }

    /** 
     * Set the 'GoodSign' element value. На борту воздушного судна отсутствуют товары, подлежащие разгрузке (выгрузке) или погрузке в месте посадки
     * 
     * @param goodSign
     */
    public void setGoodSign(String goodSign) {
        this.goodSign = goodSign;
    }
}
