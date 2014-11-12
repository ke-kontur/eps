
package ru.acs.fts.schemas.album.cargomanifest;

/** 
 * Информация для таможни
 */
public class CustomsInfoType
{
    private String notice;
    private String originCountryCode;

    /** 
     * Get the 'Notice' element value. Примечание
     * 
     * @return value
     */
    public String getNotice() {
        return notice;
    }

    /** 
     * Set the 'Notice' element value. Примечание
     * 
     * @param notice
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }

    /** 
     * Get the 'OriginCountryCode' element value. Код страны происхождения товаров
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. Код страны происхождения товаров
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }
}
