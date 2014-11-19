
package ru.acs.fts.schemas.album.realestateresponse;

/** 
 * �����
 */
public class AddressType
        extends
            ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType
{
    private String KLADRCode;
    private String OKATO;
    private String unformalizedDescription;
    private AddressElementType district;
    private AddressElementType ruralPlace;
    private AddressElementType urbanDistrict;

    /** 
     * Get the 'KLADRCode' element value. ��� ������ �� �����
     * 
     * @return value
     */
    public String getKLADRCode() {
        return KLADRCode;
    }

    /** 
     * Set the 'KLADRCode' element value. ��� ������ �� �����
     * 
     * @param KLADRCode
     */
    public void setKLADRCode(String KLADRCode) {
        this.KLADRCode = KLADRCode;
    }

    /** 
     * Get the 'OKATO' element value. �����
     * 
     * @return value
     */
    public String getOKATO() {
        return OKATO;
    }

    /** 
     * Set the 'OKATO' element value. �����
     * 
     * @param OKATO
     */
    public void setOKATO(String OKATO) {
        this.OKATO = OKATO;
    }

    /** 
     * Get the 'UnformalizedDescription' element value. ����������������� ��������
     * 
     * @return value
     */
    public String getUnformalizedDescription() {
        return unformalizedDescription;
    }

    /** 
     * Set the 'UnformalizedDescription' element value. ����������������� ��������
     * 
     * @param unformalizedDescription
     */
    public void setUnformalizedDescription(String unformalizedDescription) {
        this.unformalizedDescription = unformalizedDescription;
    }

    /** 
     * Get the 'District' element value. �����
     * 
     * @return value
     */
    public AddressElementType getDistrict() {
        return district;
    }

    /** 
     * Set the 'District' element value. �����
     * 
     * @param district
     */
    public void setDistrict(AddressElementType district) {
        this.district = district;
    }

    /** 
     * Get the 'RuralPlace' element value. ���������
     * 
     * @return value
     */
    public AddressElementType getRuralPlace() {
        return ruralPlace;
    }

    /** 
     * Set the 'RuralPlace' element value. ���������
     * 
     * @param ruralPlace
     */
    public void setRuralPlace(AddressElementType ruralPlace) {
        this.ruralPlace = ruralPlace;
    }

    /** 
     * Get the 'UrbanDistrict' element value. ��������� �����
     * 
     * @return value
     */
    public AddressElementType getUrbanDistrict() {
        return urbanDistrict;
    }

    /** 
     * Set the 'UrbanDistrict' element value. ��������� �����
     * 
     * @param urbanDistrict
     */
    public void setUrbanDistrict(AddressElementType urbanDistrict) {
        this.urbanDistrict = urbanDistrict;
    }
}
