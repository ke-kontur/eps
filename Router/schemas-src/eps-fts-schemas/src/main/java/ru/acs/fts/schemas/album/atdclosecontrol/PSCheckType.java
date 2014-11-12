
package ru.acs.fts.schemas.album.atdclosecontrol;

/** 
 * ����������� ��������, ����������� ��������
 */
public class PSCheckType
{
    private String PSID;
    private String PSVersion;

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
}
