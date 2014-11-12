
package ru.acs.fts.schemas.album.esadout_cu;

import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DriverInformationType;

/** 
 * �������� � �����������
 */
public class ESADoutCUCarrierType extends CUOrganizationType
{
    private DriverInformationType ESADoutCUDriverInformation;

    /** 
     * Get the 'ESADout_CUDriverInformation' element value. ���������� � ��������� ������������ �������. ����������� ��� �������� ������� ������������� �����������
     * 
     * @return value
     */
    public DriverInformationType getESADoutCUDriverInformation() {
        return ESADoutCUDriverInformation;
    }

    /** 
     * Set the 'ESADout_CUDriverInformation' element value. ���������� � ��������� ������������ �������. ����������� ��� �������� ������� ������������� �����������
     * 
     * @param ESADoutCUDriverInformation
     */
    public void setESADoutCUDriverInformation(
            DriverInformationType ESADoutCUDriverInformation) {
        this.ESADoutCUDriverInformation = ESADoutCUDriverInformation;
    }
}
