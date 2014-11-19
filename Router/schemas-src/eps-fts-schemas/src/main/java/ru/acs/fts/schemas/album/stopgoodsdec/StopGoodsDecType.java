
package ru.acs.fts.schemas.album.stopgoodsdec;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.BaseDocType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Решение о приостановлении выпуска товаров
 */
public class StopGoodsDecType extends BaseDocType
{
    private LocalDate sendDate;
    private LocalDate decIssueDate;
    private LocalDate decEndDate;
    private String goodsLocation;
    private List<RightPersonType> rightPersonList = new ArrayList<RightPersonType>();
    private CustomsInfoType customs;
    private GTDIDType declarationNumber;
    private List<RestrictionGoodsInfoType> restrictionGoodsInfoList = new ArrayList<RestrictionGoodsInfoType>();
    private String documentModeID;

    /** 
     * Get the 'SendDate' element value. Дата направления
     * 
     * @return value
     */
    public LocalDate getSendDate() {
        return sendDate;
    }

    /** 
     * Set the 'SendDate' element value. Дата направления
     * 
     * @param sendDate
     */
    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    /** 
     * Get the 'DecIssueDate' element value. Дата принятия решения
     * 
     * @return value
     */
    public LocalDate getDecIssueDate() {
        return decIssueDate;
    }

    /** 
     * Set the 'DecIssueDate' element value. Дата принятия решения
     * 
     * @param decIssueDate
     */
    public void setDecIssueDate(LocalDate decIssueDate) {
        this.decIssueDate = decIssueDate;
    }

    /** 
     * Get the 'DecEndDate' element value. Дата окончания приостановления выпуска товаров
     * 
     * @return value
     */
    public LocalDate getDecEndDate() {
        return decEndDate;
    }

    /** 
     * Set the 'DecEndDate' element value. Дата окончания приостановления выпуска товаров
     * 
     * @param decEndDate
     */
    public void setDecEndDate(LocalDate decEndDate) {
        this.decEndDate = decEndDate;
    }

    /** 
     * Get the 'GoodsLocation' element value. Местонахождение товаров, выпуск которых приостановлен
     * 
     * @return value
     */
    public String getGoodsLocation() {
        return goodsLocation;
    }

    /** 
     * Set the 'GoodsLocation' element value. Местонахождение товаров, выпуск которых приостановлен
     * 
     * @param goodsLocation
     */
    public void setGoodsLocation(String goodsLocation) {
        this.goodsLocation = goodsLocation;
    }

    /** 
     * Get the list of 'RightPerson' element items. Правообладатель (декларант, представитель)
     * 
     * @return list
     */
    public List<RightPersonType> getRightPersonList() {
        return rightPersonList;
    }

    /** 
     * Set the list of 'RightPerson' element items. Правообладатель (декларант, представитель)
     * 
     * @param list
     */
    public void setRightPersonList(List<RightPersonType> list) {
        rightPersonList = list;
    }

    /** 
     * Get the 'Customs' element value. Таможенный орган
     * 
     * @return value
     */
    public CustomsInfoType getCustoms() {
        return customs;
    }

    /** 
     * Set the 'Customs' element value. Таможенный орган
     * 
     * @param customs
     */
    public void setCustoms(CustomsInfoType customs) {
        this.customs = customs;
    }

    /** 
     * Get the 'DeclarationNumber' element value. Номер ДТ
     * 
     * @return value
     */
    public GTDIDType getDeclarationNumber() {
        return declarationNumber;
    }

    /** 
     * Set the 'DeclarationNumber' element value. Номер ДТ
     * 
     * @param declarationNumber
     */
    public void setDeclarationNumber(GTDIDType declarationNumber) {
        this.declarationNumber = declarationNumber;
    }

    /** 
     * Get the list of 'RestrictionGoodsInfo' element items. Сведения о товаре, на который наложено ограничение
     * 
     * @return list
     */
    public List<RestrictionGoodsInfoType> getRestrictionGoodsInfoList() {
        return restrictionGoodsInfoList;
    }

    /** 
     * Set the list of 'RestrictionGoodsInfo' element items. Сведения о товаре, на который наложено ограничение
     * 
     * @param list
     */
    public void setRestrictionGoodsInfoList(List<RestrictionGoodsInfoType> list) {
        restrictionGoodsInfoList = list;
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
