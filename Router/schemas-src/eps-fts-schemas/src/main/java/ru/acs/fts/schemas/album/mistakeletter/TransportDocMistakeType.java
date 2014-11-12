
package ru.acs.fts.schemas.album.mistakeletter;

/** 
 * ����������� ��� ��� �������� ���������� ������ � ���������� ������������� ���������
 */
public class TransportDocMistakeType extends PresentedDocMistakeType
{
    private WaybillRegNumberMistakeType waybillRegNumberMistake;

    /** 
     * Get the 'WaybillRegNumberMistake' element value. ������ � ��������������� ������ ���������
     * 
     * @return value
     */
    public WaybillRegNumberMistakeType getWaybillRegNumberMistake() {
        return waybillRegNumberMistake;
    }

    /** 
     * Set the 'WaybillRegNumberMistake' element value. ������ � ��������������� ������ ���������
     * 
     * @param waybillRegNumberMistake
     */
    public void setWaybillRegNumberMistake(
            WaybillRegNumberMistakeType waybillRegNumberMistake) {
        this.waybillRegNumberMistake = waybillRegNumberMistake;
    }
}
