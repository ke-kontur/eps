
package ru.acs.fts.schemas.album.mzsrdrugsubstance;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * � ��������� ������������� ����������
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
     * Get the 'Name' element value. ������������ �������������� ��������� (������������� ��������������� ��� ���������� � �������� ������������)
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'Name' element value. ������������ �������������� ��������� (������������� ��������������� ��� ���������� � �������� ������������)
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'TradeName' element value. �������� ������������ �������������� ���������
     * 
     * @return value
     */
    public String getTradeName() {
        return tradeName;
    }

    /** 
     * Set the 'TradeName' element value. �������� ������������ �������������� ���������
     * 
     * @param tradeName
     */
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    /** 
     * Get the 'Compound' element value. �������� �������, �������� � ������ �������������� ���������, � ��������� ���-�� ������� �� ���
     * 
     * @return value
     */
    public String getCompound() {
        return compound;
    }

    /** 
     * Set the 'Compound' element value. �������� �������, �������� � ������ �������������� ���������, � ��������� ���-�� ������� �� ���
     * 
     * @param compound
     */
    public void setCompound(String compound) {
        this.compound = compound;
    }

    /** 
     * Get the 'Form' element value. ������������� ����� � ��������� ���������� �������������� ��������� � ��������������� ��������
     * 
     * @return value
     */
    public String getForm() {
        return form;
    }

    /** 
     * Set the 'Form' element value. ������������� ����� � ��������� ���������� �������������� ��������� � ��������������� ��������
     * 
     * @param form
     */
    public void setForm(String form) {
        this.form = form;
    }

    /** 
     * Get the 'Doze' element value. ���������
     * 
     * @return value
     */
    public String getDoze() {
        return doze;
    }

    /** 
     * Set the 'Doze' element value. ���������
     * 
     * @param doze
     */
    public void setDoze(String doze) {
        this.doze = doze;
    }

    /** 
     * Get the 'DozeMeasureUnit' element value. ������� ��������� ���������
     * 
     * @return value
     */
    public String getDozeMeasureUnit() {
        return dozeMeasureUnit;
    }

    /** 
     * Set the 'DozeMeasureUnit' element value. ������� ��������� ���������
     * 
     * @param dozeMeasureUnit
     */
    public void setDozeMeasureUnit(String dozeMeasureUnit) {
        this.dozeMeasureUnit = dozeMeasureUnit;
    }

    /** 
     * Get the 'Packing' element value. ��������� �������� �������������� ���������
     * 
     * @return value
     */
    public String getPacking() {
        return packing;
    }

    /** 
     * Set the 'Packing' element value. ��������� �������� �������������� ���������
     * 
     * @param packing
     */
    public void setPacking(String packing) {
        this.packing = packing;
    }

    /** 
     * Get the 'Group' element value. ���������������������� ������ �������������� ���������
     * 
     * @return value
     */
    public String getGroup() {
        return group;
    }

    /** 
     * Set the 'Group' element value. ���������������������� ������ �������������� ���������
     * 
     * @param group
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /** 
     * Get the 'DozeNumber' element value. ���������� ��� � ��������
     * 
     * @return value
     */
    public String getDozeNumber() {
        return dozeNumber;
    }

    /** 
     * Set the 'DozeNumber' element value. ���������� ��� � ��������
     * 
     * @param dozeNumber
     */
    public void setDozeNumber(String dozeNumber) {
        this.dozeNumber = dozeNumber;
    }

    /** 
     * Get the 'PackingComplete' element value. ������������� ��������
     * 
     * @return value
     */
    public String getPackingComplete() {
        return packingComplete;
    }

    /** 
     * Set the 'PackingComplete' element value. ������������� ��������
     * 
     * @param packingComplete
     */
    public void setPackingComplete(String packingComplete) {
        this.packingComplete = packingComplete;
    }

    /** 
     * Get the 'FS_ND' element value. ��/��
     * 
     * @return value
     */
    public String getFSND() {
        return FSND;
    }

    /** 
     * Set the 'FS_ND' element value. ��/��
     * 
     * @param FSND
     */
    public void setFSND(String FSND) {
        this.FSND = FSND;
    }

    /** 
     * Get the 'ULName' element value. ����������� ����, �� ��� �������� ������ ���������� (�������������)
     * 
     * @return value
     */
    public OrganizationBaseType getULName() {
        return ULName;
    }

    /** 
     * Set the 'ULName' element value. ����������� ����, �� ��� �������� ������ ���������� (�������������)
     * 
     * @param ULName
     */
    public void setULName(OrganizationBaseType ULName) {
        this.ULName = ULName;
    }

    /** 
     * Get the 'Producer' element value. ������������� �������������� ���������
     * 
     * @return value
     */
    public CUOrganizationType getProducer() {
        return producer;
    }

    /** 
     * Set the 'Producer' element value. ������������� �������������� ���������
     * 
     * @param producer
     */
    public void setProducer(CUOrganizationType producer) {
        this.producer = producer;
    }

    /** 
     * Get the 'Registration' element value. �������� � ����������� �������������� ���������
     * 
     * @return value
     */
    public RegistrationType getRegistration() {
        return registration;
    }

    /** 
     * Set the 'Registration' element value. �������� � ����������� �������������� ���������
     * 
     * @param registration
     */
    public void setRegistration(RegistrationType registration) {
        this.registration = registration;
    }
}
