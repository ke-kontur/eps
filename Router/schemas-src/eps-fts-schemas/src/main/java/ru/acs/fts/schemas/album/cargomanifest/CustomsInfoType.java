
package ru.acs.fts.schemas.album.cargomanifest;

/** 
 * ���������� ��� �������
 */
public class CustomsInfoType
{
    private String notice;
    private String originCountryCode;

    /** 
     * Get the 'Notice' element value. ����������
     * 
     * @return value
     */
    public String getNotice() {
        return notice;
    }

    /** 
     * Set the 'Notice' element value. ����������
     * 
     * @param notice
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }

    /** 
     * Get the 'OriginCountryCode' element value. ��� ������ ������������� �������
     * 
     * @return value
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /** 
     * Set the 'OriginCountryCode' element value. ��� ������ ������������� �������
     * 
     * @param originCountryCode
     */
    public void setOriginCountryCode(String originCountryCode) {
        this.originCountryCode = originCountryCode;
    }
}
