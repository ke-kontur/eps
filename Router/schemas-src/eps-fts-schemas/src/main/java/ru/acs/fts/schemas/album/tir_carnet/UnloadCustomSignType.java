
package ru.acs.fts.schemas.album.tir_carnet;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsPersonType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ��������� �������,����������� �������� ������.
 */
public class UnloadCustomSignType
{
    private String custComments;
    private CustomsType customs;
    private CustomsPersonType person;

    /** 
     * Get the 'CustComments' element value. ����������� � ��������� �����.
     * 
     * @return value
     */
    public String getCustComments() {
        return custComments;
    }

    /** 
     * Set the 'CustComments' element value. ����������� � ��������� �����.
     * 
     * @param custComments
     */
    public void setCustComments(String custComments) {
        this.custComments = custComments;
    }

    /** 
     * Get the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. ��� � ������������ ����������� ������
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Person' element value. ����������� ���� ����������� ������
     * 
     * @return value
     */
    public CustomsPersonType getPerson() {
        return person;
    }

    /** 
     * Set the 'Person' element value. ����������� ���� ����������� ������
     * 
     * @param person
     */
    public void setPerson(CustomsPersonType person) {
        this.person = person;
    }
}
