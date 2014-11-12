
package ru.acs.fts.schemas.album.cutir_carnet;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DriverInformationType;

/** 
 * ���������� / ��������� ������ ���
 */
public class TIRCarrierType extends CUOrganizationType
{
    private String TIRHolderID;
    private DriverInformationType CUDriverInformation;

    /** 
     * Get the 'TIRHolderID' element value. ����������������� ����� ��������� ������ ���
     * 
     * @return value
     */
    public String getTIRHolderID() {
        return TIRHolderID;
    }

    /** 
     * Set the 'TIRHolderID' element value. ����������������� ����� ��������� ������ ���
     * 
     * @param TIRHolderID
     */
    public void setTIRHolderID(String TIRHolderID) {
        this.TIRHolderID = TIRHolderID;
    }

    /** 
     * Get the 'CUDriverInformation' element value. ���������� � �������� ������������� ��������
     * 
     * @return value
     */
    public DriverInformationType getCUDriverInformation() {
        return CUDriverInformation;
    }

    /** 
     * Set the 'CUDriverInformation' element value. ���������� � �������� ������������� ��������
     * 
     * @param CUDriverInformation
     */
    public void setCUDriverInformation(DriverInformationType CUDriverInformation) {
        this.CUDriverInformation = CUDriverInformation;
    }
}
