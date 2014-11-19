
package ru.acs.fts.schemas.album.preliminaryorigincountry;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ��������������� ������� � ������ ������������� ������
 */
public class PreliminaryOriginCountryType extends BaseDocType
{
    private LocalDate date;
    private String originCountryName;
    private List<String> markList = new ArrayList<String>();
    private String managementName;
    private DeclarantType declarant;
    private RegistrationNumberType registrationNumber;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private GoodsInfoOriginCountryType goodsInfoOriginCountry;
    private DocumentBaseType document;
    private PersonSignatureType personSignature;
    private String documentModeID;

    /** 
     * Get the 'Date' element value. ���� �������� �������
     * 
     * @return value
     */
    public LocalDate getDate() {
        return date;
    }

    /** 
     * Set the 'Date' element value. ���� �������� �������
     * 
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /** 
     * Get the 'OriginCountryName' element value. ������ ������������� ������
     * 
     * @return value
     */
    public String getOriginCountryName() {
        return originCountryName;
    }

    /** 
     * Set the 'OriginCountryName' element value. ������ ������������� ������
     * 
     * @param originCountryName
     */
    public void setOriginCountryName(String originCountryName) {
        this.originCountryName = originCountryName;
    }

    /** 
     * Get the list of 'Mark' element items. ��������� �������
     * 
     * @return list
     */
    public List<String> getMarkList() {
        return markList;
    }

    /** 
     * Set the list of 'Mark' element items. ��������� �������
     * 
     * @param list
     */
    public void setMarkList(List<String> list) {
        markList = list;
    }

    /** 
     * Get the 'ManagementName' element value. ������������ ����������
     * 
     * @return value
     */
    public String getManagementName() {
        return managementName;
    }

    /** 
     * Set the 'ManagementName' element value. ������������ ����������
     * 
     * @param managementName
     */
    public void setManagementName(String managementName) {
        this.managementName = managementName;
    }

    /** 
     * Get the 'Declarant' element value. �������� � ���������
     * 
     * @return value
     */
    public DeclarantType getDeclarant() {
        return declarant;
    }

    /** 
     * Set the 'Declarant' element value. �������� � ���������
     * 
     * @param declarant
     */
    public void setDeclarant(DeclarantType declarant) {
        this.declarant = declarant;
    }

    /** 
     * Get the 'RegistrationNumber' element value. ��������������� �����
     * 
     * @return value
     */
    public RegistrationNumberType getRegistrationNumber() {
        return registrationNumber;
    }

    /** 
     * Set the 'RegistrationNumber' element value. ��������������� �����
     * 
     * @param registrationNumber
     */
    public void setRegistrationNumber(RegistrationNumberType registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /** 
     * Get the list of 'Goods' element items. �����
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. �����
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
    }

    /** 
     * Get the 'GoodsInfoOriginCountry' element value. �������� � ������, ����������� ��� ����������� ������ ������������� 
     * 
     * @return value
     */
    public GoodsInfoOriginCountryType getGoodsInfoOriginCountry() {
        return goodsInfoOriginCountry;
    }

    /** 
     * Set the 'GoodsInfoOriginCountry' element value. �������� � ������, ����������� ��� ����������� ������ ������������� 
     * 
     * @param goodsInfoOriginCountry
     */
    public void setGoodsInfoOriginCountry(
            GoodsInfoOriginCountryType goodsInfoOriginCountry) {
        this.goodsInfoOriginCountry = goodsInfoOriginCountry;
    }

    /** 
     * Get the 'Document' element value. ��������, ���������������� ������� ����������� ������ ������������� ������ �� ���������� ������ ��� ������ �����.
     * 
     * @return value
     */
    public DocumentBaseType getDocument() {
        return document;
    }

    /** 
     * Set the 'Document' element value. ��������, ���������������� ������� ����������� ������ ������������� ������ �� ���������� ������ ��� ������ �����.
     * 
     * @param document
     */
    public void setDocument(DocumentBaseType document) {
        this.document = document;
    }

    /** 
     * Get the 'PersonSignature' element value. ������� ������������ ���� ����������� ������
     * 
     * @return value
     */
    public PersonSignatureType getPersonSignature() {
        return personSignature;
    }

    /** 
     * Set the 'PersonSignature' element value. ������� ������������ ���� ����������� ������
     * 
     * @param personSignature
     */
    public void setPersonSignature(PersonSignatureType personSignature) {
        this.personSignature = personSignature;
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
