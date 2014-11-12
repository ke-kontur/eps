
package ru.acs.fts.schemas.album.realestateexcerpt;

import java.util.ArrayList;
import java.util.List;

/** 
 * ������������� ��������
 */
public class RequestDataType
{
    private String requestSign;
    private EstateObjectType estateObject;
    private OwnerType owner;
    private TerritoryType territory;
    private RequestPeriodType requestPeriod;
    private List<DocRequestType> docRequestList = new ArrayList<DocRequestType>();

    /** 
     * Get the 'RequestSign' element value. ������� �� ������� ���������������� �������: 1 - �� ������� ������������; 2 -  � ������ ���������� ���� �� ��������� � ���� ������� ����������� ���������; 3 - �������� �� ���������; 4 - � ��������� ��������������� �������������� ��� ����������� ������������
     * 
     * @return value
     */
    public String getRequestSign() {
        return requestSign;
    }

    /** 
     * Set the 'RequestSign' element value. ������� �� ������� ���������������� �������: 1 - �� ������� ������������; 2 -  � ������ ���������� ���� �� ��������� � ���� ������� ����������� ���������; 3 - �������� �� ���������; 4 - � ��������� ��������������� �������������� ��� ����������� ������������
     * 
     * @param requestSign
     */
    public void setRequestSign(String requestSign) {
        this.requestSign = requestSign;
    }

    /** 
     * Get the 'EstateObject' element value. ������ ������������
     * 
     * @return value
     */
    public EstateObjectType getEstateObject() {
        return estateObject;
    }

    /** 
     * Set the 'EstateObject' element value. ������ ������������
     * 
     * @param estateObject
     */
    public void setEstateObject(EstateObjectType estateObject) {
        this.estateObject = estateObject;
    }

    /** 
     * Get the 'Owner' element value. �������� ������� ����������� ���������
     * 
     * @return value
     */
    public OwnerType getOwner() {
        return owner;
    }

    /** 
     * Set the 'Owner' element value. �������� ������� ����������� ���������
     * 
     * @param owner
     */
    public void setOwner(OwnerType owner) {
        this.owner = owner;
    }

    /** 
     * Get the 'Territory' element value. ���������� ��
     * 
     * @return value
     */
    public TerritoryType getTerritory() {
        return territory;
    }

    /** 
     * Set the 'Territory' element value. ���������� ��
     * 
     * @param territory
     */
    public void setTerritory(TerritoryType territory) {
        this.territory = territory;
    }

    /** 
     * Get the 'RequestPeriod' element value. ������ �������, �� ������� ���������� ������������ ��������
     * 
     * @return value
     */
    public RequestPeriodType getRequestPeriod() {
        return requestPeriod;
    }

    /** 
     * Set the 'RequestPeriod' element value. ������ �������, �� ������� ���������� ������������ ��������
     * 
     * @param requestPeriod
     */
    public void setRequestPeriod(RequestPeriodType requestPeriod) {
        this.requestPeriod = requestPeriod;
    }

    /** 
     * Get the list of 'DocRequest' element items. ������ ���������
     * 
     * @return list
     */
    public List<DocRequestType> getDocRequestList() {
        return docRequestList;
    }

    /** 
     * Set the list of 'DocRequest' element items. ������ ���������
     * 
     * @param list
     */
    public void setDocRequestList(List<DocRequestType> list) {
        docRequestList = list;
    }
}
