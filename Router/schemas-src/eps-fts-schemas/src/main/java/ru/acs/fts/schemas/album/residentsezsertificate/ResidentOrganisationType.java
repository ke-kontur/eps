
package ru.acs.fts.schemas.album.residentsezsertificate;

/** 
 * Сведения о юридическом лице или об индивидуальном предпринимателе - резиденте ОЭЗ 
 */
public class ResidentOrganisationType
{
    private String organizationName;
    private String shortName;
    private String fullName;
    private String firmName;
    private String type;
    private String OGRN;
    private String INN;
    private String KPP;

    /** 
     * Get the 'OrganizationName' element value. Наименование
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'ShortName' element value. Краткое наименование 
     * 
     * @return value
     */
    public String getShortName() {
        return shortName;
    }

    /** 
     * Set the 'ShortName' element value. Краткое наименование 
     * 
     * @param shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /** 
     * Get the 'FullName' element value. Полное наименование 
     * 
     * @return value
     */
    public String getFullName() {
        return fullName;
    }

    /** 
     * Set the 'FullName' element value. Полное наименование 
     * 
     * @param fullName
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /** 
     * Get the 'FirmName' element value. Фирменное наименование 
     * 
     * @return value
     */
    public String getFirmName() {
        return firmName;
    }

    /** 
     * Set the 'FirmName' element value. Фирменное наименование 
     * 
     * @param firmName
     */
    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    /** 
     * Get the 'Type' element value. Тип резидента: 1 - юр. лицо, 0 - ИП
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'Type' element value. Тип резидента: 1 - юр. лицо, 0 - ИП
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
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
}
