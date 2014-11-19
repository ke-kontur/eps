
package ru.acs.fts.schemas.album.treatmentcommonaggregatetypescust;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ����������� ������������
 */
public class ProcOrganizationType extends OrganizationBaseType
{
    private String phone;
    private String fax;
    private String telex;
    private List<AddressType> factoryPlaceList = new ArrayList<AddressType>();
    private AddressType address;
    private List<DocumentBaseType> contractList = new ArrayList<DocumentBaseType>();
    private TrResultType trResult;
    private WasteProductsType wasteProducts;

    /** 
     * Get the 'Phone' element value. ������� ����������� �����������
     * 
     * @return value
     */
    public String getPhone() {
        return phone;
    }

    /** 
     * Set the 'Phone' element value. ������� ����������� �����������
     * 
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** 
     * Get the 'Fax' element value. ����� �����.
     * 
     * @return value
     */
    public String getFax() {
        return fax;
    }

    /** 
     * Set the 'Fax' element value. ����� �����.
     * 
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /** 
     * Get the 'Telex' element value. ����� �������.
     * 
     * @return value
     */
    public String getTelex() {
        return telex;
    }

    /** 
     * Set the 'Telex' element value. ����� �������.
     * 
     * @param telex
     */
    public void setTelex(String telex) {
        this.telex = telex;
    }

    /** 
     * Get the list of 'FactoryPlace' element items. ��������������� ����������������  ��������� 
     * 
     * @return list
     */
    public List<AddressType> getFactoryPlaceList() {
        return factoryPlaceList;
    }

    /** 
     * Set the list of 'FactoryPlace' element items. ��������������� ����������������  ��������� 
     * 
     * @param list
     */
    public void setFactoryPlaceList(List<AddressType> list) {
        factoryPlaceList = list;
    }

    /** 
     * Get the 'Address' element value. ����� 
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. ����� 
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }

    /** 
     * Get the list of 'Contract' element items. �������� � ���������
     * 
     * @return list
     */
    public List<DocumentBaseType> getContractList() {
        return contractList;
    }

    /** 
     * Set the list of 'Contract' element items. �������� � ���������
     * 
     * @param list
     */
    public void setContractList(List<DocumentBaseType> list) {
        contractList = list;
    }

    /** 
     * Get the 'TrResult' element value. �������� �����������
     * 
     * @return value
     */
    public TrResultType getTrResult() {
        return trResult;
    }

    /** 
     * Set the 'TrResult' element value. �������� �����������
     * 
     * @param trResult
     */
    public void setTrResult(TrResultType trResult) {
        this.trResult = trResult;
    }

    /** 
     * Get the 'WasteProducts' element value. ������ �����������
     * 
     * @return value
     */
    public WasteProductsType getWasteProducts() {
        return wasteProducts;
    }

    /** 
     * Set the 'WasteProducts' element value. ������ �����������
     * 
     * @param wasteProducts
     */
    public void setWasteProducts(WasteProductsType wasteProducts) {
        this.wasteProducts = wasteProducts;
    }
}
