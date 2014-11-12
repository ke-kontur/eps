
package ru.acs.fts.schemas.album.reportclosecontrol;

/** 
 * Программное средство, выполнившее проверку
 */
public class PSCheckType
{
    private String PSID;
    private String PSVersion;
    private String PSName;

    /** 
     * Get the 'PSID' element value. Идентификатор ПС, выполнившего проверку
     * 
     * @return value
     */
    public String getPSID() {
        return PSID;
    }

    /** 
     * Set the 'PSID' element value. Идентификатор ПС, выполнившего проверку
     * 
     * @param PSID
     */
    public void setPSID(String PSID) {
        this.PSID = PSID;
    }

    /** 
     * Get the 'PSVersion' element value. Версия ПС, выполнившего проверку
     * 
     * @return value
     */
    public String getPSVersion() {
        return PSVersion;
    }

    /** 
     * Set the 'PSVersion' element value. Версия ПС, выполнившего проверку
     * 
     * @param PSVersion
     */
    public void setPSVersion(String PSVersion) {
        this.PSVersion = PSVersion;
    }

    /** 
     * Get the 'PSName' element value. Наименование ПС, выполнившего проверку
     * 
     * @return value
     */
    public String getPSName() {
        return PSName;
    }

    /** 
     * Set the 'PSName' element value. Наименование ПС, выполнившего проверку
     * 
     * @param PSName
     */
    public void setPSName(String PSName) {
        this.PSName = PSName;
    }
}
