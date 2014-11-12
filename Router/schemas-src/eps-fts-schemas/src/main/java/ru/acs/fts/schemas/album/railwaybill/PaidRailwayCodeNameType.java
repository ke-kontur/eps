
package ru.acs.fts.schemas.album.railwaybill;

/** 
 * Наименования и коды транзитных железнодорожных дорог, за перевозку по которым отправитель принимает на себя платежи 
 */
public class PaidRailwayCodeNameType
{
    private String paidRailwayCode;
    private String paidRailwayName;
    private String paidRailwayShortName;
    private InfoPayerType infoPayer;

    /** 
     * Get the 'PaidRailwayCode' element value. Коды транзитных железнодорожных дорог
     * 
     * @return value
     */
    public String getPaidRailwayCode() {
        return paidRailwayCode;
    }

    /** 
     * Set the 'PaidRailwayCode' element value. Коды транзитных железнодорожных дорог
     * 
     * @param paidRailwayCode
     */
    public void setPaidRailwayCode(String paidRailwayCode) {
        this.paidRailwayCode = paidRailwayCode;
    }

    /** 
     * Get the 'PaidRailwayName' element value. Наименования транзитных железнодорожных дорог
     * 
     * @return value
     */
    public String getPaidRailwayName() {
        return paidRailwayName;
    }

    /** 
     * Set the 'PaidRailwayName' element value. Наименования транзитных железнодорожных дорог
     * 
     * @param paidRailwayName
     */
    public void setPaidRailwayName(String paidRailwayName) {
        this.paidRailwayName = paidRailwayName;
    }

    /** 
     * Get the 'PaidRailwayShortName' element value. Сокращенное наименование транзитных железнодорожных дорог
     * 
     * @return value
     */
    public String getPaidRailwayShortName() {
        return paidRailwayShortName;
    }

    /** 
     * Set the 'PaidRailwayShortName' element value. Сокращенное наименование транзитных железнодорожных дорог
     * 
     * @param paidRailwayShortName
     */
    public void setPaidRailwayShortName(String paidRailwayShortName) {
        this.paidRailwayShortName = paidRailwayShortName;
    }

    /** 
     * Get the 'InfoPayer' element value. Сведения о плательщике
     * 
     * @return value
     */
    public InfoPayerType getInfoPayer() {
        return infoPayer;
    }

    /** 
     * Set the 'InfoPayer' element value. Сведения о плательщике
     * 
     * @param infoPayer
     */
    public void setInfoPayer(InfoPayerType infoPayer) {
        this.infoPayer = infoPayer;
    }
}
