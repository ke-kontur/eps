
package ru.acs.fts.schemas.album.pi_airarrive;

import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * �������� �� ���������������
 */
public class AirCarrierInfoType
{
    private String nameAirCarrier;
    private String IATACode;
    private PersonBaseType representativeCarrier;

    /** 
     * Get the 'NameAirCarrier' element value. ������ ������������ �����������
     * 
     * @return value
     */
    public String getNameAirCarrier() {
        return nameAirCarrier;
    }

    /** 
     * Set the 'NameAirCarrier' element value. ������ ������������ �����������
     * 
     * @param nameAirCarrier
     */
    public void setNameAirCarrier(String nameAirCarrier) {
        this.nameAirCarrier = nameAirCarrier;
    }

    /** 
     * Get the 'IATACode' element value. ��� ���� �����������
     * 
     * @return value
     */
    public String getIATACode() {
        return IATACode;
    }

    /** 
     * Set the 'IATACode' element value. ��� ���� �����������
     * 
     * @param IATACode
     */
    public void setIATACode(String IATACode) {
        this.IATACode = IATACode;
    }

    /** 
     * Get the 'RepresentativeCarrier' element value. ������������� ���������������
     * 
     * @return value
     */
    public PersonBaseType getRepresentativeCarrier() {
        return representativeCarrier;
    }

    /** 
     * Set the 'RepresentativeCarrier' element value. ������������� ���������������
     * 
     * @param representativeCarrier
     */
    public void setRepresentativeCarrier(PersonBaseType representativeCarrier) {
        this.representativeCarrier = representativeCarrier;
    }
}
