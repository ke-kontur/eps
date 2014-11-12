
package ru.acs.fts.schemas.album.cwquitance;

/** 
 * ����� ���������, ��������������� ��� ����� � ������
 */
public class CommonDocumentType
{
    private String documentNumber;
    private String orderNumberOfEdition;

    /** 
     * Get the 'DocumentNumber' element value. ����� ���������������/���������� ���������
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. ����� ���������������/���������� ���������
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'OrderNumberOfEdition' element value. ����� ������ ���������������/���������� ���������
     * 
     * @return value
     */
    public String getOrderNumberOfEdition() {
        return orderNumberOfEdition;
    }

    /** 
     * Set the 'OrderNumberOfEdition' element value. ����� ������ ���������������/���������� ���������
     * 
     * @param orderNumberOfEdition
     */
    public void setOrderNumberOfEdition(String orderNumberOfEdition) {
        this.orderNumberOfEdition = orderNumberOfEdition;
    }
}
