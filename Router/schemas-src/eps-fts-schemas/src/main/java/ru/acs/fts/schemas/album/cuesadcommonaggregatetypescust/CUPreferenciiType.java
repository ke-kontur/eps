
package ru.acs.fts.schemas.album.cuesadcommonaggregatetypescust;

/** 
 * ����������� � ������������ � ��������������� ����� �� ������ ���������� ��������. ��.36
 */
public class CUPreferenciiType
{
    private String customsTax;
    private String customsDuty;
    private String excise;
    private String rate;

    /** 
     * Get the 'CustomsTax' element value. ���������� �����
     * 
     * @return value
     */
    public String getCustomsTax() {
        return customsTax;
    }

    /** 
     * Set the 'CustomsTax' element value. ���������� �����
     * 
     * @param customsTax
     */
    public void setCustomsTax(String customsTax) {
        this.customsTax = customsTax;
    }

    /** 
     * Get the 'CustomsDuty' element value. ���������� �������
     * 
     * @return value
     */
    public String getCustomsDuty() {
        return customsDuty;
    }

    /** 
     * Set the 'CustomsDuty' element value. ���������� �������
     * 
     * @param customsDuty
     */
    public void setCustomsDuty(String customsDuty) {
        this.customsDuty = customsDuty;
    }

    /** 
     * Get the 'Excise' element value. ������
     * 
     * @return value
     */
    public String getExcise() {
        return excise;
    }

    /** 
     * Set the 'Excise' element value. ������
     * 
     * @param excise
     */
    public void setExcise(String excise) {
        this.excise = excise;
    }

    /** 
     * Get the 'Rate' element value. ����� �� ����������� ���������
     * 
     * @return value
     */
    public String getRate() {
        return rate;
    }

    /** 
     * Set the 'Rate' element value. ����� �� ����������� ���������
     * 
     * @param rate
     */
    public void setRate(String rate) {
        this.rate = rate;
    }
}
