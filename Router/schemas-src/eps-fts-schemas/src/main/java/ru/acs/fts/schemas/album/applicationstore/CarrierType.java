
package ru.acs.fts.schemas.album.applicationstore;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;

/** 
 * �������� � �����������
 */
public class CarrierType extends CUOrganizationType
{
    private String airlineIATACode;
    private CUOrganizationType carrierRepresentative;

    /** 
     * Get the 'AirlineIATACode' element value. ��� ����
     * 
     * @return value
     */
    public String getAirlineIATACode() {
        return airlineIATACode;
    }

    /** 
     * Set the 'AirlineIATACode' element value. ��� ����
     * 
     * @param airlineIATACode
     */
    public void setAirlineIATACode(String airlineIATACode) {
        this.airlineIATACode = airlineIATACode;
    }

    /** 
     * Get the 'CarrierRepresentative' element value. ������������� ������������
     * 
     * @return value
     */
    public CUOrganizationType getCarrierRepresentative() {
        return carrierRepresentative;
    }

    /** 
     * Set the 'CarrierRepresentative' element value. ������������� ������������
     * 
     * @param carrierRepresentative
     */
    public void setCarrierRepresentative(
            CUOrganizationType carrierRepresentative) {
        this.carrierRepresentative = carrierRepresentative;
    }
}
