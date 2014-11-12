
package ru.acs.fts.schemas.album.reportclosecontrol;

/** 
 * ����������� ��������, ����������� ��������
 */
public class PSCheckType
{
    private String PSID;
    private String PSVersion;
    private String PSName;

    /** 
     * Get the 'PSID' element value. ������������� ��, ������������ ��������
     * 
     * @return value
     */
    public String getPSID() {
        return PSID;
    }

    /** 
     * Set the 'PSID' element value. ������������� ��, ������������ ��������
     * 
     * @param PSID
     */
    public void setPSID(String PSID) {
        this.PSID = PSID;
    }

    /** 
     * Get the 'PSVersion' element value. ������ ��, ������������ ��������
     * 
     * @return value
     */
    public String getPSVersion() {
        return PSVersion;
    }

    /** 
     * Set the 'PSVersion' element value. ������ ��, ������������ ��������
     * 
     * @param PSVersion
     */
    public void setPSVersion(String PSVersion) {
        this.PSVersion = PSVersion;
    }

    /** 
     * Get the 'PSName' element value. ������������ ��, ������������ ��������
     * 
     * @return value
     */
    public String getPSName() {
        return PSName;
    }

    /** 
     * Set the 'PSName' element value. ������������ ��, ������������ ��������
     * 
     * @param PSName
     */
    public void setPSName(String PSName) {
        this.PSName = PSName;
    }
}
