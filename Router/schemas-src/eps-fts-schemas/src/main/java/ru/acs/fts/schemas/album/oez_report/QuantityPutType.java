
package ru.acs.fts.schemas.album.oez_report;

/** 
 * ���������� ������, ���������� ��� ���������� ����� ���
 */
public class QuantityPutType
{
    private String quantityAtTheBeginning;
    private String quantityInTheEnd;
    private String quantityTotal;

    /** 
     * Get the 'QuantityAtTheBeginning' element value. ���������� ������ � ������ ��������� �������
     * 
     * @return value
     */
    public String getQuantityAtTheBeginning() {
        return quantityAtTheBeginning;
    }

    /** 
     * Set the 'QuantityAtTheBeginning' element value. ���������� ������ � ������ ��������� �������
     * 
     * @param quantityAtTheBeginning
     */
    public void setQuantityAtTheBeginning(String quantityAtTheBeginning) {
        this.quantityAtTheBeginning = quantityAtTheBeginning;
    }

    /** 
     * Get the 'QuantityInTheEnd' element value. ���������� ������, �� ����� ��������� �������
     * 
     * @return value
     */
    public String getQuantityInTheEnd() {
        return quantityInTheEnd;
    }

    /** 
     * Set the 'QuantityInTheEnd' element value. ���������� ������, �� ����� ��������� �������
     * 
     * @param quantityInTheEnd
     */
    public void setQuantityInTheEnd(String quantityInTheEnd) {
        this.quantityInTheEnd = quantityInTheEnd;
    }

    /** 
     * Get the 'QuantityTotal' element value. ����� �� �������� ������
     * 
     * @return value
     */
    public String getQuantityTotal() {
        return quantityTotal;
    }

    /** 
     * Set the 'QuantityTotal' element value. ����� �� �������� ������
     * 
     * @param quantityTotal
     */
    public void setQuantityTotal(String quantityTotal) {
        this.quantityTotal = quantityTotal;
    }
}
