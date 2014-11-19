
package ru.acs.fts.schemas.album.postalmanifest;

/** 
 * �������� � ����������� ���������� ��� �������� ��������� � ����
 */
public class ReloadInfoType
{
    private String operationDescription;
    private ReloadPlaceType reloadPlace;

    /** 
     * Get the 'OperationDescription' element value. �������� �������� � ������
     * 
     * @return value
     */
    public String getOperationDescription() {
        return operationDescription;
    }

    /** 
     * Set the 'OperationDescription' element value. �������� �������� � ������
     * 
     * @param operationDescription
     */
    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
    }

    /** 
     * Get the 'ReloadPlace' element value. ����� ���������� �������� � ���� ��������
     * 
     * @return value
     */
    public ReloadPlaceType getReloadPlace() {
        return reloadPlace;
    }

    /** 
     * Set the 'ReloadPlace' element value. ����� ���������� �������� � ���� ��������
     * 
     * @param reloadPlace
     */
    public void setReloadPlace(ReloadPlaceType reloadPlace) {
        this.reloadPlace = reloadPlace;
    }
}
