
package ru.acs.fts.schemas.album.minpromlicence;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.SupplementaryQuantityType;

/** 
 * ����� �� ������ �������� � �������� �� ����/����� ������ � ���������� ����������� �����
 */
public class MinPromLicenceType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private String nomenclatureCode;
    private String nomenclatureDescription;
    private String addInfo;
    private String addendumTotalPages;
    private LicenceInfoType license;
    private DocumentBaseType contract;
    private DealerType dealer;
    private CountryType country7Info;
    private CountryType originCountry;
    private CostType cost;
    private SupplementaryQuantityType quantity;
    private SupplementaryQuantityType addQuantity;
    private BlankType blank;
    private List<LicAddendumItemType> addendumList = new ArrayList<LicAddendumItemType>();
    private String documentModeID;

    /** 
     * Get the 'IsCanceled' element value. ������� ����, ��� �������� ������������
     * 
     * @return value
     */
    public String getIsCanceled() {
        return isCanceled;
    }

    /** 
     * Set the 'IsCanceled' element value. ������� ����, ��� �������� ������������
     * 
     * @param isCanceled
     */
    public void setIsCanceled(String isCanceled) {
        this.isCanceled = isCanceled;
    }

    /** 
     * Get the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. ������������� ��������� �� �� ��
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'NomenclatureCode' element value. ��� ��� ���
     * 
     * @return value
     */
    public String getNomenclatureCode() {
        return nomenclatureCode;
    }

    /** 
     * Set the 'NomenclatureCode' element value. ��� ��� ���
     * 
     * @param nomenclatureCode
     */
    public void setNomenclatureCode(String nomenclatureCode) {
        this.nomenclatureCode = nomenclatureCode;
    }

    /** 
     * Get the 'NomenclatureDescription' element value. ���������������� ��������
     * 
     * @return value
     */
    public String getNomenclatureDescription() {
        return nomenclatureDescription;
    }

    /** 
     * Set the 'NomenclatureDescription' element value. ���������������� ��������
     * 
     * @param nomenclatureDescription
     */
    public void setNomenclatureDescription(String nomenclatureDescription) {
        this.nomenclatureDescription = nomenclatureDescription;
    }

    /** 
     * Get the 'AddInfo' element value. �������������� ����������
     * 
     * @return value
     */
    public String getAddInfo() {
        return addInfo;
    }

    /** 
     * Set the 'AddInfo' element value. �������������� ����������
     * 
     * @param addInfo
     */
    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }

    /** 
     * Get the 'AddendumTotalPages' element value. ���������� ������ � ����������
     * 
     * @return value
     */
    public String getAddendumTotalPages() {
        return addendumTotalPages;
    }

    /** 
     * Set the 'AddendumTotalPages' element value. ���������� ������ � ����������
     * 
     * @param addendumTotalPages
     */
    public void setAddendumTotalPages(String addendumTotalPages) {
        this.addendumTotalPages = addendumTotalPages;
    }

    /** 
     * Get the 'License' element value. ��������
     * 
     * @return value
     */
    public LicenceInfoType getLicense() {
        return license;
    }

    /** 
     * Set the 'License' element value. ��������
     * 
     * @param license
     */
    public void setLicense(LicenceInfoType license) {
        this.license = license;
    }

    /** 
     * Get the 'Contract' element value. ���������� � ���������
     * 
     * @return value
     */
    public DocumentBaseType getContract() {
        return contract;
    }

    /** 
     * Set the 'Contract' element value. ���������� � ���������
     * 
     * @param contract
     */
    public void setContract(DocumentBaseType contract) {
        this.contract = contract;
    }

    /** 
     * Get the 'Dealer' element value. ���������� � ����������/��������
     * 
     * @return value
     */
    public DealerType getDealer() {
        return dealer;
    }

    /** 
     * Set the 'Dealer' element value. ���������� � ����������/��������
     * 
     * @param dealer
     */
    public void setDealer(DealerType dealer) {
        this.dealer = dealer;
    }

    /** 
     * Get the 'Country7Info' element value. ������ ����������/�����������
     * 
     * @return value
     */
    public CountryType getCountry7Info() {
        return country7Info;
    }

    /** 
     * Set the 'Country7Info' element value. ������ ����������/�����������
     * 
     * @param country7Info
     */
    public void setCountry7Info(CountryType country7Info) {
        this.country7Info = country7Info;
    }

    /** 
     * Get the 'OriginCountry' element value. ������ �������������
     * 
     * @return value
     */
    public CountryType getOriginCountry() {
        return originCountry;
    }

    /** 
     * Set the 'OriginCountry' element value. ������ �������������
     * 
     * @param originCountry
     */
    public void setOriginCountry(CountryType originCountry) {
        this.originCountry = originCountry;
    }

    /** 
     * Get the 'Cost' element value. ���������
     * 
     * @return value
     */
    public CostType getCost() {
        return cost;
    }

    /** 
     * Set the 'Cost' element value. ���������
     * 
     * @param cost
     */
    public void setCost(CostType cost) {
        this.cost = cost;
    }

    /** 
     * Get the 'Quantity' element value. ���������� � �������� ������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'Quantity' element value. ���������� � �������� ������� ���������
     * 
     * @param quantity
     */
    public void setQuantity(SupplementaryQuantityType quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'AddQuantity' element value. ���������� � �������������� ������� ���������
     * 
     * @return value
     */
    public SupplementaryQuantityType getAddQuantity() {
        return addQuantity;
    }

    /** 
     * Set the 'AddQuantity' element value. ���������� � �������������� ������� ���������
     * 
     * @param addQuantity
     */
    public void setAddQuantity(SupplementaryQuantityType addQuantity) {
        this.addQuantity = addQuantity;
    }

    /** 
     * Get the 'Blank' element value. �����
     * 
     * @return value
     */
    public BlankType getBlank() {
        return blank;
    }

    /** 
     * Set the 'Blank' element value. �����
     * 
     * @param blank
     */
    public void setBlank(BlankType blank) {
        this.blank = blank;
    }

    /** 
     * Get the list of 'Addendum' element items. ���������� � ��������
     * 
     * @return list
     */
    public List<LicAddendumItemType> getAddendumList() {
        return addendumList;
    }

    /** 
     * Set the list of 'Addendum' element items. ���������� � ��������
     * 
     * @param list
     */
    public void setAddendumList(List<LicAddendumItemType> list) {
        addendumList = list;
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
