
package ru.acs.fts.schemas.album.mzsrdrugsubstance;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * В отношении лекарственных препаратов
 */
public class DrugsType
{
    private String name;
    private String tradeName;
    private String compound;
    private String form;
    private String doze;
    private String dozeMeasureUnit;
    private String packing;
    private String group;
    private String dozeNumber;
    private String packingComplete;
    private String FSND;
    private OrganizationBaseType ULName;
    private CUOrganizationType producer;
    private RegistrationType registration;

    /** 
     * Get the 'Name' element value. Наименование лекарственного препарата (международное непатентованное или химическое и торговое наименования)
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. Наименование лекарственного препарата (международное непатентованное или химическое и торговое наименования)
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'TradeName' element value. Торговое наименование лекарственного препарата
     * 
     * @return value
     */
    public String getTradeName() {
        return tradeName;
    }

    /** 
     * Set the 'TradeName' element value. Торговое наименование лекарственного препарата
     * 
     * @param tradeName
     */
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    /** 
     * Get the 'Compound' element value. Перечень веществ, входящих в состав лекарственного препарата, с указанием кол-ва каждого из них
     * 
     * @return value
     */
    public String getCompound() {
        return compound;
    }

    /** 
     * Set the 'Compound' element value. Перечень веществ, входящих в состав лекарственного препарата, с указанием кол-ва каждого из них
     * 
     * @param compound
     */
    public void setCompound(String compound) {
        this.compound = compound;
    }

    /** 
     * Get the 'Form' element value. Лекарственная форма с указанием количества лекарственного препарата в потребительской упаковке
     * 
     * @return value
     */
    public String getForm() {
        return form;
    }

    /** 
     * Set the 'Form' element value. Лекарственная форма с указанием количества лекарственного препарата в потребительской упаковке
     * 
     * @param form
     */
    public void setForm(String form) {
        this.form = form;
    }

    /** 
     * Get the 'Doze' element value. Дозировка
     * 
     * @return value
     */
    public String getDoze() {
        return doze;
    }

    /** 
     * Set the 'Doze' element value. Дозировка
     * 
     * @param doze
     */
    public void setDoze(String doze) {
        this.doze = doze;
    }

    /** 
     * Get the 'DozeMeasureUnit' element value. Единица измерения дозировки
     * 
     * @return value
     */
    public String getDozeMeasureUnit() {
        return dozeMeasureUnit;
    }

    /** 
     * Set the 'DozeMeasureUnit' element value. Единица измерения дозировки
     * 
     * @param dozeMeasureUnit
     */
    public void setDozeMeasureUnit(String dozeMeasureUnit) {
        this.dozeMeasureUnit = dozeMeasureUnit;
    }

    /** 
     * Get the 'Packing' element value. Первичная упаковка лекарственного препарата
     * 
     * @return value
     */
    public String getPacking() {
        return packing;
    }

    /** 
     * Set the 'Packing' element value. Первичная упаковка лекарственного препарата
     * 
     * @param packing
     */
    public void setPacking(String packing) {
        this.packing = packing;
    }

    /** 
     * Get the 'Group' element value. Фармакотерапевтическая группа лекарственного препарата
     * 
     * @return value
     */
    public String getGroup() {
        return group;
    }

    /** 
     * Set the 'Group' element value. Фармакотерапевтическая группа лекарственного препарата
     * 
     * @param group
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /** 
     * Get the 'DozeNumber' element value. Количество доз в упаковке
     * 
     * @return value
     */
    public String getDozeNumber() {
        return dozeNumber;
    }

    /** 
     * Set the 'DozeNumber' element value. Количество доз в упаковке
     * 
     * @param dozeNumber
     */
    public void setDozeNumber(String dozeNumber) {
        this.dozeNumber = dozeNumber;
    }

    /** 
     * Get the 'PackingComplete' element value. Комплектность упаковки
     * 
     * @return value
     */
    public String getPackingComplete() {
        return packingComplete;
    }

    /** 
     * Set the 'PackingComplete' element value. Комплектность упаковки
     * 
     * @param packingComplete
     */
    public void setPackingComplete(String packingComplete) {
        this.packingComplete = packingComplete;
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
     * Get the 'ULName' element value. Юридическое лицо, на имя которого выдано разрешение (Представитель)
     * 
     * @return value
     */
    public OrganizationBaseType getULName() {
        return ULName;
    }

    /** 
     * Set the 'ULName' element value. Юридическое лицо, на имя которого выдано разрешение (Представитель)
     * 
     * @param ULName
     */
    public void setULName(OrganizationBaseType ULName) {
        this.ULName = ULName;
    }

    /** 
     * Get the 'Producer' element value. Производитель лекарственного препарата
     * 
     * @return value
     */
    public CUOrganizationType getProducer() {
        return producer;
    }

    /** 
     * Set the 'Producer' element value. Производитель лекарственного препарата
     * 
     * @param producer
     */
    public void setProducer(CUOrganizationType producer) {
        this.producer = producer;
    }

    /** 
     * Get the 'Registration' element value. Сведения о регистрации лекарственного препарата
     * 
     * @return value
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. Сведения о регистрации лекарственного препарата
     * 
     * @param registration
     */
    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
    }
}
