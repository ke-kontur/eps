
package ru.acs.fts.schemas.album.detailquotadatard;

/** 
 * Сведения о владельце лицензии
 */
public class OwnersLicenseType
{
    private String organizationName;
    private String OGRN;
    private String INN;
    private String KPP;
    private String OKPOID;
    private String ITN;
    private String legalAddress;

    /** 
     * Get the 'OrganizationName' element value. Полное официальное наименование 
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Полное официальное наименование 
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'OGRN' element value. ОГРН/ОГРНИП. Основной государственный регистрационный  номер.
     * 
     * @return value
     */
    public String getOGRN() {
        return OGRN;
    }

    /** 
     * Set the 'OGRN' element value. ОГРН/ОГРНИП. Основной государственный регистрационный  номер.
     * 
     * @param OGRN
     */
    public void setOGRN(String OGRN) {
        this.OGRN = OGRN;
    }

    /** 
     * Get the 'INN' element value. ИНН - Индивидуальный номер налогоплательщика.
     * 
     * @return value
     */
    public String getINN() {
        return INN;
    }

    /** 
     * Set the 'INN' element value. ИНН - Индивидуальный номер налогоплательщика.
     * 
     * @param INN
     */
    public void setINN(String INN) {
        this.INN = INN;
    }

    /** 
     * Get the 'KPP' element value. КПП - Код причины постановки на учет.
     * 
     * @return value
     */
    public String getKPP() {
        return KPP;
    }

    /** 
     * Set the 'KPP' element value. КПП - Код причины постановки на учет.
     * 
     * @param KPP
     */
    public void setKPP(String KPP) {
        this.KPP = KPP;
    }

    /** 
     * Get the 'OKPOID' element value. Код организации по ОКПО.
     * 
     * @return value
     */
    public String getOKPOID() {
        return OKPOID;
    }

    /** 
     * Set the 'OKPOID' element value. Код организации по ОКПО.
     * 
     * @param OKPOID
     */
    public void setOKPOID(String OKPOID) {
        this.OKPOID = OKPOID;
    }

    /** 
     * Get the 'ITN' element value. ИТН 
     * 
     * @return value
     */
    public String getITN() {
        return ITN;
    }

    /** 
     * Set the 'ITN' element value. ИТН 
     * 
     * @param ITN
     */
    public void setITN(String ITN) {
        this.ITN = ITN;
    }

    /** 
     * Get the 'LegalAddress' element value. Юридический адрес
     * 
     * @return value
     */
    public String getLegalAddress() {
        return legalAddress;
    }

    /** 
     * Set the 'LegalAddress' element value. Юридический адрес
     * 
     * @param legalAddress
     */
    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }
}
