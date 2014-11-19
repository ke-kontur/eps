
package ru.acs.fts.schemas.album.guaranteecommonaggregatetypescust;

/** 
 * ����� ����� �����������
 */
public class TotalAmountType
{
    private AmountType duties;
    private AmountType excises;
    private AmountType taxes;

    /** 
     * Get the 'Duties' element value. ���������� �������
     * 
     * @return value
     */
    public AmountType getDuties() {
        return duties;
    }

    /** 
     * Set the 'Duties' element value. ���������� �������
     * 
     * @param duties
     */
    public void setDuties(AmountType duties) {
        this.duties = duties;
    }

    /** 
     * Get the 'Excises' element value. ������
     * 
     * @return value
     */
    public AmountType getExcises() {
        return excises;
    }

    /** 
     * Set the 'Excises' element value. ������
     * 
     * @param excises
     */
    public void setExcises(AmountType excises) {
        this.excises = excises;
    }

    /** 
     * Get the 'Taxes' element value. ������.
     * 
     * @return value
     */
    public AmountType getTaxes() {
        return taxes;
    }

    /** 
     * Set the 'Taxes' element value. ������.
     * 
     * @param taxes
     */
    public void setTaxes(AmountType taxes) {
        this.taxes = taxes;
    }
}
