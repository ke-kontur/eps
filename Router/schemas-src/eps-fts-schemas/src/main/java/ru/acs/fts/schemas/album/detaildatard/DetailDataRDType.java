
package ru.acs.fts.schemas.album.detaildatard;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;

/** 
 * Сведения по неквотируемому документу
 */
public class DetailDataRDType extends BaseDocType
{
    private String BDRDID;
    private String documentNumber;
    private LocalDate issueDate;
    private LocalDate term;
    private String documentCode;
    private String status;
    private LocalDate statusDate;
    private String formNumber;
    private LocalDate datePlacement;
    private OrganizationInfoType manufacturer;
    private OrganizationInfoType receiver;
    private List<GoodsInfoType> goodsInfoList = new ArrayList<GoodsInfoType>();
    private String documentModeID;

    /** 
     * Get the 'BDRDID' element value. Уникальный номер по БД РД
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. Уникальный номер по БД РД
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'DocumentNumber' element value. Номер документа
     * 
     * @return value
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /** 
     * Set the 'DocumentNumber' element value. Номер документа
     * 
     * @param documentNumber
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /** 
     * Get the 'IssueDate' element value. Дата выдачи документа
     * 
     * @return value
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /** 
     * Set the 'IssueDate' element value. Дата выдачи документа
     * 
     * @param issueDate
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /** 
     * Get the 'Term' element value. Срок действия
     * 
     * @return value
     */
    public LocalDate getTerm() {
        return term;
    }

    /** 
     * Set the 'Term' element value. Срок действия
     * 
     * @param term
     */
    public void setTerm(LocalDate term) {
        this.term = term;
    }

    /** 
     * Get the 'DocumentCode' element value. Код вида документа
     * 
     * @return value
     */
    public String getDocumentCode() {
        return documentCode;
    }

    /** 
     * Set the 'DocumentCode' element value. Код вида документа
     * 
     * @param documentCode
     */
    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    /** 
     * Get the 'Status' element value. Статус
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'Status' element value. Статус
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'StatusDate' element value. Дата установки статуса
     * 
     * @return value
     */
    public LocalDate getStatusDate() {
        return statusDate;
    }

    /** 
     * Set the 'StatusDate' element value. Дата установки статуса
     * 
     * @param statusDate
     */
    public void setStatusDate(LocalDate statusDate) {
        this.statusDate = statusDate;
    }

    /** 
     * Get the 'FormNumber' element value. Номер бланка
     * 
     * @return value
     */
    public String getFormNumber() {
        return formNumber;
    }

    /** 
     * Set the 'FormNumber' element value. Номер бланка
     * 
     * @param formNumber
     */
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    /** 
     * Get the 'DatePlacement' element value. Дата помещения в БД РД
     * 
     * @return value
     */
    public LocalDate getDatePlacement() {
        return datePlacement;
    }

    /** 
     * Set the 'DatePlacement' element value. Дата помещения в БД РД
     * 
     * @param datePlacement
     */
    public void setDatePlacement(LocalDate datePlacement) {
        this.datePlacement = datePlacement;
    }

    /** 
     * Get the 'Manufacturer' element value. Сведения о фирме изготовителя
     * 
     * @return value
     */
    public OrganizationInfoType getManufacturer() {
        return manufacturer;
    }

    /** 
     * Set the 'Manufacturer' element value. Сведения о фирме изготовителя
     * 
     * @param manufacturer
     */
    public void setManufacturer(OrganizationInfoType manufacturer) {
        this.manufacturer = manufacturer;
    }

    /** 
     * Get the 'Receiver' element value. Сведения о фирме получателя
     * 
     * @return value
     */
    public OrganizationInfoType getReceiver() {
        return receiver;
    }

    /** 
     * Set the 'Receiver' element value. Сведения о фирме получателя
     * 
     * @param receiver
     */
    public void setReceiver(OrganizationInfoType receiver) {
        this.receiver = receiver;
    }

    /** 
     * Get the list of 'GoodsInfo' element items. Сведения о продукции
     * 
     * @return list
     */
    public List<GoodsInfoType> getGoodsInfoList() {
        return goodsInfoList;
    }

    /** 
     * Set the list of 'GoodsInfo' element items. Сведения о продукции
     * 
     * @param list
     */
    public void setGoodsInfoList(List<GoodsInfoType> list) {
        goodsInfoList = list;
    }

    /** 
     * Get the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @return value
     */
    public String getDocumentModeID() {
        return documentModeID;
    }

    /** 
     * Set the 'DocumentModeID' attribute value. Идентификатор вида документа
     * 
     * @param documentModeID
     */
    public void setDocumentModeID(String documentModeID) {
        this.documentModeID = documentModeID;
    }
}
