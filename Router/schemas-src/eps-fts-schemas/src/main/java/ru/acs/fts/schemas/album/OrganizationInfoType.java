
package ru.acs.fts.schemas.album;

/** 
 * Сведения об отправителе/получателе/лице, отв. за фин. рег/декларанте
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:Information:CustomsDocuments:InfoDT:5.4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OrganizationInfoType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="OrganizationName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="OGRN" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="INN" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="KPP" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="ITN" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="OKATO" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OrganizationInfoType
{
    private String organizationName;
    private String OGRN;
    private String INN;
    private String KPP;
    private String ITN;
    private String OKATO;

    /** 
     * Get the 'OrganizationName' element value. Наименование организации / ФИО физического лица
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование организации / ФИО физического лица
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'OGRN' element value. ОГРН/ОГРНИП. Основной государственный регистрационный номер.
     * 
     * @return value
     */
    public String getOGRN() {
        return OGRN;
    }

    /** 
     * Set the 'OGRN' element value. ОГРН/ОГРНИП. Основной государственный регистрационный номер.
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
     * Get the 'OKATO' element value. Код ОКАТО (формируется автоматически в соответствии с приказом ФТС России от 10.10.2007 г. № 1246)
     * 
     * @return value
     */
    public String getOKATO() {
        return OKATO;
    }

    /** 
     * Set the 'OKATO' element value. Код ОКАТО (формируется автоматически в соответствии с приказом ФТС России от 10.10.2007 г. № 1246)
     * 
     * @param OKATO
     */
    public void setOKATO(String OKATO) {
        this.OKATO = OKATO;
    }
}
