
package ru.acs.fts.schemas.album.generaldeclarationairtransport;

/** 
 * ѕризнак совершени€ промежуточной, вынужденной (технической) посадки воздушного судна на территории –‘ и на его борту отсутствуют товары, подлежащие разгрузке (выгрузке) или погрузке в месте посадки
 */
public class SignInOutType
{
    private String landingSign;
    private String goodSign;

    /** 
     * Get the 'LandingSign' element value. ѕризнак о совершении промежуточной, вынужденной (технической) посадки воздушного судна на территории –‘.
     * 
     * @return value
     */
    public String getLandingSign() {
        return landingSign;
    }

    /** 
     * Set the 'LandingSign' element value. ѕризнак о совершении промежуточной, вынужденной (технической) посадки воздушного судна на территории –‘.
     * 
     * @param landingSign
     */
    public void setLandingSign(String landingSign) {
        this.landingSign = landingSign;
    }

    /** 
     * Get the 'GoodSign' element value. Ќа борту воздушного судна отсутствуют товары, подлежащие разгрузке (выгрузке) или погрузке в месте посадки
     * 
     * @return value
     */
    public String getGoodSign() {
        return goodSign;
    }

    /** 
     * Set the 'GoodSign' element value. Ќа борту воздушного судна отсутствуют товары, подлежащие разгрузке (выгрузке) или погрузке в месте посадки
     * 
     * @param goodSign
     */
    public void setGoodSign(String goodSign) {
        this.goodSign = goodSign;
    }
}
