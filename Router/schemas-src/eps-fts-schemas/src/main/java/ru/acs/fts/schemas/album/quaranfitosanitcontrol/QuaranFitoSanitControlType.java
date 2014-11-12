
package ru.acs.fts.schemas.album.quaranfitosanitcontrol;

import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUOrganizationType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.TransportMeansBaseType;

/** 
 * Результаты проведения документального карантинного фитосанитарного контроля должностными лицами ФТС России
 */
public class QuaranFitoSanitControlType extends BaseDocType
{
    private String certificateIsPresent;
    private String originCountry;
    private String quarantineCountry;
    private String controlResult;
    private String banImportReason;
    private TransportMeansBaseType TSInfo;
    private DocumentBaseType certificate;
    private GoodsDescriptionType goodsDescription;
    private CUOrganizationType importer;
    private CUOrganizationType exporter;
    private ActType act;
    private CustomsType customs;
    private PersonBaseType inspector;
    private String documentModeID;

    /** 
     * Get the 'CertificateIsPresent' element value. Признак наличия фитосанитарного сертификата страны-экспортера
     * 
     * @return value
     */
    public String getCertificateIsPresent() {
        return certificateIsPresent;
    }

    /** 
     * Set the 'CertificateIsPresent' element value. Признак наличия фитосанитарного сертификата страны-экспортера
     * 
     * @param certificateIsPresent
     */
    public void setCertificateIsPresent(String certificateIsPresent) {
        this.certificateIsPresent = certificateIsPresent;
    }

    /** 
     * Get the 'OriginCountry' element value. При отсутствии фитосанитарного сертификата страны-экспортера, указывается страна, из которой прибыл груз
     * 
     * @return value
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /** 
     * Set the 'OriginCountry' element value. При отсутствии фитосанитарного сертификата страны-экспортера, указывается страна, из которой прибыл груз
     * 
     * @param originCountry
     */
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    /** 
     * Get the 'QuarantineCountry' element value. Страна-экспортер подкарантинной продукции, выдавшая фитосанитарный сертификат
     * 
     * @return value
     */
    public String getQuarantineCountry() {
        return quarantineCountry;
    }

    /** 
     * Set the 'QuarantineCountry' element value. Страна-экспортер подкарантинной продукции, выдавшая фитосанитарный сертификат
     * 
     * @param quarantineCountry
     */
    public void setQuarantineCountry(String quarantineCountry) {
        this.quarantineCountry = quarantineCountry;
    }

    /** 
     * Get the 'ControlResult' element value. Результат документального карантинного фитосанитарного контроля
     * 
     * @return value
     */
    public String getControlResult() {
        return controlResult;
    }

    /** 
     * Set the 'ControlResult' element value. Результат документального карантинного фитосанитарного контроля
     * 
     * @param controlResult
     */
    public void setControlResult(String controlResult) {
        this.controlResult = controlResult;
    }

    /** 
     * Get the 'BanImportReason' element value. Причина запрета ввоза
     * 
     * @return value
     */
    public String getBanImportReason() {
        return banImportReason;
    }

    /** 
     * Set the 'BanImportReason' element value. Причина запрета ввоза
     * 
     * @param banImportReason
     */
    public void setBanImportReason(String banImportReason) {
        this.banImportReason = banImportReason;
    }

    /** 
     * Get the 'TSInfo' element value. Сведения о транспортном средстве
     * 
     * @return value
     */
    public TransportMeansBaseType getTSInfo() {
        return TSInfo;
    }

    /** 
     * Set the 'TSInfo' element value. Сведения о транспортном средстве
     * 
     * @param TSInfo
     */
    public void setTSInfo(TransportMeansBaseType TSInfo) {
        this.TSInfo = TSInfo;
    }

    /** 
     * Get the 'Certificate' element value. Фитосанитарный сертификат страны-экспортера
     * 
     * @return value
     */
    public DocumentBaseType getCertificate() {
        return certificate;
    }

    /** 
     * Set the 'Certificate' element value. Фитосанитарный сертификат страны-экспортера
     * 
     * @param certificate
     */
    public void setCertificate(DocumentBaseType certificate) {
        this.certificate = certificate;
    }

    /** 
     * Get the 'GoodsDescription' element value. Сведения о подкарантинной продукции
     * 
     * @return value
     */
    public GoodsDescriptionType getGoodsDescription() {
        return goodsDescription;
    }

    /** 
     * Set the 'GoodsDescription' element value. Сведения о подкарантинной продукции
     * 
     * @param goodsDescription
     */
    public void setGoodsDescription(GoodsDescriptionType goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    /** 
     * Get the 'Importer' element value. Импортер (получатель)
     * 
     * @return value
     */
    public CUOrganizationType getImporter() {
        return importer;
    }

    /** 
     * Set the 'Importer' element value. Импортер (получатель)
     * 
     * @param importer
     */
    public void setImporter(CUOrganizationType importer) {
        this.importer = importer;
    }

    /** 
     * Get the 'Exporter' element value. Экспортер (отправитель)
     * 
     * @return value
     */
    public CUOrganizationType getExporter() {
        return exporter;
    }

    /** 
     * Set the 'Exporter' element value. Экспортер (отправитель)
     * 
     * @param exporter
     */
    public void setExporter(CUOrganizationType exporter) {
        this.exporter = exporter;
    }

    /** 
     * Get the 'Act' element value. Выданный акт
     * 
     * @return value
     */
    public ActType getAct() {
        return act;
    }

    /** 
     * Set the 'Act' element value. Выданный акт
     * 
     * @param act
     */
    public void setAct(ActType act) {
        this.act = act;
    }

    /** 
     * Get the 'Customs' element value. Таможенный пост
     * 
     * @return value
     */
    public CustomsType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный пост
     * 
     * @param customs
     */
    public void setCustoms(CustomsType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'Inspector' element value. Инспектор таможенного подразделения
     * 
     * @return value
     */
    public PersonBaseType getInspector() {
        return inspector;
    }

    /** 
     * Set the 'Inspector' element value. Инспектор таможенного подразделения
     * 
     * @param inspector
     */
    public void setInspector(PersonBaseType inspector) {
        this.inspector = inspector;
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
