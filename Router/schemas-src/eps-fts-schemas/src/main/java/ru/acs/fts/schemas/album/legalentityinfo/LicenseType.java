
package ru.acs.fts.schemas.album.legalentityinfo;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о лицензии
 */
public class LicenseType extends DocumentBaseType
{
    private LocalDate beginDate;
    private LocalDate expirationDate;
    private String licenseSeries;
    private String licenseKind;
    private String licensedServiceName;
    private RecordDataType recordData;
    private List<AddressType> licensedServicePlaceList = new ArrayList<AddressType>();
    private RegOrganType licenseOrg;
    private SuspensionType suspension;

    /** 
     * Get the 'BeginDate' element value. Дата начала действия документа
     * 
     * @return value
     */
    public LocalDate getBeginDate() {
        return beginDate;
    }

    /** 
     * Set the 'BeginDate' element value. Дата начала действия документа
     * 
     * @param beginDate
     */
    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    /** 
     * Get the 'ExpirationDate' element value. Дата окончания действия документа
     * 
     * @return value
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /** 
     * Set the 'ExpirationDate' element value. Дата окончания действия документа
     * 
     * @param expirationDate
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /** 
     * Get the 'LicenseSeries' element value. Серия документа
     * 
     * @return value
     */
    public String getLicenseSeries() {
        return licenseSeries;
    }

    /** 
     * Set the 'LicenseSeries' element value. Серия документа
     * 
     * @param licenseSeries
     */
    public void setLicenseSeries(String licenseSeries) {
        this.licenseSeries = licenseSeries;
    }

    /** 
     * Get the 'LicenseKind' element value. Вид лицензии
     * 
     * @return value
     */
    public String getLicenseKind() {
        return licenseKind;
    }

    /** 
     * Set the 'LicenseKind' element value. Вид лицензии
     * 
     * @param licenseKind
     */
    public void setLicenseKind(String licenseKind) {
        this.licenseKind = licenseKind;
    }

    /** 
     * Get the 'LicensedServiceName' element value. Наименование лицензируемого вида деятельности
     * 
     * @return value
     */
    public String getLicensedServiceName() {
        return licensedServiceName;
    }

    /** 
     * Set the 'LicensedServiceName' element value. Наименование лицензируемого вида деятельности
     * 
     * @param licensedServiceName
     */
    public void setLicensedServiceName(String licensedServiceName) {
        this.licensedServiceName = licensedServiceName;
    }

    /** 
     * Get the 'RecordData' element value. Сведения о записи
     * 
     * @return value
     */
    public RecordDataType getRecordData() {
        return recordData;
    }

    /** 
     * Set the 'RecordData' element value. Сведения о записи
     * 
     * @param recordData
     */
    public void setRecordData(RecordDataType recordData) {
        this.recordData = recordData;
    }

    /** 
     * Get the list of 'LicensedServicePlace' element items. Сведения об месте осуществления лицензируемого вида деятельности
     * 
     * @return list
     */
    public List<AddressType> getLicensedServicePlaceList() {
        return licensedServicePlaceList;
    }

    /** 
     * Set the list of 'LicensedServicePlace' element items. Сведения об месте осуществления лицензируемого вида деятельности
     * 
     * @param list
     */
    public void setLicensedServicePlaceList(List<AddressType> list) {
        licensedServicePlaceList = list;
    }

    /** 
     * Get the 'LicenseOrg' element value. Наименование лицензирующего органа, выдавшего или переоформившего лицензию
     * 
     * @return value
     */
    public RegOrganType getLicenseOrg() {
        return licenseOrg;
    }

    /** 
     * Set the 'LicenseOrg' element value. Наименование лицензирующего органа, выдавшего или переоформившего лицензию
     * 
     * @param licenseOrg
     */
    public void setLicenseOrg(RegOrganType licenseOrg) {
        this.licenseOrg = licenseOrg;
    }

    /** 
     * Get the 'Suspension' element value. Сведения о приостановлении действия лицензии
     * 
     * @return value
     */
    public SuspensionType getSuspension() {
        return suspension;
    }

    /** 
     * Set the 'Suspension' element value. Сведения о приостановлении действия лицензии
     * 
     * @param suspension
     */
    public void setSuspension(SuspensionType suspension) {
        this.suspension = suspension;
    }
}
