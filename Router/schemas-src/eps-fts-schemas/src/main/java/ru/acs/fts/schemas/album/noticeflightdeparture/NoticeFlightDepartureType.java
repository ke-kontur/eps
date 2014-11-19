
package ru.acs.fts.schemas.album.noticeflightdeparture;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;

/** 
 * ����������� � ���������� �������������� ����� �� ��������� ������� ������
 */
public class NoticeFlightDepartureType extends BaseDocType
{
    private CUOrganizationType carrier;
    private CustomsType customsOffice;
    private DepartureInfoType departureInfo;
    private String documentModeID;

    /** 
     * Get the 'Carrier' element value. ����������
     * 
     * @return value
     */
    public CUOrganizationType getCarrier() {
        return carrier;
    }

    /** 
     * Set the 'Carrier' element value. ����������
     * 
     * @param carrier
     */
    public void setCarrier(CUOrganizationType carrier) {
        this.carrier = carrier;
    }

    /** 
     * Get the 'CustomsOffice' element value. ���������� �����, � ������� ������������ �������� ��������� ��������� ����� ��������
     * 
     * @return value
     */
    public CustomsType getCustomsOffice() {
        return customsOffice;
    }

    /** 
     * Set the 'CustomsOffice' element value. ���������� �����, � ������� ������������ �������� ��������� ��������� ����� ��������
     * 
     * @param customsOffice
     */
    public void setCustomsOffice(CustomsType customsOffice) {
        this.customsOffice = customsOffice;
    }

    /** 
     * Get the 'DepartureInfo' element value. �������� �� ������ ���������� �����
     * 
     * @return value
     */
    public DepartureInfoType getDepartureInfo() {
        return departureInfo;
    }

    /** 
     * Set the 'DepartureInfo' element value. �������� �� ������ ���������� �����
     * 
     * @param departureInfo
     */
    public void setDepartureInfo(DepartureInfoType departureInfo) {
        this.departureInfo = departureInfo;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. ������������� ���� ���������
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
