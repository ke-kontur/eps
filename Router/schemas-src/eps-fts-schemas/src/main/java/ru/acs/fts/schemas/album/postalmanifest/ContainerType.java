
package ru.acs.fts.schemas.album.postalmanifest;

/** 
 * �������� �� ������������ �����������
 */
public class ContainerType
{
    private String containerNumber;
    private String stampNumber;

    /** 
     * Get the 'ContainerNumber' element value. ����� ����������
     * 
     * @return value
     */
    public String getContainerNumber() {
        return containerNumber;
    }

    /** 
     * Set the 'ContainerNumber' element value. ����� ����������
     * 
     * @param containerNumber
     */
    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    /** 
     * Get the 'StampNumber' element value. ����� ������
     * 
     * @return value
     */
    public String getStampNumber() {
        return stampNumber;
    }

    /** 
     * Set the 'StampNumber' element value. ����� ������
     * 
     * @param stampNumber
     */
    public void setStampNumber(String stampNumber) {
        this.stampNumber = stampNumber;
    }
}
