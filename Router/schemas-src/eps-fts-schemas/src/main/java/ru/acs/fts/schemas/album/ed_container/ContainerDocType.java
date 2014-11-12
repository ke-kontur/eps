
package ru.acs.fts.schemas.album.ed_container;

/** 
 * ������� ����������
 */
public class ContainerDocType
{
    private String order;
    private DocBodyType docBody;

    /** 
     * Get the 'Order' element value. ������� ��������� ���������. ������������ � �������� ������������ ��������������. ��� ������� ������� ���������� �� �����������.
     * 
     * @return value
     */
    public String getOrder() {
        return order;
    }

    /** 
     * Set the 'Order' element value. ������� ��������� ���������. ������������ � �������� ������������ ��������������. ��� ������� ������� ���������� �� �����������.
     * 
     * @param order
     */
    public void setOrder(String order) {
        this.order = order;
    }

    /** 
     * Get the 'DocBody' element value.
     * 
     * @return value
     */
    public DocBodyType getDocBody() {
        return docBody;
    }

    /** 
     * Set the 'DocBody' element value.
     * 
     * @param docBody
     */
    public void setDocBody(DocBodyType docBody) {
        this.docBody = docBody;
    }
}
