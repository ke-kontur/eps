
package ru.acs.fts.schemas.album.postalmanifest;

/** 
 * �������� � ���� ������������ ��������
 */
public class ReturnedContainersKindType
{
    private String priorityAviaKind;
    private String unpriorityLandKind;
    private String parcelKind;
    private String EMSKind;

    /** 
     * Get the 'PriorityAviaKind' element value. ������� ������������/���� ������������ ��������
     * 
     * @return value
     */
    public String getPriorityAviaKind() {
        return priorityAviaKind;
    }

    /** 
     * Set the 'PriorityAviaKind' element value. ������� ������������/���� ������������ ��������
     * 
     * @param priorityAviaKind
     */
    public void setPriorityAviaKind(String priorityAviaKind) {
        this.priorityAviaKind = priorityAviaKind;
    }

    /** 
     * Get the 'UnpriorityLandKind' element value. ������� ��������������/�������� ������������ ��������
     * 
     * @return value
     */
    public String getUnpriorityLandKind() {
        return unpriorityLandKind;
    }

    /** 
     * Set the 'UnpriorityLandKind' element value. ������� ��������������/�������� ������������ ��������
     * 
     * @param unpriorityLandKind
     */
    public void setUnpriorityLandKind(String unpriorityLandKind) {
        this.unpriorityLandKind = unpriorityLandKind;
    }

    /** 
     * Get the 'ParcelKind' element value. ������� ������������ ��������, ����������� � ��������
     * 
     * @return value
     */
    public String getParcelKind() {
        return parcelKind;
    }

    /** 
     * Set the 'ParcelKind' element value. ������� ������������ ��������, ����������� � ��������
     * 
     * @param parcelKind
     */
    public void setParcelKind(String parcelKind) {
        this.parcelKind = parcelKind;
    }

    /** 
     * Get the 'EMSKind' element value. ������� ������������ ��������, ����������� � EMS
     * 
     * @return value
     */
    public String getEMSKind() {
        return EMSKind;
    }

    /** 
     * Set the 'EMSKind' element value. ������� ������������ ��������, ����������� � EMS
     * 
     * @param EMSKind
     */
    public void setEMSKind(String EMSKind) {
        this.EMSKind = EMSKind;
    }
}
