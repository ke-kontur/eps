
package ru.acs.fts.schemas.album.roskomradio;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Сведения из заключения (разрешительного документа) на ввоз радиоэлектронных средств и высокочастотных устройств, в том числе встроенных либо входящих в состав других товаров
 */
public class RosKomRadioType extends BaseDocType
{
    private String isCanceled;
    private String BDRDID;
    private LocalDate outDate;
    private String importObjective;
    private String requesterName;
    private String permissionOrganName;
    private DocInfoType documentInfo;
    private OwnerType owner;
    private List<ResItemType> resItemList = new ArrayList<ResItemType>();
    private List<DocumentBaseType> contractList = new ArrayList<DocumentBaseType>();
    private OrganizationBaseType organizationName;
    private PersonSignatureType signer;
    private String documentModeID;

    /** 
     * Get the 'IsCanceled' element value. Признак прекращения действия документа
     * 
     * @return value
     */
    public String getIsCanceled() {
        return isCanceled;
    }

    /** 
     * Set the 'IsCanceled' element value. Признак прекращения действия документа
     * 
     * @param isCanceled
     */
    public void setIsCanceled(String isCanceled) {
        this.isCanceled = isCanceled;
    }

    /** 
     * Get the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @return value
     */
    public String getBDRDID() {
        return BDRDID;
    }

    /** 
     * Set the 'BDRDID' element value. Идентификатор документа по БД РД
     * 
     * @param BDRDID
     */
    public void setBDRDID(String BDRDID) {
        this.BDRDID = BDRDID;
    }

    /** 
     * Get the 'OutDate' element value. Дата вывоза оборудования
     * 
     * @return value
     */
    public LocalDate getOutDate() {
        return outDate;
    }

    /** 
     * Set the 'OutDate' element value. Дата вывоза оборудования
     * 
     * @param outDate
     */
    public void setOutDate(LocalDate outDate) {
        this.outDate = outDate;
    }

    /** 
     * Get the 'ImportObjective' element value. Цель ввоза
     * 
     * @return value
     */
    public String getImportObjective() {
        return importObjective;
    }

    /** 
     * Set the 'ImportObjective' element value. Цель ввоза
     * 
     * @param importObjective
     */
    public void setImportObjective(String importObjective) {
        this.importObjective = importObjective;
    }

    /** 
     * Get the 'RequesterName' element value. Наименование органа военного управления или федерального органа исполнительной власти, обратившегося за получением разрешения на ввоз РЭС
     * 
     * @return value
     */
    public String getRequesterName() {
        return requesterName;
    }

    /** 
     * Set the 'RequesterName' element value. Наименование органа военного управления или федерального органа исполнительной власти, обратившегося за получением разрешения на ввоз РЭС
     * 
     * @param requesterName
     */
    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    /** 
     * Get the 'PermissionOrganName' element value. Наименование органа военного управления или федерального органа исполнительной власти, которому разрешается ввоз РЭС
     * 
     * @return value
     */
    public String getPermissionOrganName() {
        return permissionOrganName;
    }

    /** 
     * Set the 'PermissionOrganName' element value. Наименование органа военного управления или федерального органа исполнительной власти, которому разрешается ввоз РЭС
     * 
     * @param permissionOrganName
     */
    public void setPermissionOrganName(String permissionOrganName) {
        this.permissionOrganName = permissionOrganName;
    }

    /** 
     * Get the 'DocumentInfo' element value. Сведения о документе
     * 
     * @return value
     */
    public DocInfoType getDocumentInfo() {
        return documentInfo;
    }

    /** 
     * Set the 'DocumentInfo' element value. Сведения о документе
     * 
     * @param documentInfo
     */
    public void setDocumentInfo(DocInfoType documentInfo) {
        this.documentInfo = documentInfo;
    }

    /** 
     * Get the 'Owner' element value. Параметры владельца
     * 
     * @return value
     */
    public OwnerType getOwner() {
        return owner;
    }

    /** 
     * Set the 'Owner' element value. Параметры владельца
     * 
     * @param owner
     */
    public void setOwner(OwnerType owner) {
        this.owner = owner;
    }

    /** 
     * Get the list of 'ResItem' element items. Оборудование (Тип РЭС, его комплектация)
     * 
     * @return list
     */
    public List<ResItemType> getResItemList() {
        return resItemList;
    }

    /** 
     * Set the list of 'ResItem' element items. Оборудование (Тип РЭС, его комплектация)
     * 
     * @param list
     */
    public void setResItemList(List<ResItemType> list) {
        resItemList = list;
    }

    /** 
     * Get the list of 'Contract' element items. Договор (контракт) на поставку РЭС
     * 
     * @return list
     */
    public List<DocumentBaseType> getContractList() {
        return contractList;
    }

    /** 
     * Set the list of 'Contract' element items. Договор (контракт) на поставку РЭС
     * 
     * @param list
     */
    public void setContractList(List<DocumentBaseType> list) {
        contractList = list;
    }

    /** 
     * Get the 'OrganizationName' element value. Наименование организации, поставляющей РЭС
     * 
     * @return value
     */
    public OrganizationBaseType getOrganizationName() {
        return organizationName;
    }

    /** 
     * Set the 'OrganizationName' element value. Наименование организации, поставляющей РЭС
     * 
     * @param organizationName
     */
    public void setOrganizationName(OrganizationBaseType organizationName) {
        this.organizationName = organizationName;
    }

    /** 
     * Get the 'Signer' element value. Лицо, подписавшее документ
     * 
     * @return value
     */
    public PersonSignatureType getSigner() {
        return signer;
    }

    /** 
     * Set the 'Signer' element value. Лицо, подписавшее документ
     * 
     * @param signer
     */
    public void setSigner(PersonSignatureType signer) {
        this.signer = signer;
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
