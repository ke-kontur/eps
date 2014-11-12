
package ru.acs.fts.schemas.album.arrivaldepartcargodecl;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;
import ru.acs.fts.schemas.album.transportcommonaggregatetypescust.VesselType;

/** 
 * Декларация о грузе при приходе/отходе судна
 */
public class ArrivalDepartCargoDeclType extends BaseDocType
{
    private String docSign;
    private String languageCode;
    private String departDestinPort;
    private String declarationPort;
    private PersonSignatureType documentSignature;
    private VesselType vessel;
    private List<GoodsType> goodList = new ArrayList<GoodsType>();
    private String documentModeID;

    /** 
     * Get the 'DocSign' element value. Признак документа: 0 - приход; 1 - отход
     * 
     * @return value
     */
    public String getDocSign() {
        return docSign;
    }

    /** 
     * Set the 'DocSign' element value. Признак документа: 0 - приход; 1 - отход
     * 
     * @param docSign
     */
    public void setDocSign(String docSign) {
        this.docSign = docSign;
    }

    /** 
     * Get the 'LanguageCode' element value. Код языка документа 
     * 
     * @return value
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /** 
     * Set the 'LanguageCode' element value. Код языка документа 
     * 
     * @param languageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /** 
     * Get the 'DepartDestinPort' element value. Название порта отправления/назначения судна
     * 
     * @return value
     */
    public String getDepartDestinPort() {
        return departDestinPort;
    }

    /** 
     * Set the 'DepartDestinPort' element value. Название порта отправления/назначения судна
     * 
     * @param departDestinPort
     */
    public void setDepartDestinPort(String departDestinPort) {
        this.departDestinPort = departDestinPort;
    }

    /** 
     * Get the 'DeclarationPort' element value. Название порта составления декларации о грузе
     * 
     * @return value
     */
    public String getDeclarationPort() {
        return declarationPort;
    }

    /** 
     * Set the 'DeclarationPort' element value. Название порта составления декларации о грузе
     * 
     * @param declarationPort
     */
    public void setDeclarationPort(String declarationPort) {
        this.declarationPort = declarationPort;
    }

    /** 
     * Get the 'DocumentSignature' element value. Подпись документа капитаном, морским агентом или каким-либо другим лицом, надлежащим образом уполномоченным на то капитаном
     * 
     * @return value
     */
    public PersonSignatureType getDocumentSignature() {
        return documentSignature;
    }

    /** 
     * Set the 'DocumentSignature' element value. Подпись документа капитаном, морским агентом или каким-либо другим лицом, надлежащим образом уполномоченным на то капитаном
     * 
     * @param documentSignature
     */
    public void setDocumentSignature(PersonSignatureType documentSignature) {
        this.documentSignature = documentSignature;
    }

    /** 
     * Get the 'Vessel' element value. Реквизиты судна
     * 
     * @return value
     */
    public VesselType getVessel() {
        return vessel;
    }

    /** 
     * Set the 'Vessel' element value. Реквизиты судна
     * 
     * @param vessel
     */
    public void setVessel(VesselType vessel) {
        this.vessel = vessel;
    }

    /** 
     * Get the list of 'Goods' element items. Описание груза (товаров), взятых в порту отхода/подлежащих выгрузке в порту прихода
     * 
     * @return list
     */
    public List<GoodsType> getGoodList() {
        return goodList;
    }

    /** 
     * Set the list of 'Goods' element items. Описание груза (товаров), взятых в порту отхода/подлежащих выгрузке в порту прихода
     * 
     * @param list
     */
    public void setGoodList(List<GoodsType> list) {
        goodList = list;
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
