
package ru.acs.fts.schemas.album.culturecertificate;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;

/** 
 * Свидетельство на право вывоза культурных ценностей
 */
public class CultureCertificateType extends BaseDocType
{
    private String BDRDID;
    private String regNumber;
    private String exportType;
    private String numSheets;
    private String numFoto;
    private String countryName;
    private String target;
    private String term;
    private String unitTime;
    private LocalDate dateIssued;
    private String placeIssued;
    private List<String> customsMarkList = new ArrayList<String>();
    private OrganizationBaseType organizationIssued;
    private DecisionInfType decisionInf;
    private PersonBaseType personIssued;
    private List<CulturalValuesListType> culturalValuesList = new ArrayList<CulturalValuesListType>();
    private String documentModeID;

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
     * Get the 'RegNumber' element value. Номер свидетельства
     * 
     * @return value
     */
    public String getRegNumber() {
        return regNumber;
    }

    /** 
     * Set the 'RegNumber' element value. Номер свидетельства
     * 
     * @param regNumber
     */
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    /** 
     * Get the 'ExportType' element value. Вид вывоза: 0 - временный, 1 - постоянный
     * 
     * @return value
     */
    public String getExportType() {
        return exportType;
    }

    /** 
     * Set the 'ExportType' element value. Вид вывоза: 0 - временный, 1 - постоянный
     * 
     * @param exportType
     */
    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    /** 
     * Get the 'NumSheets' element value. Количество листов, прилагаемых со списком предметов
     * 
     * @return value
     */
    public String getNumSheets() {
        return numSheets;
    }

    /** 
     * Set the 'NumSheets' element value. Количество листов, прилагаемых со списком предметов
     * 
     * @param numSheets
     */
    public void setNumSheets(String numSheets) {
        this.numSheets = numSheets;
    }

    /** 
     * Get the 'NumFoto' element value. Количество фотографий предметов.
     * 
     * @return value
     */
    public String getNumFoto() {
        return numFoto;
    }

    /** 
     * Set the 'NumFoto' element value. Количество фотографий предметов.
     * 
     * @param numFoto
     */
    public void setNumFoto(String numFoto) {
        this.numFoto = numFoto;
    }

    /** 
     * Get the 'CountryName' element value. Название страны ввоза культурных ценностей
     * 
     * @return value
     */
    public String getCountryName() {
        return countryName;
    }

    /** 
     * Set the 'CountryName' element value. Название страны ввоза культурных ценностей
     * 
     * @param countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /** 
     * Get the 'Target' element value. Цель вывоза
     * 
     * @return value
     */
    public String getTarget() {
        return target;
    }

    /** 
     * Set the 'Target' element value. Цель вывоза
     * 
     * @param target
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /** 
     * Get the 'Term' element value. Срок вывоза
     * 
     * @return value
     */
    public String getTerm() {
        return term;
    }

    /** 
     * Set the 'Term' element value. Срок вывоза
     * 
     * @param term
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /** 
     * Get the 'UnitTime' element value. Единица измерения времени
     * 
     * @return value
     */
    public String getUnitTime() {
        return unitTime;
    }

    /** 
     * Set the 'UnitTime' element value. Единица измерения времени
     * 
     * @param unitTime
     */
    public void setUnitTime(String unitTime) {
        this.unitTime = unitTime;
    }

    /** 
     * Get the 'DateIssued' element value. Дата выдачи свидетельства
     * 
     * @return value
     */
    public LocalDate getDateIssued() {
        return dateIssued;
    }

    /** 
     * Set the 'DateIssued' element value. Дата выдачи свидетельства
     * 
     * @param dateIssued
     */
    public void setDateIssued(LocalDate dateIssued) {
        this.dateIssued = dateIssued;
    }

    /** 
     * Get the 'PlaceIssued' element value. Место выдачи свидетельства
     * 
     * @return value
     */
    public String getPlaceIssued() {
        return placeIssued;
    }

    /** 
     * Set the 'PlaceIssued' element value. Место выдачи свидетельства
     * 
     * @param placeIssued
     */
    public void setPlaceIssued(String placeIssued) {
        this.placeIssued = placeIssued;
    }

    /** 
     * Get the list of 'CustomsMark' element items. Отметки таможни
     * 
     * @return list
     */
    public List<String> getCustomsMarkList() {
        return customsMarkList;
    }

    /** 
     * Set the list of 'CustomsMark' element items. Отметки таможни
     * 
     * @param list
     */
    public void setCustomsMarkList(List<String> list) {
        customsMarkList = list;
    }

    /** 
     * Get the 'OrganizationIssued' element value. Сведения о лице или об организации, которому(й) выдан сертификат
     * 
     * @return value
     */
    public OrganizationBaseType getOrganizationIssued() {
        return organizationIssued;
    }

    /** 
     * Set the 'OrganizationIssued' element value. Сведения о лице или об организации, которому(й) выдан сертификат
     * 
     * @param organizationIssued
     */
    public void setOrganizationIssued(OrganizationBaseType organizationIssued) {
        this.organizationIssued = organizationIssued;
    }

    /** 
     * Get the 'DecisionInf' element value. Сведения о решении, на основании которого разрешен вывоз
     * 
     * @return value
     */
    public DecisionInfType getDecisionInf() {
        return decisionInf;
    }

    /** 
     * Set the 'DecisionInf' element value. Сведения о решении, на основании которого разрешен вывоз
     * 
     * @param decisionInf
     */
    public void setDecisionInf(DecisionInfType decisionInf) {
        this.decisionInf = decisionInf;
    }

    /** 
     * Get the 'PersonIssued' element value. Сведения о должностном лице, выдавшем свидетельство
     * 
     * @return value
     */
    public PersonBaseType getPersonIssued() {
        return personIssued;
    }

    /** 
     * Set the 'PersonIssued' element value. Сведения о должностном лице, выдавшем свидетельство
     * 
     * @param personIssued
     */
    public void setPersonIssued(PersonBaseType personIssued) {
        this.personIssued = personIssued;
    }

    /** 
     * Get the list of 'CulturalValuesList' element items. Список культурных ценностей
     * 
     * @return list
     */
    public List<CulturalValuesListType> getCulturalValuesList() {
        return culturalValuesList;
    }

    /** 
     * Set the list of 'CulturalValuesList' element items. Список культурных ценностей
     * 
     * @param list
     */
    public void setCulturalValuesList(List<CulturalValuesListType> list) {
        culturalValuesList = list;
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
