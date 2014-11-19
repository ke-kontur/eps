
package ru.acs.fts.schemas.album.tir_carnet;

import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.TDTransportMeansType;

/** 
 * ������������ �������� � ���
 */
public class TIRTransportMeansType extends TDTransportMeansType
{
    private String trailerNumber;
    private String trailerNumber2;

    /** 
     * Get the 'TrailerNumber' element value. ����� ���������� ������������� ��������
     * 
     * @return value
     */
    public String getTrailerNumber() {
        return trailerNumber;
    }

    /** 
     * Set the 'TrailerNumber' element value. ����� ���������� ������������� ��������
     * 
     * @param trailerNumber
     */
    public void setTrailerNumber(String trailerNumber) {
        this.trailerNumber = trailerNumber;
    }

    /** 
     * Get the 'TrailerNumber2' element value. ����� ������� ���������� ������������� ��������
     * 
     * @return value
     */
    public String getTrailerNumber2() {
        return trailerNumber2;
    }

    /** 
     * Set the 'TrailerNumber2' element value. ����� ������� ���������� ������������� ��������
     * 
     * @param trailerNumber2
     */
    public void setTrailerNumber2(String trailerNumber2) {
        this.trailerNumber2 = trailerNumber2;
    }
}
