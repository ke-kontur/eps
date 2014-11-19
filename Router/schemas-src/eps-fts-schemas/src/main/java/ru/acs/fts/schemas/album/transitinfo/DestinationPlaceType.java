
package ru.acs.fts.schemas.album.transitinfo;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * �������� � ����� ����������
 */
public class DestinationPlaceType extends CUCustomsType
{
    private String placeDescription;
    private DocumentBaseType registrationCertificate;
    private RWstationType RWstation;

    /** 
     * Get the 'PlaceDescription' element value. ����� �������� �������
     * 
     * @return value
     */
    public String getPlaceDescription() {
        return placeDescription;
    }

    /** 
     * Set the 'PlaceDescription' element value. ����� �������� �������
     * 
     * @param placeDescription
     */
    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }

    /** 
     * Get the 'RegistrationCertificate' element value. ������������� � ��������� � ������ ���
     * 
     * @return value
     */
    public DocumentBaseType getRegistrationCertificate() {
        return registrationCertificate;
    }

    /** 
     * Set the 'RegistrationCertificate' element value. ������������� � ��������� � ������ ���
     * 
     * @param registrationCertificate
     */
    public void setRegistrationCertificate(
            DocumentBaseType registrationCertificate) {
        this.registrationCertificate = registrationCertificate;
    }

    /** 
     * Get the 'RWstation' element value. �� �������
     * 
     * @return value
     */
    public RWstationType getRWstation() {
        return RWstation;
    }

    /** 
     * Set the 'RWstation' element value. �� �������
     * 
     * @param RWstation
     */
    public void setRWstation(RWstationType RWstation) {
        this.RWstation = RWstation;
    }
}
