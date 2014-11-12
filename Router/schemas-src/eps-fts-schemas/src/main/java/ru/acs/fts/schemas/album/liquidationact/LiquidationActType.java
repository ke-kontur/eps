
package ru.acs.fts.schemas.album.liquidationact;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.CUCustomsType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Акт об уничтожении
 */
public class LiquidationActType extends BaseDocType
{
    private String documentSign;
    private LiquidationParticipantType residentOEZ;
    private LiquidationParticipantType liquidator;
    private CUCustomsType CUCustoms;
    private AddressType liquidationPlace;
    private List<WasteProductsType> wasteProductList = new ArrayList<WasteProductsType>();
    private List<ParticipatedPersonType> participatedPersonList = new ArrayList<ParticipatedPersonType>();
    private ApplicationRegNumberType applicationRegNumber;
    private List<GTDIDType> declRegNumberList = new ArrayList<GTDIDType>();
    private List<GoodsType> liquidationGoodList = new ArrayList<GoodsType>();
    private String documentModeID;

    /** 
     * Get the 'DocumentSign' element value. Акт об уничтожении товаров:  0 - помещенных под таможенную процедуру СТЗ и пришедших в негодность; 1 - под таможенным контролем; 2 - подтверждающий факт уничтожения/утилизации товаров (ст. 297 ТК ТС)
     * 
     * @return value
     */
    public String getDocumentSign() {
        return documentSign;
    }

    /** 
     * Set the 'DocumentSign' element value. Акт об уничтожении товаров:  0 - помещенных под таможенную процедуру СТЗ и пришедших в негодность; 1 - под таможенным контролем; 2 - подтверждающий факт уничтожения/утилизации товаров (ст. 297 ТК ТС)
     * 
     * @param documentSign
     */
    public void setDocumentSign(String documentSign) {
        this.documentSign = documentSign;
    }

    /** 
     * Get the 'ResidentOEZ' element value. Резидент ОЭЗ/Нерезидент ОЭЗ/Декларант
     * 
     * @return value
     */
    public LiquidationParticipantType getResidentOEZ() {
        return residentOEZ;
    }

    /** 
     * Set the 'ResidentOEZ' element value. Резидент ОЭЗ/Нерезидент ОЭЗ/Декларант
     * 
     * @param residentOEZ
     */
    public void setResidentOEZ(LiquidationParticipantType residentOEZ) {
        this.residentOEZ = residentOEZ;
    }

    /** 
     * Get the 'Liquidator' element value. Лицо, осуществляющее уничтожение
     * 
     * @return value
     */
    public LiquidationParticipantType getLiquidator() {
        return liquidator;
    }

    /** 
     * Set the 'Liquidator' element value. Лицо, осуществляющее уничтожение
     * 
     * @param liquidator
     */
    public void setLiquidator(LiquidationParticipantType liquidator) {
        this.liquidator = liquidator;
    }

    /** 
     * Get the 'CUCustoms' element value. Сведения о таможенном органе
     * 
     * @return value
     */
    public CUCustomsType getCUCustoms() {
        return CUCustoms;
    }

    /** 
     * Set the 'CUCustoms' element value. Сведения о таможенном органе
     * 
     * @param CUCustoms
     */
    public void setCUCustoms(CUCustomsType CUCustoms) {
        this.CUCustoms = CUCustoms;
    }

    /** 
     * Get the 'LiquidationPlace' element value. Место уничтожения
     * 
     * @return value
     */
    public AddressType getLiquidationPlace() {
        return liquidationPlace;
    }

    /** 
     * Set the 'LiquidationPlace' element value. Место уничтожения
     * 
     * @param liquidationPlace
     */
    public void setLiquidationPlace(AddressType liquidationPlace) {
        this.liquidationPlace = liquidationPlace;
    }

    /** 
     * Get the list of 'WasteProducts' element items. Отходы, полученные из товаров и (или) упаковки
     * 
     * @return list
     */
    public List<WasteProductsType> getWasteProductList() {
        return wasteProductList;
    }

    /** 
     * Set the list of 'WasteProducts' element items. Отходы, полученные из товаров и (или) упаковки
     * 
     * @param list
     */
    public void setWasteProductList(List<WasteProductsType> list) {
        wasteProductList = list;
    }

    /** 
     * Get the list of 'ParticipatedPerson' element items. Лицо, присутствующее при уничтожении
     * 
     * @return list
     */
    public List<ParticipatedPersonType> getParticipatedPersonList() {
        return participatedPersonList;
    }

    /** 
     * Set the list of 'ParticipatedPerson' element items. Лицо, присутствующее при уничтожении
     * 
     * @param list
     */
    public void setParticipatedPersonList(List<ParticipatedPersonType> list) {
        participatedPersonList = list;
    }

    /** 
     * Get the 'ApplicationRegNumber' element value. Регистрационный номер
     * 
     * @return value
     */
    public ApplicationRegNumberType getApplicationRegNumber() {
        return applicationRegNumber;
    }

    /** 
     * Set the 'ApplicationRegNumber' element value. Регистрационный номер
     * 
     * @param applicationRegNumber
     */
    public void setApplicationRegNumber(
            ApplicationRegNumberType applicationRegNumber) {
        this.applicationRegNumber = applicationRegNumber;
    }

    /** 
     * Get the list of 'DeclRegNumber' element items. Регистрационный номер таможенной декларации
     * 
     * @return list
     */
    public List<GTDIDType> getDeclRegNumberList() {
        return declRegNumberList;
    }

    /** 
     * Set the list of 'DeclRegNumber' element items. Регистрационный номер таможенной декларации
     * 
     * @param list
     */
    public void setDeclRegNumberList(List<GTDIDType> list) {
        declRegNumberList = list;
    }

    /** 
     * Get the list of 'LiquidationGoods' element items. Сведения о товарах, помещенных под таможенную процедуру уничтожения
     * 
     * @return list
     */
    public List<GoodsType> getLiquidationGoodList() {
        return liquidationGoodList;
    }

    /** 
     * Set the list of 'LiquidationGoods' element items. Сведения о товарах, помещенных под таможенную процедуру уничтожения
     * 
     * @param list
     */
    public void setLiquidationGoodList(List<GoodsType> list) {
        liquidationGoodList = list;
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
