
package ru.acs.fts.schemas.album.datard;

import org.joda.time.LocalDate;

/** 
 * ����������� ���������
 */
public class QuotaType
{
    private String conNumber;
    private LocalDate conDateSignature;
    private String formNumber;
    private String seriesForm;
    private String ownersLicense;
    private String organizationName;
    private String goodsTNVED;
    private String goodsDescription;

    /** 
     * Get the 'ConNumber' element value. ����� ���������
     * 
     * @return value
     */
    public String getConNumber() {
        return conNumber;
    }

    /** 
     * Set the 'ConNumber' element value. ����� ���������
     * 
     * @param conNumber
     */
    public void setConNumber(String conNumber) {
        this.conNumber = conNumber;
    }

    /** 
     * Get the 'ConDateSignature' element value. ���� ���������� ���������
     * 
     * @return value
     */
    public LocalDate getConDateSignature() {
        return conDateSignature;
    }

    /** 
     * Set the 'ConDateSignature' element value. ���� ���������� ���������
     * 
     * @param conDateSignature
     */
    public void setConDateSignature(LocalDate conDateSignature) {
        this.conDateSignature = conDateSignature;
    }

    /** 
     * Get the 'FormNumber' element value. ����� ������ 
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. ����� ������ 
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'SeriesForm' element value. ����� ������ 
     * 
     * @return value
     */
    public String getSeriesForm() {
        return seriesForm;
    }

    /** 
     * Set the 'SeriesForm' element value. ����� ������ 
     * 
     * @param seriesForm
     */
    public void setSeriesForm(String seriesForm) {
        this.seriesForm = seriesForm;
    }

    /** 
     * Get the 'OwnersLicense' element value. ������������  ��������� ��������
     * 
     * @return value
     */
    public String getOwnersLicense() {
        return ownersLicense;
    }

    /** 
     * Set the 'OwnersLicense' element value. ������������  ��������� ��������
     * 
     * @param ownersLicense
     */
    public void setOwnersLicense(String ownersLicense) {
        this.ownersLicense = ownersLicense;
    }

    /** 
     * Get the 'OrganizationName' element value. ������������ �������� (����������)
     * 
     * @return value
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. ������������ �������� (����������)
     * 
     * @param organizationName
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'GoodsTNVED' element value. ��� �����
     * 
     * @return value
     */
    public String getGoodsTNVED() {
        return goodsTNVED;
    }

    /** 
     * Set the 'GoodsTNVED' element value. ��� �����
     * 
     * @param goodsTNVED
     */
    public void setGoodsTNVED(String goodsTNVED) {
        this.goodsTNVED = goodsTNVED;
    }

    /** 
     * Get the 'GoodsDescription' element value. �������� (������������) ������
     * 
     * @return value
     */
    public String getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. �������� (������������) ������
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }
}
