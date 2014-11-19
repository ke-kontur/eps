
package ru.acs.fts.schemas.album.mediacertificate;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Информация из свидетельств СМИ
 */
public class MediaCertificateType extends BaseDocType
{
    private String mediaName;
    private String advertisementPercent;
    private String periodicity;
    private String specialty;
    private String append;
    private DocumentBaseType certificate;
    private List<MediaInfoType> languageList = new ArrayList<MediaInfoType>();
    private List<CUOrganizationType> founderList = new ArrayList<CUOrganizationType>();
    private AddressType editorialAddress;
    private List<MediaInfoType> mediaTopicList = new ArrayList<MediaInfoType>();
    private MediaInfoType distributionForm;
    private DistributionTerritoryType distributionTerritory;
    private DocumentBaseType referenceDoc;
    private String documentModeID;

    /** 
     * Get the 'MediaName' element value. Наименование СМИ
     * 
     * @return value
     */
    public String getMediaName() {
        return mediaName;
    }

    /** 
     * Set the 'MediaName' element value. Наименование СМИ
     * 
     * @param mediaName
     */
    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    /** 
     * Get the 'AdvertisementPercent' element value. Процент рекламы
     * 
     * @return value
     */
    public String getAdvertisementPercent() {
        return advertisementPercent;
    }

    /** 
     * Set the 'AdvertisementPercent' element value. Процент рекламы
     * 
     * @param advertisementPercent
     */
    public void setAdvertisementPercent(String advertisementPercent) {
        this.advertisementPercent = advertisementPercent;
    }

    /** 
     * Get the 'Periodicity' element value. Периодичность
     * 
     * @return value
     */
    public String getPeriodicity() {
        return periodicity;
    }

    /** 
     * Set the 'Periodicity' element value. Периодичность
     * 
     * @param periodicity
     */
    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    /** 
     * Get the 'Specialty' element value. Специализация
     * 
     * @return value
     */
    public String getSpecialty() {
        return specialty;
    }

    /** 
     * Set the 'Specialty' element value. Специализация
     * 
     * @param specialty
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /** 
     * Get the 'Append' element value. Наличие, наименование и количество приложений
     * 
     * @return value
     */
    public String getAppend() {
        return append;
    }

    /** 
     * Set the 'Append' element value. Наличие, наименование и количество приложений
     * 
     * @param append
     */
    public void setAppend(String append) {
        this.append = append;
    }

    /** 
     * Get the 'Certificate' element value. Свидетельство СМИ
     * 
     * @return value
     */
    public DocumentBaseType getCertificate() {
        return certificate;
    }

    /** 
     * Set the 'Certificate' element value. Свидетельство СМИ
     * 
     * @param certificate
     */
    public void setCertificate(DocumentBaseType certificate) {
        this.certificate = certificate;
    }

    /** 
     * Get the list of 'Language' element items. Язык
     * 
     * @return list
     */
    public List<MediaInfoType> getLanguageList() {
        return languageList;
    }

    /** 
     * Set the list of 'Language' element items. Язык
     * 
     * @param list
     */
    public void setLanguageList(List<MediaInfoType> list) {
        languageList = list;
    }

    /** 
     * Get the list of 'Founder' element items. Учредитель СМИ
     * 
     * @return list
     */
    public List<CUOrganizationType> getFounderList() {
        return founderList;
    }

    /** 
     * Set the list of 'Founder' element items. Учредитель СМИ
     * 
     * @param list
     */
    public void setFounderList(List<CUOrganizationType> list) {
        founderList = list;
    }

    /** 
     * Get the 'EditorialAddress' element value. Адрес редакции СМИ
     * 
     * @return value
     */
    public AddressType getEditorialAddress() {
        return editorialAddress;
    }

    /** 
     * Set the 'EditorialAddress' element value. Адрес редакции СМИ
     * 
     * @param editorialAddress
     */
    public void setEditorialAddress(AddressType editorialAddress) {
        this.editorialAddress = editorialAddress;
    }

    /** 
     * Get the list of 'MediaTopic' element items. Тематика
     * 
     * @return list
     */
    public List<MediaInfoType> getMediaTopicList() {
        return mediaTopicList;
    }

    /** 
     * Set the list of 'MediaTopic' element items. Тематика
     * 
     * @param list
     */
    public void setMediaTopicList(List<MediaInfoType> list) {
        mediaTopicList = list;
    }

    /** 
     * Get the 'DistributionForm' element value. Форма распространения
     * 
     * @return value
     */
    public MediaInfoType getDistributionForm() {
        return distributionForm;
    }

    /** 
     * Set the 'DistributionForm' element value. Форма распространения
     * 
     * @param distributionForm
     */
    public void setDistributionForm(MediaInfoType distributionForm) {
        this.distributionForm = distributionForm;
    }

    /** 
     * Get the 'DistributionTerritory' element value. Территория распространения
     * 
     * @return value
     */
    public DistributionTerritoryType getDistributionTerritory() {
        return distributionTerritory;
    }

    /** 
     * Set the 'DistributionTerritory' element value. Территория распространения
     * 
     * @param distributionTerritory
     */
    public void setDistributionTerritory(
            DistributionTerritoryType distributionTerritory) {
        this.distributionTerritory = distributionTerritory;
    }

    /** 
     * Get the 'ReferenceDoc' element value. Сведения о справке
     * 
     * @return value
     */
    public DocumentBaseType getReferenceDoc() {
        return referenceDoc;
    }

    /** 
     * Set the 'ReferenceDoc' element value. Сведения о справке
     * 
     * @param referenceDoc
     */
    public void setReferenceDoc(DocumentBaseType referenceDoc) {
        this.referenceDoc = referenceDoc;
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
