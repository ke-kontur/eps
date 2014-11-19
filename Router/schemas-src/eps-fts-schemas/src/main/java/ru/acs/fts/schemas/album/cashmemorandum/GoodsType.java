
package ru.acs.fts.schemas.album.cashmemorandum;

import ru.acs.fts.schemas.album.commercialfinancecommonaggregatetypescust.SpecificationGoodsType;

/** 
 * ����� ��������� ����
 */
public class GoodsType extends SpecificationGoodsType
{
    private String number;
    private String discount;
    private String taxPercent;
    private String notes;

    /** 
     * Get the 'Number' element value. ����� ������ � ������
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. ����� ������ � ������
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'Discount' element value. ������, � ���������
     * 
     * @return value
     */
    public String getDiscount() {
        return discount;
    }

    /** 
     * Set the 'Discount' element value. ������, � ���������
     * 
     * @param discount
     */
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    /** 
     * Get the 'TaxPercent' element value. �����, � ��������� �� ��������� ������
     * 
     * @return value
     */
    public String getTaxPercent() {
        return taxPercent;
    }

    /** 
     * Set the 'TaxPercent' element value. �����, � ��������� �� ��������� ������
     * 
     * @param taxPercent
     */
    public void setTaxPercent(String taxPercent) {
        this.taxPercent = taxPercent;
    }

    /** 
     * Get the 'Notes' element value. �������������� ����������
     * 
     * @return value
     */
    public String getNotes() {
        return notes;
    }

    /** 
     * Set the 'Notes' element value. �������������� ����������
     * 
     * @param notes
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
