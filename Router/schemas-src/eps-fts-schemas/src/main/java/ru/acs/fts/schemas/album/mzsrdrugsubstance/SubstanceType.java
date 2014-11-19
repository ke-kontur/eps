
package ru.acs.fts.schemas.album.mzsrdrugsubstance;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * В отношении фармацевтических субстанций
 */
public class SubstanceType
{
    private String name;
    private String reestrNumber;
    private String tradeName;
    private String form;
    private String FSND;
    private CUOrganizationType producer;
    private RegistrationType registration;

    /** 
     * Get the 'Name' element value. Наименование фармацевтической субстанции (международное непатентованное или химическое и торговое наименования)
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование фармацевтической субстанции (международное непатентованное или химическое и торговое наименования)
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'ReestrNumber' element value. Номер реестровой записи
     * 
     * @return value
     */
    public String getReestrNumber() {
        return reestrNumber;
    }

    /** 
     * Set the 'ReestrNumber' element value. Номер реестровой записи
     * 
     * @param reestrNumber
     */
    public void setReestrNumber(String reestrNumber) {
        this.reestrNumber = reestrNumber;
    }

    /** 
     * Get the 'TradeName' element value. Торговое наименование
     * 
     * @return value
     */
    public String getTradeName() {
        return tradeName;
    }

    /** 
     * Set the 'TradeName' element value. Торговое наименование
     * 
     * @param tradeName
     */
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    /** 
     * Get the 'Form' element value. Лекарственная форма
     * 
     * @return value
     */
    public String getForm() {
        return form;
    }

    /** 
     * Set the 'Form' element value. Лекарственная форма
     * 
     * @param form
     */
    public void setForm(String form) {
        this.form = form;
    }

    /** 
     * Get the 'FS_ND' element value. ФС/НД
     * 
     * @return value
     */
    public String getFSND() {
        return FSND;
    }

    /** 
     * Set the 'FS_ND' element value. ФС/НД
     * 
     * @param FSND
     */
    public void setFSND(String FSND) {
        this.FSND = FSND;
    }

    /** 
     * Get the 'Producer' element value. Производитель фармацевтической субстанции
     * 
     * @return value
     */
    public CUOrganizationType getProducer() {
        return producer;
    }

    /** 
     * Set the 'Producer' element value. Производитель фармацевтической субстанции
     * 
     * @param producer
     */
    public void setProducer(CUOrganizationType producer) {
        this.producer = producer;
    }

    /** 
     * Get the 'Registration' element value. Сведения о регистрации
     * 
     * @return value
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. Сведения о регистрации
     * 
     * @param registration
     */
    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
    }
}
